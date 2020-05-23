package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trail extends js.Object {
  /**
    * Specifies an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a trail has insight types specified in an InsightSelector list.
    */
  var HasInsightSelectors: js.UndefOr[Boolean] = js.native
  /**
    * The region in which the trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  /**
    * Set to True to include AWS API calls from AWS global services such as IAM. Otherwise, False.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail exists only in one region or exists in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail is an organization trail.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies whether log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Name of the trail set by calling CreateTrail. The maximum length is 128 characters.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Name of the Amazon S3 bucket into which CloudTrail delivers your trail files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.The maximum length is 200 characters.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
  /**
    * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
    */
  var SnsTopicARN: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use. Use SnsTopicARN.
    */
  var SnsTopicName: js.UndefOr[String] = js.native
  /**
    * Specifies the ARN of the trail. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object Trail {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: String = null,
    CloudWatchLogsRoleArn: String = null,
    HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
    HasInsightSelectors: js.UndefOr[Boolean] = js.undefined,
    HomeRegion: String = null,
    IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
    IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
    IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
    Name: String = null,
    S3BucketName: String = null,
    S3KeyPrefix: String = null,
    SnsTopicARN: String = null,
    SnsTopicName: String = null,
    TrailARN: String = null
  ): Trail = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsLogGroupArn != null) __obj.updateDynamic("CloudWatchLogsLogGroupArn")(CloudWatchLogsLogGroupArn.asInstanceOf[js.Any])
    if (CloudWatchLogsRoleArn != null) __obj.updateDynamic("CloudWatchLogsRoleArn")(CloudWatchLogsRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCustomEventSelectors)) __obj.updateDynamic("HasCustomEventSelectors")(HasCustomEventSelectors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HasInsightSelectors)) __obj.updateDynamic("HasInsightSelectors")(HasInsightSelectors.get.asInstanceOf[js.Any])
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeGlobalServiceEvents)) __obj.updateDynamic("IncludeGlobalServiceEvents")(IncludeGlobalServiceEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IsMultiRegionTrail)) __obj.updateDynamic("IsMultiRegionTrail")(IsMultiRegionTrail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IsOrganizationTrail)) __obj.updateDynamic("IsOrganizationTrail")(IsOrganizationTrail.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(LogFileValidationEnabled)) __obj.updateDynamic("LogFileValidationEnabled")(LogFileValidationEnabled.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    if (SnsTopicARN != null) __obj.updateDynamic("SnsTopicARN")(SnsTopicARN.asInstanceOf[js.Any])
    if (SnsTopicName != null) __obj.updateDynamic("SnsTopicName")(SnsTopicName.asInstanceOf[js.Any])
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trail]
  }
}

