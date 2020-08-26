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
  def apply(): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
  @scala.inline
  implicit class ListAWSDefaultServiceQuotasResponseOps[Self <: ListAWSDefaultServiceQuotasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQuotasVarargs(value: ServiceQuota*): Self = this.set("Quotas", js.Array(value :_*))
    @scala.inline
    def setQuotas(value: ServiceQuotaListDefinition): Self = this.set("Quotas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotas: Self = this.set("Quotas", js.undefined)
  }
  
}

