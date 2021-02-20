package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDevicesRequest extends StObject {
  
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.MaxResults] = js.native
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListDevicesRequest {
  
  @scala.inline
  def apply(): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  @scala.inline
  implicit class ListDevicesRequestMutableBuilder[Self <: ListDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceType(value: string): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
