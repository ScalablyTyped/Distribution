package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCallerIdentityResponse extends js.Object {
  /**
    * The AWS account ID number of the account that owns or contains the calling entity.
    */
  var Account: js.UndefOr[accountType] = js.native
  /**
    * The AWS ARN associated with the calling entity.
    */
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * The unique identifier of the calling entity. The exact value depends on the type of entity that is making the call. The values returned are those listed in the aws:userid column in the Principal table found on the Policy Variables reference page in the IAM User Guide.
    */
  var UserId: js.UndefOr[userIdType] = js.native
}

object GetCallerIdentityResponse {
  @scala.inline
  def apply(Account: accountType = null, Arn: arnType = null, UserId: userIdType = null): GetCallerIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCallerIdentityResponse]
  }
}

