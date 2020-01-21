package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceRequest extends js.Object {
  /**
    * The device type's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetDeviceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeviceRequest]
  }
}

