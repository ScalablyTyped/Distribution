package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workforce extends js.Object {
  /**
    * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to a single  Amazon Cognito user pool.
    */
  var CognitoConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CognitoConfig] = js.native
  /**
    * The date that the workforce is created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The most recent date that was used to successfully add one or more IP address ranges (CIDRs) to a private workforce's allow list.
    */
  var LastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The configuration of an OIDC Identity Provider (IdP) private workforce.
    */
  var OidcConfig: js.UndefOr[OidcConfigForResponse] = js.native
  /**
    * A list of one to ten IP address ranges (CIDRs) to be added to the workforce allow list.
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The subdomain for your OIDC Identity Provider.
    */
  var SubDomain: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the private workforce.
    */
  var WorkforceArn: typings.awsSdk.sagemakerMod.WorkforceArn = js.native
  /**
    * The name of the private workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}

object Workforce {
  @scala.inline
  def apply(WorkforceArn: WorkforceArn, WorkforceName: WorkforceName): Workforce = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any], WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workforce]
  }
  @scala.inline
  implicit class WorkforceOps[Self <: Workforce] (val x: Self) extends AnyVal {
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
    def setWorkforceArn(value: WorkforceArn): Self = this.set("WorkforceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = this.set("WorkforceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoConfig(value: CognitoConfig): Self = this.set("CognitoConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoConfig: Self = this.set("CognitoConfig", js.undefined)
    @scala.inline
    def setCreateDate(value: Timestamp): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    @scala.inline
    def setOidcConfig(value: OidcConfigForResponse): Self = this.set("OidcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOidcConfig: Self = this.set("OidcConfig", js.undefined)
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = this.set("SourceIpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIpConfig: Self = this.set("SourceIpConfig", js.undefined)
    @scala.inline
    def setSubDomain(value: String): Self = this.set("SubDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomain: Self = this.set("SubDomain", js.undefined)
  }
  
}

