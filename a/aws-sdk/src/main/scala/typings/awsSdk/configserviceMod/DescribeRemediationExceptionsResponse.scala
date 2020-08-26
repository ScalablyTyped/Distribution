package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExceptionsResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of remediation exception objects.
    */
  var RemediationExceptions: js.UndefOr[typings.awsSdk.configserviceMod.RemediationExceptions] = js.native
}

object DescribeRemediationExceptionsResponse {
  @scala.inline
  def apply(): DescribeRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
  }
  @scala.inline
  implicit class DescribeRemediationExceptionsResponseOps[Self <: DescribeRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRemediationExceptionsVarargs(value: RemediationException*): Self = this.set("RemediationExceptions", js.Array(value :_*))
    @scala.inline
    def setRemediationExceptions(value: RemediationExceptions): Self = this.set("RemediationExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediationExceptions: Self = this.set("RemediationExceptions", js.undefined)
  }
  
}

