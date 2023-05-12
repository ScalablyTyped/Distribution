package typings.awsSdk.clientsVpclatticeMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPCLattice extends Service {
  
  /**
    * Updates the listener rules in a batch. You can use this operation to change the priority of listener rules. This can be useful when bulk updating or swapping rule priority. 
    */
  def batchUpdateRule(): Request[BatchUpdateRuleResponse, AWSError] = js.native
  def batchUpdateRule(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateRuleResponse, Unit]): Request[BatchUpdateRuleResponse, AWSError] = js.native
  /**
    * Updates the listener rules in a batch. You can use this operation to change the priority of listener rules. This can be useful when bulk updating or swapping rule priority. 
    */
  def batchUpdateRule(params: BatchUpdateRuleRequest): Request[BatchUpdateRuleResponse, AWSError] = js.native
  def batchUpdateRule(
    params: BatchUpdateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateRuleResponse, Unit]
  ): Request[BatchUpdateRuleResponse, AWSError] = js.native
  
  @JSName("config")
  var config_VPCLattice: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose. The service network owner can use the access logs to audit the services in the network. The service network owner will only see access logs from clients and services that are associated with their service network. Access log entries represent traffic originated from VPCs associated with that network. For more information, see Access logs in the Amazon VPC Lattice User Guide.
    */
  def createAccessLogSubscription(): Request[CreateAccessLogSubscriptionResponse, AWSError] = js.native
  def createAccessLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessLogSubscriptionResponse, Unit]): Request[CreateAccessLogSubscriptionResponse, AWSError] = js.native
  /**
    * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose. The service network owner can use the access logs to audit the services in the network. The service network owner will only see access logs from clients and services that are associated with their service network. Access log entries represent traffic originated from VPCs associated with that network. For more information, see Access logs in the Amazon VPC Lattice User Guide.
    */
  def createAccessLogSubscription(params: CreateAccessLogSubscriptionRequest): Request[CreateAccessLogSubscriptionResponse, AWSError] = js.native
  def createAccessLogSubscription(
    params: CreateAccessLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessLogSubscriptionResponse, Unit]
  ): Request[CreateAccessLogSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or more listeners. A listener is a process that checks for connection requests to your services. For more information, see Listeners in the Amazon VPC Lattice User Guide.
    */
  def createListener(): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or more listeners. A listener is a process that checks for connection requests to your services. For more information, see Listeners in the Amazon VPC Lattice User Guide.
    */
  def createListener(params: CreateListenerRequest): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(
    params: CreateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]
  ): Request[CreateListenerResponse, AWSError] = js.native
  
  /**
    * Creates a listener rule. Each listener has a default rule for checking connection requests, but you can define additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def createRule(): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]): Request[CreateRuleResponse, AWSError] = js.native
  /**
    * Creates a listener rule. Each listener has a default rule for checking connection requests, but you can define additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def createRule(params: CreateRuleRequest): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(
    params: CreateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]
  ): Request[CreateRuleResponse, AWSError] = js.native
  
  /**
    * Creates a service. A service is any software application that can run on instances containers, or serverless functions within an account or virtual private cloud (VPC). For more information, see Services in the Amazon VPC Lattice User Guide.
    */
  def createService(): Request[CreateServiceResponse, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Creates a service. A service is any software application that can run on instances containers, or serverless functions within an account or virtual private cloud (VPC). For more information, see Services in the Amazon VPC Lattice User Guide.
    */
  def createService(params: CreateServiceRequest): Request[CreateServiceResponse, AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]
  ): Request[CreateServiceResponse, AWSError] = js.native
  
  /**
    * Creates a service network. A service network is a logical boundary for a collection of services. You can associate services and VPCs with a service network. For more information, see Service networks in the Amazon VPC Lattice User Guide.
    */
  def createServiceNetwork(): Request[CreateServiceNetworkResponse, AWSError] = js.native
  def createServiceNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkResponse, Unit]): Request[CreateServiceNetworkResponse, AWSError] = js.native
  /**
    * Creates a service network. A service network is a logical boundary for a collection of services. You can associate services and VPCs with a service network. For more information, see Service networks in the Amazon VPC Lattice User Guide.
    */
  def createServiceNetwork(params: CreateServiceNetworkRequest): Request[CreateServiceNetworkResponse, AWSError] = js.native
  def createServiceNetwork(
    params: CreateServiceNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkResponse, Unit]
  ): Request[CreateServiceNetworkResponse, AWSError] = js.native
  
  /**
    * Associates a service with a service network. You can't use this operation if the service and service network are already associated or if there is a disassociation or deletion in progress. If the association fails, you can retry the operation by deleting the association and recreating it. You cannot associate a service and service network that are shared with a caller. The caller must own either the service or the service network. As a result of this operation, the association is created in the service network account and the association owner account.
    */
  def createServiceNetworkServiceAssociation(): Request[CreateServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def createServiceNetworkServiceAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkServiceAssociationResponse, Unit]
  ): Request[CreateServiceNetworkServiceAssociationResponse, AWSError] = js.native
  /**
    * Associates a service with a service network. You can't use this operation if the service and service network are already associated or if there is a disassociation or deletion in progress. If the association fails, you can retry the operation by deleting the association and recreating it. You cannot associate a service and service network that are shared with a caller. The caller must own either the service or the service network. As a result of this operation, the association is created in the service network account and the association owner account.
    */
  def createServiceNetworkServiceAssociation(params: CreateServiceNetworkServiceAssociationRequest): Request[CreateServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def createServiceNetworkServiceAssociation(
    params: CreateServiceNetworkServiceAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkServiceAssociationResponse, Unit]
  ): Request[CreateServiceNetworkServiceAssociationResponse, AWSError] = js.native
  
  /**
    * Associates a VPC with a service network. When you associate a VPC with the service network, it enables all the resources within that VPC to be clients and communicate with other services in the service network. For more information, see Manage VPC associations in the Amazon VPC Lattice User Guide. You can't use this operation if there is a disassociation in progress. If the association fails, retry by deleting the association and recreating it. As a result of this operation, the association gets created in the service network account and the VPC owner account. If you add a security group to the service network and VPC association, the association must continue to always have at least one security group. You can add or edit security groups at any time. However, to remove all security groups, you must first delete the association and recreate it without security groups.
    */
  def createServiceNetworkVpcAssociation(): Request[CreateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def createServiceNetworkVpcAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkVpcAssociationResponse, Unit]
  ): Request[CreateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  /**
    * Associates a VPC with a service network. When you associate a VPC with the service network, it enables all the resources within that VPC to be clients and communicate with other services in the service network. For more information, see Manage VPC associations in the Amazon VPC Lattice User Guide. You can't use this operation if there is a disassociation in progress. If the association fails, retry by deleting the association and recreating it. As a result of this operation, the association gets created in the service network account and the VPC owner account. If you add a security group to the service network and VPC association, the association must continue to always have at least one security group. You can add or edit security groups at any time. However, to remove all security groups, you must first delete the association and recreate it without security groups.
    */
  def createServiceNetworkVpcAssociation(params: CreateServiceNetworkVpcAssociationRequest): Request[CreateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def createServiceNetworkVpcAssociation(
    params: CreateServiceNetworkVpcAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceNetworkVpcAssociationResponse, Unit]
  ): Request[CreateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  
  /**
    * Creates a target group. A target group is a collection of targets, or compute resources, that run your application or service. A target group can only be used by a single service. For more information, see Target groups in the Amazon VPC Lattice User Guide.
    */
  def createTargetGroup(): Request[CreateTargetGroupResponse, AWSError] = js.native
  def createTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateTargetGroupResponse, Unit]): Request[CreateTargetGroupResponse, AWSError] = js.native
  /**
    * Creates a target group. A target group is a collection of targets, or compute resources, that run your application or service. A target group can only be used by a single service. For more information, see Target groups in the Amazon VPC Lattice User Guide.
    */
  def createTargetGroup(params: CreateTargetGroupRequest): Request[CreateTargetGroupResponse, AWSError] = js.native
  def createTargetGroup(
    params: CreateTargetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTargetGroupResponse, Unit]
  ): Request[CreateTargetGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified access log subscription.
    */
  def deleteAccessLogSubscription(): Request[DeleteAccessLogSubscriptionResponse, AWSError] = js.native
  def deleteAccessLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessLogSubscriptionResponse, Unit]): Request[DeleteAccessLogSubscriptionResponse, AWSError] = js.native
  /**
    * Deletes the specified access log subscription.
    */
  def deleteAccessLogSubscription(params: DeleteAccessLogSubscriptionRequest): Request[DeleteAccessLogSubscriptionResponse, AWSError] = js.native
  def deleteAccessLogSubscription(
    params: DeleteAccessLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessLogSubscriptionResponse, Unit]
  ): Request[DeleteAccessLogSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified auth policy. If an auth is set to AWS_IAM and the auth policy is deleted, all requests will be denied by default. If you are trying to remove the auth policy completely, you must set the auth_type to NONE. If auth is enabled on the resource, but no auth policy is set, all requests will be denied.
    */
  def deleteAuthPolicy(): Request[DeleteAuthPolicyResponse, AWSError] = js.native
  def deleteAuthPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuthPolicyResponse, Unit]): Request[DeleteAuthPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified auth policy. If an auth is set to AWS_IAM and the auth policy is deleted, all requests will be denied by default. If you are trying to remove the auth policy completely, you must set the auth_type to NONE. If auth is enabled on the resource, but no auth policy is set, all requests will be denied.
    */
  def deleteAuthPolicy(params: DeleteAuthPolicyRequest): Request[DeleteAuthPolicyResponse, AWSError] = js.native
  def deleteAuthPolicy(
    params: DeleteAuthPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAuthPolicyResponse, Unit]
  ): Request[DeleteAuthPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes the specified listener.
    */
  def deleteListener(): Request[DeleteListenerResponse, AWSError] = js.native
  def deleteListener(callback: js.Function2[/* err */ AWSError, /* data */ DeleteListenerResponse, Unit]): Request[DeleteListenerResponse, AWSError] = js.native
  /**
    * Deletes the specified listener.
    */
  def deleteListener(params: DeleteListenerRequest): Request[DeleteListenerResponse, AWSError] = js.native
  def deleteListener(
    params: DeleteListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteListenerResponse, Unit]
  ): Request[DeleteListenerResponse, AWSError] = js.native
  
  /**
    * Deletes the specified resource policy.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified resource policy.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a listener rule. Each listener has a default rule for checking connection requests, but you can define additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. You can delete additional listener rules, but you cannot delete the default rule. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def deleteRule(): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]): Request[DeleteRuleResponse, AWSError] = js.native
  /**
    * Deletes a listener rule. Each listener has a default rule for checking connection requests, but you can define additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. You can delete additional listener rules, but you cannot delete the default rule. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]
  ): Request[DeleteRuleResponse, AWSError] = js.native
  
  /**
    * Deletes a service. A service can't be deleted if it's associated with a service network. If you delete a service, all resources related to the service, such as the resource policy, auth policy, listeners, listener rules, and access log subscriptions, are also deleted. For more information, see Delete a service in the Amazon VPC Lattice User Guide.
    */
  def deleteService(): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Deletes a service. A service can't be deleted if it's associated with a service network. If you delete a service, all resources related to the service, such as the resource policy, auth policy, listeners, listener rules, and access log subscriptions, are also deleted. For more information, see Delete a service in the Amazon VPC Lattice User Guide.
    */
  def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]
  ): Request[DeleteServiceResponse, AWSError] = js.native
  
  /**
    * Deletes a service network. You can only delete the service network if there is no service or VPC associated with it. If you delete a service network, all resources related to the service network, such as the resource policy, auth policy, and access log subscriptions, are also deleted. For more information, see Delete a service network in the Amazon VPC Lattice User Guide.
    */
  def deleteServiceNetwork(): Request[DeleteServiceNetworkResponse, AWSError] = js.native
  def deleteServiceNetwork(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkResponse, Unit]): Request[DeleteServiceNetworkResponse, AWSError] = js.native
  /**
    * Deletes a service network. You can only delete the service network if there is no service or VPC associated with it. If you delete a service network, all resources related to the service network, such as the resource policy, auth policy, and access log subscriptions, are also deleted. For more information, see Delete a service network in the Amazon VPC Lattice User Guide.
    */
  def deleteServiceNetwork(params: DeleteServiceNetworkRequest): Request[DeleteServiceNetworkResponse, AWSError] = js.native
  def deleteServiceNetwork(
    params: DeleteServiceNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkResponse, Unit]
  ): Request[DeleteServiceNetworkResponse, AWSError] = js.native
  
  /**
    * Deletes the association between a specified service and the specific service network. This request will fail if an association is still in progress.
    */
  def deleteServiceNetworkServiceAssociation(): Request[DeleteServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def deleteServiceNetworkServiceAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkServiceAssociationResponse, Unit]
  ): Request[DeleteServiceNetworkServiceAssociationResponse, AWSError] = js.native
  /**
    * Deletes the association between a specified service and the specific service network. This request will fail if an association is still in progress.
    */
  def deleteServiceNetworkServiceAssociation(params: DeleteServiceNetworkServiceAssociationRequest): Request[DeleteServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def deleteServiceNetworkServiceAssociation(
    params: DeleteServiceNetworkServiceAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkServiceAssociationResponse, Unit]
  ): Request[DeleteServiceNetworkServiceAssociationResponse, AWSError] = js.native
  
  /**
    * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update association in progress.
    */
  def deleteServiceNetworkVpcAssociation(): Request[DeleteServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def deleteServiceNetworkVpcAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkVpcAssociationResponse, Unit]
  ): Request[DeleteServiceNetworkVpcAssociationResponse, AWSError] = js.native
  /**
    * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update association in progress.
    */
  def deleteServiceNetworkVpcAssociation(params: DeleteServiceNetworkVpcAssociationRequest): Request[DeleteServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def deleteServiceNetworkVpcAssociation(
    params: DeleteServiceNetworkVpcAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceNetworkVpcAssociationResponse, Unit]
  ): Request[DeleteServiceNetworkVpcAssociationResponse, AWSError] = js.native
  
  /**
    * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group creation is in progress.
    */
  def deleteTargetGroup(): Request[DeleteTargetGroupResponse, AWSError] = js.native
  def deleteTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetGroupResponse, Unit]): Request[DeleteTargetGroupResponse, AWSError] = js.native
  /**
    * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group creation is in progress.
    */
  def deleteTargetGroup(params: DeleteTargetGroupRequest): Request[DeleteTargetGroupResponse, AWSError] = js.native
  def deleteTargetGroup(
    params: DeleteTargetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetGroupResponse, Unit]
  ): Request[DeleteTargetGroupResponse, AWSError] = js.native
  
  /**
    * Deregisters the specified targets from the specified target group.
    */
  def deregisterTargets(): Request[DeregisterTargetsResponse, AWSError] = js.native
  def deregisterTargets(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetsResponse, Unit]): Request[DeregisterTargetsResponse, AWSError] = js.native
  /**
    * Deregisters the specified targets from the specified target group.
    */
  def deregisterTargets(params: DeregisterTargetsRequest): Request[DeregisterTargetsResponse, AWSError] = js.native
  def deregisterTargets(
    params: DeregisterTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTargetsResponse, Unit]
  ): Request[DeregisterTargetsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified access log subscription.
    */
  def getAccessLogSubscription(): Request[GetAccessLogSubscriptionResponse, AWSError] = js.native
  def getAccessLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessLogSubscriptionResponse, Unit]): Request[GetAccessLogSubscriptionResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified access log subscription.
    */
  def getAccessLogSubscription(params: GetAccessLogSubscriptionRequest): Request[GetAccessLogSubscriptionResponse, AWSError] = js.native
  def getAccessLogSubscription(
    params: GetAccessLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessLogSubscriptionResponse, Unit]
  ): Request[GetAccessLogSubscriptionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the auth policy for the specified service or service network.
    */
  def getAuthPolicy(): Request[GetAuthPolicyResponse, AWSError] = js.native
  def getAuthPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthPolicyResponse, Unit]): Request[GetAuthPolicyResponse, AWSError] = js.native
  /**
    * Retrieves information about the auth policy for the specified service or service network.
    */
  def getAuthPolicy(params: GetAuthPolicyRequest): Request[GetAuthPolicyResponse, AWSError] = js.native
  def getAuthPolicy(
    params: GetAuthPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthPolicyResponse, Unit]
  ): Request[GetAuthPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified listener for the specified service.
    */
  def getListener(): Request[GetListenerResponse, AWSError] = js.native
  def getListener(callback: js.Function2[/* err */ AWSError, /* data */ GetListenerResponse, Unit]): Request[GetListenerResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified listener for the specified service.
    */
  def getListener(params: GetListenerRequest): Request[GetListenerResponse, AWSError] = js.native
  def getListener(
    params: GetListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetListenerResponse, Unit]
  ): Request[GetListenerResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the resource owner when they share a resource.
    */
  def getResourcePolicy(): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the resource owner when they share a resource.
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]
  ): Request[GetResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about listener rules. You can also retrieve information about the default listener rule. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def getRule(): Request[GetRuleResponse, AWSError] = js.native
  def getRule(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]): Request[GetRuleResponse, AWSError] = js.native
  /**
    * Retrieves information about listener rules. You can also retrieve information about the default listener rule. For more information, see Listener rules in the Amazon VPC Lattice User Guide.
    */
  def getRule(params: GetRuleRequest): Request[GetRuleResponse, AWSError] = js.native
  def getRule(
    params: GetRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]
  ): Request[GetRuleResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified service.
    */
  def getService(): Request[GetServiceResponse, AWSError] = js.native
  def getService(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]): Request[GetServiceResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified service.
    */
  def getService(params: GetServiceRequest): Request[GetServiceResponse, AWSError] = js.native
  def getService(
    params: GetServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]
  ): Request[GetServiceResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified service network.
    */
  def getServiceNetwork(): Request[GetServiceNetworkResponse, AWSError] = js.native
  def getServiceNetwork(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkResponse, Unit]): Request[GetServiceNetworkResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified service network.
    */
  def getServiceNetwork(params: GetServiceNetworkRequest): Request[GetServiceNetworkResponse, AWSError] = js.native
  def getServiceNetwork(
    params: GetServiceNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkResponse, Unit]
  ): Request[GetServiceNetworkResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified association between a service network and a service.
    */
  def getServiceNetworkServiceAssociation(): Request[GetServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def getServiceNetworkServiceAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkServiceAssociationResponse, Unit]
  ): Request[GetServiceNetworkServiceAssociationResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified association between a service network and a service.
    */
  def getServiceNetworkServiceAssociation(params: GetServiceNetworkServiceAssociationRequest): Request[GetServiceNetworkServiceAssociationResponse, AWSError] = js.native
  def getServiceNetworkServiceAssociation(
    params: GetServiceNetworkServiceAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkServiceAssociationResponse, Unit]
  ): Request[GetServiceNetworkServiceAssociationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the association between a service network and a VPC.
    */
  def getServiceNetworkVpcAssociation(): Request[GetServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def getServiceNetworkVpcAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkVpcAssociationResponse, Unit]
  ): Request[GetServiceNetworkVpcAssociationResponse, AWSError] = js.native
  /**
    * Retrieves information about the association between a service network and a VPC.
    */
  def getServiceNetworkVpcAssociation(params: GetServiceNetworkVpcAssociationRequest): Request[GetServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def getServiceNetworkVpcAssociation(
    params: GetServiceNetworkVpcAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceNetworkVpcAssociationResponse, Unit]
  ): Request[GetServiceNetworkVpcAssociationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified target group.
    */
  def getTargetGroup(): Request[GetTargetGroupResponse, AWSError] = js.native
  def getTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetTargetGroupResponse, Unit]): Request[GetTargetGroupResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified target group.
    */
  def getTargetGroup(params: GetTargetGroupRequest): Request[GetTargetGroupResponse, AWSError] = js.native
  def getTargetGroup(
    params: GetTargetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTargetGroupResponse, Unit]
  ): Request[GetTargetGroupResponse, AWSError] = js.native
  
  /**
    * Lists all access log subscriptions for the specified service network or service.
    */
  def listAccessLogSubscriptions(): Request[ListAccessLogSubscriptionsResponse, AWSError] = js.native
  def listAccessLogSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessLogSubscriptionsResponse, Unit]): Request[ListAccessLogSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists all access log subscriptions for the specified service network or service.
    */
  def listAccessLogSubscriptions(params: ListAccessLogSubscriptionsRequest): Request[ListAccessLogSubscriptionsResponse, AWSError] = js.native
  def listAccessLogSubscriptions(
    params: ListAccessLogSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessLogSubscriptionsResponse, Unit]
  ): Request[ListAccessLogSubscriptionsResponse, AWSError] = js.native
  
  /**
    * Lists the listeners for the specified service.
    */
  def listListeners(): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]): Request[ListListenersResponse, AWSError] = js.native
  /**
    * Lists the listeners for the specified service.
    */
  def listListeners(params: ListListenersRequest): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(
    params: ListListenersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]
  ): Request[ListListenersResponse, AWSError] = js.native
  
  /**
    * Lists the rules for the listener.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Lists the rules for the listener.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  
  /**
    * Lists the associations between the service network and the service. You can filter the list either by service or service network. You must provide either the service network identifier or the service identifier. Every association in Amazon VPC Lattice is given a unique Amazon Resource Name (ARN), such as when a service network is associated with a VPC or when a service is associated with a service network. If the association is for a resource that is shared with another account, the association will include the local account ID as the prefix in the ARN for each account the resource is shared with.
    */
  def listServiceNetworkServiceAssociations(): Request[ListServiceNetworkServiceAssociationsResponse, AWSError] = js.native
  def listServiceNetworkServiceAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworkServiceAssociationsResponse, Unit]
  ): Request[ListServiceNetworkServiceAssociationsResponse, AWSError] = js.native
  /**
    * Lists the associations between the service network and the service. You can filter the list either by service or service network. You must provide either the service network identifier or the service identifier. Every association in Amazon VPC Lattice is given a unique Amazon Resource Name (ARN), such as when a service network is associated with a VPC or when a service is associated with a service network. If the association is for a resource that is shared with another account, the association will include the local account ID as the prefix in the ARN for each account the resource is shared with.
    */
  def listServiceNetworkServiceAssociations(params: ListServiceNetworkServiceAssociationsRequest): Request[ListServiceNetworkServiceAssociationsResponse, AWSError] = js.native
  def listServiceNetworkServiceAssociations(
    params: ListServiceNetworkServiceAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworkServiceAssociationsResponse, Unit]
  ): Request[ListServiceNetworkServiceAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You must provide either the service network identifier or the VPC identifier.
    */
  def listServiceNetworkVpcAssociations(): Request[ListServiceNetworkVpcAssociationsResponse, AWSError] = js.native
  def listServiceNetworkVpcAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworkVpcAssociationsResponse, Unit]
  ): Request[ListServiceNetworkVpcAssociationsResponse, AWSError] = js.native
  /**
    * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You must provide either the service network identifier or the VPC identifier.
    */
  def listServiceNetworkVpcAssociations(params: ListServiceNetworkVpcAssociationsRequest): Request[ListServiceNetworkVpcAssociationsResponse, AWSError] = js.native
  def listServiceNetworkVpcAssociations(
    params: ListServiceNetworkVpcAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworkVpcAssociationsResponse, Unit]
  ): Request[ListServiceNetworkVpcAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists the service networks owned by the caller account or shared with the caller account. Also includes the account ID in the ARN to show which account owns the service network.
    */
  def listServiceNetworks(): Request[ListServiceNetworksResponse, AWSError] = js.native
  def listServiceNetworks(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworksResponse, Unit]): Request[ListServiceNetworksResponse, AWSError] = js.native
  /**
    * Lists the service networks owned by the caller account or shared with the caller account. Also includes the account ID in the ARN to show which account owns the service network.
    */
  def listServiceNetworks(params: ListServiceNetworksRequest): Request[ListServiceNetworksResponse, AWSError] = js.native
  def listServiceNetworks(
    params: ListServiceNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceNetworksResponse, Unit]
  ): Request[ListServiceNetworksResponse, AWSError] = js.native
  
  /**
    * Lists the services owned by the caller account or shared with the caller account.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists the services owned by the caller account or shared with the caller account.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists your target groups. You can narrow your search by using the filters below in your request.
    */
  def listTargetGroups(): Request[ListTargetGroupsResponse, AWSError] = js.native
  def listTargetGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetGroupsResponse, Unit]): Request[ListTargetGroupsResponse, AWSError] = js.native
  /**
    * Lists your target groups. You can narrow your search by using the filters below in your request.
    */
  def listTargetGroups(params: ListTargetGroupsRequest): Request[ListTargetGroupsResponse, AWSError] = js.native
  def listTargetGroups(
    params: ListTargetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetGroupsResponse, Unit]
  ): Request[ListTargetGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the targets for the target group. By default, all targets are included. You can use this API to check the health status of targets. You can also ﬁlter the results by target. 
    */
  def listTargets(): Request[ListTargetsResponse, AWSError] = js.native
  def listTargets(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsResponse, Unit]): Request[ListTargetsResponse, AWSError] = js.native
  /**
    * Lists the targets for the target group. By default, all targets are included. You can use this API to check the health status of targets. You can also ﬁlter the results by target. 
    */
  def listTargets(params: ListTargetsRequest): Request[ListTargetsResponse, AWSError] = js.native
  def listTargets(
    params: ListTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsResponse, Unit]
  ): Request[ListTargetsResponse, AWSError] = js.native
  
  /**
    * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank lines.
    */
  def putAuthPolicy(): Request[PutAuthPolicyResponse, AWSError] = js.native
  def putAuthPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutAuthPolicyResponse, Unit]): Request[PutAuthPolicyResponse, AWSError] = js.native
  /**
    * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank lines.
    */
  def putAuthPolicy(params: PutAuthPolicyRequest): Request[PutAuthPolicyResponse, AWSError] = js.native
  def putAuthPolicy(
    params: PutAuthPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAuthPolicyResponse, Unit]
  ): Request[PutAuthPolicyResponse, AWSError] = js.native
  
  /**
    * Attaches a resource-based permission policy to a service or service network. The policy must contain the same actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing services and service networks.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Attaches a resource-based permission policy to a service or service network. The policy must contain the same actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing services and service networks.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target group.
    */
  def registerTargets(): Request[RegisterTargetsResponse, AWSError] = js.native
  def registerTargets(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetsResponse, Unit]): Request[RegisterTargetsResponse, AWSError] = js.native
  /**
    * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target group.
    */
  def registerTargets(params: RegisterTargetsRequest): Request[RegisterTargetsResponse, AWSError] = js.native
  def registerTargets(
    params: RegisterTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTargetsResponse, Unit]
  ): Request[RegisterTargetsResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified access log subscription.
    */
  def updateAccessLogSubscription(): Request[UpdateAccessLogSubscriptionResponse, AWSError] = js.native
  def updateAccessLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessLogSubscriptionResponse, Unit]): Request[UpdateAccessLogSubscriptionResponse, AWSError] = js.native
  /**
    * Updates the specified access log subscription.
    */
  def updateAccessLogSubscription(params: UpdateAccessLogSubscriptionRequest): Request[UpdateAccessLogSubscriptionResponse, AWSError] = js.native
  def updateAccessLogSubscription(
    params: UpdateAccessLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessLogSubscriptionResponse, Unit]
  ): Request[UpdateAccessLogSubscriptionResponse, AWSError] = js.native
  
  /**
    * Updates the specified listener for the specified service.
    */
  def updateListener(): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]): Request[UpdateListenerResponse, AWSError] = js.native
  /**
    * Updates the specified listener for the specified service.
    */
  def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(
    params: UpdateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]
  ): Request[UpdateListenerResponse, AWSError] = js.native
  
  /**
    * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use UpdateListener.
    */
  def updateRule(): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]): Request[UpdateRuleResponse, AWSError] = js.native
  /**
    * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use UpdateListener.
    */
  def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(
    params: UpdateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]
  ): Request[UpdateRuleResponse, AWSError] = js.native
  
  /**
    * Updates the specified service.
    */
  def updateService(): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]): Request[UpdateServiceResponse, AWSError] = js.native
  /**
    * Updates the specified service.
    */
  def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(
    params: UpdateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]
  ): Request[UpdateServiceResponse, AWSError] = js.native
  
  /**
    * Updates the specified service network.
    */
  def updateServiceNetwork(): Request[UpdateServiceNetworkResponse, AWSError] = js.native
  def updateServiceNetwork(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceNetworkResponse, Unit]): Request[UpdateServiceNetworkResponse, AWSError] = js.native
  /**
    * Updates the specified service network.
    */
  def updateServiceNetwork(params: UpdateServiceNetworkRequest): Request[UpdateServiceNetworkResponse, AWSError] = js.native
  def updateServiceNetwork(
    params: UpdateServiceNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceNetworkResponse, Unit]
  ): Request[UpdateServiceNetworkResponse, AWSError] = js.native
  
  /**
    * Updates the service network and VPC association. If you add a security group to the service network and VPC association, the association must continue to always have at least one security group. You can add or edit security groups at any time. However, to remove all security groups, you must first delete the association and recreate it without security groups.
    */
  def updateServiceNetworkVpcAssociation(): Request[UpdateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def updateServiceNetworkVpcAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceNetworkVpcAssociationResponse, Unit]
  ): Request[UpdateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  /**
    * Updates the service network and VPC association. If you add a security group to the service network and VPC association, the association must continue to always have at least one security group. You can add or edit security groups at any time. However, to remove all security groups, you must first delete the association and recreate it without security groups.
    */
  def updateServiceNetworkVpcAssociation(params: UpdateServiceNetworkVpcAssociationRequest): Request[UpdateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  def updateServiceNetworkVpcAssociation(
    params: UpdateServiceNetworkVpcAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceNetworkVpcAssociationResponse, Unit]
  ): Request[UpdateServiceNetworkVpcAssociationResponse, AWSError] = js.native
  
  /**
    * Updates the specified target group.
    */
  def updateTargetGroup(): Request[UpdateTargetGroupResponse, AWSError] = js.native
  def updateTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTargetGroupResponse, Unit]): Request[UpdateTargetGroupResponse, AWSError] = js.native
  /**
    * Updates the specified target group.
    */
  def updateTargetGroup(params: UpdateTargetGroupRequest): Request[UpdateTargetGroupResponse, AWSError] = js.native
  def updateTargetGroup(
    params: UpdateTargetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTargetGroupResponse, Unit]
  ): Request[UpdateTargetGroupResponse, AWSError] = js.native
}
