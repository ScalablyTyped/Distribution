package typings.awsSdk.shieldMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shield extends Service {
  
  /**
    * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(
    params: AssociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]
  ): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  
  /**
    * Authorizes the DDoS Response Team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]): Request[AssociateDRTRoleResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response Team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(
    params: AssociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]
  ): Request[AssociateDRTRoleResponse, AWSError] = js.native
  
  /**
    * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and mitigation.  You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the AWS WAF and AWS Shield Developer Guide. 
    */
  def associateHealthCheck(): Request[AssociateHealthCheckResponse, AWSError] = js.native
  def associateHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ AssociateHealthCheckResponse, scala.Unit]): Request[AssociateHealthCheckResponse, AWSError] = js.native
  /**
    * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and mitigation.  You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the AWS WAF and AWS Shield Developer Guide. 
    */
  def associateHealthCheck(params: AssociateHealthCheckRequest): Request[AssociateHealthCheckResponse, AWSError] = js.native
  def associateHealthCheck(
    params: AssociateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateHealthCheckResponse, scala.Unit]
  ): Request[AssociateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Initializes proactive engagement and sets the list of contacts for the DDoS Response Team (DRT) to use. You must provide at least one phone number in the emergency contact list.  After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use the calls DisableProactiveEngagement and EnableProactiveEngagement.   This call defines the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you for escalations to the DRT and to initiate proactive customer support. The contacts that you provide in the request replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it to this call.  
    */
  def associateProactiveEngagementDetails(): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  def associateProactiveEngagementDetails(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateProactiveEngagementDetailsResponse, 
      scala.Unit
    ]
  ): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  /**
    * Initializes proactive engagement and sets the list of contacts for the DDoS Response Team (DRT) to use. You must provide at least one phone number in the emergency contact list.  After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use the calls DisableProactiveEngagement and EnableProactiveEngagement.   This call defines the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you for escalations to the DRT and to initiate proactive customer support. The contacts that you provide in the request replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it to this call.  
    */
  def associateProactiveEngagementDetails(params: AssociateProactiveEngagementDetailsRequest): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  def associateProactiveEngagementDetails(
    params: AssociateProactiveEngagementDetailsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateProactiveEngagementDetailsResponse, 
      scala.Unit
    ]
  ): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Shield: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]): Request[CreateProtectionResponse, AWSError] = js.native
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(
    params: CreateProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]
  ): Request[CreateProtectionResponse, AWSError] = js.native
  
  /**
    * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def createProtectionGroup(): Request[CreateProtectionGroupResponse, AWSError] = js.native
  def createProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionGroupResponse, scala.Unit]): Request[CreateProtectionGroupResponse, AWSError] = js.native
  /**
    * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def createProtectionGroup(params: CreateProtectionGroupRequest): Request[CreateProtectionGroupResponse, AWSError] = js.native
  def createProtectionGroup(
    params: CreateProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionGroupResponse, scala.Unit]
  ): Request[CreateProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Activates AWS Shield Advanced for an account. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]): Request[CreateSubscriptionResponse, AWSError] = js.native
  /**
    * Activates AWS Shield Advanced for an account. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(
    params: CreateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]
  ): Request[CreateSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]): Request[DeleteProtectionResponse, AWSError] = js.native
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(
    params: DeleteProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]
  ): Request[DeleteProtectionResponse, AWSError] = js.native
  
  /**
    * Removes the specified protection group.
    */
  def deleteProtectionGroup(): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  def deleteProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionGroupResponse, scala.Unit]): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  /**
    * Removes the specified protection group.
    */
  def deleteProtectionGroup(params: DeleteProtectionGroupRequest): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  def deleteProtectionGroup(
    params: DeleteProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionGroupResponse, scala.Unit]
  ): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]): Request[DeleteSubscriptionResponse, AWSError] = js.native
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(
    params: DeleteSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]
  ): Request[DeleteSubscriptionResponse, AWSError] = js.native
  
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]): Request[DescribeAttackResponse, AWSError] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(
    params: DescribeAttackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]
  ): Request[DescribeAttackResponse, AWSError] = js.native
  
  /**
    * Provides information about the number and type of attacks AWS Shield has detected in the last year for all resources that belong to your account, regardless of whether you've defined Shield protections for them. This operation is available to Shield customers as well as to Shield Advanced customers. The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example, if the current time is 2020-10-26 15:39:32 PDT, equal to 2020-10-26 22:39:32 UTC, then the time range for the attack data returned is from 2019-10-26 00:00:00 UTC to 2020-10-26 00:00:00 UTC.  The time range indicates the period covered by the attack statistics data items.
    */
  def describeAttackStatistics(): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  def describeAttackStatistics(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackStatisticsResponse, scala.Unit]
  ): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  /**
    * Provides information about the number and type of attacks AWS Shield has detected in the last year for all resources that belong to your account, regardless of whether you've defined Shield protections for them. This operation is available to Shield customers as well as to Shield Advanced customers. The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example, if the current time is 2020-10-26 15:39:32 PDT, equal to 2020-10-26 22:39:32 UTC, then the time range for the attack data returned is from 2019-10-26 00:00:00 UTC to 2020-10-26 00:00:00 UTC.  The time range indicates the period covered by the attack statistics data items.
    */
  def describeAttackStatistics(params: DescribeAttackStatisticsRequest): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  def describeAttackStatistics(
    params: DescribeAttackStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackStatisticsResponse, scala.Unit]
  ): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response Team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]): Request[DescribeDRTAccessResponse, AWSError] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response Team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(
    params: DescribeDRTAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]
  ): Request[DescribeDRTAccessResponse, AWSError] = js.native
  
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  def describeEmergencyContactSettings(): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    params: DescribeEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]): Request[DescribeProtectionResponse, AWSError] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(
    params: DescribeProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]
  ): Request[DescribeProtectionResponse, AWSError] = js.native
  
  /**
    * Returns the specification for the specified protection group.
    */
  def describeProtectionGroup(): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  def describeProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionGroupResponse, scala.Unit]): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  /**
    * Returns the specification for the specified protection group.
    */
  def describeProtectionGroup(params: DescribeProtectionGroupRequest): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  def describeProtectionGroup(
    params: DescribeProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionGroupResponse, scala.Unit]
  ): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]): Request[DescribeSubscriptionResponse, AWSError] = js.native
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(
    params: DescribeSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]
  ): Request[DescribeSubscriptionResponse, AWSError] = js.native
  
  /**
    * Removes authorization from the DDoS Response Team (DRT) to notify contacts about escalations to the DRT and to initiate proactive customer support.
    */
  def disableProactiveEngagement(): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  def disableProactiveEngagement(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableProactiveEngagementResponse, scala.Unit]
  ): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  /**
    * Removes authorization from the DDoS Response Team (DRT) to notify contacts about escalations to the DRT and to initiate proactive customer support.
    */
  def disableProactiveEngagement(params: DisableProactiveEngagementRequest): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  def disableProactiveEngagement(
    params: DisableProactiveEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableProactiveEngagementResponse, scala.Unit]
  ): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  
  /**
    * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    params: DisassociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  
  /**
    * Removes the DDoS Response Team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response Team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(
    params: DisassociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]
  ): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  
  /**
    * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and mitigation.  You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the AWS WAF and AWS Shield Developer Guide. 
    */
  def disassociateHealthCheck(): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  def disassociateHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateHealthCheckResponse, scala.Unit]): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  /**
    * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and mitigation.  You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the AWS WAF and AWS Shield Developer Guide. 
    */
  def disassociateHealthCheck(params: DisassociateHealthCheckRequest): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  def disassociateHealthCheck(
    params: DisassociateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateHealthCheckResponse, scala.Unit]
  ): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Authorizes the DDoS Response Team (DRT) to use email and phone to notify contacts about escalations to the DRT and to initiate proactive customer support.
    */
  def enableProactiveEngagement(): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  def enableProactiveEngagement(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableProactiveEngagementResponse, scala.Unit]
  ): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response Team (DRT) to use email and phone to notify contacts about escalations to the DRT and to initiate proactive customer support.
    */
  def enableProactiveEngagement(params: EnableProactiveEngagementRequest): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  def enableProactiveEngagement(
    params: EnableProactiveEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableProactiveEngagementResponse, scala.Unit]
  ): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]): Request[GetSubscriptionStateResponse, AWSError] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(
    params: GetSubscriptionStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]
  ): Request[GetSubscriptionStateResponse, AWSError] = js.native
  
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]): Request[ListAttacksResponse, AWSError] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(
    params: ListAttacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]
  ): Request[ListAttacksResponse, AWSError] = js.native
  
  /**
    * Retrieves the ProtectionGroup objects for the account.
    */
  def listProtectionGroups(): Request[ListProtectionGroupsResponse, AWSError] = js.native
  def listProtectionGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionGroupsResponse, scala.Unit]): Request[ListProtectionGroupsResponse, AWSError] = js.native
  /**
    * Retrieves the ProtectionGroup objects for the account.
    */
  def listProtectionGroups(params: ListProtectionGroupsRequest): Request[ListProtectionGroupsResponse, AWSError] = js.native
  def listProtectionGroups(
    params: ListProtectionGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionGroupsResponse, scala.Unit]
  ): Request[ListProtectionGroupsResponse, AWSError] = js.native
  
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]): Request[ListProtectionsResponse, AWSError] = js.native
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(
    params: ListProtectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]
  ): Request[ListProtectionsResponse, AWSError] = js.native
  
  /**
    * Retrieves the resources that are included in the protection group. 
    */
  def listResourcesInProtectionGroup(): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  def listResourcesInProtectionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesInProtectionGroupResponse, scala.Unit]
  ): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  /**
    * Retrieves the resources that are included in the protection group. 
    */
  def listResourcesInProtectionGroup(params: ListResourcesInProtectionGroupRequest): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  def listResourcesInProtectionGroup(
    params: ListResourcesInProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesInProtectionGroupResponse, scala.Unit]
  ): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Updates the details of the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  def updateEmergencyContactSettings(): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Updates the details of the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    params: UpdateEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  
  /**
    * Updates an existing protection group. A protection group is a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def updateProtectionGroup(): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  def updateProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectionGroupResponse, scala.Unit]): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  /**
    * Updates an existing protection group. A protection group is a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def updateProtectionGroup(params: UpdateProtectionGroupRequest): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  def updateProtectionGroup(
    params: UpdateProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectionGroupResponse, scala.Unit]
  ): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]): Request[UpdateSubscriptionResponse, AWSError] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(
    params: UpdateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]
  ): Request[UpdateSubscriptionResponse, AWSError] = js.native
}
