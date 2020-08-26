package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionDetails extends js.Object {
  /**
    * The domain name corresponding to the distribution.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The entity tag is a hash of the object.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time that the distribution was last modified.
    */
  var LastModifiedTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  var Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.native
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.native
  /**
    * Indicates the current status of the distribution.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionDetails {
  @scala.inline
  def apply(): AwsCloudFrontDistributionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionDetailsOps[Self <: AwsCloudFrontDistributionDetails] (val x: Self) extends AnyVal {
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
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setETag(value: NonEmptyString): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: NonEmptyString): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setLogging(value: AwsCloudFrontDistributionLogging): Self = this.set("Logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("Logging", js.undefined)
    @scala.inline
    def setOrigins(value: AwsCloudFrontDistributionOrigins): Self = this.set("Origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("Origins", js.undefined)
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setWebAclId(value: NonEmptyString): Self = this.set("WebAclId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebAclId: Self = this.set("WebAclId", js.undefined)
  }
  
}

