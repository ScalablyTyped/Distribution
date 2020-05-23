package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputDeviceRequest extends js.Object {
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}

object DescribeInputDeviceRequest {
  @scala.inline
  def apply(InputDeviceId: string): DescribeInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputDeviceRequest]
  }
}

