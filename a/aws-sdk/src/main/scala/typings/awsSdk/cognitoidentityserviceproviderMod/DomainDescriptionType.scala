package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDescriptionType extends js.Object {
  /**
    * The AWS account ID for the user pool owner.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.native
  /**
    * The ARN of the CloudFront distribution.
    */
  var CloudFrontDistribution: js.UndefOr[StringType] = js.native
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.native
  /**
    * The domain string.
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  var S3Bucket: js.UndefOr[S3BucketType] = js.native
  /**
    * The domain status.
    */
  var Status: js.UndefOr[DomainStatusType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
  /**
    * The app version.
    */
  var Version: js.UndefOr[DomainVersionType] = js.native
}

object DomainDescriptionType {
  @scala.inline
  def apply(): DomainDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescriptionType]
  }
  @scala.inline
  implicit class DomainDescriptionTypeOps[Self <: DomainDescriptionType] (val x: Self) extends AnyVal {
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
    def setAWSAccountId(value: AWSAccountIdType): Self = this.set("AWSAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAWSAccountId: Self = this.set("AWSAccountId", js.undefined)
    @scala.inline
    def setCloudFrontDistribution(value: StringType): Self = this.set("CloudFrontDistribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudFrontDistribution: Self = this.set("CloudFrontDistribution", js.undefined)
    @scala.inline
    def setCustomDomainConfig(value: CustomDomainConfigType): Self = this.set("CustomDomainConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDomainConfig: Self = this.set("CustomDomainConfig", js.undefined)
    @scala.inline
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setS3Bucket(value: S3BucketType): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    @scala.inline
    def setStatus(value: DomainStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
    @scala.inline
    def setVersion(value: DomainVersionType): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

