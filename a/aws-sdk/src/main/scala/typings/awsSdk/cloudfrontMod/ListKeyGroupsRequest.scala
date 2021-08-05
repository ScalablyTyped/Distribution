package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyGroupsRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of key groups. The response includes key groups in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of key groups that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListKeyGroupsRequest {
  
  inline def apply(): ListKeyGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyGroupsRequest]
  }
  
  extension [Self <: ListKeyGroupsRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
