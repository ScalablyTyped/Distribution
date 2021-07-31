package typings.awsSdk.greengrassMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Greengrass extends Service {
  
  /**
    * Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
    */
  def associateRoleToGroup(): Request[AssociateRoleToGroupResponse, AWSError] = js.native
  def associateRoleToGroup(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRoleToGroupResponse, Unit]): Request[AssociateRoleToGroupResponse, AWSError] = js.native
  /**
    * Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
    */
  def associateRoleToGroup(params: AssociateRoleToGroupRequest): Request[AssociateRoleToGroupResponse, AWSError] = js.native
  def associateRoleToGroup(
    params: AssociateRoleToGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRoleToGroupResponse, Unit]
  ): Request[AssociateRoleToGroupResponse, AWSError] = js.native
  
  /**
    * Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
    */
  def associateServiceRoleToAccount(): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  def associateServiceRoleToAccount(callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceRoleToAccountResponse, Unit]): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  /**
    * Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
    */
  def associateServiceRoleToAccount(params: AssociateServiceRoleToAccountRequest): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  def associateServiceRoleToAccount(
    params: AssociateServiceRoleToAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceRoleToAccountResponse, Unit]
  ): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Greengrass: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a connector definition. You may provide the initial version of the connector definition now or use ''CreateConnectorDefinitionVersion'' at a later time.
    */
  def createConnectorDefinition(): Request[CreateConnectorDefinitionResponse, AWSError] = js.native
  def createConnectorDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorDefinitionResponse, Unit]): Request[CreateConnectorDefinitionResponse, AWSError] = js.native
  /**
    * Creates a connector definition. You may provide the initial version of the connector definition now or use ''CreateConnectorDefinitionVersion'' at a later time.
    */
  def createConnectorDefinition(params: CreateConnectorDefinitionRequest): Request[CreateConnectorDefinitionResponse, AWSError] = js.native
  def createConnectorDefinition(
    params: CreateConnectorDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorDefinitionResponse, Unit]
  ): Request[CreateConnectorDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a connector definition which has already been defined.
    */
  def createConnectorDefinitionVersion(): Request[CreateConnectorDefinitionVersionResponse, AWSError] = js.native
  def createConnectorDefinitionVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorDefinitionVersionResponse, Unit]
  ): Request[CreateConnectorDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a connector definition which has already been defined.
    */
  def createConnectorDefinitionVersion(params: CreateConnectorDefinitionVersionRequest): Request[CreateConnectorDefinitionVersionResponse, AWSError] = js.native
  def createConnectorDefinitionVersion(
    params: CreateConnectorDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorDefinitionVersionResponse, Unit]
  ): Request[CreateConnectorDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinition(): Request[CreateCoreDefinitionResponse, AWSError] = js.native
  def createCoreDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreDefinitionResponse, Unit]): Request[CreateCoreDefinitionResponse, AWSError] = js.native
  /**
    * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinition(params: CreateCoreDefinitionRequest): Request[CreateCoreDefinitionResponse, AWSError] = js.native
  def createCoreDefinition(
    params: CreateCoreDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreDefinitionResponse, Unit]
  ): Request[CreateCoreDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinitionVersion(): Request[CreateCoreDefinitionVersionResponse, AWSError] = js.native
  def createCoreDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreDefinitionVersionResponse, Unit]): Request[CreateCoreDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinitionVersion(params: CreateCoreDefinitionVersionRequest): Request[CreateCoreDefinitionVersionResponse, AWSError] = js.native
  def createCoreDefinitionVersion(
    params: CreateCoreDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreDefinitionVersionResponse, Unit]
  ): Request[CreateCoreDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
    */
  def createDeployment(): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]): Request[CreateDeploymentResponse, AWSError] = js.native
  /**
    * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]
  ): Request[CreateDeploymentResponse, AWSError] = js.native
  
  /**
    * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
    */
  def createDeviceDefinition(): Request[CreateDeviceDefinitionResponse, AWSError] = js.native
  def createDeviceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceDefinitionResponse, Unit]): Request[CreateDeviceDefinitionResponse, AWSError] = js.native
  /**
    * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
    */
  def createDeviceDefinition(params: CreateDeviceDefinitionRequest): Request[CreateDeviceDefinitionResponse, AWSError] = js.native
  def createDeviceDefinition(
    params: CreateDeviceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceDefinitionResponse, Unit]
  ): Request[CreateDeviceDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a device definition that has already been defined.
    */
  def createDeviceDefinitionVersion(): Request[CreateDeviceDefinitionVersionResponse, AWSError] = js.native
  def createDeviceDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceDefinitionVersionResponse, Unit]): Request[CreateDeviceDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a device definition that has already been defined.
    */
  def createDeviceDefinitionVersion(params: CreateDeviceDefinitionVersionRequest): Request[CreateDeviceDefinitionVersionResponse, AWSError] = js.native
  def createDeviceDefinitionVersion(
    params: CreateDeviceDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceDefinitionVersionResponse, Unit]
  ): Request[CreateDeviceDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
    */
  def createFunctionDefinition(): Request[CreateFunctionDefinitionResponse, AWSError] = js.native
  def createFunctionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionDefinitionResponse, Unit]): Request[CreateFunctionDefinitionResponse, AWSError] = js.native
  /**
    * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
    */
  def createFunctionDefinition(params: CreateFunctionDefinitionRequest): Request[CreateFunctionDefinitionResponse, AWSError] = js.native
  def createFunctionDefinition(
    params: CreateFunctionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionDefinitionResponse, Unit]
  ): Request[CreateFunctionDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a Lambda function definition that has already been defined.
    */
  def createFunctionDefinitionVersion(): Request[CreateFunctionDefinitionVersionResponse, AWSError] = js.native
  def createFunctionDefinitionVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionDefinitionVersionResponse, Unit]
  ): Request[CreateFunctionDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a Lambda function definition that has already been defined.
    */
  def createFunctionDefinitionVersion(params: CreateFunctionDefinitionVersionRequest): Request[CreateFunctionDefinitionVersionResponse, AWSError] = js.native
  def createFunctionDefinitionVersion(
    params: CreateFunctionDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionDefinitionVersionResponse, Unit]
  ): Request[CreateFunctionDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time. Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a library or command-line application to create and deploy Greengrass groups.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time. Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a library or command-line application to create and deploy Greengrass groups.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
    */
  def createGroupCertificateAuthority(): Request[CreateGroupCertificateAuthorityResponse, AWSError] = js.native
  def createGroupCertificateAuthority(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupCertificateAuthorityResponse, Unit]
  ): Request[CreateGroupCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
    */
  def createGroupCertificateAuthority(params: CreateGroupCertificateAuthorityRequest): Request[CreateGroupCertificateAuthorityResponse, AWSError] = js.native
  def createGroupCertificateAuthority(
    params: CreateGroupCertificateAuthorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupCertificateAuthorityResponse, Unit]
  ): Request[CreateGroupCertificateAuthorityResponse, AWSError] = js.native
  
  /**
    * Creates a version of a group which has already been defined.
    */
  def createGroupVersion(): Request[CreateGroupVersionResponse, AWSError] = js.native
  def createGroupVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupVersionResponse, Unit]): Request[CreateGroupVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a group which has already been defined.
    */
  def createGroupVersion(params: CreateGroupVersionRequest): Request[CreateGroupVersionResponse, AWSError] = js.native
  def createGroupVersion(
    params: CreateGroupVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupVersionResponse, Unit]
  ): Request[CreateGroupVersionResponse, AWSError] = js.native
  
  /**
    * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
    */
  def createLoggerDefinition(): Request[CreateLoggerDefinitionResponse, AWSError] = js.native
  def createLoggerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggerDefinitionResponse, Unit]): Request[CreateLoggerDefinitionResponse, AWSError] = js.native
  /**
    * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
    */
  def createLoggerDefinition(params: CreateLoggerDefinitionRequest): Request[CreateLoggerDefinitionResponse, AWSError] = js.native
  def createLoggerDefinition(
    params: CreateLoggerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggerDefinitionResponse, Unit]
  ): Request[CreateLoggerDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a logger definition that has already been defined.
    */
  def createLoggerDefinitionVersion(): Request[CreateLoggerDefinitionVersionResponse, AWSError] = js.native
  def createLoggerDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggerDefinitionVersionResponse, Unit]): Request[CreateLoggerDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a logger definition that has already been defined.
    */
  def createLoggerDefinitionVersion(params: CreateLoggerDefinitionVersionRequest): Request[CreateLoggerDefinitionVersionResponse, AWSError] = js.native
  def createLoggerDefinitionVersion(
    params: CreateLoggerDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggerDefinitionVersionResponse, Unit]
  ): Request[CreateLoggerDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
    */
  def createResourceDefinition(): Request[CreateResourceDefinitionResponse, AWSError] = js.native
  def createResourceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDefinitionResponse, Unit]): Request[CreateResourceDefinitionResponse, AWSError] = js.native
  /**
    * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
    */
  def createResourceDefinition(params: CreateResourceDefinitionRequest): Request[CreateResourceDefinitionResponse, AWSError] = js.native
  def createResourceDefinition(
    params: CreateResourceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDefinitionResponse, Unit]
  ): Request[CreateResourceDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a resource definition that has already been defined.
    */
  def createResourceDefinitionVersion(): Request[CreateResourceDefinitionVersionResponse, AWSError] = js.native
  def createResourceDefinitionVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDefinitionVersionResponse, Unit]
  ): Request[CreateResourceDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a resource definition that has already been defined.
    */
  def createResourceDefinitionVersion(params: CreateResourceDefinitionVersionRequest): Request[CreateResourceDefinitionVersionResponse, AWSError] = js.native
  def createResourceDefinitionVersion(
    params: CreateResourceDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceDefinitionVersionResponse, Unit]
  ): Request[CreateResourceDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
    */
  def createSoftwareUpdateJob(): Request[CreateSoftwareUpdateJobResponse, AWSError] = js.native
  def createSoftwareUpdateJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateSoftwareUpdateJobResponse, Unit]): Request[CreateSoftwareUpdateJobResponse, AWSError] = js.native
  /**
    * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
    */
  def createSoftwareUpdateJob(params: CreateSoftwareUpdateJobRequest): Request[CreateSoftwareUpdateJobResponse, AWSError] = js.native
  def createSoftwareUpdateJob(
    params: CreateSoftwareUpdateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSoftwareUpdateJobResponse, Unit]
  ): Request[CreateSoftwareUpdateJobResponse, AWSError] = js.native
  
  /**
    * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
    */
  def createSubscriptionDefinition(): Request[CreateSubscriptionDefinitionResponse, AWSError] = js.native
  def createSubscriptionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionDefinitionResponse, Unit]): Request[CreateSubscriptionDefinitionResponse, AWSError] = js.native
  /**
    * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
    */
  def createSubscriptionDefinition(params: CreateSubscriptionDefinitionRequest): Request[CreateSubscriptionDefinitionResponse, AWSError] = js.native
  def createSubscriptionDefinition(
    params: CreateSubscriptionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionDefinitionResponse, Unit]
  ): Request[CreateSubscriptionDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a version of a subscription definition which has already been defined.
    */
  def createSubscriptionDefinitionVersion(): Request[CreateSubscriptionDefinitionVersionResponse, AWSError] = js.native
  def createSubscriptionDefinitionVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionDefinitionVersionResponse, Unit]
  ): Request[CreateSubscriptionDefinitionVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a subscription definition which has already been defined.
    */
  def createSubscriptionDefinitionVersion(params: CreateSubscriptionDefinitionVersionRequest): Request[CreateSubscriptionDefinitionVersionResponse, AWSError] = js.native
  def createSubscriptionDefinitionVersion(
    params: CreateSubscriptionDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionDefinitionVersionResponse, Unit]
  ): Request[CreateSubscriptionDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Deletes a connector definition.
    */
  def deleteConnectorDefinition(): Request[DeleteConnectorDefinitionResponse, AWSError] = js.native
  def deleteConnectorDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorDefinitionResponse, Unit]): Request[DeleteConnectorDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a connector definition.
    */
  def deleteConnectorDefinition(params: DeleteConnectorDefinitionRequest): Request[DeleteConnectorDefinitionResponse, AWSError] = js.native
  def deleteConnectorDefinition(
    params: DeleteConnectorDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorDefinitionResponse, Unit]
  ): Request[DeleteConnectorDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a core definition.
    */
  def deleteCoreDefinition(): Request[DeleteCoreDefinitionResponse, AWSError] = js.native
  def deleteCoreDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreDefinitionResponse, Unit]): Request[DeleteCoreDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a core definition.
    */
  def deleteCoreDefinition(params: DeleteCoreDefinitionRequest): Request[DeleteCoreDefinitionResponse, AWSError] = js.native
  def deleteCoreDefinition(
    params: DeleteCoreDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreDefinitionResponse, Unit]
  ): Request[DeleteCoreDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a device definition.
    */
  def deleteDeviceDefinition(): Request[DeleteDeviceDefinitionResponse, AWSError] = js.native
  def deleteDeviceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceDefinitionResponse, Unit]): Request[DeleteDeviceDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a device definition.
    */
  def deleteDeviceDefinition(params: DeleteDeviceDefinitionRequest): Request[DeleteDeviceDefinitionResponse, AWSError] = js.native
  def deleteDeviceDefinition(
    params: DeleteDeviceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceDefinitionResponse, Unit]
  ): Request[DeleteDeviceDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a Lambda function definition.
    */
  def deleteFunctionDefinition(): Request[DeleteFunctionDefinitionResponse, AWSError] = js.native
  def deleteFunctionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFunctionDefinitionResponse, Unit]): Request[DeleteFunctionDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a Lambda function definition.
    */
  def deleteFunctionDefinition(params: DeleteFunctionDefinitionRequest): Request[DeleteFunctionDefinitionResponse, AWSError] = js.native
  def deleteFunctionDefinition(
    params: DeleteFunctionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFunctionDefinitionResponse, Unit]
  ): Request[DeleteFunctionDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a group.
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Deletes a group.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a logger definition.
    */
  def deleteLoggerDefinition(): Request[DeleteLoggerDefinitionResponse, AWSError] = js.native
  def deleteLoggerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggerDefinitionResponse, Unit]): Request[DeleteLoggerDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a logger definition.
    */
  def deleteLoggerDefinition(params: DeleteLoggerDefinitionRequest): Request[DeleteLoggerDefinitionResponse, AWSError] = js.native
  def deleteLoggerDefinition(
    params: DeleteLoggerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggerDefinitionResponse, Unit]
  ): Request[DeleteLoggerDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a resource definition.
    */
  def deleteResourceDefinition(): Request[DeleteResourceDefinitionResponse, AWSError] = js.native
  def deleteResourceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceDefinitionResponse, Unit]): Request[DeleteResourceDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a resource definition.
    */
  def deleteResourceDefinition(params: DeleteResourceDefinitionRequest): Request[DeleteResourceDefinitionResponse, AWSError] = js.native
  def deleteResourceDefinition(
    params: DeleteResourceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceDefinitionResponse, Unit]
  ): Request[DeleteResourceDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a subscription definition.
    */
  def deleteSubscriptionDefinition(): Request[DeleteSubscriptionDefinitionResponse, AWSError] = js.native
  def deleteSubscriptionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionDefinitionResponse, Unit]): Request[DeleteSubscriptionDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a subscription definition.
    */
  def deleteSubscriptionDefinition(params: DeleteSubscriptionDefinitionRequest): Request[DeleteSubscriptionDefinitionResponse, AWSError] = js.native
  def deleteSubscriptionDefinition(
    params: DeleteSubscriptionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionDefinitionResponse, Unit]
  ): Request[DeleteSubscriptionDefinitionResponse, AWSError] = js.native
  
  /**
    * Disassociates the role from a group.
    */
  def disassociateRoleFromGroup(): Request[DisassociateRoleFromGroupResponse, AWSError] = js.native
  def disassociateRoleFromGroup(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRoleFromGroupResponse, Unit]): Request[DisassociateRoleFromGroupResponse, AWSError] = js.native
  /**
    * Disassociates the role from a group.
    */
  def disassociateRoleFromGroup(params: DisassociateRoleFromGroupRequest): Request[DisassociateRoleFromGroupResponse, AWSError] = js.native
  def disassociateRoleFromGroup(
    params: DisassociateRoleFromGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRoleFromGroupResponse, Unit]
  ): Request[DisassociateRoleFromGroupResponse, AWSError] = js.native
  
  /**
    * Disassociates the service role from your account. Without a service role, deployments will not work.
    */
  def disassociateServiceRoleFromAccount(): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceRoleFromAccountResponse, Unit]
  ): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  /**
    * Disassociates the service role from your account. Without a service role, deployments will not work.
    */
  def disassociateServiceRoleFromAccount(params: DisassociateServiceRoleFromAccountRequest): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    params: DisassociateServiceRoleFromAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceRoleFromAccountResponse, Unit]
  ): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  
  /**
    * Retrieves the role associated with a particular group.
    */
  def getAssociatedRole(): Request[GetAssociatedRoleResponse, AWSError] = js.native
  def getAssociatedRole(callback: js.Function2[/* err */ AWSError, /* data */ GetAssociatedRoleResponse, Unit]): Request[GetAssociatedRoleResponse, AWSError] = js.native
  /**
    * Retrieves the role associated with a particular group.
    */
  def getAssociatedRole(params: GetAssociatedRoleRequest): Request[GetAssociatedRoleResponse, AWSError] = js.native
  def getAssociatedRole(
    params: GetAssociatedRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociatedRoleResponse, Unit]
  ): Request[GetAssociatedRoleResponse, AWSError] = js.native
  
  /**
    * Returns the status of a bulk deployment.
    */
  def getBulkDeploymentStatus(): Request[GetBulkDeploymentStatusResponse, AWSError] = js.native
  def getBulkDeploymentStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetBulkDeploymentStatusResponse, Unit]): Request[GetBulkDeploymentStatusResponse, AWSError] = js.native
  /**
    * Returns the status of a bulk deployment.
    */
  def getBulkDeploymentStatus(params: GetBulkDeploymentStatusRequest): Request[GetBulkDeploymentStatusResponse, AWSError] = js.native
  def getBulkDeploymentStatus(
    params: GetBulkDeploymentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBulkDeploymentStatusResponse, Unit]
  ): Request[GetBulkDeploymentStatusResponse, AWSError] = js.native
  
  /**
    * Retrieves the connectivity information for a core.
    */
  def getConnectivityInfo(): Request[GetConnectivityInfoResponse, AWSError] = js.native
  def getConnectivityInfo(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectivityInfoResponse, Unit]): Request[GetConnectivityInfoResponse, AWSError] = js.native
  /**
    * Retrieves the connectivity information for a core.
    */
  def getConnectivityInfo(params: GetConnectivityInfoRequest): Request[GetConnectivityInfoResponse, AWSError] = js.native
  def getConnectivityInfo(
    params: GetConnectivityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectivityInfoResponse, Unit]
  ): Request[GetConnectivityInfoResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a connector definition.
    */
  def getConnectorDefinition(): Request[GetConnectorDefinitionResponse, AWSError] = js.native
  def getConnectorDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorDefinitionResponse, Unit]): Request[GetConnectorDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a connector definition.
    */
  def getConnectorDefinition(params: GetConnectorDefinitionRequest): Request[GetConnectorDefinitionResponse, AWSError] = js.native
  def getConnectorDefinition(
    params: GetConnectorDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorDefinitionResponse, Unit]
  ): Request[GetConnectorDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a connector definition version, including the connectors that the version contains. Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def getConnectorDefinitionVersion(): Request[GetConnectorDefinitionVersionResponse, AWSError] = js.native
  def getConnectorDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorDefinitionVersionResponse, Unit]): Request[GetConnectorDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a connector definition version, including the connectors that the version contains. Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def getConnectorDefinitionVersion(params: GetConnectorDefinitionVersionRequest): Request[GetConnectorDefinitionVersionResponse, AWSError] = js.native
  def getConnectorDefinitionVersion(
    params: GetConnectorDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorDefinitionVersionResponse, Unit]
  ): Request[GetConnectorDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinition(): Request[GetCoreDefinitionResponse, AWSError] = js.native
  def getCoreDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDefinitionResponse, Unit]): Request[GetCoreDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinition(params: GetCoreDefinitionRequest): Request[GetCoreDefinitionResponse, AWSError] = js.native
  def getCoreDefinition(
    params: GetCoreDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDefinitionResponse, Unit]
  ): Request[GetCoreDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinitionVersion(): Request[GetCoreDefinitionVersionResponse, AWSError] = js.native
  def getCoreDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDefinitionVersionResponse, Unit]): Request[GetCoreDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinitionVersion(params: GetCoreDefinitionVersionRequest): Request[GetCoreDefinitionVersionResponse, AWSError] = js.native
  def getCoreDefinitionVersion(
    params: GetCoreDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDefinitionVersionResponse, Unit]
  ): Request[GetCoreDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Returns the status of a deployment.
    */
  def getDeploymentStatus(): Request[GetDeploymentStatusResponse, AWSError] = js.native
  def getDeploymentStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentStatusResponse, Unit]): Request[GetDeploymentStatusResponse, AWSError] = js.native
  /**
    * Returns the status of a deployment.
    */
  def getDeploymentStatus(params: GetDeploymentStatusRequest): Request[GetDeploymentStatusResponse, AWSError] = js.native
  def getDeploymentStatus(
    params: GetDeploymentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentStatusResponse, Unit]
  ): Request[GetDeploymentStatusResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a device definition.
    */
  def getDeviceDefinition(): Request[GetDeviceDefinitionResponse, AWSError] = js.native
  def getDeviceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceDefinitionResponse, Unit]): Request[GetDeviceDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a device definition.
    */
  def getDeviceDefinition(params: GetDeviceDefinitionRequest): Request[GetDeviceDefinitionResponse, AWSError] = js.native
  def getDeviceDefinition(
    params: GetDeviceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceDefinitionResponse, Unit]
  ): Request[GetDeviceDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a device definition version.
    */
  def getDeviceDefinitionVersion(): Request[GetDeviceDefinitionVersionResponse, AWSError] = js.native
  def getDeviceDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceDefinitionVersionResponse, Unit]): Request[GetDeviceDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a device definition version.
    */
  def getDeviceDefinitionVersion(params: GetDeviceDefinitionVersionRequest): Request[GetDeviceDefinitionVersionResponse, AWSError] = js.native
  def getDeviceDefinitionVersion(
    params: GetDeviceDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceDefinitionVersionResponse, Unit]
  ): Request[GetDeviceDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a Lambda function definition, including its creation time and latest version.
    */
  def getFunctionDefinition(): Request[GetFunctionDefinitionResponse, AWSError] = js.native
  def getFunctionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionDefinitionResponse, Unit]): Request[GetFunctionDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition, including its creation time and latest version.
    */
  def getFunctionDefinition(params: GetFunctionDefinitionRequest): Request[GetFunctionDefinitionResponse, AWSError] = js.native
  def getFunctionDefinition(
    params: GetFunctionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionDefinitionResponse, Unit]
  ): Request[GetFunctionDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
    */
  def getFunctionDefinitionVersion(): Request[GetFunctionDefinitionVersionResponse, AWSError] = js.native
  def getFunctionDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionDefinitionVersionResponse, Unit]): Request[GetFunctionDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
    */
  def getFunctionDefinitionVersion(params: GetFunctionDefinitionVersionRequest): Request[GetFunctionDefinitionVersionResponse, AWSError] = js.native
  def getFunctionDefinitionVersion(
    params: GetFunctionDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionDefinitionVersionResponse, Unit]
  ): Request[GetFunctionDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a group.
    */
  def getGroup(): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]): Request[GetGroupResponse, AWSError] = js.native
  /**
    * Retrieves information about a group.
    */
  def getGroup(params: GetGroupRequest): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]
  ): Request[GetGroupResponse, AWSError] = js.native
  
  /**
    * Retreives the CA associated with a group. Returns the public key of the CA.
    */
  def getGroupCertificateAuthority(): Request[GetGroupCertificateAuthorityResponse, AWSError] = js.native
  def getGroupCertificateAuthority(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupCertificateAuthorityResponse, Unit]): Request[GetGroupCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Retreives the CA associated with a group. Returns the public key of the CA.
    */
  def getGroupCertificateAuthority(params: GetGroupCertificateAuthorityRequest): Request[GetGroupCertificateAuthorityResponse, AWSError] = js.native
  def getGroupCertificateAuthority(
    params: GetGroupCertificateAuthorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupCertificateAuthorityResponse, Unit]
  ): Request[GetGroupCertificateAuthorityResponse, AWSError] = js.native
  
  /**
    * Retrieves the current configuration for the CA used by the group.
    */
  def getGroupCertificateConfiguration(): Request[GetGroupCertificateConfigurationResponse, AWSError] = js.native
  def getGroupCertificateConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupCertificateConfigurationResponse, Unit]
  ): Request[GetGroupCertificateConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the current configuration for the CA used by the group.
    */
  def getGroupCertificateConfiguration(params: GetGroupCertificateConfigurationRequest): Request[GetGroupCertificateConfigurationResponse, AWSError] = js.native
  def getGroupCertificateConfiguration(
    params: GetGroupCertificateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupCertificateConfigurationResponse, Unit]
  ): Request[GetGroupCertificateConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a group version.
    */
  def getGroupVersion(): Request[GetGroupVersionResponse, AWSError] = js.native
  def getGroupVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupVersionResponse, Unit]): Request[GetGroupVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a group version.
    */
  def getGroupVersion(params: GetGroupVersionRequest): Request[GetGroupVersionResponse, AWSError] = js.native
  def getGroupVersion(
    params: GetGroupVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupVersionResponse, Unit]
  ): Request[GetGroupVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a logger definition.
    */
  def getLoggerDefinition(): Request[GetLoggerDefinitionResponse, AWSError] = js.native
  def getLoggerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggerDefinitionResponse, Unit]): Request[GetLoggerDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a logger definition.
    */
  def getLoggerDefinition(params: GetLoggerDefinitionRequest): Request[GetLoggerDefinitionResponse, AWSError] = js.native
  def getLoggerDefinition(
    params: GetLoggerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggerDefinitionResponse, Unit]
  ): Request[GetLoggerDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a logger definition version.
    */
  def getLoggerDefinitionVersion(): Request[GetLoggerDefinitionVersionResponse, AWSError] = js.native
  def getLoggerDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggerDefinitionVersionResponse, Unit]): Request[GetLoggerDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a logger definition version.
    */
  def getLoggerDefinitionVersion(params: GetLoggerDefinitionVersionRequest): Request[GetLoggerDefinitionVersionResponse, AWSError] = js.native
  def getLoggerDefinitionVersion(
    params: GetLoggerDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggerDefinitionVersionResponse, Unit]
  ): Request[GetLoggerDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a resource definition, including its creation time and latest version.
    */
  def getResourceDefinition(): Request[GetResourceDefinitionResponse, AWSError] = js.native
  def getResourceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceDefinitionResponse, Unit]): Request[GetResourceDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a resource definition, including its creation time and latest version.
    */
  def getResourceDefinition(params: GetResourceDefinitionRequest): Request[GetResourceDefinitionResponse, AWSError] = js.native
  def getResourceDefinition(
    params: GetResourceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceDefinitionResponse, Unit]
  ): Request[GetResourceDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a resource definition version, including which resources are included in the version.
    */
  def getResourceDefinitionVersion(): Request[GetResourceDefinitionVersionResponse, AWSError] = js.native
  def getResourceDefinitionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceDefinitionVersionResponse, Unit]): Request[GetResourceDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a resource definition version, including which resources are included in the version.
    */
  def getResourceDefinitionVersion(params: GetResourceDefinitionVersionRequest): Request[GetResourceDefinitionVersionResponse, AWSError] = js.native
  def getResourceDefinitionVersion(
    params: GetResourceDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceDefinitionVersionResponse, Unit]
  ): Request[GetResourceDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves the service role that is attached to your account.
    */
  def getServiceRoleForAccount(): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  def getServiceRoleForAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceRoleForAccountResponse, Unit]): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  /**
    * Retrieves the service role that is attached to your account.
    */
  def getServiceRoleForAccount(params: GetServiceRoleForAccountRequest): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  def getServiceRoleForAccount(
    params: GetServiceRoleForAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceRoleForAccountResponse, Unit]
  ): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a subscription definition.
    */
  def getSubscriptionDefinition(): Request[GetSubscriptionDefinitionResponse, AWSError] = js.native
  def getSubscriptionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionDefinitionResponse, Unit]): Request[GetSubscriptionDefinitionResponse, AWSError] = js.native
  /**
    * Retrieves information about a subscription definition.
    */
  def getSubscriptionDefinition(params: GetSubscriptionDefinitionRequest): Request[GetSubscriptionDefinitionResponse, AWSError] = js.native
  def getSubscriptionDefinition(
    params: GetSubscriptionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionDefinitionResponse, Unit]
  ): Request[GetSubscriptionDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a subscription definition version.
    */
  def getSubscriptionDefinitionVersion(): Request[GetSubscriptionDefinitionVersionResponse, AWSError] = js.native
  def getSubscriptionDefinitionVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionDefinitionVersionResponse, Unit]
  ): Request[GetSubscriptionDefinitionVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about a subscription definition version.
    */
  def getSubscriptionDefinitionVersion(params: GetSubscriptionDefinitionVersionRequest): Request[GetSubscriptionDefinitionVersionResponse, AWSError] = js.native
  def getSubscriptionDefinitionVersion(
    params: GetSubscriptionDefinitionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionDefinitionVersionResponse, Unit]
  ): Request[GetSubscriptionDefinitionVersionResponse, AWSError] = js.native
  
  /**
    * Get the runtime configuration of a thing.
    */
  def getThingRuntimeConfiguration(): Request[GetThingRuntimeConfigurationResponse, AWSError] = js.native
  def getThingRuntimeConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetThingRuntimeConfigurationResponse, Unit]): Request[GetThingRuntimeConfigurationResponse, AWSError] = js.native
  /**
    * Get the runtime configuration of a thing.
    */
  def getThingRuntimeConfiguration(params: GetThingRuntimeConfigurationRequest): Request[GetThingRuntimeConfigurationResponse, AWSError] = js.native
  def getThingRuntimeConfiguration(
    params: GetThingRuntimeConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThingRuntimeConfigurationResponse, Unit]
  ): Request[GetThingRuntimeConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
    */
  def listBulkDeploymentDetailedReports(): Request[ListBulkDeploymentDetailedReportsResponse, AWSError] = js.native
  def listBulkDeploymentDetailedReports(
    callback: js.Function2[/* err */ AWSError, /* data */ ListBulkDeploymentDetailedReportsResponse, Unit]
  ): Request[ListBulkDeploymentDetailedReportsResponse, AWSError] = js.native
  /**
    * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
    */
  def listBulkDeploymentDetailedReports(params: ListBulkDeploymentDetailedReportsRequest): Request[ListBulkDeploymentDetailedReportsResponse, AWSError] = js.native
  def listBulkDeploymentDetailedReports(
    params: ListBulkDeploymentDetailedReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBulkDeploymentDetailedReportsResponse, Unit]
  ): Request[ListBulkDeploymentDetailedReportsResponse, AWSError] = js.native
  
  /**
    * Returns a list of bulk deployments.
    */
  def listBulkDeployments(): Request[ListBulkDeploymentsResponse, AWSError] = js.native
  def listBulkDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListBulkDeploymentsResponse, Unit]): Request[ListBulkDeploymentsResponse, AWSError] = js.native
  /**
    * Returns a list of bulk deployments.
    */
  def listBulkDeployments(params: ListBulkDeploymentsRequest): Request[ListBulkDeploymentsResponse, AWSError] = js.native
  def listBulkDeployments(
    params: ListBulkDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBulkDeploymentsResponse, Unit]
  ): Request[ListBulkDeploymentsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a connector definition, which are containers for connectors. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def listConnectorDefinitionVersions(): Request[ListConnectorDefinitionVersionsResponse, AWSError] = js.native
  def listConnectorDefinitionVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorDefinitionVersionsResponse, Unit]
  ): Request[ListConnectorDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a connector definition, which are containers for connectors. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def listConnectorDefinitionVersions(params: ListConnectorDefinitionVersionsRequest): Request[ListConnectorDefinitionVersionsResponse, AWSError] = js.native
  def listConnectorDefinitionVersions(
    params: ListConnectorDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorDefinitionVersionsResponse, Unit]
  ): Request[ListConnectorDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of connector definitions.
    */
  def listConnectorDefinitions(): Request[ListConnectorDefinitionsResponse, AWSError] = js.native
  def listConnectorDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorDefinitionsResponse, Unit]): Request[ListConnectorDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of connector definitions.
    */
  def listConnectorDefinitions(params: ListConnectorDefinitionsRequest): Request[ListConnectorDefinitionsResponse, AWSError] = js.native
  def listConnectorDefinitions(
    params: ListConnectorDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorDefinitionsResponse, Unit]
  ): Request[ListConnectorDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a core definition.
    */
  def listCoreDefinitionVersions(): Request[ListCoreDefinitionVersionsResponse, AWSError] = js.native
  def listCoreDefinitionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDefinitionVersionsResponse, Unit]): Request[ListCoreDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a core definition.
    */
  def listCoreDefinitionVersions(params: ListCoreDefinitionVersionsRequest): Request[ListCoreDefinitionVersionsResponse, AWSError] = js.native
  def listCoreDefinitionVersions(
    params: ListCoreDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDefinitionVersionsResponse, Unit]
  ): Request[ListCoreDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of core definitions.
    */
  def listCoreDefinitions(): Request[ListCoreDefinitionsResponse, AWSError] = js.native
  def listCoreDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDefinitionsResponse, Unit]): Request[ListCoreDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of core definitions.
    */
  def listCoreDefinitions(params: ListCoreDefinitionsRequest): Request[ListCoreDefinitionsResponse, AWSError] = js.native
  def listCoreDefinitions(
    params: ListCoreDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDefinitionsResponse, Unit]
  ): Request[ListCoreDefinitionsResponse, AWSError] = js.native
  
  /**
    * Returns a history of deployments for the group.
    */
  def listDeployments(): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]): Request[ListDeploymentsResponse, AWSError] = js.native
  /**
    * Returns a history of deployments for the group.
    */
  def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]
  ): Request[ListDeploymentsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a device definition.
    */
  def listDeviceDefinitionVersions(): Request[ListDeviceDefinitionVersionsResponse, AWSError] = js.native
  def listDeviceDefinitionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceDefinitionVersionsResponse, Unit]): Request[ListDeviceDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a device definition.
    */
  def listDeviceDefinitionVersions(params: ListDeviceDefinitionVersionsRequest): Request[ListDeviceDefinitionVersionsResponse, AWSError] = js.native
  def listDeviceDefinitionVersions(
    params: ListDeviceDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceDefinitionVersionsResponse, Unit]
  ): Request[ListDeviceDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of device definitions.
    */
  def listDeviceDefinitions(): Request[ListDeviceDefinitionsResponse, AWSError] = js.native
  def listDeviceDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceDefinitionsResponse, Unit]): Request[ListDeviceDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of device definitions.
    */
  def listDeviceDefinitions(params: ListDeviceDefinitionsRequest): Request[ListDeviceDefinitionsResponse, AWSError] = js.native
  def listDeviceDefinitions(
    params: ListDeviceDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceDefinitionsResponse, Unit]
  ): Request[ListDeviceDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a Lambda function definition.
    */
  def listFunctionDefinitionVersions(): Request[ListFunctionDefinitionVersionsResponse, AWSError] = js.native
  def listFunctionDefinitionVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionDefinitionVersionsResponse, Unit]
  ): Request[ListFunctionDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a Lambda function definition.
    */
  def listFunctionDefinitionVersions(params: ListFunctionDefinitionVersionsRequest): Request[ListFunctionDefinitionVersionsResponse, AWSError] = js.native
  def listFunctionDefinitionVersions(
    params: ListFunctionDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionDefinitionVersionsResponse, Unit]
  ): Request[ListFunctionDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of Lambda function definitions.
    */
  def listFunctionDefinitions(): Request[ListFunctionDefinitionsResponse, AWSError] = js.native
  def listFunctionDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionDefinitionsResponse, Unit]): Request[ListFunctionDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of Lambda function definitions.
    */
  def listFunctionDefinitions(params: ListFunctionDefinitionsRequest): Request[ListFunctionDefinitionsResponse, AWSError] = js.native
  def listFunctionDefinitions(
    params: ListFunctionDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionDefinitionsResponse, Unit]
  ): Request[ListFunctionDefinitionsResponse, AWSError] = js.native
  
  /**
    * Retrieves the current CAs for a group.
    */
  def listGroupCertificateAuthorities(): Request[ListGroupCertificateAuthoritiesResponse, AWSError] = js.native
  def listGroupCertificateAuthorities(
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupCertificateAuthoritiesResponse, Unit]
  ): Request[ListGroupCertificateAuthoritiesResponse, AWSError] = js.native
  /**
    * Retrieves the current CAs for a group.
    */
  def listGroupCertificateAuthorities(params: ListGroupCertificateAuthoritiesRequest): Request[ListGroupCertificateAuthoritiesResponse, AWSError] = js.native
  def listGroupCertificateAuthorities(
    params: ListGroupCertificateAuthoritiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupCertificateAuthoritiesResponse, Unit]
  ): Request[ListGroupCertificateAuthoritiesResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a group.
    */
  def listGroupVersions(): Request[ListGroupVersionsResponse, AWSError] = js.native
  def listGroupVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupVersionsResponse, Unit]): Request[ListGroupVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a group.
    */
  def listGroupVersions(params: ListGroupVersionsRequest): Request[ListGroupVersionsResponse, AWSError] = js.native
  def listGroupVersions(
    params: ListGroupVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupVersionsResponse, Unit]
  ): Request[ListGroupVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of groups.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Retrieves a list of groups.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a logger definition.
    */
  def listLoggerDefinitionVersions(): Request[ListLoggerDefinitionVersionsResponse, AWSError] = js.native
  def listLoggerDefinitionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListLoggerDefinitionVersionsResponse, Unit]): Request[ListLoggerDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a logger definition.
    */
  def listLoggerDefinitionVersions(params: ListLoggerDefinitionVersionsRequest): Request[ListLoggerDefinitionVersionsResponse, AWSError] = js.native
  def listLoggerDefinitionVersions(
    params: ListLoggerDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLoggerDefinitionVersionsResponse, Unit]
  ): Request[ListLoggerDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of logger definitions.
    */
  def listLoggerDefinitions(): Request[ListLoggerDefinitionsResponse, AWSError] = js.native
  def listLoggerDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListLoggerDefinitionsResponse, Unit]): Request[ListLoggerDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of logger definitions.
    */
  def listLoggerDefinitions(params: ListLoggerDefinitionsRequest): Request[ListLoggerDefinitionsResponse, AWSError] = js.native
  def listLoggerDefinitions(
    params: ListLoggerDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLoggerDefinitionsResponse, Unit]
  ): Request[ListLoggerDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a resource definition.
    */
  def listResourceDefinitionVersions(): Request[ListResourceDefinitionVersionsResponse, AWSError] = js.native
  def listResourceDefinitionVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDefinitionVersionsResponse, Unit]
  ): Request[ListResourceDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a resource definition.
    */
  def listResourceDefinitionVersions(params: ListResourceDefinitionVersionsRequest): Request[ListResourceDefinitionVersionsResponse, AWSError] = js.native
  def listResourceDefinitionVersions(
    params: ListResourceDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDefinitionVersionsResponse, Unit]
  ): Request[ListResourceDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of resource definitions.
    */
  def listResourceDefinitions(): Request[ListResourceDefinitionsResponse, AWSError] = js.native
  def listResourceDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDefinitionsResponse, Unit]): Request[ListResourceDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of resource definitions.
    */
  def listResourceDefinitions(params: ListResourceDefinitionsRequest): Request[ListResourceDefinitionsResponse, AWSError] = js.native
  def listResourceDefinitions(
    params: ListResourceDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDefinitionsResponse, Unit]
  ): Request[ListResourceDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a subscription definition.
    */
  def listSubscriptionDefinitionVersions(): Request[ListSubscriptionDefinitionVersionsResponse, AWSError] = js.native
  def listSubscriptionDefinitionVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionDefinitionVersionsResponse, Unit]
  ): Request[ListSubscriptionDefinitionVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a subscription definition.
    */
  def listSubscriptionDefinitionVersions(params: ListSubscriptionDefinitionVersionsRequest): Request[ListSubscriptionDefinitionVersionsResponse, AWSError] = js.native
  def listSubscriptionDefinitionVersions(
    params: ListSubscriptionDefinitionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionDefinitionVersionsResponse, Unit]
  ): Request[ListSubscriptionDefinitionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of subscription definitions.
    */
  def listSubscriptionDefinitions(): Request[ListSubscriptionDefinitionsResponse, AWSError] = js.native
  def listSubscriptionDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionDefinitionsResponse, Unit]): Request[ListSubscriptionDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of subscription definitions.
    */
  def listSubscriptionDefinitions(params: ListSubscriptionDefinitionsRequest): Request[ListSubscriptionDefinitionsResponse, AWSError] = js.native
  def listSubscriptionDefinitions(
    params: ListSubscriptionDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscriptionDefinitionsResponse, Unit]
  ): Request[ListSubscriptionDefinitionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of resource tags for a resource arn.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves a list of resource tags for a resource arn.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Resets a group's deployments.
    */
  def resetDeployments(): Request[ResetDeploymentsResponse, AWSError] = js.native
  def resetDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ResetDeploymentsResponse, Unit]): Request[ResetDeploymentsResponse, AWSError] = js.native
  /**
    * Resets a group's deployments.
    */
  def resetDeployments(params: ResetDeploymentsRequest): Request[ResetDeploymentsResponse, AWSError] = js.native
  def resetDeployments(
    params: ResetDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetDeploymentsResponse, Unit]
  ): Request[ResetDeploymentsResponse, AWSError] = js.native
  
  /**
    * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
    */
  def startBulkDeployment(): Request[StartBulkDeploymentResponse, AWSError] = js.native
  def startBulkDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StartBulkDeploymentResponse, Unit]): Request[StartBulkDeploymentResponse, AWSError] = js.native
  /**
    * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
    */
  def startBulkDeployment(params: StartBulkDeploymentRequest): Request[StartBulkDeploymentResponse, AWSError] = js.native
  def startBulkDeployment(
    params: StartBulkDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBulkDeploymentResponse, Unit]
  ): Request[StartBulkDeploymentResponse, AWSError] = js.native
  
  /**
    * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
    */
  def stopBulkDeployment(): Request[StopBulkDeploymentResponse, AWSError] = js.native
  def stopBulkDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StopBulkDeploymentResponse, Unit]): Request[StopBulkDeploymentResponse, AWSError] = js.native
  /**
    * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
    */
  def stopBulkDeployment(params: StopBulkDeploymentRequest): Request[StopBulkDeploymentResponse, AWSError] = js.native
  def stopBulkDeployment(
    params: StopBulkDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopBulkDeploymentResponse, Unit]
  ): Request[StopBulkDeploymentResponse, AWSError] = js.native
  
  /**
    * Adds tags to a Greengrass resource. Valid resources are 'Group', 'ConnectorDefinition', 'CoreDefinition', 'DeviceDefinition', 'FunctionDefinition', 'LoggerDefinition', 'SubscriptionDefinition', 'ResourceDefinition', and 'BulkDeployment'.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to a Greengrass resource. Valid resources are 'Group', 'ConnectorDefinition', 'CoreDefinition', 'DeviceDefinition', 'FunctionDefinition', 'LoggerDefinition', 'SubscriptionDefinition', 'ResourceDefinition', and 'BulkDeployment'.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Remove resource tags from a Greengrass Resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove resource tags from a Greengrass Resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
    */
  def updateConnectivityInfo(): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  def updateConnectivityInfo(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectivityInfoResponse, Unit]): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  /**
    * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
    */
  def updateConnectivityInfo(params: UpdateConnectivityInfoRequest): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  def updateConnectivityInfo(
    params: UpdateConnectivityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectivityInfoResponse, Unit]
  ): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  
  /**
    * Updates a connector definition.
    */
  def updateConnectorDefinition(): Request[UpdateConnectorDefinitionResponse, AWSError] = js.native
  def updateConnectorDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorDefinitionResponse, Unit]): Request[UpdateConnectorDefinitionResponse, AWSError] = js.native
  /**
    * Updates a connector definition.
    */
  def updateConnectorDefinition(params: UpdateConnectorDefinitionRequest): Request[UpdateConnectorDefinitionResponse, AWSError] = js.native
  def updateConnectorDefinition(
    params: UpdateConnectorDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorDefinitionResponse, Unit]
  ): Request[UpdateConnectorDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a core definition.
    */
  def updateCoreDefinition(): Request[UpdateCoreDefinitionResponse, AWSError] = js.native
  def updateCoreDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCoreDefinitionResponse, Unit]): Request[UpdateCoreDefinitionResponse, AWSError] = js.native
  /**
    * Updates a core definition.
    */
  def updateCoreDefinition(params: UpdateCoreDefinitionRequest): Request[UpdateCoreDefinitionResponse, AWSError] = js.native
  def updateCoreDefinition(
    params: UpdateCoreDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCoreDefinitionResponse, Unit]
  ): Request[UpdateCoreDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a device definition.
    */
  def updateDeviceDefinition(): Request[UpdateDeviceDefinitionResponse, AWSError] = js.native
  def updateDeviceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceDefinitionResponse, Unit]): Request[UpdateDeviceDefinitionResponse, AWSError] = js.native
  /**
    * Updates a device definition.
    */
  def updateDeviceDefinition(params: UpdateDeviceDefinitionRequest): Request[UpdateDeviceDefinitionResponse, AWSError] = js.native
  def updateDeviceDefinition(
    params: UpdateDeviceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceDefinitionResponse, Unit]
  ): Request[UpdateDeviceDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a Lambda function definition.
    */
  def updateFunctionDefinition(): Request[UpdateFunctionDefinitionResponse, AWSError] = js.native
  def updateFunctionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFunctionDefinitionResponse, Unit]): Request[UpdateFunctionDefinitionResponse, AWSError] = js.native
  /**
    * Updates a Lambda function definition.
    */
  def updateFunctionDefinition(params: UpdateFunctionDefinitionRequest): Request[UpdateFunctionDefinitionResponse, AWSError] = js.native
  def updateFunctionDefinition(
    params: UpdateFunctionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFunctionDefinitionResponse, Unit]
  ): Request[UpdateFunctionDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a group.
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Updates a group.
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  
  /**
    * Updates the Certificate expiry time for a group.
    */
  def updateGroupCertificateConfiguration(): Request[UpdateGroupCertificateConfigurationResponse, AWSError] = js.native
  def updateGroupCertificateConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupCertificateConfigurationResponse, Unit]
  ): Request[UpdateGroupCertificateConfigurationResponse, AWSError] = js.native
  /**
    * Updates the Certificate expiry time for a group.
    */
  def updateGroupCertificateConfiguration(params: UpdateGroupCertificateConfigurationRequest): Request[UpdateGroupCertificateConfigurationResponse, AWSError] = js.native
  def updateGroupCertificateConfiguration(
    params: UpdateGroupCertificateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupCertificateConfigurationResponse, Unit]
  ): Request[UpdateGroupCertificateConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a logger definition.
    */
  def updateLoggerDefinition(): Request[UpdateLoggerDefinitionResponse, AWSError] = js.native
  def updateLoggerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggerDefinitionResponse, Unit]): Request[UpdateLoggerDefinitionResponse, AWSError] = js.native
  /**
    * Updates a logger definition.
    */
  def updateLoggerDefinition(params: UpdateLoggerDefinitionRequest): Request[UpdateLoggerDefinitionResponse, AWSError] = js.native
  def updateLoggerDefinition(
    params: UpdateLoggerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggerDefinitionResponse, Unit]
  ): Request[UpdateLoggerDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a resource definition.
    */
  def updateResourceDefinition(): Request[UpdateResourceDefinitionResponse, AWSError] = js.native
  def updateResourceDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceDefinitionResponse, Unit]): Request[UpdateResourceDefinitionResponse, AWSError] = js.native
  /**
    * Updates a resource definition.
    */
  def updateResourceDefinition(params: UpdateResourceDefinitionRequest): Request[UpdateResourceDefinitionResponse, AWSError] = js.native
  def updateResourceDefinition(
    params: UpdateResourceDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceDefinitionResponse, Unit]
  ): Request[UpdateResourceDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates a subscription definition.
    */
  def updateSubscriptionDefinition(): Request[UpdateSubscriptionDefinitionResponse, AWSError] = js.native
  def updateSubscriptionDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionDefinitionResponse, Unit]): Request[UpdateSubscriptionDefinitionResponse, AWSError] = js.native
  /**
    * Updates a subscription definition.
    */
  def updateSubscriptionDefinition(params: UpdateSubscriptionDefinitionRequest): Request[UpdateSubscriptionDefinitionResponse, AWSError] = js.native
  def updateSubscriptionDefinition(
    params: UpdateSubscriptionDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionDefinitionResponse, Unit]
  ): Request[UpdateSubscriptionDefinitionResponse, AWSError] = js.native
  
  /**
    * Updates the runtime configuration of a thing.
    */
  def updateThingRuntimeConfiguration(): Request[UpdateThingRuntimeConfigurationResponse, AWSError] = js.native
  def updateThingRuntimeConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingRuntimeConfigurationResponse, Unit]
  ): Request[UpdateThingRuntimeConfigurationResponse, AWSError] = js.native
  /**
    * Updates the runtime configuration of a thing.
    */
  def updateThingRuntimeConfiguration(params: UpdateThingRuntimeConfigurationRequest): Request[UpdateThingRuntimeConfigurationResponse, AWSError] = js.native
  def updateThingRuntimeConfiguration(
    params: UpdateThingRuntimeConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingRuntimeConfigurationResponse, Unit]
  ): Request[UpdateThingRuntimeConfigurationResponse, AWSError] = js.native
}
