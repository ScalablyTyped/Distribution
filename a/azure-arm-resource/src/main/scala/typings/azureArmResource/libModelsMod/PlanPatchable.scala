package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanPatchable extends js.Object {
  
  /**
    * The plan name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The product code.
    */
  var product: js.UndefOr[String] = js.native
  
  /**
    * The promotion code.
    */
  var promotionCode: js.UndefOr[String] = js.native
  
  /**
    * The publisher ID.
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * The plan's version.
    */
  var version: js.UndefOr[String] = js.native
}
object PlanPatchable {
  
  @scala.inline
  def apply(): PlanPatchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanPatchable]
  }
  
  @scala.inline
  implicit class PlanPatchableOps[Self <: PlanPatchable] (val x: Self) extends AnyVal {
    
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
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setPromotionCode(value: String): Self = this.set("promotionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionCode: Self = this.set("promotionCode", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
