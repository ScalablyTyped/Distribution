package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingsResponse extends js.Object {
  /**
    * Indicates whether cross-account discovery has been enabled.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member accounts with access to this share.
    */
  var LicenseManagerResourceShareArn: js.UndefOr[String] = js.native
  /**
    * Indicates whether AWS Organizations has been integrated with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  /**
    * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  /**
    * SNS topic configured to receive notifications from License Manager.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}

object GetServiceSettingsResponse {
  @scala.inline
  def apply(
    EnableCrossAccountsDiscovery: js.UndefOr[scala.Boolean] = js.undefined,
    LicenseManagerResourceShareArn: String = null,
    OrganizationConfiguration: OrganizationConfiguration = null,
    S3BucketArn: String = null,
    SnsTopicArn: String = null
  ): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableCrossAccountsDiscovery)) __obj.updateDynamic("EnableCrossAccountsDiscovery")(EnableCrossAccountsDiscovery.asInstanceOf[js.Any])
    if (LicenseManagerResourceShareArn != null) __obj.updateDynamic("LicenseManagerResourceShareArn")(LicenseManagerResourceShareArn.asInstanceOf[js.Any])
    if (OrganizationConfiguration != null) __obj.updateDynamic("OrganizationConfiguration")(OrganizationConfiguration.asInstanceOf[js.Any])
    if (S3BucketArn != null) __obj.updateDynamic("S3BucketArn")(S3BucketArn.asInstanceOf[js.Any])
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
}

