package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedUser extends js.Object {
  /**
    * Reserved for future use.
    */
  var accessKeyId: js.UndefOr[string] = js.native
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
  var sessionContext: js.UndefOr[SessionContext] = js.native
}

object FederatedUser {
  @scala.inline
  def apply(
    accessKeyId: string = null,
    accountId: string = null,
    arn: string = null,
    principalId: string = null,
    sessionContext: SessionContext = null
  ): FederatedUser = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    if (sessionContext != null) __obj.updateDynamic("sessionContext")(sessionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedUser]
  }
}

