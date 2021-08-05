package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicyList extends StObject {
  
  /**
    * Contains the origin request policies in the list.
    */
  var Items: js.UndefOr[OriginRequestPolicySummaryList] = js.undefined
  
  /**
    * The maximum number of origin request policies requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing origin request policies where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of origin request policies returned in the response.
    */
  var Quantity: integer
}
object OriginRequestPolicyList {
  
  inline def apply(MaxItems: integer, Quantity: integer): OriginRequestPolicyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyList]
  }
  
  extension [Self <: OriginRequestPolicyList](x: Self) {
    
    inline def setItems(value: OriginRequestPolicySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: OriginRequestPolicySummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
