package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance you're requesting information about.
    */
  var arn: AmazonResourceName = js.native
}

object GetDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceInstanceRequest]
  }
}

