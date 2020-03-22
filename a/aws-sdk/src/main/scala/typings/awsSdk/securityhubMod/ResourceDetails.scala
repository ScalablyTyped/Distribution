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
    * Details for an AWS CodeBuild project.
    */
  var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.native
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.native
  /**
    * Details for an AWS EC2 network interface.
    */
  var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.native
  /**
    * Details for an EC2 security group.
    */
  var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.native
  /**
    * Details for an Elasticsearch domain.
    */
  var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.native
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
    * Details for a Lambda layer version.
    */
  var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails] = js.native
  /**
    * Details for an RDS database instance.
    */
  var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.native
  /**
    * Details about an Amazon S3 Bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.native
  /**
    * Details about an Amazon S3 object related to a finding.
    */
  var AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.native
  /**
    * Details about an SNS topic.
    */
  var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.native
  /**
    * Details about an SQS queue.
    */
  var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.native
  /**
    * Details for a WAF WebACL.
    */
  var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails] = js.native
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.native
  /**
    * Details about a resource that are not available in a type-specific details object. Use the Other object in the following cases.   The type-specific object does not contain all of the fields that you want to populate. In this case, first use the type-specific object to populate those fields. Use the Other object to populate the fields that are missing from the type-specific object.   The resource type does not have a corresponding object. This includes resources for which the type is Other.   
    */
  var Other: js.UndefOr[FieldMap] = js.native
}

object ResourceDetails {
  @scala.inline
  def apply(
    AwsCloudFrontDistribution: AwsCloudFrontDistributionDetails = null,
    AwsCodeBuildProject: AwsCodeBuildProjectDetails = null,
    AwsEc2Instance: AwsEc2InstanceDetails = null,
    AwsEc2NetworkInterface: AwsEc2NetworkInterfaceDetails = null,
    AwsEc2SecurityGroup: AwsEc2SecurityGroupDetails = null,
    AwsElasticsearchDomain: AwsElasticsearchDomainDetails = null,
    AwsElbv2LoadBalancer: AwsElbv2LoadBalancerDetails = null,
    AwsIamAccessKey: AwsIamAccessKeyDetails = null,
    AwsIamRole: AwsIamRoleDetails = null,
    AwsKmsKey: AwsKmsKeyDetails = null,
    AwsLambdaFunction: AwsLambdaFunctionDetails = null,
    AwsLambdaLayerVersion: AwsLambdaLayerVersionDetails = null,
    AwsRdsDbInstance: AwsRdsDbInstanceDetails = null,
    AwsS3Bucket: AwsS3BucketDetails = null,
    AwsS3Object: AwsS3ObjectDetails = null,
    AwsSnsTopic: AwsSnsTopicDetails = null,
    AwsSqsQueue: AwsSqsQueueDetails = null,
    AwsWafWebAcl: AwsWafWebAclDetails = null,
    Container: ContainerDetails = null,
    Other: FieldMap = null
  ): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (AwsCloudFrontDistribution != null) __obj.updateDynamic("AwsCloudFrontDistribution")(AwsCloudFrontDistribution.asInstanceOf[js.Any])
    if (AwsCodeBuildProject != null) __obj.updateDynamic("AwsCodeBuildProject")(AwsCodeBuildProject.asInstanceOf[js.Any])
    if (AwsEc2Instance != null) __obj.updateDynamic("AwsEc2Instance")(AwsEc2Instance.asInstanceOf[js.Any])
    if (AwsEc2NetworkInterface != null) __obj.updateDynamic("AwsEc2NetworkInterface")(AwsEc2NetworkInterface.asInstanceOf[js.Any])
    if (AwsEc2SecurityGroup != null) __obj.updateDynamic("AwsEc2SecurityGroup")(AwsEc2SecurityGroup.asInstanceOf[js.Any])
    if (AwsElasticsearchDomain != null) __obj.updateDynamic("AwsElasticsearchDomain")(AwsElasticsearchDomain.asInstanceOf[js.Any])
    if (AwsElbv2LoadBalancer != null) __obj.updateDynamic("AwsElbv2LoadBalancer")(AwsElbv2LoadBalancer.asInstanceOf[js.Any])
    if (AwsIamAccessKey != null) __obj.updateDynamic("AwsIamAccessKey")(AwsIamAccessKey.asInstanceOf[js.Any])
    if (AwsIamRole != null) __obj.updateDynamic("AwsIamRole")(AwsIamRole.asInstanceOf[js.Any])
    if (AwsKmsKey != null) __obj.updateDynamic("AwsKmsKey")(AwsKmsKey.asInstanceOf[js.Any])
    if (AwsLambdaFunction != null) __obj.updateDynamic("AwsLambdaFunction")(AwsLambdaFunction.asInstanceOf[js.Any])
    if (AwsLambdaLayerVersion != null) __obj.updateDynamic("AwsLambdaLayerVersion")(AwsLambdaLayerVersion.asInstanceOf[js.Any])
    if (AwsRdsDbInstance != null) __obj.updateDynamic("AwsRdsDbInstance")(AwsRdsDbInstance.asInstanceOf[js.Any])
    if (AwsS3Bucket != null) __obj.updateDynamic("AwsS3Bucket")(AwsS3Bucket.asInstanceOf[js.Any])
    if (AwsS3Object != null) __obj.updateDynamic("AwsS3Object")(AwsS3Object.asInstanceOf[js.Any])
    if (AwsSnsTopic != null) __obj.updateDynamic("AwsSnsTopic")(AwsSnsTopic.asInstanceOf[js.Any])
    if (AwsSqsQueue != null) __obj.updateDynamic("AwsSqsQueue")(AwsSqsQueue.asInstanceOf[js.Any])
    if (AwsWafWebAcl != null) __obj.updateDynamic("AwsWafWebAcl")(AwsWafWebAcl.asInstanceOf[js.Any])
    if (Container != null) __obj.updateDynamic("Container")(Container.asInstanceOf[js.Any])
    if (Other != null) __obj.updateDynamic("Other")(Other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetails]
  }
}

