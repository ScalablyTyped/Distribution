package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamUser extends js.Object {
  /**
    * Reserved for future use.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var principalId: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var userName: js.UndefOr[string] = js.native
}

object IamUser {
  @scala.inline
  def apply(accountId: string = null, arn: string = null, principalId: string = null, userName: string = null): IamUser = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamUser]
  }
}

