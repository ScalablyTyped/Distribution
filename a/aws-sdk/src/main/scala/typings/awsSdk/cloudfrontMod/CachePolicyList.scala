package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachePolicyList extends StObject {
  
  /**
    * Contains the cache policies in the list.
    */
  var Items: js.UndefOr[CachePolicySummaryList] = js.undefined
  
  /**
    * The maximum number of cache policies requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing cache policies where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of cache policies returned in the response.
    */
  var Quantity: integer
}
object CachePolicyList {
  
  inline def apply(MaxItems: integer, Quantity: integer): CachePolicyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyList]
  }
  
  extension [Self <: CachePolicyList](x: Self) {
    
    inline def setItems(value: CachePolicySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: CachePolicySummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
