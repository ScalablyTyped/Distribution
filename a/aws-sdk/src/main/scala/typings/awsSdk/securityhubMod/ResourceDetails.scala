package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * 
    */
  var AwsApiGatewayRestApi: js.UndefOr[AwsApiGatewayRestApiDetails] = js.undefined
  
  /**
    * 
    */
  var AwsApiGatewayStage: js.UndefOr[AwsApiGatewayStageDetails] = js.undefined
  
  /**
    * 
    */
  var AwsApiGatewayV2Api: js.UndefOr[AwsApiGatewayV2ApiDetails] = js.undefined
  
  /**
    * 
    */
  var AwsApiGatewayV2Stage: js.UndefOr[AwsApiGatewayV2StageDetails] = js.undefined
  
  /**
    * Details for an autoscaling group.
    */
  var AwsAutoScalingAutoScalingGroup: js.UndefOr[AwsAutoScalingAutoScalingGroupDetails] = js.undefined
  
  /**
    * 
    */
  var AwsCertificateManagerCertificate: js.UndefOr[AwsCertificateManagerCertificateDetails] = js.undefined
  
  /**
    * Details about a CloudFront distribution.
    */
  var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.undefined
  
  /**
    * 
    */
  var AwsCloudTrailTrail: js.UndefOr[AwsCloudTrailTrailDetails] = js.undefined
  
  /**
    * Details for an AWS CodeBuild project.
    */
  var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.undefined
  
  /**
    * Details about a DynamoDB table.
    */
  var AwsDynamoDbTable: js.UndefOr[AwsDynamoDbTableDetails] = js.undefined
  
  /**
    * Details about an Elastic IP address.
    */
  var AwsEc2Eip: js.UndefOr[AwsEc2EipDetails] = js.undefined
  
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
  
  /**
    * Details for an Amazon EC2 network interface.
    */
  var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.undefined
  
  /**
    * Details for an EC2 security group.
    */
  var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.undefined
  
  /**
    * Details for an EC2 volume.
    */
  var AwsEc2Volume: js.UndefOr[AwsEc2VolumeDetails] = js.undefined
  
  /**
    * Details for an EC2 VPC.
    */
  var AwsEc2Vpc: js.UndefOr[AwsEc2VpcDetails] = js.undefined
  
  /**
    * Details for an Elasticsearch domain.
    */
  var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.undefined
  
  /**
    * 
    */
  var AwsElbLoadBalancer: js.UndefOr[AwsElbLoadBalancerDetails] = js.undefined
  
  /**
    * Details about a load balancer.
    */
  var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.undefined
  
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined
  
  /**
    * 
    */
  var AwsIamGroup: js.UndefOr[AwsIamGroupDetails] = js.undefined
  
  /**
    * Details about an IAM permissions policy.
    */
  var AwsIamPolicy: js.UndefOr[AwsIamPolicyDetails] = js.undefined
  
  /**
    * Details about an IAM role.
    */
  var AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.undefined
  
  /**
    * Details about an IAM user.
    */
  var AwsIamUser: js.UndefOr[AwsIamUserDetails] = js.undefined
  
  /**
    * Details about a KMS key.
    */
  var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.undefined
  
  /**
    * Details about a Lambda function.
    */
  var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined
  
  /**
    * Details for a Lambda layer version.
    */
  var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database cluster.
    */
  var AwsRdsDbCluster: js.UndefOr[AwsRdsDbClusterDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database cluster snapshot.
    */
  var AwsRdsDbClusterSnapshot: js.UndefOr[AwsRdsDbClusterSnapshotDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database instance.
    */
  var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database snapshot.
    */
  var AwsRdsDbSnapshot: js.UndefOr[AwsRdsDbSnapshotDetails] = js.undefined
  
  /**
    * 
    */
  var AwsRedshiftCluster: js.UndefOr[AwsRedshiftClusterDetails] = js.undefined
  
  /**
    * Details about an Amazon S3 bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined
  
  /**
    * Details about an Amazon S3 object related to a finding.
    */
  var AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.undefined
  
  /**
    * Details about a Secrets Manager secret.
    */
  var AwsSecretsManagerSecret: js.UndefOr[AwsSecretsManagerSecretDetails] = js.undefined
  
  /**
    * Details about an SNS topic.
    */
  var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.undefined
  
  /**
    * Details about an SQS queue.
    */
  var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.undefined
  
  /**
    * Details for a WAF WebACL.
    */
  var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails] = js.undefined
  
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.undefined
  
  /**
    * Details about a resource that are not available in a type-specific details object. Use the Other object in the following cases.   The type-specific object does not contain all of the fields that you want to populate. In this case, first use the type-specific object to populate those fields. Use the Other object to populate the fields that are missing from the type-specific object.   The resource type does not have a corresponding object. This includes resources for which the type is Other.   
    */
  var Other: js.UndefOr[FieldMap] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  extension [Self <: ResourceDetails](x: Self) {
    
    inline def setAwsApiGatewayRestApi(value: AwsApiGatewayRestApiDetails): Self = StObject.set(x, "AwsApiGatewayRestApi", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayRestApiUndefined: Self = StObject.set(x, "AwsApiGatewayRestApi", js.undefined)
    
    inline def setAwsApiGatewayStage(value: AwsApiGatewayStageDetails): Self = StObject.set(x, "AwsApiGatewayStage", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayStageUndefined: Self = StObject.set(x, "AwsApiGatewayStage", js.undefined)
    
    inline def setAwsApiGatewayV2Api(value: AwsApiGatewayV2ApiDetails): Self = StObject.set(x, "AwsApiGatewayV2Api", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayV2ApiUndefined: Self = StObject.set(x, "AwsApiGatewayV2Api", js.undefined)
    
    inline def setAwsApiGatewayV2Stage(value: AwsApiGatewayV2StageDetails): Self = StObject.set(x, "AwsApiGatewayV2Stage", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayV2StageUndefined: Self = StObject.set(x, "AwsApiGatewayV2Stage", js.undefined)
    
    inline def setAwsAutoScalingAutoScalingGroup(value: AwsAutoScalingAutoScalingGroupDetails): Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsAutoScalingAutoScalingGroupUndefined: Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", js.undefined)
    
    inline def setAwsCertificateManagerCertificate(value: AwsCertificateManagerCertificateDetails): Self = StObject.set(x, "AwsCertificateManagerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAwsCertificateManagerCertificateUndefined: Self = StObject.set(x, "AwsCertificateManagerCertificate", js.undefined)
    
    inline def setAwsCloudFrontDistribution(value: AwsCloudFrontDistributionDetails): Self = StObject.set(x, "AwsCloudFrontDistribution", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudFrontDistributionUndefined: Self = StObject.set(x, "AwsCloudFrontDistribution", js.undefined)
    
    inline def setAwsCloudTrailTrail(value: AwsCloudTrailTrailDetails): Self = StObject.set(x, "AwsCloudTrailTrail", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudTrailTrailUndefined: Self = StObject.set(x, "AwsCloudTrailTrail", js.undefined)
    
    inline def setAwsCodeBuildProject(value: AwsCodeBuildProjectDetails): Self = StObject.set(x, "AwsCodeBuildProject", value.asInstanceOf[js.Any])
    
    inline def setAwsCodeBuildProjectUndefined: Self = StObject.set(x, "AwsCodeBuildProject", js.undefined)
    
    inline def setAwsDynamoDbTable(value: AwsDynamoDbTableDetails): Self = StObject.set(x, "AwsDynamoDbTable", value.asInstanceOf[js.Any])
    
    inline def setAwsDynamoDbTableUndefined: Self = StObject.set(x, "AwsDynamoDbTable", js.undefined)
    
    inline def setAwsEc2Eip(value: AwsEc2EipDetails): Self = StObject.set(x, "AwsEc2Eip", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2EipUndefined: Self = StObject.set(x, "AwsEc2Eip", js.undefined)
    
    inline def setAwsEc2Instance(value: AwsEc2InstanceDetails): Self = StObject.set(x, "AwsEc2Instance", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2InstanceUndefined: Self = StObject.set(x, "AwsEc2Instance", js.undefined)
    
    inline def setAwsEc2NetworkInterface(value: AwsEc2NetworkInterfaceDetails): Self = StObject.set(x, "AwsEc2NetworkInterface", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkInterfaceUndefined: Self = StObject.set(x, "AwsEc2NetworkInterface", js.undefined)
    
    inline def setAwsEc2SecurityGroup(value: AwsEc2SecurityGroupDetails): Self = StObject.set(x, "AwsEc2SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2SecurityGroupUndefined: Self = StObject.set(x, "AwsEc2SecurityGroup", js.undefined)
    
    inline def setAwsEc2Volume(value: AwsEc2VolumeDetails): Self = StObject.set(x, "AwsEc2Volume", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VolumeUndefined: Self = StObject.set(x, "AwsEc2Volume", js.undefined)
    
    inline def setAwsEc2Vpc(value: AwsEc2VpcDetails): Self = StObject.set(x, "AwsEc2Vpc", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VpcUndefined: Self = StObject.set(x, "AwsEc2Vpc", js.undefined)
    
    inline def setAwsElasticsearchDomain(value: AwsElasticsearchDomainDetails): Self = StObject.set(x, "AwsElasticsearchDomain", value.asInstanceOf[js.Any])
    
    inline def setAwsElasticsearchDomainUndefined: Self = StObject.set(x, "AwsElasticsearchDomain", js.undefined)
    
    inline def setAwsElbLoadBalancer(value: AwsElbLoadBalancerDetails): Self = StObject.set(x, "AwsElbLoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setAwsElbLoadBalancerUndefined: Self = StObject.set(x, "AwsElbLoadBalancer", js.undefined)
    
    inline def setAwsElbv2LoadBalancer(value: AwsElbv2LoadBalancerDetails): Self = StObject.set(x, "AwsElbv2LoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setAwsElbv2LoadBalancerUndefined: Self = StObject.set(x, "AwsElbv2LoadBalancer", js.undefined)
    
    inline def setAwsIamAccessKey(value: AwsIamAccessKeyDetails): Self = StObject.set(x, "AwsIamAccessKey", value.asInstanceOf[js.Any])
    
    inline def setAwsIamAccessKeyUndefined: Self = StObject.set(x, "AwsIamAccessKey", js.undefined)
    
    inline def setAwsIamGroup(value: AwsIamGroupDetails): Self = StObject.set(x, "AwsIamGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsIamGroupUndefined: Self = StObject.set(x, "AwsIamGroup", js.undefined)
    
    inline def setAwsIamPolicy(value: AwsIamPolicyDetails): Self = StObject.set(x, "AwsIamPolicy", value.asInstanceOf[js.Any])
    
    inline def setAwsIamPolicyUndefined: Self = StObject.set(x, "AwsIamPolicy", js.undefined)
    
    inline def setAwsIamRole(value: AwsIamRoleDetails): Self = StObject.set(x, "AwsIamRole", value.asInstanceOf[js.Any])
    
    inline def setAwsIamRoleUndefined: Self = StObject.set(x, "AwsIamRole", js.undefined)
    
    inline def setAwsIamUser(value: AwsIamUserDetails): Self = StObject.set(x, "AwsIamUser", value.asInstanceOf[js.Any])
    
    inline def setAwsIamUserUndefined: Self = StObject.set(x, "AwsIamUser", js.undefined)
    
    inline def setAwsKmsKey(value: AwsKmsKeyDetails): Self = StObject.set(x, "AwsKmsKey", value.asInstanceOf[js.Any])
    
    inline def setAwsKmsKeyUndefined: Self = StObject.set(x, "AwsKmsKey", js.undefined)
    
    inline def setAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = StObject.set(x, "AwsLambdaFunction", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaFunctionUndefined: Self = StObject.set(x, "AwsLambdaFunction", js.undefined)
    
    inline def setAwsLambdaLayerVersion(value: AwsLambdaLayerVersionDetails): Self = StObject.set(x, "AwsLambdaLayerVersion", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaLayerVersionUndefined: Self = StObject.set(x, "AwsLambdaLayerVersion", js.undefined)
    
    inline def setAwsRdsDbCluster(value: AwsRdsDbClusterDetails): Self = StObject.set(x, "AwsRdsDbCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbClusterSnapshot(value: AwsRdsDbClusterSnapshotDetails): Self = StObject.set(x, "AwsRdsDbClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbClusterSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbClusterSnapshot", js.undefined)
    
    inline def setAwsRdsDbClusterUndefined: Self = StObject.set(x, "AwsRdsDbCluster", js.undefined)
    
    inline def setAwsRdsDbInstance(value: AwsRdsDbInstanceDetails): Self = StObject.set(x, "AwsRdsDbInstance", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbInstanceUndefined: Self = StObject.set(x, "AwsRdsDbInstance", js.undefined)
    
    inline def setAwsRdsDbSnapshot(value: AwsRdsDbSnapshotDetails): Self = StObject.set(x, "AwsRdsDbSnapshot", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbSnapshot", js.undefined)
    
    inline def setAwsRedshiftCluster(value: AwsRedshiftClusterDetails): Self = StObject.set(x, "AwsRedshiftCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsRedshiftClusterUndefined: Self = StObject.set(x, "AwsRedshiftCluster", js.undefined)
    
    inline def setAwsS3Bucket(value: AwsS3BucketDetails): Self = StObject.set(x, "AwsS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setAwsS3BucketUndefined: Self = StObject.set(x, "AwsS3Bucket", js.undefined)
    
    inline def setAwsS3Object(value: AwsS3ObjectDetails): Self = StObject.set(x, "AwsS3Object", value.asInstanceOf[js.Any])
    
    inline def setAwsS3ObjectUndefined: Self = StObject.set(x, "AwsS3Object", js.undefined)
    
    inline def setAwsSecretsManagerSecret(value: AwsSecretsManagerSecretDetails): Self = StObject.set(x, "AwsSecretsManagerSecret", value.asInstanceOf[js.Any])
    
    inline def setAwsSecretsManagerSecretUndefined: Self = StObject.set(x, "AwsSecretsManagerSecret", js.undefined)
    
    inline def setAwsSnsTopic(value: AwsSnsTopicDetails): Self = StObject.set(x, "AwsSnsTopic", value.asInstanceOf[js.Any])
    
    inline def setAwsSnsTopicUndefined: Self = StObject.set(x, "AwsSnsTopic", js.undefined)
    
    inline def setAwsSqsQueue(value: AwsSqsQueueDetails): Self = StObject.set(x, "AwsSqsQueue", value.asInstanceOf[js.Any])
    
    inline def setAwsSqsQueueUndefined: Self = StObject.set(x, "AwsSqsQueue", js.undefined)
    
    inline def setAwsWafWebAcl(value: AwsWafWebAclDetails): Self = StObject.set(x, "AwsWafWebAcl", value.asInstanceOf[js.Any])
    
    inline def setAwsWafWebAclUndefined: Self = StObject.set(x, "AwsWafWebAcl", js.undefined)
    
    inline def setContainer(value: ContainerDetails): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setOther(value: FieldMap): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "Other", js.undefined)
  }
}
