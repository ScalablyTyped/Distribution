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
  def apply(
    DomainName: NonEmptyString = null,
    ETag: NonEmptyString = null,
    LastModifiedTime: NonEmptyString = null,
    Logging: AwsCloudFrontDistributionLogging = null,
    Origins: AwsCloudFrontDistributionOrigins = null,
    Status: NonEmptyString = null,
    WebAclId: NonEmptyString = null
  ): AwsCloudFrontDistributionDetails = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Logging != null) __obj.updateDynamic("Logging")(Logging.asInstanceOf[js.Any])
    if (Origins != null) __obj.updateDynamic("Origins")(Origins.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WebAclId != null) __obj.updateDynamic("WebAclId")(WebAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
  }
}

