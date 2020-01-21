package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecretsResponse extends js.Object {
  /**
    * If present in the response, this value indicates that there's more output available than what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextTokenType] = js.native
  /**
    * A list of the secrets in the account.
    */
  var SecretList: js.UndefOr[SecretListType] = js.native
}

object ListSecretsResponse {
  @scala.inline
  def apply(NextToken: NextTokenType = null, SecretList: SecretListType = null): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SecretList != null) __obj.updateDynamic("SecretList")(SecretList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecretsResponse]
  }
}

