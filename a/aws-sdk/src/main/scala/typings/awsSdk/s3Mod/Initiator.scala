package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initiator extends js.Object {
  /**
    * Name of the Principal.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.s3Mod.DisplayName] = js.native
  /**
    * If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
}

object Initiator {
  @scala.inline
  def apply(DisplayName: DisplayName = null, ID: ID = null): Initiator = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initiator]
  }
}

