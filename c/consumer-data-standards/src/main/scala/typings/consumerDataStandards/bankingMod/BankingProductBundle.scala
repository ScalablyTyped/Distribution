package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductBundle
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the bundle
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on the bundle criteria and benefits
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the bundle
    */
  var description: String
  
  /**
    * Name of the bundle
    */
  var name: String
  
  /**
    * Array of product IDs for products included in the bundle that are available via the product end points.  Note that this array is not intended to represent a comprehensive model of the products included in the bundle and some products available for the bundle may not be available via the product reference end points
    */
  var productIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object BankingProductBundle {
  
  inline def apply(description: String, name: String): BankingProductBundle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductBundle]
  }
  
  extension [Self <: BankingProductBundle](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProductIds(value: js.Array[String]): Self = StObject.set(x, "productIds", value.asInstanceOf[js.Any])
    
    inline def setProductIdsNull: Self = StObject.set(x, "productIds", null)
    
    inline def setProductIdsUndefined: Self = StObject.set(x, "productIds", js.undefined)
    
    inline def setProductIdsVarargs(value: String*): Self = StObject.set(x, "productIds", js.Array(value*))
  }
}
