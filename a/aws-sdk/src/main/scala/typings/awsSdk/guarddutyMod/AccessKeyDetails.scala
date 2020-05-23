package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyDetails extends js.Object {
  /**
    * The access key ID of the user.
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.native
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[String] = js.native
  /**
    * The type of the user.
    */
  var UserType: js.UndefOr[String] = js.native
}

object AccessKeyDetails {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    PrincipalId: String = null,
    UserName: String = null,
    UserType: String = null
  ): AccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    if (UserType != null) __obj.updateDynamic("UserType")(UserType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyDetails]
  }
}

