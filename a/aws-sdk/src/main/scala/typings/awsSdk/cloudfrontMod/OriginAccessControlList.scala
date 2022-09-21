package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginAccessControlList extends StObject {
  
  /**
    * If there are more items in the list than are in this response, this value is true.
    */
  var IsTruncated: Boolean
  
  /**
    * Contains the origin access controls in the list.
    */
  var Items: js.UndefOr[OriginAccessControlSummaryList] = js.undefined
  
  /**
    * The value of the Marker field that was provided in the request.
    */
  var Marker: String
  
  /**
    * The maximum number of origin access controls requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value to use in the Marker field of another request to continue listing origin access controls.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of origin access controls returned in the response.
    */
  var Quantity: integer
}
object OriginAccessControlList {
  
  inline def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): OriginAccessControlList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessControlList]
  }
  
  extension [Self <: OriginAccessControlList](x: Self) {
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setItems(value: OriginAccessControlSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: OriginAccessControlSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
