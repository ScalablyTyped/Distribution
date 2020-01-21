package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAWSDefaultServiceQuotasResponse extends js.Object {
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * A list of the quotas in the account with the AWS default values. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.native
}

object ListAWSDefaultServiceQuotasResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Quotas: ServiceQuotaListDefinition = null): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Quotas != null) __obj.updateDynamic("Quotas")(Quotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
}

