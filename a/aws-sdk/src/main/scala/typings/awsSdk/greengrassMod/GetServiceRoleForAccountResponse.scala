package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceRoleForAccountResponse extends js.Object {
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the role which is associated with the account.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object GetServiceRoleForAccountResponse {
  @scala.inline
  def apply(AssociatedAt: string = null, RoleArn: string = null): GetServiceRoleForAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceRoleForAccountResponse]
  }
}

