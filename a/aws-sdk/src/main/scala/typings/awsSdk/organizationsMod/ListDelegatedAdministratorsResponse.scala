package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDelegatedAdministratorsResponse extends js.Object {
  /**
    * The list of delegated administrators in your organization.
    */
  var DelegatedAdministrators: js.UndefOr[typings.awsSdk.organizationsMod.DelegatedAdministrators] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListDelegatedAdministratorsResponse {
  @scala.inline
  def apply(DelegatedAdministrators: DelegatedAdministrators = null, NextToken: NextToken = null): ListDelegatedAdministratorsResponse = {
    val __obj = js.Dynamic.literal()
    if (DelegatedAdministrators != null) __obj.updateDynamic("DelegatedAdministrators")(DelegatedAdministrators.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDelegatedAdministratorsResponse]
  }
}

