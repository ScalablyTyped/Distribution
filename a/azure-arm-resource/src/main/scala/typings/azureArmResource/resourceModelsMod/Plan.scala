package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  /**
    * The plan ID.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The offer ID.
    */
  var product: js.UndefOr[String] = js.undefined
  
  /**
    * The promotion code.
    */
  var promotionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The publisher ID.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * The plan's version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Plan {
  
  inline def apply(): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plan]
  }
  
  extension [Self <: Plan](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
    
    inline def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
