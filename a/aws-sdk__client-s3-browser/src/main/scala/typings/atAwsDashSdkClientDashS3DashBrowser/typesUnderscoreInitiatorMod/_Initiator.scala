package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInitiatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Initiator extends js.Object {
  /**
    * <p>Name of the Principal.</p>
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * <p>If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
}

object _Initiator {
  @scala.inline
  def apply(DisplayName: String = null, ID: String = null): _Initiator = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[_Initiator]
  }
}

