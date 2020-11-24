package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetails extends js.Object {
  
  /**
    * 
    */
  var AwsApiGatewayRestApi: js.UndefOr[AwsApiGatewayRestApiDetails] = js.native
  
  /**
    * 
    */
  var AwsApiGatewayStage: js.UndefOr[AwsApiGatewayStageDetails] = js.native
  
  /**
    * 
    */
  var AwsApiGatewayV2Api: js.UndefOr[AwsApiGatewayV2ApiDetails] = js.native
  
  /**
    * 
    */
  var AwsApiGatewayV2Stage: js.UndefOr[AwsApiGatewayV2StageDetails] = js.native
  
  /**
    * Details for an autoscaling group.
    */
  var AwsAutoScalingAutoScalingGroup: js.UndefOr[AwsAutoScalingAutoScalingGroupDetails] = js.native
  
  /**
    * 
    */
  var AwsCertificateManagerCertificate: js.UndefOr[AwsCertificateManagerCertificateDetails] = js.native
  
  /**
    * Details about a CloudFront distribution.
    */
  var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.native
  
  /**
    * 
    */
  var AwsCloudTrailTrail: js.UndefOr[AwsCloudTrailTrailDetails] = js.native
  
  /**
    * Details for an AWS CodeBuild project.
    */
  var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.native
  
  /**
    * Details about a DynamoDB table.
    */
  var AwsDynamoDbTable: js.UndefOr[AwsDynamoDbTableDetails] = js.native
  
  /**
    * Details about an Elastic IP address.
    */
  var AwsEc2Eip: js.UndefOr[AwsEc2EipDetails] = js.native
  
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.native
  
  /**
    * Details for an Amazon EC2 network interface.
    */
  var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.native
  
  /**
    * Details for an EC2 security group.
    */
  var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.native
  
  /**
    * Details for an EC2 volume.
    */
  var AwsEc2Volume: js.UndefOr[AwsEc2VolumeDetails] = js.native
  
  /**
    * Details for an EC2 VPC.
    */
  var AwsEc2Vpc: js.UndefOr[AwsEc2VpcDetails] = js.native
  
  /**
    * Details for an Elasticsearch domain.
    */
  var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.native
  
  /**
    * 
    */
  var AwsElbLoadBalancer: js.UndefOr[AwsElbLoadBalancerDetails] = js.native
  
  /**
    * Details about a load balancer.
    */
  var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.native
  
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.native
  
  /**
    * 
    */
  var AwsIamGroup: js.UndefOr[AwsIamGroupDetails] = js.native
  
  /**
    * Details about an IAM permissions policy.
    */
  var AwsIamPolicy: js.UndefOr[AwsIamPolicyDetails] = js.native
  
  /**
    * Details about an IAM role.
    */
  var AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.native
  
  /**
    * Details about an IAM user.
    */
  var AwsIamUser: js.UndefOr[AwsIamUserDetails] = js.native
  
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
    * Details about an Amazon RDS database cluster.
    */
  var AwsRdsDbCluster: js.UndefOr[AwsRdsDbClusterDetails] = js.native
  
  /**
    * Details about an Amazon RDS database cluster snapshot.
    */
  var AwsRdsDbClusterSnapshot: js.UndefOr[AwsRdsDbClusterSnapshotDetails] = js.native
  
  /**
    * Details about an Amazon RDS database instance.
    */
  var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.native
  
  /**
    * Details about an Amazon RDS database snapshot.
    */
  var AwsRdsDbSnapshot: js.UndefOr[AwsRdsDbSnapshotDetails] = js.native
  
  /**
    * 
    */
  var AwsRedshiftCluster: js.UndefOr[AwsRedshiftClusterDetails] = js.native
  
  /**
    * Details about an Amazon S3 bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.native
  
  /**
    * Details about an Amazon S3 object related to a finding.
    */
  var AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.native
  
  /**
    * Details about a Secrets Manager secret.
    */
  var AwsSecretsManagerSecret: js.UndefOr[AwsSecretsManagerSecretDetails] = js.native
  
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
  def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit class ResourceDetailsOps[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
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
    def setAwsApiGatewayRestApi(value: AwsApiGatewayRestApiDetails): Self = this.set("AwsApiGatewayRestApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsApiGatewayRestApi: Self = this.set("AwsApiGatewayRestApi", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayStage(value: AwsApiGatewayStageDetails): Self = this.set("AwsApiGatewayStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsApiGatewayStage: Self = this.set("AwsApiGatewayStage", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayV2Api(value: AwsApiGatewayV2ApiDetails): Self = this.set("AwsApiGatewayV2Api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsApiGatewayV2Api: Self = this.set("AwsApiGatewayV2Api", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayV2Stage(value: AwsApiGatewayV2StageDetails): Self = this.set("AwsApiGatewayV2Stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsApiGatewayV2Stage: Self = this.set("AwsApiGatewayV2Stage", js.undefined)
    
    @scala.inline
    def setAwsAutoScalingAutoScalingGroup(value: AwsAutoScalingAutoScalingGroupDetails): Self = this.set("AwsAutoScalingAutoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAutoScalingAutoScalingGroup: Self = this.set("AwsAutoScalingAutoScalingGroup", js.undefined)
    
    @scala.inline
    def setAwsCertificateManagerCertificate(value: AwsCertificateManagerCertificateDetails): Self = this.set("AwsCertificateManagerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsCertificateManagerCertificate: Self = this.set("AwsCertificateManagerCertificate", js.undefined)
    
    @scala.inline
    def setAwsCloudFrontDistribution(value: AwsCloudFrontDistributionDetails): Self = this.set("AwsCloudFrontDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsCloudFrontDistribution: Self = this.set("AwsCloudFrontDistribution", js.undefined)
    
    @scala.inline
    def setAwsCloudTrailTrail(value: AwsCloudTrailTrailDetails): Self = this.set("AwsCloudTrailTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsCloudTrailTrail: Self = this.set("AwsCloudTrailTrail", js.undefined)
    
    @scala.inline
    def setAwsCodeBuildProject(value: AwsCodeBuildProjectDetails): Self = this.set("AwsCodeBuildProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsCodeBuildProject: Self = this.set("AwsCodeBuildProject", js.undefined)
    
    @scala.inline
    def setAwsDynamoDbTable(value: AwsDynamoDbTableDetails): Self = this.set("AwsDynamoDbTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsDynamoDbTable: Self = this.set("AwsDynamoDbTable", js.undefined)
    
    @scala.inline
    def setAwsEc2Eip(value: AwsEc2EipDetails): Self = this.set("AwsEc2Eip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2Eip: Self = this.set("AwsEc2Eip", js.undefined)
    
    @scala.inline
    def setAwsEc2Instance(value: AwsEc2InstanceDetails): Self = this.set("AwsEc2Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2Instance: Self = this.set("AwsEc2Instance", js.undefined)
    
    @scala.inline
    def setAwsEc2NetworkInterface(value: AwsEc2NetworkInterfaceDetails): Self = this.set("AwsEc2NetworkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2NetworkInterface: Self = this.set("AwsEc2NetworkInterface", js.undefined)
    
    @scala.inline
    def setAwsEc2SecurityGroup(value: AwsEc2SecurityGroupDetails): Self = this.set("AwsEc2SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2SecurityGroup: Self = this.set("AwsEc2SecurityGroup", js.undefined)
    
    @scala.inline
    def setAwsEc2Volume(value: AwsEc2VolumeDetails): Self = this.set("AwsEc2Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2Volume: Self = this.set("AwsEc2Volume", js.undefined)
    
    @scala.inline
    def setAwsEc2Vpc(value: AwsEc2VpcDetails): Self = this.set("AwsEc2Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2Vpc: Self = this.set("AwsEc2Vpc", js.undefined)
    
    @scala.inline
    def setAwsElasticsearchDomain(value: AwsElasticsearchDomainDetails): Self = this.set("AwsElasticsearchDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsElasticsearchDomain: Self = this.set("AwsElasticsearchDomain", js.undefined)
    
    @scala.inline
    def setAwsElbLoadBalancer(value: AwsElbLoadBalancerDetails): Self = this.set("AwsElbLoadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsElbLoadBalancer: Self = this.set("AwsElbLoadBalancer", js.undefined)
    
    @scala.inline
    def setAwsElbv2LoadBalancer(value: AwsElbv2LoadBalancerDetails): Self = this.set("AwsElbv2LoadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsElbv2LoadBalancer: Self = this.set("AwsElbv2LoadBalancer", js.undefined)
    
    @scala.inline
    def setAwsIamAccessKey(value: AwsIamAccessKeyDetails): Self = this.set("AwsIamAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIamAccessKey: Self = this.set("AwsIamAccessKey", js.undefined)
    
    @scala.inline
    def setAwsIamGroup(value: AwsIamGroupDetails): Self = this.set("AwsIamGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIamGroup: Self = this.set("AwsIamGroup", js.undefined)
    
    @scala.inline
    def setAwsIamPolicy(value: AwsIamPolicyDetails): Self = this.set("AwsIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIamPolicy: Self = this.set("AwsIamPolicy", js.undefined)
    
    @scala.inline
    def setAwsIamRole(value: AwsIamRoleDetails): Self = this.set("AwsIamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIamRole: Self = this.set("AwsIamRole", js.undefined)
    
    @scala.inline
    def setAwsIamUser(value: AwsIamUserDetails): Self = this.set("AwsIamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIamUser: Self = this.set("AwsIamUser", js.undefined)
    
    @scala.inline
    def setAwsKmsKey(value: AwsKmsKeyDetails): Self = this.set("AwsKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsKmsKey: Self = this.set("AwsKmsKey", js.undefined)
    
    @scala.inline
    def setAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = this.set("AwsLambdaFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsLambdaFunction: Self = this.set("AwsLambdaFunction", js.undefined)
    
    @scala.inline
    def setAwsLambdaLayerVersion(value: AwsLambdaLayerVersionDetails): Self = this.set("AwsLambdaLayerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsLambdaLayerVersion: Self = this.set("AwsLambdaLayerVersion", js.undefined)
    
    @scala.inline
    def setAwsRdsDbCluster(value: AwsRdsDbClusterDetails): Self = this.set("AwsRdsDbCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRdsDbCluster: Self = this.set("AwsRdsDbCluster", js.undefined)
    
    @scala.inline
    def setAwsRdsDbClusterSnapshot(value: AwsRdsDbClusterSnapshotDetails): Self = this.set("AwsRdsDbClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRdsDbClusterSnapshot: Self = this.set("AwsRdsDbClusterSnapshot", js.undefined)
    
    @scala.inline
    def setAwsRdsDbInstance(value: AwsRdsDbInstanceDetails): Self = this.set("AwsRdsDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRdsDbInstance: Self = this.set("AwsRdsDbInstance", js.undefined)
    
    @scala.inline
    def setAwsRdsDbSnapshot(value: AwsRdsDbSnapshotDetails): Self = this.set("AwsRdsDbSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRdsDbSnapshot: Self = this.set("AwsRdsDbSnapshot", js.undefined)
    
    @scala.inline
    def setAwsRedshiftCluster(value: AwsRedshiftClusterDetails): Self = this.set("AwsRedshiftCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRedshiftCluster: Self = this.set("AwsRedshiftCluster", js.undefined)
    
    @scala.inline
    def setAwsS3Bucket(value: AwsS3BucketDetails): Self = this.set("AwsS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsS3Bucket: Self = this.set("AwsS3Bucket", js.undefined)
    
    @scala.inline
    def setAwsS3Object(value: AwsS3ObjectDetails): Self = this.set("AwsS3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsS3Object: Self = this.set("AwsS3Object", js.undefined)
    
    @scala.inline
    def setAwsSecretsManagerSecret(value: AwsSecretsManagerSecretDetails): Self = this.set("AwsSecretsManagerSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSecretsManagerSecret: Self = this.set("AwsSecretsManagerSecret", js.undefined)
    
    @scala.inline
    def setAwsSnsTopic(value: AwsSnsTopicDetails): Self = this.set("AwsSnsTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSnsTopic: Self = this.set("AwsSnsTopic", js.undefined)
    
    @scala.inline
    def setAwsSqsQueue(value: AwsSqsQueueDetails): Self = this.set("AwsSqsQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSqsQueue: Self = this.set("AwsSqsQueue", js.undefined)
    
    @scala.inline
    def setAwsWafWebAcl(value: AwsWafWebAclDetails): Self = this.set("AwsWafWebAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsWafWebAcl: Self = this.set("AwsWafWebAcl", js.undefined)
    
    @scala.inline
    def setContainer(value: ContainerDetails): Self = this.set("Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("Container", js.undefined)
    
    @scala.inline
    def setOther(value: FieldMap): Self = this.set("Other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("Other", js.undefined)
  }
}
