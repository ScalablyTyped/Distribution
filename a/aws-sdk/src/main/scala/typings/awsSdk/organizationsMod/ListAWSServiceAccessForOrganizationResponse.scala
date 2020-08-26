package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
  /**
    * A list of the service principals for the services that are enabled to integrate with your organization. Each principal is a structure that includes the name and the date that it was enabled for integration with AWS Organizations.
    */
  var EnabledServicePrincipals: js.UndefOr[typings.awsSdk.organizationsMod.EnabledServicePrincipals] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListAWSServiceAccessForOrganizationResponse {
  @scala.inline
  def apply(): ListAWSServiceAccessForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
  }
  @scala.inline
  implicit class ListAWSServiceAccessForOrganizationResponseOps[Self <: ListAWSServiceAccessForOrganizationResponse] (val x: Self) extends AnyVal {
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
    def setEnabledServicePrincipalsVarargs(value: EnabledServicePrincipal*): Self = this.set("EnabledServicePrincipals", js.Array(value :_*))
    @scala.inline
    def setEnabledServicePrincipals(value: EnabledServicePrincipals): Self = this.set("EnabledServicePrincipals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledServicePrincipals: Self = this.set("EnabledServicePrincipals", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

