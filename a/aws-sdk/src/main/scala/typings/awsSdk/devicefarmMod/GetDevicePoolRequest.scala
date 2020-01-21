package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolRequest extends js.Object {
  /**
    * The device pool's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetDevicePoolRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDevicePoolRequest]
  }
}

