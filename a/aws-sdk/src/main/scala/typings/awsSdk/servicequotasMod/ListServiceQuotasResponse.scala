package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceQuotasResponse extends js.Object {
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  /**
    * The response information for a quota lists all attribute information for the quota. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.native
}

object ListServiceQuotasResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Quotas: ServiceQuotaListDefinition = null): ListServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Quotas != null) __obj.updateDynamic("Quotas")(Quotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceQuotasResponse]
  }
}

