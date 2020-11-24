package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputDeviceThumbnailRequest extends js.Object {
  
  /**
    * The HTTP Accept header. Indicates the requested type for the thumbnail.
    */
  var Accept: AcceptHeader = js.native
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}
object DescribeInputDeviceThumbnailRequest {
  
  @scala.inline
  def apply(Accept: AcceptHeader, InputDeviceId: string): DescribeInputDeviceThumbnailRequest = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputDeviceThumbnailRequest]
  }
  
  @scala.inline
  implicit class DescribeInputDeviceThumbnailRequestOps[Self <: DescribeInputDeviceThumbnailRequest] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: AcceptHeader): Self = this.set("Accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDeviceId(value: string): Self = this.set("InputDeviceId", value.asInstanceOf[js.Any])
  }
}
