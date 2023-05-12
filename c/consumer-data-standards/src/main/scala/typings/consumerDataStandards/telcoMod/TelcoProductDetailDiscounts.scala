package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DescriptionDisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductDetailDiscounts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The description name of the product plan
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the discount
    */
  var discountUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the product plan
    */
  var displayName: String
  
  /**
    * Optional list of features of the discount
    */
  var features: js.UndefOr[js.Array[DescriptionDisplayName] | Null] = js.undefined
}
object TelcoProductDetailDiscounts {
  
  inline def apply(displayName: String): TelcoProductDetailDiscounts = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProductDetailDiscounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductDetailDiscounts] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscountUri(value: String): Self = StObject.set(x, "discountUri", value.asInstanceOf[js.Any])
    
    inline def setDiscountUriNull: Self = StObject.set(x, "discountUri", null)
    
    inline def setDiscountUriUndefined: Self = StObject.set(x, "discountUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[DescriptionDisplayName]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DescriptionDisplayName*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
