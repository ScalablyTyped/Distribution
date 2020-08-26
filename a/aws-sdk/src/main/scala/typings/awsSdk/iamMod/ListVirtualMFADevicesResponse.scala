package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualMFADevicesResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    *  The list of virtual MFA devices in the current account that match the AssignmentStatus value that was passed in the request.
    */
  var VirtualMFADevices: virtualMFADeviceListType = js.native
}

object ListVirtualMFADevicesResponse {
  @scala.inline
  def apply(VirtualMFADevices: virtualMFADeviceListType): ListVirtualMFADevicesResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevices = VirtualMFADevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualMFADevicesResponse]
  }
  @scala.inline
  implicit class ListVirtualMFADevicesResponseOps[Self <: ListVirtualMFADevicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualMFADevicesVarargs(value: VirtualMFADevice*): Self = this.set("VirtualMFADevices", js.Array(value :_*))
    @scala.inline
    def setVirtualMFADevices(value: virtualMFADeviceListType): Self = this.set("VirtualMFADevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

