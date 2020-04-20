package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmRequest extends js.Object {
  /**
    * The ARN of the HSM to delete.
    */
  var HsmArn: typings.awsSdk.cloudhsmMod.HsmArn = js.native
}

object DeleteHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
}

