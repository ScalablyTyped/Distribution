package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetails extends StObject {
  
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
  implicit class ResourceDetailsMutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsApiGatewayRestApi(value: AwsApiGatewayRestApiDetails): Self = StObject.set(x, "AwsApiGatewayRestApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsApiGatewayRestApiUndefined: Self = StObject.set(x, "AwsApiGatewayRestApi", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayStage(value: AwsApiGatewayStageDetails): Self = StObject.set(x, "AwsApiGatewayStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsApiGatewayStageUndefined: Self = StObject.set(x, "AwsApiGatewayStage", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayV2Api(value: AwsApiGatewayV2ApiDetails): Self = StObject.set(x, "AwsApiGatewayV2Api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsApiGatewayV2ApiUndefined: Self = StObject.set(x, "AwsApiGatewayV2Api", js.undefined)
    
    @scala.inline
    def setAwsApiGatewayV2Stage(value: AwsApiGatewayV2StageDetails): Self = StObject.set(x, "AwsApiGatewayV2Stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsApiGatewayV2StageUndefined: Self = StObject.set(x, "AwsApiGatewayV2Stage", js.undefined)
    
    @scala.inline
    def setAwsAutoScalingAutoScalingGroup(value: AwsAutoScalingAutoScalingGroupDetails): Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAutoScalingAutoScalingGroupUndefined: Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", js.undefined)
    
    @scala.inline
    def setAwsCertificateManagerCertificate(value: AwsCertificateManagerCertificateDetails): Self = StObject.set(x, "AwsCertificateManagerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCertificateManagerCertificateUndefined: Self = StObject.set(x, "AwsCertificateManagerCertificate", js.undefined)
    
    @scala.inline
    def setAwsCloudFrontDistribution(value: AwsCloudFrontDistributionDetails): Self = StObject.set(x, "AwsCloudFrontDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCloudFrontDistributionUndefined: Self = StObject.set(x, "AwsCloudFrontDistribution", js.undefined)
    
    @scala.inline
    def setAwsCloudTrailTrail(value: AwsCloudTrailTrailDetails): Self = StObject.set(x, "AwsCloudTrailTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCloudTrailTrailUndefined: Self = StObject.set(x, "AwsCloudTrailTrail", js.undefined)
    
    @scala.inline
    def setAwsCodeBuildProject(value: AwsCodeBuildProjectDetails): Self = StObject.set(x, "AwsCodeBuildProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCodeBuildProjectUndefined: Self = StObject.set(x, "AwsCodeBuildProject", js.undefined)
    
    @scala.inline
    def setAwsDynamoDbTable(value: AwsDynamoDbTableDetails): Self = StObject.set(x, "AwsDynamoDbTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDynamoDbTableUndefined: Self = StObject.set(x, "AwsDynamoDbTable", js.undefined)
    
    @scala.inline
    def setAwsEc2Eip(value: AwsEc2EipDetails): Self = StObject.set(x, "AwsEc2Eip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2EipUndefined: Self = StObject.set(x, "AwsEc2Eip", js.undefined)
    
    @scala.inline
    def setAwsEc2Instance(value: AwsEc2InstanceDetails): Self = StObject.set(x, "AwsEc2Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2InstanceUndefined: Self = StObject.set(x, "AwsEc2Instance", js.undefined)
    
    @scala.inline
    def setAwsEc2NetworkInterface(value: AwsEc2NetworkInterfaceDetails): Self = StObject.set(x, "AwsEc2NetworkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2NetworkInterfaceUndefined: Self = StObject.set(x, "AwsEc2NetworkInterface", js.undefined)
    
    @scala.inline
    def setAwsEc2SecurityGroup(value: AwsEc2SecurityGroupDetails): Self = StObject.set(x, "AwsEc2SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2SecurityGroupUndefined: Self = StObject.set(x, "AwsEc2SecurityGroup", js.undefined)
    
    @scala.inline
    def setAwsEc2Volume(value: AwsEc2VolumeDetails): Self = StObject.set(x, "AwsEc2Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2VolumeUndefined: Self = StObject.set(x, "AwsEc2Volume", js.undefined)
    
    @scala.inline
    def setAwsEc2Vpc(value: AwsEc2VpcDetails): Self = StObject.set(x, "AwsEc2Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2VpcUndefined: Self = StObject.set(x, "AwsEc2Vpc", js.undefined)
    
    @scala.inline
    def setAwsElasticsearchDomain(value: AwsElasticsearchDomainDetails): Self = StObject.set(x, "AwsElasticsearchDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsElasticsearchDomainUndefined: Self = StObject.set(x, "AwsElasticsearchDomain", js.undefined)
    
    @scala.inline
    def setAwsElbLoadBalancer(value: AwsElbLoadBalancerDetails): Self = StObject.set(x, "AwsElbLoadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsElbLoadBalancerUndefined: Self = StObject.set(x, "AwsElbLoadBalancer", js.undefined)
    
    @scala.inline
    def setAwsElbv2LoadBalancer(value: AwsElbv2LoadBalancerDetails): Self = StObject.set(x, "AwsElbv2LoadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsElbv2LoadBalancerUndefined: Self = StObject.set(x, "AwsElbv2LoadBalancer", js.undefined)
    
    @scala.inline
    def setAwsIamAccessKey(value: AwsIamAccessKeyDetails): Self = StObject.set(x, "AwsIamAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamAccessKeyUndefined: Self = StObject.set(x, "AwsIamAccessKey", js.undefined)
    
    @scala.inline
    def setAwsIamGroup(value: AwsIamGroupDetails): Self = StObject.set(x, "AwsIamGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamGroupUndefined: Self = StObject.set(x, "AwsIamGroup", js.undefined)
    
    @scala.inline
    def setAwsIamPolicy(value: AwsIamPolicyDetails): Self = StObject.set(x, "AwsIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamPolicyUndefined: Self = StObject.set(x, "AwsIamPolicy", js.undefined)
    
    @scala.inline
    def setAwsIamRole(value: AwsIamRoleDetails): Self = StObject.set(x, "AwsIamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamRoleUndefined: Self = StObject.set(x, "AwsIamRole", js.undefined)
    
    @scala.inline
    def setAwsIamUser(value: AwsIamUserDetails): Self = StObject.set(x, "AwsIamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamUserUndefined: Self = StObject.set(x, "AwsIamUser", js.undefined)
    
    @scala.inline
    def setAwsKmsKey(value: AwsKmsKeyDetails): Self = StObject.set(x, "AwsKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyUndefined: Self = StObject.set(x, "AwsKmsKey", js.undefined)
    
    @scala.inline
    def setAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = StObject.set(x, "AwsLambdaFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsLambdaFunctionUndefined: Self = StObject.set(x, "AwsLambdaFunction", js.undefined)
    
    @scala.inline
    def setAwsLambdaLayerVersion(value: AwsLambdaLayerVersionDetails): Self = StObject.set(x, "AwsLambdaLayerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsLambdaLayerVersionUndefined: Self = StObject.set(x, "AwsLambdaLayerVersion", js.undefined)
    
    @scala.inline
    def setAwsRdsDbCluster(value: AwsRdsDbClusterDetails): Self = StObject.set(x, "AwsRdsDbCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRdsDbClusterSnapshot(value: AwsRdsDbClusterSnapshotDetails): Self = StObject.set(x, "AwsRdsDbClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRdsDbClusterSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbClusterSnapshot", js.undefined)
    
    @scala.inline
    def setAwsRdsDbClusterUndefined: Self = StObject.set(x, "AwsRdsDbCluster", js.undefined)
    
    @scala.inline
    def setAwsRdsDbInstance(value: AwsRdsDbInstanceDetails): Self = StObject.set(x, "AwsRdsDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRdsDbInstanceUndefined: Self = StObject.set(x, "AwsRdsDbInstance", js.undefined)
    
    @scala.inline
    def setAwsRdsDbSnapshot(value: AwsRdsDbSnapshotDetails): Self = StObject.set(x, "AwsRdsDbSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRdsDbSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbSnapshot", js.undefined)
    
    @scala.inline
    def setAwsRedshiftCluster(value: AwsRedshiftClusterDetails): Self = StObject.set(x, "AwsRedshiftCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRedshiftClusterUndefined: Self = StObject.set(x, "AwsRedshiftCluster", js.undefined)
    
    @scala.inline
    def setAwsS3Bucket(value: AwsS3BucketDetails): Self = StObject.set(x, "AwsS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsS3BucketUndefined: Self = StObject.set(x, "AwsS3Bucket", js.undefined)
    
    @scala.inline
    def setAwsS3Object(value: AwsS3ObjectDetails): Self = StObject.set(x, "AwsS3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsS3ObjectUndefined: Self = StObject.set(x, "AwsS3Object", js.undefined)
    
    @scala.inline
    def setAwsSecretsManagerSecret(value: AwsSecretsManagerSecretDetails): Self = StObject.set(x, "AwsSecretsManagerSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsSecretsManagerSecretUndefined: Self = StObject.set(x, "AwsSecretsManagerSecret", js.undefined)
    
    @scala.inline
    def setAwsSnsTopic(value: AwsSnsTopicDetails): Self = StObject.set(x, "AwsSnsTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsSnsTopicUndefined: Self = StObject.set(x, "AwsSnsTopic", js.undefined)
    
    @scala.inline
    def setAwsSqsQueue(value: AwsSqsQueueDetails): Self = StObject.set(x, "AwsSqsQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsSqsQueueUndefined: Self = StObject.set(x, "AwsSqsQueue", js.undefined)
    
    @scala.inline
    def setAwsWafWebAcl(value: AwsWafWebAclDetails): Self = StObject.set(x, "AwsWafWebAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsWafWebAclUndefined: Self = StObject.set(x, "AwsWafWebAcl", js.undefined)
    
    @scala.inline
    def setContainer(value: ContainerDetails): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    @scala.inline
    def setOther(value: FieldMap): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherUndefined: Self = StObject.set(x, "Other", js.undefined)
  }
}
