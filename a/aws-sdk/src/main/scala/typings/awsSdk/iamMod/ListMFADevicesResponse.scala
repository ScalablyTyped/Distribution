package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMFADevicesResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * A list of MFA devices.
    */
  var MFADevices: mfaDeviceListType = js.native
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
}
object ListMFADevicesResponse {
  
  @scala.inline
  def apply(MFADevices: mfaDeviceListType): ListMFADevicesResponse = {
    val __obj = js.Dynamic.literal(MFADevices = MFADevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMFADevicesResponse]
  }
  
  @scala.inline
  implicit class ListMFADevicesResponseMutableBuilder[Self <: ListMFADevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setMFADevices(value: mfaDeviceListType): Self = StObject.set(x, "MFADevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFADevicesVarargs(value: MFADevice*): Self = StObject.set(x, "MFADevices", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
