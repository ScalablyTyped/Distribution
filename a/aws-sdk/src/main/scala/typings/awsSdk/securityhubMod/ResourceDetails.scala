package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDetails extends js.Object {
  /**
    * Details about a CloudFront distribution.
    */
  var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.native
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.native
  /**
    * Details about a load balancer.
    */
  var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.native
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.native
  /**
    * Details about an IAM role.
    */
  var AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.native
  /**
    * Details about a KMS key.
    */
  var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.native
  /**
    * Details about a Lambda function.
    */
  var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.native
  /**
    * Details about an Amazon S3 Bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.native
  /**
    * Details about an SNS topic.
    */
  var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.native
  /**
    * Details about an SQS queue.
    */
  var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.native
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.native
  /**
    * Details about a resource that doesn't have a specific type defined.
    */
  var Other: js.UndefOr[FieldMap] = js.native
}

object ResourceDetails {
  @scala.inline
  def apply(
    AwsCloudFrontDistribution: AwsCloudFrontDistributionDetails = null,
    AwsEc2Instance: AwsEc2InstanceDetails = null,
    AwsElbv2LoadBalancer: AwsElbv2LoadBalancerDetails = null,
    AwsIamAccessKey: AwsIamAccessKeyDetails = null,
    AwsIamRole: AwsIamRoleDetails = null,
    AwsKmsKey: AwsKmsKeyDetails = null,
    AwsLambdaFunction: AwsLambdaFunctionDetails = null,
    AwsS3Bucket: AwsS3BucketDetails = null,
    AwsSnsTopic: AwsSnsTopicDetails = null,
    AwsSqsQueue: AwsSqsQueueDetails = null,
    Container: ContainerDetails = null,
    Other: FieldMap = null
  ): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (AwsCloudFrontDistribution != null) __obj.updateDynamic("AwsCloudFrontDistribution")(AwsCloudFrontDistribution.asInstanceOf[js.Any])
    if (AwsEc2Instance != null) __obj.updateDynamic("AwsEc2Instance")(AwsEc2Instance.asInstanceOf[js.Any])
    if (AwsElbv2LoadBalancer != null) __obj.updateDynamic("AwsElbv2LoadBalancer")(AwsElbv2LoadBalancer.asInstanceOf[js.Any])
    if (AwsIamAccessKey != null) __obj.updateDynamic("AwsIamAccessKey")(AwsIamAccessKey.asInstanceOf[js.Any])
    if (AwsIamRole != null) __obj.updateDynamic("AwsIamRole")(AwsIamRole.asInstanceOf[js.Any])
    if (AwsKmsKey != null) __obj.updateDynamic("AwsKmsKey")(AwsKmsKey.asInstanceOf[js.Any])
    if (AwsLambdaFunction != null) __obj.updateDynamic("AwsLambdaFunction")(AwsLambdaFunction.asInstanceOf[js.Any])
    if (AwsS3Bucket != null) __obj.updateDynamic("AwsS3Bucket")(AwsS3Bucket.asInstanceOf[js.Any])
    if (AwsSnsTopic != null) __obj.updateDynamic("AwsSnsTopic")(AwsSnsTopic.asInstanceOf[js.Any])
    if (AwsSqsQueue != null) __obj.updateDynamic("AwsSqsQueue")(AwsSqsQueue.asInstanceOf[js.Any])
    if (Container != null) __obj.updateDynamic("Container")(Container.asInstanceOf[js.Any])
    if (Other != null) __obj.updateDynamic("Other")(Other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetails]
  }
}

