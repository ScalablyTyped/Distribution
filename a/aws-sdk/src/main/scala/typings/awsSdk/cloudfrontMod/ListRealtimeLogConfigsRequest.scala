package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRealtimeLogConfigsRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of real-time log configurations. The response includes real-time log configurations in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of real-time log configurations that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListRealtimeLogConfigsRequest {
  
  @scala.inline
  def apply(): ListRealtimeLogConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRealtimeLogConfigsRequest]
  }
  
  @scala.inline
  implicit class ListRealtimeLogConfigsRequestMutableBuilder[Self <: ListRealtimeLogConfigsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
