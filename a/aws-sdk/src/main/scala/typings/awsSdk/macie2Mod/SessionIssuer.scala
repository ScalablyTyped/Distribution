package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionIssuer extends js.Object {
  /**
    * The account that owns the entity that was used to get the credentials.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The internal identifier for the entity that was used to get the credentials.
    */
  var principalId: js.UndefOr[string] = js.native
  /**
    * The source of the temporary security credentials, such as Root, IAMUser, or Role.
    */
  var `type`: js.UndefOr[string] = js.native
  /**
    * The name or alias of the user or role that issued the session. This value is null if the credentials were obtained from a root account that doesn't have an alias.
    */
  var userName: js.UndefOr[string] = js.native
}

object SessionIssuer {
  @scala.inline
  def apply(
    accountId: string = null,
    arn: string = null,
    principalId: string = null,
    `type`: string = null,
    userName: string = null
  ): SessionIssuer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionIssuer]
  }
}

