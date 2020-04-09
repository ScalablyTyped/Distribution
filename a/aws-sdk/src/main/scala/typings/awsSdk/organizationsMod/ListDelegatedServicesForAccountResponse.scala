package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDelegatedServicesForAccountResponse extends js.Object {
  /**
    * The services for which the account is a delegated administrator.
    */
  var DelegatedServices: js.UndefOr[typings.awsSdk.organizationsMod.DelegatedServices] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListDelegatedServicesForAccountResponse {
  @scala.inline
  def apply(DelegatedServices: DelegatedServices = null, NextToken: NextToken = null): ListDelegatedServicesForAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (DelegatedServices != null) __obj.updateDynamic("DelegatedServices")(DelegatedServices.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDelegatedServicesForAccountResponse]
  }
}

