package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigRulesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of OrganizationConfigRule objects.
    */
  var OrganizationConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConfigRules] = js.native
}

object DescribeOrganizationConfigRulesResponse {
  @scala.inline
  def apply(): DescribeOrganizationConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConfigRulesResponseOps[Self <: DescribeOrganizationConfigRulesResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationConfigRulesVarargs(value: OrganizationConfigRule*): Self = this.set("OrganizationConfigRules", js.Array(value :_*))
    @scala.inline
    def setOrganizationConfigRules(value: OrganizationConfigRules): Self = this.set("OrganizationConfigRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationConfigRules: Self = this.set("OrganizationConfigRules", js.undefined)
  }
  
}

