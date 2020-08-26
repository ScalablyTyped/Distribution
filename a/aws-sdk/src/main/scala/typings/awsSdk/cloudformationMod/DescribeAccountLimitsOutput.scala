package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
    */
  var AccountLimits: js.UndefOr[AccountLimitList] = js.native
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object DescribeAccountLimitsOutput {
  @scala.inline
  def apply(): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
  @scala.inline
  implicit class DescribeAccountLimitsOutputOps[Self <: DescribeAccountLimitsOutput] (val x: Self) extends AnyVal {
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
    def setAccountLimitsVarargs(value: AccountLimit*): Self = this.set("AccountLimits", js.Array(value :_*))
    @scala.inline
    def setAccountLimits(value: AccountLimitList): Self = this.set("AccountLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountLimits: Self = this.set("AccountLimits", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

