package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCreateAccountStatusResponse extends js.Object {
  /**
    * A structure that contains the current status of an account creation request.
    */
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}

object DescribeCreateAccountStatusResponse {
  @scala.inline
  def apply(CreateAccountStatus: CreateAccountStatus = null): DescribeCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatus != null) __obj.updateDynamic("CreateAccountStatus")(CreateAccountStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
  }
}

