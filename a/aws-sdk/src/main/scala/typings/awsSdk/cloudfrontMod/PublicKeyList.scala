package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyList extends StObject {
  
  /**
    * A list of public keys.
    */
  var Items: js.UndefOr[PublicKeySummaryList] = js.undefined
  
  /**
    * The maximum number of public keys you want in the response.
    */
  var MaxItems: integer
  
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your public keys where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of public keys in the list.
    */
  var Quantity: integer
}
object PublicKeyList {
  
  inline def apply(MaxItems: integer, Quantity: integer): PublicKeyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyList]
  }
  
  extension [Self <: PublicKeyList](x: Self) {
    
    inline def setItems(value: PublicKeySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: PublicKeySummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
