package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plan extends js.Object {
  
  /**
    * The plan name.
    */
  var name: String = js.native
  
  /**
    * The product code.
    */
  var product: String = js.native
  
  /**
    * The promotion code.
    */
  var promotionCode: js.UndefOr[String] = js.native
  
  /**
    * The publisher ID.
    */
  var publisher: String = js.native
  
  /**
    * The plan's version.
    */
  var version: String = js.native
}
object Plan {
  
  @scala.inline
  def apply(name: String, product: String, publisher: String, version: String): Plan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionCode(value: String): Self = this.set("promotionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionCode: Self = this.set("promotionCode", js.undefined)
  }
}
