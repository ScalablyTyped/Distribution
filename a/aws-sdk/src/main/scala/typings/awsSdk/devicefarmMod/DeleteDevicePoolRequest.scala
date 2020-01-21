package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDevicePoolRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm device pool to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteDevicePoolRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDevicePoolRequest]
  }
}

