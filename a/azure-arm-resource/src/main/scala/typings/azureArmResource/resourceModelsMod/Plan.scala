package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plan extends StObject {
  
  /**
    * The plan ID.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The offer ID.
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
object Plan {
  
  @scala.inline
  def apply(): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit class PlanMutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
