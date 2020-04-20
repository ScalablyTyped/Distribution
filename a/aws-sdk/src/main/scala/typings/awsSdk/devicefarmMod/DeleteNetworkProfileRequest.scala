package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
}

