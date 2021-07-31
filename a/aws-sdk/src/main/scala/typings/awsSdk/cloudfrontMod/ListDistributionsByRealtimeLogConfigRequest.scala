package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByRealtimeLogConfigRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distributions. The response includes distributions in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distributions that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the real-time log configuration whose associated distributions you want to list.
    */
  var RealtimeLogConfigArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the real-time log configuration whose associated distributions you want to list.
    */
  var RealtimeLogConfigName: js.UndefOr[String] = js.undefined
}
object ListDistributionsByRealtimeLogConfigRequest {
  
  @scala.inline
  def apply(): ListDistributionsByRealtimeLogConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByRealtimeLogConfigRequest]
  }
  
  @scala.inline
  implicit class ListDistributionsByRealtimeLogConfigRequestMutableBuilder[Self <: ListDistributionsByRealtimeLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setRealtimeLogConfigArn(value: String): Self = StObject.set(x, "RealtimeLogConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigArnUndefined: Self = StObject.set(x, "RealtimeLogConfigArn", js.undefined)
    
    @scala.inline
    def setRealtimeLogConfigName(value: String): Self = StObject.set(x, "RealtimeLogConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigNameUndefined: Self = StObject.set(x, "RealtimeLogConfigName", js.undefined)
  }
}
