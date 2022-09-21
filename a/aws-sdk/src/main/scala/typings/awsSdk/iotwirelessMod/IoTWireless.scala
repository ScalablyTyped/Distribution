package typings.awsSdk.iotwirelessMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTWireless extends Service {
  
  /**
    * Associates a partner account with your AWS account.
    */
  def associateAwsAccountWithPartnerAccount(): Request[AssociateAwsAccountWithPartnerAccountResponse, AWSError] = js.native
  def associateAwsAccountWithPartnerAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAwsAccountWithPartnerAccountResponse, Unit]
  ): Request[AssociateAwsAccountWithPartnerAccountResponse, AWSError] = js.native
  /**
    * Associates a partner account with your AWS account.
    */
  def associateAwsAccountWithPartnerAccount(params: AssociateAwsAccountWithPartnerAccountRequest): Request[AssociateAwsAccountWithPartnerAccountResponse, AWSError] = js.native
  def associateAwsAccountWithPartnerAccount(
    params: AssociateAwsAccountWithPartnerAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAwsAccountWithPartnerAccountResponse, Unit]
  ): Request[AssociateAwsAccountWithPartnerAccountResponse, AWSError] = js.native
  
  /**
    * Associate a multicast group with a FUOTA task.
    */
  def associateMulticastGroupWithFuotaTask(): Request[AssociateMulticastGroupWithFuotaTaskResponse, AWSError] = js.native
  def associateMulticastGroupWithFuotaTask(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateMulticastGroupWithFuotaTaskResponse, Unit]
  ): Request[AssociateMulticastGroupWithFuotaTaskResponse, AWSError] = js.native
  /**
    * Associate a multicast group with a FUOTA task.
    */
  def associateMulticastGroupWithFuotaTask(params: AssociateMulticastGroupWithFuotaTaskRequest): Request[AssociateMulticastGroupWithFuotaTaskResponse, AWSError] = js.native
  def associateMulticastGroupWithFuotaTask(
    params: AssociateMulticastGroupWithFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateMulticastGroupWithFuotaTaskResponse, Unit]
  ): Request[AssociateMulticastGroupWithFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Associate a wireless device with a FUOTA task.
    */
  def associateWirelessDeviceWithFuotaTask(): Request[AssociateWirelessDeviceWithFuotaTaskResponse, AWSError] = js.native
  def associateWirelessDeviceWithFuotaTask(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessDeviceWithFuotaTaskResponse, Unit]
  ): Request[AssociateWirelessDeviceWithFuotaTaskResponse, AWSError] = js.native
  /**
    * Associate a wireless device with a FUOTA task.
    */
  def associateWirelessDeviceWithFuotaTask(params: AssociateWirelessDeviceWithFuotaTaskRequest): Request[AssociateWirelessDeviceWithFuotaTaskResponse, AWSError] = js.native
  def associateWirelessDeviceWithFuotaTask(
    params: AssociateWirelessDeviceWithFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessDeviceWithFuotaTaskResponse, Unit]
  ): Request[AssociateWirelessDeviceWithFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Associates a wireless device with a multicast group.
    */
  def associateWirelessDeviceWithMulticastGroup(): Request[AssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  def associateWirelessDeviceWithMulticastGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateWirelessDeviceWithMulticastGroupResponse, 
      Unit
    ]
  ): Request[AssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  /**
    * Associates a wireless device with a multicast group.
    */
  def associateWirelessDeviceWithMulticastGroup(params: AssociateWirelessDeviceWithMulticastGroupRequest): Request[AssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  def associateWirelessDeviceWithMulticastGroup(
    params: AssociateWirelessDeviceWithMulticastGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateWirelessDeviceWithMulticastGroupResponse, 
      Unit
    ]
  ): Request[AssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Associates a wireless device with a thing.
    */
  def associateWirelessDeviceWithThing(): Request[AssociateWirelessDeviceWithThingResponse, AWSError] = js.native
  def associateWirelessDeviceWithThing(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessDeviceWithThingResponse, Unit]
  ): Request[AssociateWirelessDeviceWithThingResponse, AWSError] = js.native
  /**
    * Associates a wireless device with a thing.
    */
  def associateWirelessDeviceWithThing(params: AssociateWirelessDeviceWithThingRequest): Request[AssociateWirelessDeviceWithThingResponse, AWSError] = js.native
  def associateWirelessDeviceWithThing(
    params: AssociateWirelessDeviceWithThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessDeviceWithThingResponse, Unit]
  ): Request[AssociateWirelessDeviceWithThingResponse, AWSError] = js.native
  
  /**
    * Associates a wireless gateway with a certificate.
    */
  def associateWirelessGatewayWithCertificate(): Request[AssociateWirelessGatewayWithCertificateResponse, AWSError] = js.native
  def associateWirelessGatewayWithCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessGatewayWithCertificateResponse, Unit]
  ): Request[AssociateWirelessGatewayWithCertificateResponse, AWSError] = js.native
  /**
    * Associates a wireless gateway with a certificate.
    */
  def associateWirelessGatewayWithCertificate(params: AssociateWirelessGatewayWithCertificateRequest): Request[AssociateWirelessGatewayWithCertificateResponse, AWSError] = js.native
  def associateWirelessGatewayWithCertificate(
    params: AssociateWirelessGatewayWithCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessGatewayWithCertificateResponse, Unit]
  ): Request[AssociateWirelessGatewayWithCertificateResponse, AWSError] = js.native
  
  /**
    * Associates a wireless gateway with a thing.
    */
  def associateWirelessGatewayWithThing(): Request[AssociateWirelessGatewayWithThingResponse, AWSError] = js.native
  def associateWirelessGatewayWithThing(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessGatewayWithThingResponse, Unit]
  ): Request[AssociateWirelessGatewayWithThingResponse, AWSError] = js.native
  /**
    * Associates a wireless gateway with a thing.
    */
  def associateWirelessGatewayWithThing(params: AssociateWirelessGatewayWithThingRequest): Request[AssociateWirelessGatewayWithThingResponse, AWSError] = js.native
  def associateWirelessGatewayWithThing(
    params: AssociateWirelessGatewayWithThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWirelessGatewayWithThingResponse, Unit]
  ): Request[AssociateWirelessGatewayWithThingResponse, AWSError] = js.native
  
  /**
    * Cancels an existing multicast group session.
    */
  def cancelMulticastGroupSession(): Request[CancelMulticastGroupSessionResponse, AWSError] = js.native
  def cancelMulticastGroupSession(callback: js.Function2[/* err */ AWSError, /* data */ CancelMulticastGroupSessionResponse, Unit]): Request[CancelMulticastGroupSessionResponse, AWSError] = js.native
  /**
    * Cancels an existing multicast group session.
    */
  def cancelMulticastGroupSession(params: CancelMulticastGroupSessionRequest): Request[CancelMulticastGroupSessionResponse, AWSError] = js.native
  def cancelMulticastGroupSession(
    params: CancelMulticastGroupSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelMulticastGroupSessionResponse, Unit]
  ): Request[CancelMulticastGroupSessionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTWireless: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new destination that maps a device message to an AWS IoT rule.
    */
  def createDestination(): Request[CreateDestinationResponse, AWSError] = js.native
  def createDestination(callback: js.Function2[/* err */ AWSError, /* data */ CreateDestinationResponse, Unit]): Request[CreateDestinationResponse, AWSError] = js.native
  /**
    * Creates a new destination that maps a device message to an AWS IoT rule.
    */
  def createDestination(params: CreateDestinationRequest): Request[CreateDestinationResponse, AWSError] = js.native
  def createDestination(
    params: CreateDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDestinationResponse, Unit]
  ): Request[CreateDestinationResponse, AWSError] = js.native
  
  /**
    * Creates a new device profile.
    */
  def createDeviceProfile(): Request[CreateDeviceProfileResponse, AWSError] = js.native
  def createDeviceProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceProfileResponse, Unit]): Request[CreateDeviceProfileResponse, AWSError] = js.native
  /**
    * Creates a new device profile.
    */
  def createDeviceProfile(params: CreateDeviceProfileRequest): Request[CreateDeviceProfileResponse, AWSError] = js.native
  def createDeviceProfile(
    params: CreateDeviceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceProfileResponse, Unit]
  ): Request[CreateDeviceProfileResponse, AWSError] = js.native
  
  /**
    * Creates a FUOTA task.
    */
  def createFuotaTask(): Request[CreateFuotaTaskResponse, AWSError] = js.native
  def createFuotaTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateFuotaTaskResponse, Unit]): Request[CreateFuotaTaskResponse, AWSError] = js.native
  /**
    * Creates a FUOTA task.
    */
  def createFuotaTask(params: CreateFuotaTaskRequest): Request[CreateFuotaTaskResponse, AWSError] = js.native
  def createFuotaTask(
    params: CreateFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFuotaTaskResponse, Unit]
  ): Request[CreateFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Creates a multicast group.
    */
  def createMulticastGroup(): Request[CreateMulticastGroupResponse, AWSError] = js.native
  def createMulticastGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateMulticastGroupResponse, Unit]): Request[CreateMulticastGroupResponse, AWSError] = js.native
  /**
    * Creates a multicast group.
    */
  def createMulticastGroup(params: CreateMulticastGroupRequest): Request[CreateMulticastGroupResponse, AWSError] = js.native
  def createMulticastGroup(
    params: CreateMulticastGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMulticastGroupResponse, Unit]
  ): Request[CreateMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Creates a new network analyzer configuration.
    */
  def createNetworkAnalyzerConfiguration(): Request[CreateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def createNetworkAnalyzerConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[CreateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new network analyzer configuration.
    */
  def createNetworkAnalyzerConfiguration(params: CreateNetworkAnalyzerConfigurationRequest): Request[CreateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def createNetworkAnalyzerConfiguration(
    params: CreateNetworkAnalyzerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[CreateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a new service profile.
    */
  def createServiceProfile(): Request[CreateServiceProfileResponse, AWSError] = js.native
  def createServiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceProfileResponse, Unit]): Request[CreateServiceProfileResponse, AWSError] = js.native
  /**
    * Creates a new service profile.
    */
  def createServiceProfile(params: CreateServiceProfileRequest): Request[CreateServiceProfileResponse, AWSError] = js.native
  def createServiceProfile(
    params: CreateServiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceProfileResponse, Unit]
  ): Request[CreateServiceProfileResponse, AWSError] = js.native
  
  /**
    * Provisions a wireless device.
    */
  def createWirelessDevice(): Request[CreateWirelessDeviceResponse, AWSError] = js.native
  def createWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessDeviceResponse, Unit]): Request[CreateWirelessDeviceResponse, AWSError] = js.native
  /**
    * Provisions a wireless device.
    */
  def createWirelessDevice(params: CreateWirelessDeviceRequest): Request[CreateWirelessDeviceResponse, AWSError] = js.native
  def createWirelessDevice(
    params: CreateWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessDeviceResponse, Unit]
  ): Request[CreateWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Provisions a wireless gateway.
    */
  def createWirelessGateway(): Request[CreateWirelessGatewayResponse, AWSError] = js.native
  def createWirelessGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayResponse, Unit]): Request[CreateWirelessGatewayResponse, AWSError] = js.native
  /**
    * Provisions a wireless gateway.
    */
  def createWirelessGateway(params: CreateWirelessGatewayRequest): Request[CreateWirelessGatewayResponse, AWSError] = js.native
  def createWirelessGateway(
    params: CreateWirelessGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayResponse, Unit]
  ): Request[CreateWirelessGatewayResponse, AWSError] = js.native
  
  /**
    * Creates a task for a wireless gateway.
    */
  def createWirelessGatewayTask(): Request[CreateWirelessGatewayTaskResponse, AWSError] = js.native
  def createWirelessGatewayTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayTaskResponse, Unit]): Request[CreateWirelessGatewayTaskResponse, AWSError] = js.native
  /**
    * Creates a task for a wireless gateway.
    */
  def createWirelessGatewayTask(params: CreateWirelessGatewayTaskRequest): Request[CreateWirelessGatewayTaskResponse, AWSError] = js.native
  def createWirelessGatewayTask(
    params: CreateWirelessGatewayTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayTaskResponse, Unit]
  ): Request[CreateWirelessGatewayTaskResponse, AWSError] = js.native
  
  /**
    * Creates a gateway task definition.
    */
  def createWirelessGatewayTaskDefinition(): Request[CreateWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def createWirelessGatewayTaskDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[CreateWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  /**
    * Creates a gateway task definition.
    */
  def createWirelessGatewayTaskDefinition(params: CreateWirelessGatewayTaskDefinitionRequest): Request[CreateWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def createWirelessGatewayTaskDefinition(
    params: CreateWirelessGatewayTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[CreateWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a destination.
    */
  def deleteDestination(): Request[DeleteDestinationResponse, AWSError] = js.native
  def deleteDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDestinationResponse, Unit]): Request[DeleteDestinationResponse, AWSError] = js.native
  /**
    * Deletes a destination.
    */
  def deleteDestination(params: DeleteDestinationRequest): Request[DeleteDestinationResponse, AWSError] = js.native
  def deleteDestination(
    params: DeleteDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDestinationResponse, Unit]
  ): Request[DeleteDestinationResponse, AWSError] = js.native
  
  /**
    * Deletes a device profile.
    */
  def deleteDeviceProfile(): Request[DeleteDeviceProfileResponse, AWSError] = js.native
  def deleteDeviceProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceProfileResponse, Unit]): Request[DeleteDeviceProfileResponse, AWSError] = js.native
  /**
    * Deletes a device profile.
    */
  def deleteDeviceProfile(params: DeleteDeviceProfileRequest): Request[DeleteDeviceProfileResponse, AWSError] = js.native
  def deleteDeviceProfile(
    params: DeleteDeviceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceProfileResponse, Unit]
  ): Request[DeleteDeviceProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a FUOTA task.
    */
  def deleteFuotaTask(): Request[DeleteFuotaTaskResponse, AWSError] = js.native
  def deleteFuotaTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFuotaTaskResponse, Unit]): Request[DeleteFuotaTaskResponse, AWSError] = js.native
  /**
    * Deletes a FUOTA task.
    */
  def deleteFuotaTask(params: DeleteFuotaTaskRequest): Request[DeleteFuotaTaskResponse, AWSError] = js.native
  def deleteFuotaTask(
    params: DeleteFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFuotaTaskResponse, Unit]
  ): Request[DeleteFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Deletes a multicast group if it is not in use by a fuota task.
    */
  def deleteMulticastGroup(): Request[DeleteMulticastGroupResponse, AWSError] = js.native
  def deleteMulticastGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMulticastGroupResponse, Unit]): Request[DeleteMulticastGroupResponse, AWSError] = js.native
  /**
    * Deletes a multicast group if it is not in use by a fuota task.
    */
  def deleteMulticastGroup(params: DeleteMulticastGroupRequest): Request[DeleteMulticastGroupResponse, AWSError] = js.native
  def deleteMulticastGroup(
    params: DeleteMulticastGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMulticastGroupResponse, Unit]
  ): Request[DeleteMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a network analyzer configuration.
    */
  def deleteNetworkAnalyzerConfiguration(): Request[DeleteNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def deleteNetworkAnalyzerConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[DeleteNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  /**
    * Deletes a network analyzer configuration.
    */
  def deleteNetworkAnalyzerConfiguration(params: DeleteNetworkAnalyzerConfigurationRequest): Request[DeleteNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def deleteNetworkAnalyzerConfiguration(
    params: DeleteNetworkAnalyzerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[DeleteNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  
  /**
    * Remove queued messages from the downlink queue.
    */
  def deleteQueuedMessages(): Request[DeleteQueuedMessagesResponse, AWSError] = js.native
  def deleteQueuedMessages(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedMessagesResponse, Unit]): Request[DeleteQueuedMessagesResponse, AWSError] = js.native
  /**
    * Remove queued messages from the downlink queue.
    */
  def deleteQueuedMessages(params: DeleteQueuedMessagesRequest): Request[DeleteQueuedMessagesResponse, AWSError] = js.native
  def deleteQueuedMessages(
    params: DeleteQueuedMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedMessagesResponse, Unit]
  ): Request[DeleteQueuedMessagesResponse, AWSError] = js.native
  
  /**
    * Deletes a service profile.
    */
  def deleteServiceProfile(): Request[DeleteServiceProfileResponse, AWSError] = js.native
  def deleteServiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceProfileResponse, Unit]): Request[DeleteServiceProfileResponse, AWSError] = js.native
  /**
    * Deletes a service profile.
    */
  def deleteServiceProfile(params: DeleteServiceProfileRequest): Request[DeleteServiceProfileResponse, AWSError] = js.native
  def deleteServiceProfile(
    params: DeleteServiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceProfileResponse, Unit]
  ): Request[DeleteServiceProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a wireless device.
    */
  def deleteWirelessDevice(): Request[DeleteWirelessDeviceResponse, AWSError] = js.native
  def deleteWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessDeviceResponse, Unit]): Request[DeleteWirelessDeviceResponse, AWSError] = js.native
  /**
    * Deletes a wireless device.
    */
  def deleteWirelessDevice(params: DeleteWirelessDeviceRequest): Request[DeleteWirelessDeviceResponse, AWSError] = js.native
  def deleteWirelessDevice(
    params: DeleteWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessDeviceResponse, Unit]
  ): Request[DeleteWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Deletes a wireless gateway.
    */
  def deleteWirelessGateway(): Request[DeleteWirelessGatewayResponse, AWSError] = js.native
  def deleteWirelessGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayResponse, Unit]): Request[DeleteWirelessGatewayResponse, AWSError] = js.native
  /**
    * Deletes a wireless gateway.
    */
  def deleteWirelessGateway(params: DeleteWirelessGatewayRequest): Request[DeleteWirelessGatewayResponse, AWSError] = js.native
  def deleteWirelessGateway(
    params: DeleteWirelessGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayResponse, Unit]
  ): Request[DeleteWirelessGatewayResponse, AWSError] = js.native
  
  /**
    * Deletes a wireless gateway task.
    */
  def deleteWirelessGatewayTask(): Request[DeleteWirelessGatewayTaskResponse, AWSError] = js.native
  def deleteWirelessGatewayTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayTaskResponse, Unit]): Request[DeleteWirelessGatewayTaskResponse, AWSError] = js.native
  /**
    * Deletes a wireless gateway task.
    */
  def deleteWirelessGatewayTask(params: DeleteWirelessGatewayTaskRequest): Request[DeleteWirelessGatewayTaskResponse, AWSError] = js.native
  def deleteWirelessGatewayTask(
    params: DeleteWirelessGatewayTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayTaskResponse, Unit]
  ): Request[DeleteWirelessGatewayTaskResponse, AWSError] = js.native
  
  /**
    * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are currently in progress.
    */
  def deleteWirelessGatewayTaskDefinition(): Request[DeleteWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def deleteWirelessGatewayTaskDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[DeleteWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are currently in progress.
    */
  def deleteWirelessGatewayTaskDefinition(params: DeleteWirelessGatewayTaskDefinitionRequest): Request[DeleteWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def deleteWirelessGatewayTaskDefinition(
    params: DeleteWirelessGatewayTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[DeleteWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  
  /**
    * Disassociates your AWS account from a partner account. If PartnerAccountId and PartnerType are null, disassociates your AWS account from all partner accounts.
    */
  def disassociateAwsAccountFromPartnerAccount(): Request[DisassociateAwsAccountFromPartnerAccountResponse, AWSError] = js.native
  def disassociateAwsAccountFromPartnerAccount(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateAwsAccountFromPartnerAccountResponse, 
      Unit
    ]
  ): Request[DisassociateAwsAccountFromPartnerAccountResponse, AWSError] = js.native
  /**
    * Disassociates your AWS account from a partner account. If PartnerAccountId and PartnerType are null, disassociates your AWS account from all partner accounts.
    */
  def disassociateAwsAccountFromPartnerAccount(params: DisassociateAwsAccountFromPartnerAccountRequest): Request[DisassociateAwsAccountFromPartnerAccountResponse, AWSError] = js.native
  def disassociateAwsAccountFromPartnerAccount(
    params: DisassociateAwsAccountFromPartnerAccountRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateAwsAccountFromPartnerAccountResponse, 
      Unit
    ]
  ): Request[DisassociateAwsAccountFromPartnerAccountResponse, AWSError] = js.native
  
  /**
    * Disassociates a multicast group from a fuota task.
    */
  def disassociateMulticastGroupFromFuotaTask(): Request[DisassociateMulticastGroupFromFuotaTaskResponse, AWSError] = js.native
  def disassociateMulticastGroupFromFuotaTask(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMulticastGroupFromFuotaTaskResponse, Unit]
  ): Request[DisassociateMulticastGroupFromFuotaTaskResponse, AWSError] = js.native
  /**
    * Disassociates a multicast group from a fuota task.
    */
  def disassociateMulticastGroupFromFuotaTask(params: DisassociateMulticastGroupFromFuotaTaskRequest): Request[DisassociateMulticastGroupFromFuotaTaskResponse, AWSError] = js.native
  def disassociateMulticastGroupFromFuotaTask(
    params: DisassociateMulticastGroupFromFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMulticastGroupFromFuotaTaskResponse, Unit]
  ): Request[DisassociateMulticastGroupFromFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Disassociates a wireless device from a FUOTA task.
    */
  def disassociateWirelessDeviceFromFuotaTask(): Request[DisassociateWirelessDeviceFromFuotaTaskResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromFuotaTask(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessDeviceFromFuotaTaskResponse, Unit]
  ): Request[DisassociateWirelessDeviceFromFuotaTaskResponse, AWSError] = js.native
  /**
    * Disassociates a wireless device from a FUOTA task.
    */
  def disassociateWirelessDeviceFromFuotaTask(params: DisassociateWirelessDeviceFromFuotaTaskRequest): Request[DisassociateWirelessDeviceFromFuotaTaskResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromFuotaTask(
    params: DisassociateWirelessDeviceFromFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessDeviceFromFuotaTaskResponse, Unit]
  ): Request[DisassociateWirelessDeviceFromFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Disassociates a wireless device from a multicast group.
    */
  def disassociateWirelessDeviceFromMulticastGroup(): Request[DisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromMulticastGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWirelessDeviceFromMulticastGroupResponse, 
      Unit
    ]
  ): Request[DisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  /**
    * Disassociates a wireless device from a multicast group.
    */
  def disassociateWirelessDeviceFromMulticastGroup(params: DisassociateWirelessDeviceFromMulticastGroupRequest): Request[DisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromMulticastGroup(
    params: DisassociateWirelessDeviceFromMulticastGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWirelessDeviceFromMulticastGroupResponse, 
      Unit
    ]
  ): Request[DisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Disassociates a wireless device from its currently associated thing.
    */
  def disassociateWirelessDeviceFromThing(): Request[DisassociateWirelessDeviceFromThingResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromThing(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessDeviceFromThingResponse, Unit]
  ): Request[DisassociateWirelessDeviceFromThingResponse, AWSError] = js.native
  /**
    * Disassociates a wireless device from its currently associated thing.
    */
  def disassociateWirelessDeviceFromThing(params: DisassociateWirelessDeviceFromThingRequest): Request[DisassociateWirelessDeviceFromThingResponse, AWSError] = js.native
  def disassociateWirelessDeviceFromThing(
    params: DisassociateWirelessDeviceFromThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessDeviceFromThingResponse, Unit]
  ): Request[DisassociateWirelessDeviceFromThingResponse, AWSError] = js.native
  
  /**
    * Disassociates a wireless gateway from its currently associated certificate.
    */
  def disassociateWirelessGatewayFromCertificate(): Request[DisassociateWirelessGatewayFromCertificateResponse, AWSError] = js.native
  def disassociateWirelessGatewayFromCertificate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWirelessGatewayFromCertificateResponse, 
      Unit
    ]
  ): Request[DisassociateWirelessGatewayFromCertificateResponse, AWSError] = js.native
  /**
    * Disassociates a wireless gateway from its currently associated certificate.
    */
  def disassociateWirelessGatewayFromCertificate(params: DisassociateWirelessGatewayFromCertificateRequest): Request[DisassociateWirelessGatewayFromCertificateResponse, AWSError] = js.native
  def disassociateWirelessGatewayFromCertificate(
    params: DisassociateWirelessGatewayFromCertificateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWirelessGatewayFromCertificateResponse, 
      Unit
    ]
  ): Request[DisassociateWirelessGatewayFromCertificateResponse, AWSError] = js.native
  
  /**
    * Disassociates a wireless gateway from its currently associated thing.
    */
  def disassociateWirelessGatewayFromThing(): Request[DisassociateWirelessGatewayFromThingResponse, AWSError] = js.native
  def disassociateWirelessGatewayFromThing(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessGatewayFromThingResponse, Unit]
  ): Request[DisassociateWirelessGatewayFromThingResponse, AWSError] = js.native
  /**
    * Disassociates a wireless gateway from its currently associated thing.
    */
  def disassociateWirelessGatewayFromThing(params: DisassociateWirelessGatewayFromThingRequest): Request[DisassociateWirelessGatewayFromThingResponse, AWSError] = js.native
  def disassociateWirelessGatewayFromThing(
    params: DisassociateWirelessGatewayFromThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWirelessGatewayFromThingResponse, Unit]
  ): Request[DisassociateWirelessGatewayFromThingResponse, AWSError] = js.native
  
  /**
    * Gets information about a destination.
    */
  def getDestination(): Request[GetDestinationResponse, AWSError] = js.native
  def getDestination(callback: js.Function2[/* err */ AWSError, /* data */ GetDestinationResponse, Unit]): Request[GetDestinationResponse, AWSError] = js.native
  /**
    * Gets information about a destination.
    */
  def getDestination(params: GetDestinationRequest): Request[GetDestinationResponse, AWSError] = js.native
  def getDestination(
    params: GetDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDestinationResponse, Unit]
  ): Request[GetDestinationResponse, AWSError] = js.native
  
  /**
    * Gets information about a device profile.
    */
  def getDeviceProfile(): Request[GetDeviceProfileResponse, AWSError] = js.native
  def getDeviceProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceProfileResponse, Unit]): Request[GetDeviceProfileResponse, AWSError] = js.native
  /**
    * Gets information about a device profile.
    */
  def getDeviceProfile(params: GetDeviceProfileRequest): Request[GetDeviceProfileResponse, AWSError] = js.native
  def getDeviceProfile(
    params: GetDeviceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceProfileResponse, Unit]
  ): Request[GetDeviceProfileResponse, AWSError] = js.native
  
  /**
    * Get the event configuration based on resource types.
    */
  def getEventConfigurationByResourceTypes(): Request[GetEventConfigurationByResourceTypesResponse, AWSError] = js.native
  def getEventConfigurationByResourceTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventConfigurationByResourceTypesResponse, Unit]
  ): Request[GetEventConfigurationByResourceTypesResponse, AWSError] = js.native
  /**
    * Get the event configuration based on resource types.
    */
  def getEventConfigurationByResourceTypes(params: GetEventConfigurationByResourceTypesRequest): Request[GetEventConfigurationByResourceTypesResponse, AWSError] = js.native
  def getEventConfigurationByResourceTypes(
    params: GetEventConfigurationByResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventConfigurationByResourceTypesResponse, Unit]
  ): Request[GetEventConfigurationByResourceTypesResponse, AWSError] = js.native
  
  /**
    * Gets information about a FUOTA task.
    */
  def getFuotaTask(): Request[GetFuotaTaskResponse, AWSError] = js.native
  def getFuotaTask(callback: js.Function2[/* err */ AWSError, /* data */ GetFuotaTaskResponse, Unit]): Request[GetFuotaTaskResponse, AWSError] = js.native
  /**
    * Gets information about a FUOTA task.
    */
  def getFuotaTask(params: GetFuotaTaskRequest): Request[GetFuotaTaskResponse, AWSError] = js.native
  def getFuotaTask(
    params: GetFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFuotaTaskResponse, Unit]
  ): Request[GetFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be for wireless device log options or wireless gateway log options.
    */
  def getLogLevelsByResourceTypes(): Request[GetLogLevelsByResourceTypesResponse, AWSError] = js.native
  def getLogLevelsByResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetLogLevelsByResourceTypesResponse, Unit]): Request[GetLogLevelsByResourceTypesResponse, AWSError] = js.native
  /**
    * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be for wireless device log options or wireless gateway log options.
    */
  def getLogLevelsByResourceTypes(params: GetLogLevelsByResourceTypesRequest): Request[GetLogLevelsByResourceTypesResponse, AWSError] = js.native
  def getLogLevelsByResourceTypes(
    params: GetLogLevelsByResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLogLevelsByResourceTypesResponse, Unit]
  ): Request[GetLogLevelsByResourceTypesResponse, AWSError] = js.native
  
  /**
    * Gets information about a multicast group.
    */
  def getMulticastGroup(): Request[GetMulticastGroupResponse, AWSError] = js.native
  def getMulticastGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetMulticastGroupResponse, Unit]): Request[GetMulticastGroupResponse, AWSError] = js.native
  /**
    * Gets information about a multicast group.
    */
  def getMulticastGroup(params: GetMulticastGroupRequest): Request[GetMulticastGroupResponse, AWSError] = js.native
  def getMulticastGroup(
    params: GetMulticastGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMulticastGroupResponse, Unit]
  ): Request[GetMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Gets information about a multicast group session.
    */
  def getMulticastGroupSession(): Request[GetMulticastGroupSessionResponse, AWSError] = js.native
  def getMulticastGroupSession(callback: js.Function2[/* err */ AWSError, /* data */ GetMulticastGroupSessionResponse, Unit]): Request[GetMulticastGroupSessionResponse, AWSError] = js.native
  /**
    * Gets information about a multicast group session.
    */
  def getMulticastGroupSession(params: GetMulticastGroupSessionRequest): Request[GetMulticastGroupSessionResponse, AWSError] = js.native
  def getMulticastGroupSession(
    params: GetMulticastGroupSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMulticastGroupSessionResponse, Unit]
  ): Request[GetMulticastGroupSessionResponse, AWSError] = js.native
  
  /**
    * Get network analyzer configuration.
    */
  def getNetworkAnalyzerConfiguration(): Request[GetNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def getNetworkAnalyzerConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[GetNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  /**
    * Get network analyzer configuration.
    */
  def getNetworkAnalyzerConfiguration(params: GetNetworkAnalyzerConfigurationRequest): Request[GetNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def getNetworkAnalyzerConfiguration(
    params: GetNetworkAnalyzerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[GetNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets information about a partner account. If PartnerAccountId and PartnerType are null, returns all partner accounts.
    */
  def getPartnerAccount(): Request[GetPartnerAccountResponse, AWSError] = js.native
  def getPartnerAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetPartnerAccountResponse, Unit]): Request[GetPartnerAccountResponse, AWSError] = js.native
  /**
    * Gets information about a partner account. If PartnerAccountId and PartnerType are null, returns all partner accounts.
    */
  def getPartnerAccount(params: GetPartnerAccountRequest): Request[GetPartnerAccountResponse, AWSError] = js.native
  def getPartnerAccount(
    params: GetPartnerAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPartnerAccountResponse, Unit]
  ): Request[GetPartnerAccountResponse, AWSError] = js.native
  
  /**
    * Get the position information for a given resource.
    */
  def getPosition(): Request[GetPositionResponse, AWSError] = js.native
  def getPosition(callback: js.Function2[/* err */ AWSError, /* data */ GetPositionResponse, Unit]): Request[GetPositionResponse, AWSError] = js.native
  /**
    * Get the position information for a given resource.
    */
  def getPosition(params: GetPositionRequest): Request[GetPositionResponse, AWSError] = js.native
  def getPosition(
    params: GetPositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPositionResponse, Unit]
  ): Request[GetPositionResponse, AWSError] = js.native
  
  /**
    * Get position configuration for a given resource.
    */
  def getPositionConfiguration(): Request[GetPositionConfigurationResponse, AWSError] = js.native
  def getPositionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetPositionConfigurationResponse, Unit]): Request[GetPositionConfigurationResponse, AWSError] = js.native
  /**
    * Get position configuration for a given resource.
    */
  def getPositionConfiguration(params: GetPositionConfigurationRequest): Request[GetPositionConfigurationResponse, AWSError] = js.native
  def getPositionConfiguration(
    params: GetPositionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPositionConfigurationResponse, Unit]
  ): Request[GetPositionConfigurationResponse, AWSError] = js.native
  
  /**
    * Get the event configuration for a particular resource identifier.
    */
  def getResourceEventConfiguration(): Request[GetResourceEventConfigurationResponse, AWSError] = js.native
  def getResourceEventConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceEventConfigurationResponse, Unit]): Request[GetResourceEventConfigurationResponse, AWSError] = js.native
  /**
    * Get the event configuration for a particular resource identifier.
    */
  def getResourceEventConfiguration(params: GetResourceEventConfigurationRequest): Request[GetResourceEventConfigurationResponse, AWSError] = js.native
  def getResourceEventConfiguration(
    params: GetResourceEventConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceEventConfigurationResponse, Unit]
  ): Request[GetResourceEventConfigurationResponse, AWSError] = js.native
  
  /**
    * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.
    */
  def getResourceLogLevel(): Request[GetResourceLogLevelResponse, AWSError] = js.native
  def getResourceLogLevel(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceLogLevelResponse, Unit]): Request[GetResourceLogLevelResponse, AWSError] = js.native
  /**
    * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.
    */
  def getResourceLogLevel(params: GetResourceLogLevelRequest): Request[GetResourceLogLevelResponse, AWSError] = js.native
  def getResourceLogLevel(
    params: GetResourceLogLevelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceLogLevelResponse, Unit]
  ): Request[GetResourceLogLevelResponse, AWSError] = js.native
  
  /**
    * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server (LNS) connections.
    */
  def getServiceEndpoint(): Request[GetServiceEndpointResponse, AWSError] = js.native
  def getServiceEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceEndpointResponse, Unit]): Request[GetServiceEndpointResponse, AWSError] = js.native
  /**
    * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server (LNS) connections.
    */
  def getServiceEndpoint(params: GetServiceEndpointRequest): Request[GetServiceEndpointResponse, AWSError] = js.native
  def getServiceEndpoint(
    params: GetServiceEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceEndpointResponse, Unit]
  ): Request[GetServiceEndpointResponse, AWSError] = js.native
  
  /**
    * Gets information about a service profile.
    */
  def getServiceProfile(): Request[GetServiceProfileResponse, AWSError] = js.native
  def getServiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceProfileResponse, Unit]): Request[GetServiceProfileResponse, AWSError] = js.native
  /**
    * Gets information about a service profile.
    */
  def getServiceProfile(params: GetServiceProfileRequest): Request[GetServiceProfileResponse, AWSError] = js.native
  def getServiceProfile(
    params: GetServiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceProfileResponse, Unit]
  ): Request[GetServiceProfileResponse, AWSError] = js.native
  
  /**
    * Gets information about a wireless device.
    */
  def getWirelessDevice(): Request[GetWirelessDeviceResponse, AWSError] = js.native
  def getWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessDeviceResponse, Unit]): Request[GetWirelessDeviceResponse, AWSError] = js.native
  /**
    * Gets information about a wireless device.
    */
  def getWirelessDevice(params: GetWirelessDeviceRequest): Request[GetWirelessDeviceResponse, AWSError] = js.native
  def getWirelessDevice(
    params: GetWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessDeviceResponse, Unit]
  ): Request[GetWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Gets operating information about a wireless device.
    */
  def getWirelessDeviceStatistics(): Request[GetWirelessDeviceStatisticsResponse, AWSError] = js.native
  def getWirelessDeviceStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessDeviceStatisticsResponse, Unit]): Request[GetWirelessDeviceStatisticsResponse, AWSError] = js.native
  /**
    * Gets operating information about a wireless device.
    */
  def getWirelessDeviceStatistics(params: GetWirelessDeviceStatisticsRequest): Request[GetWirelessDeviceStatisticsResponse, AWSError] = js.native
  def getWirelessDeviceStatistics(
    params: GetWirelessDeviceStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessDeviceStatisticsResponse, Unit]
  ): Request[GetWirelessDeviceStatisticsResponse, AWSError] = js.native
  
  /**
    * Gets information about a wireless gateway.
    */
  def getWirelessGateway(): Request[GetWirelessGatewayResponse, AWSError] = js.native
  def getWirelessGateway(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayResponse, Unit]): Request[GetWirelessGatewayResponse, AWSError] = js.native
  /**
    * Gets information about a wireless gateway.
    */
  def getWirelessGateway(params: GetWirelessGatewayRequest): Request[GetWirelessGatewayResponse, AWSError] = js.native
  def getWirelessGateway(
    params: GetWirelessGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayResponse, Unit]
  ): Request[GetWirelessGatewayResponse, AWSError] = js.native
  
  /**
    * Gets the ID of the certificate that is currently associated with a wireless gateway.
    */
  def getWirelessGatewayCertificate(): Request[GetWirelessGatewayCertificateResponse, AWSError] = js.native
  def getWirelessGatewayCertificate(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayCertificateResponse, Unit]): Request[GetWirelessGatewayCertificateResponse, AWSError] = js.native
  /**
    * Gets the ID of the certificate that is currently associated with a wireless gateway.
    */
  def getWirelessGatewayCertificate(params: GetWirelessGatewayCertificateRequest): Request[GetWirelessGatewayCertificateResponse, AWSError] = js.native
  def getWirelessGatewayCertificate(
    params: GetWirelessGatewayCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayCertificateResponse, Unit]
  ): Request[GetWirelessGatewayCertificateResponse, AWSError] = js.native
  
  /**
    * Gets the firmware version and other information about a wireless gateway.
    */
  def getWirelessGatewayFirmwareInformation(): Request[GetWirelessGatewayFirmwareInformationResponse, AWSError] = js.native
  def getWirelessGatewayFirmwareInformation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayFirmwareInformationResponse, Unit]
  ): Request[GetWirelessGatewayFirmwareInformationResponse, AWSError] = js.native
  /**
    * Gets the firmware version and other information about a wireless gateway.
    */
  def getWirelessGatewayFirmwareInformation(params: GetWirelessGatewayFirmwareInformationRequest): Request[GetWirelessGatewayFirmwareInformationResponse, AWSError] = js.native
  def getWirelessGatewayFirmwareInformation(
    params: GetWirelessGatewayFirmwareInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayFirmwareInformationResponse, Unit]
  ): Request[GetWirelessGatewayFirmwareInformationResponse, AWSError] = js.native
  
  /**
    * Gets operating information about a wireless gateway.
    */
  def getWirelessGatewayStatistics(): Request[GetWirelessGatewayStatisticsResponse, AWSError] = js.native
  def getWirelessGatewayStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayStatisticsResponse, Unit]): Request[GetWirelessGatewayStatisticsResponse, AWSError] = js.native
  /**
    * Gets operating information about a wireless gateway.
    */
  def getWirelessGatewayStatistics(params: GetWirelessGatewayStatisticsRequest): Request[GetWirelessGatewayStatisticsResponse, AWSError] = js.native
  def getWirelessGatewayStatistics(
    params: GetWirelessGatewayStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayStatisticsResponse, Unit]
  ): Request[GetWirelessGatewayStatisticsResponse, AWSError] = js.native
  
  /**
    * Gets information about a wireless gateway task.
    */
  def getWirelessGatewayTask(): Request[GetWirelessGatewayTaskResponse, AWSError] = js.native
  def getWirelessGatewayTask(callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayTaskResponse, Unit]): Request[GetWirelessGatewayTaskResponse, AWSError] = js.native
  /**
    * Gets information about a wireless gateway task.
    */
  def getWirelessGatewayTask(params: GetWirelessGatewayTaskRequest): Request[GetWirelessGatewayTaskResponse, AWSError] = js.native
  def getWirelessGatewayTask(
    params: GetWirelessGatewayTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayTaskResponse, Unit]
  ): Request[GetWirelessGatewayTaskResponse, AWSError] = js.native
  
  /**
    * Gets information about a wireless gateway task definition.
    */
  def getWirelessGatewayTaskDefinition(): Request[GetWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def getWirelessGatewayTaskDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[GetWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  /**
    * Gets information about a wireless gateway task definition.
    */
  def getWirelessGatewayTaskDefinition(params: GetWirelessGatewayTaskDefinitionRequest): Request[GetWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  def getWirelessGatewayTaskDefinition(
    params: GetWirelessGatewayTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWirelessGatewayTaskDefinitionResponse, Unit]
  ): Request[GetWirelessGatewayTaskDefinitionResponse, AWSError] = js.native
  
  /**
    * Lists the destinations registered to your AWS account.
    */
  def listDestinations(): Request[ListDestinationsResponse, AWSError] = js.native
  def listDestinations(callback: js.Function2[/* err */ AWSError, /* data */ ListDestinationsResponse, Unit]): Request[ListDestinationsResponse, AWSError] = js.native
  /**
    * Lists the destinations registered to your AWS account.
    */
  def listDestinations(params: ListDestinationsRequest): Request[ListDestinationsResponse, AWSError] = js.native
  def listDestinations(
    params: ListDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDestinationsResponse, Unit]
  ): Request[ListDestinationsResponse, AWSError] = js.native
  
  /**
    * Lists the device profiles registered to your AWS account.
    */
  def listDeviceProfiles(): Request[ListDeviceProfilesResponse, AWSError] = js.native
  def listDeviceProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceProfilesResponse, Unit]): Request[ListDeviceProfilesResponse, AWSError] = js.native
  /**
    * Lists the device profiles registered to your AWS account.
    */
  def listDeviceProfiles(params: ListDeviceProfilesRequest): Request[ListDeviceProfilesResponse, AWSError] = js.native
  def listDeviceProfiles(
    params: ListDeviceProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceProfilesResponse, Unit]
  ): Request[ListDeviceProfilesResponse, AWSError] = js.native
  
  /**
    * List event configurations where at least one event topic has been enabled.
    */
  def listEventConfigurations(): Request[ListEventConfigurationsResponse, AWSError] = js.native
  def listEventConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListEventConfigurationsResponse, Unit]): Request[ListEventConfigurationsResponse, AWSError] = js.native
  /**
    * List event configurations where at least one event topic has been enabled.
    */
  def listEventConfigurations(params: ListEventConfigurationsRequest): Request[ListEventConfigurationsResponse, AWSError] = js.native
  def listEventConfigurations(
    params: ListEventConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventConfigurationsResponse, Unit]
  ): Request[ListEventConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists the FUOTA tasks registered to your AWS account.
    */
  def listFuotaTasks(): Request[ListFuotaTasksResponse, AWSError] = js.native
  def listFuotaTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListFuotaTasksResponse, Unit]): Request[ListFuotaTasksResponse, AWSError] = js.native
  /**
    * Lists the FUOTA tasks registered to your AWS account.
    */
  def listFuotaTasks(params: ListFuotaTasksRequest): Request[ListFuotaTasksResponse, AWSError] = js.native
  def listFuotaTasks(
    params: ListFuotaTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFuotaTasksResponse, Unit]
  ): Request[ListFuotaTasksResponse, AWSError] = js.native
  
  /**
    * Lists the multicast groups registered to your AWS account.
    */
  def listMulticastGroups(): Request[ListMulticastGroupsResponse, AWSError] = js.native
  def listMulticastGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListMulticastGroupsResponse, Unit]): Request[ListMulticastGroupsResponse, AWSError] = js.native
  /**
    * Lists the multicast groups registered to your AWS account.
    */
  def listMulticastGroups(params: ListMulticastGroupsRequest): Request[ListMulticastGroupsResponse, AWSError] = js.native
  def listMulticastGroups(
    params: ListMulticastGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMulticastGroupsResponse, Unit]
  ): Request[ListMulticastGroupsResponse, AWSError] = js.native
  
  /**
    * List all multicast groups associated with a fuota task.
    */
  def listMulticastGroupsByFuotaTask(): Request[ListMulticastGroupsByFuotaTaskResponse, AWSError] = js.native
  def listMulticastGroupsByFuotaTask(
    callback: js.Function2[/* err */ AWSError, /* data */ ListMulticastGroupsByFuotaTaskResponse, Unit]
  ): Request[ListMulticastGroupsByFuotaTaskResponse, AWSError] = js.native
  /**
    * List all multicast groups associated with a fuota task.
    */
  def listMulticastGroupsByFuotaTask(params: ListMulticastGroupsByFuotaTaskRequest): Request[ListMulticastGroupsByFuotaTaskResponse, AWSError] = js.native
  def listMulticastGroupsByFuotaTask(
    params: ListMulticastGroupsByFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMulticastGroupsByFuotaTaskResponse, Unit]
  ): Request[ListMulticastGroupsByFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Lists the network analyzer configurations.
    */
  def listNetworkAnalyzerConfigurations(): Request[ListNetworkAnalyzerConfigurationsResponse, AWSError] = js.native
  def listNetworkAnalyzerConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkAnalyzerConfigurationsResponse, Unit]
  ): Request[ListNetworkAnalyzerConfigurationsResponse, AWSError] = js.native
  /**
    * Lists the network analyzer configurations.
    */
  def listNetworkAnalyzerConfigurations(params: ListNetworkAnalyzerConfigurationsRequest): Request[ListNetworkAnalyzerConfigurationsResponse, AWSError] = js.native
  def listNetworkAnalyzerConfigurations(
    params: ListNetworkAnalyzerConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkAnalyzerConfigurationsResponse, Unit]
  ): Request[ListNetworkAnalyzerConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists the partner accounts associated with your AWS account.
    */
  def listPartnerAccounts(): Request[ListPartnerAccountsResponse, AWSError] = js.native
  def listPartnerAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerAccountsResponse, Unit]): Request[ListPartnerAccountsResponse, AWSError] = js.native
  /**
    * Lists the partner accounts associated with your AWS account.
    */
  def listPartnerAccounts(params: ListPartnerAccountsRequest): Request[ListPartnerAccountsResponse, AWSError] = js.native
  def listPartnerAccounts(
    params: ListPartnerAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerAccountsResponse, Unit]
  ): Request[ListPartnerAccountsResponse, AWSError] = js.native
  
  /**
    * List position configurations for a given resource, such as positioning solvers.
    */
  def listPositionConfigurations(): Request[ListPositionConfigurationsResponse, AWSError] = js.native
  def listPositionConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListPositionConfigurationsResponse, Unit]): Request[ListPositionConfigurationsResponse, AWSError] = js.native
  /**
    * List position configurations for a given resource, such as positioning solvers.
    */
  def listPositionConfigurations(params: ListPositionConfigurationsRequest): Request[ListPositionConfigurationsResponse, AWSError] = js.native
  def listPositionConfigurations(
    params: ListPositionConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPositionConfigurationsResponse, Unit]
  ): Request[ListPositionConfigurationsResponse, AWSError] = js.native
  
  /**
    * List queued messages in the downlink queue.
    */
  def listQueuedMessages(): Request[ListQueuedMessagesResponse, AWSError] = js.native
  def listQueuedMessages(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuedMessagesResponse, Unit]): Request[ListQueuedMessagesResponse, AWSError] = js.native
  /**
    * List queued messages in the downlink queue.
    */
  def listQueuedMessages(params: ListQueuedMessagesRequest): Request[ListQueuedMessagesResponse, AWSError] = js.native
  def listQueuedMessages(
    params: ListQueuedMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuedMessagesResponse, Unit]
  ): Request[ListQueuedMessagesResponse, AWSError] = js.native
  
  /**
    * Lists the service profiles registered to your AWS account.
    */
  def listServiceProfiles(): Request[ListServiceProfilesResponse, AWSError] = js.native
  def listServiceProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceProfilesResponse, Unit]): Request[ListServiceProfilesResponse, AWSError] = js.native
  /**
    * Lists the service profiles registered to your AWS account.
    */
  def listServiceProfiles(params: ListServiceProfilesRequest): Request[ListServiceProfilesResponse, AWSError] = js.native
  def listServiceProfiles(
    params: ListServiceProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceProfilesResponse, Unit]
  ): Request[ListServiceProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the wireless devices registered to your AWS account.
    */
  def listWirelessDevices(): Request[ListWirelessDevicesResponse, AWSError] = js.native
  def listWirelessDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessDevicesResponse, Unit]): Request[ListWirelessDevicesResponse, AWSError] = js.native
  /**
    * Lists the wireless devices registered to your AWS account.
    */
  def listWirelessDevices(params: ListWirelessDevicesRequest): Request[ListWirelessDevicesResponse, AWSError] = js.native
  def listWirelessDevices(
    params: ListWirelessDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessDevicesResponse, Unit]
  ): Request[ListWirelessDevicesResponse, AWSError] = js.native
  
  /**
    * List the wireless gateway tasks definitions registered to your AWS account.
    */
  def listWirelessGatewayTaskDefinitions(): Request[ListWirelessGatewayTaskDefinitionsResponse, AWSError] = js.native
  def listWirelessGatewayTaskDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessGatewayTaskDefinitionsResponse, Unit]
  ): Request[ListWirelessGatewayTaskDefinitionsResponse, AWSError] = js.native
  /**
    * List the wireless gateway tasks definitions registered to your AWS account.
    */
  def listWirelessGatewayTaskDefinitions(params: ListWirelessGatewayTaskDefinitionsRequest): Request[ListWirelessGatewayTaskDefinitionsResponse, AWSError] = js.native
  def listWirelessGatewayTaskDefinitions(
    params: ListWirelessGatewayTaskDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessGatewayTaskDefinitionsResponse, Unit]
  ): Request[ListWirelessGatewayTaskDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the wireless gateways registered to your AWS account.
    */
  def listWirelessGateways(): Request[ListWirelessGatewaysResponse, AWSError] = js.native
  def listWirelessGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessGatewaysResponse, Unit]): Request[ListWirelessGatewaysResponse, AWSError] = js.native
  /**
    * Lists the wireless gateways registered to your AWS account.
    */
  def listWirelessGateways(params: ListWirelessGatewaysRequest): Request[ListWirelessGatewaysResponse, AWSError] = js.native
  def listWirelessGateways(
    params: ListWirelessGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWirelessGatewaysResponse, Unit]
  ): Request[ListWirelessGatewaysResponse, AWSError] = js.native
  
  /**
    * Put position configuration for a given resource.
    */
  def putPositionConfiguration(): Request[PutPositionConfigurationResponse, AWSError] = js.native
  def putPositionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutPositionConfigurationResponse, Unit]): Request[PutPositionConfigurationResponse, AWSError] = js.native
  /**
    * Put position configuration for a given resource.
    */
  def putPositionConfiguration(params: PutPositionConfigurationRequest): Request[PutPositionConfigurationResponse, AWSError] = js.native
  def putPositionConfiguration(
    params: PutPositionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPositionConfigurationResponse, Unit]
  ): Request[PutPositionConfigurationResponse, AWSError] = js.native
  
  /**
    * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless gateway or a wireless device. A limit of 200 log level override can be set per account.
    */
  def putResourceLogLevel(): Request[PutResourceLogLevelResponse, AWSError] = js.native
  def putResourceLogLevel(callback: js.Function2[/* err */ AWSError, /* data */ PutResourceLogLevelResponse, Unit]): Request[PutResourceLogLevelResponse, AWSError] = js.native
  /**
    * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless gateway or a wireless device. A limit of 200 log level override can be set per account.
    */
  def putResourceLogLevel(params: PutResourceLogLevelRequest): Request[PutResourceLogLevelResponse, AWSError] = js.native
  def putResourceLogLevel(
    params: PutResourceLogLevelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourceLogLevelResponse, Unit]
  ): Request[PutResourceLogLevelResponse, AWSError] = js.native
  
  /**
    * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
    */
  def resetAllResourceLogLevels(): Request[ResetAllResourceLogLevelsResponse, AWSError] = js.native
  def resetAllResourceLogLevels(callback: js.Function2[/* err */ AWSError, /* data */ ResetAllResourceLogLevelsResponse, Unit]): Request[ResetAllResourceLogLevelsResponse, AWSError] = js.native
  /**
    * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
    */
  def resetAllResourceLogLevels(params: ResetAllResourceLogLevelsRequest): Request[ResetAllResourceLogLevelsResponse, AWSError] = js.native
  def resetAllResourceLogLevels(
    params: ResetAllResourceLogLevelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetAllResourceLogLevelsResponse, Unit]
  ): Request[ResetAllResourceLogLevelsResponse, AWSError] = js.native
  
  /**
    * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.
    */
  def resetResourceLogLevel(): Request[ResetResourceLogLevelResponse, AWSError] = js.native
  def resetResourceLogLevel(callback: js.Function2[/* err */ AWSError, /* data */ ResetResourceLogLevelResponse, Unit]): Request[ResetResourceLogLevelResponse, AWSError] = js.native
  /**
    * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.
    */
  def resetResourceLogLevel(params: ResetResourceLogLevelRequest): Request[ResetResourceLogLevelResponse, AWSError] = js.native
  def resetResourceLogLevel(
    params: ResetResourceLogLevelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetResourceLogLevelResponse, Unit]
  ): Request[ResetResourceLogLevelResponse, AWSError] = js.native
  
  /**
    * Sends the specified data to a multicast group.
    */
  def sendDataToMulticastGroup(): Request[SendDataToMulticastGroupResponse, AWSError] = js.native
  def sendDataToMulticastGroup(callback: js.Function2[/* err */ AWSError, /* data */ SendDataToMulticastGroupResponse, Unit]): Request[SendDataToMulticastGroupResponse, AWSError] = js.native
  /**
    * Sends the specified data to a multicast group.
    */
  def sendDataToMulticastGroup(params: SendDataToMulticastGroupRequest): Request[SendDataToMulticastGroupResponse, AWSError] = js.native
  def sendDataToMulticastGroup(
    params: SendDataToMulticastGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendDataToMulticastGroupResponse, Unit]
  ): Request[SendDataToMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Sends a decrypted application data frame to a device.
    */
  def sendDataToWirelessDevice(): Request[SendDataToWirelessDeviceResponse, AWSError] = js.native
  def sendDataToWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ SendDataToWirelessDeviceResponse, Unit]): Request[SendDataToWirelessDeviceResponse, AWSError] = js.native
  /**
    * Sends a decrypted application data frame to a device.
    */
  def sendDataToWirelessDevice(params: SendDataToWirelessDeviceRequest): Request[SendDataToWirelessDeviceResponse, AWSError] = js.native
  def sendDataToWirelessDevice(
    params: SendDataToWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendDataToWirelessDeviceResponse, Unit]
  ): Request[SendDataToWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Starts a bulk association of all qualifying wireless devices with a multicast group.
    */
  def startBulkAssociateWirelessDeviceWithMulticastGroup(): Request[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  def startBulkAssociateWirelessDeviceWithMulticastGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, 
      Unit
    ]
  ): Request[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  /**
    * Starts a bulk association of all qualifying wireless devices with a multicast group.
    */
  def startBulkAssociateWirelessDeviceWithMulticastGroup(params: StartBulkAssociateWirelessDeviceWithMulticastGroupRequest): Request[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  def startBulkAssociateWirelessDeviceWithMulticastGroup(
    params: StartBulkAssociateWirelessDeviceWithMulticastGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, 
      Unit
    ]
  ): Request[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
    */
  def startBulkDisassociateWirelessDeviceFromMulticastGroup(): Request[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  def startBulkDisassociateWirelessDeviceFromMulticastGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, 
      Unit
    ]
  ): Request[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  /**
    * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
    */
  def startBulkDisassociateWirelessDeviceFromMulticastGroup(params: StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest): Request[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  def startBulkDisassociateWirelessDeviceFromMulticastGroup(
    params: StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, 
      Unit
    ]
  ): Request[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Starts a FUOTA task.
    */
  def startFuotaTask(): Request[StartFuotaTaskResponse, AWSError] = js.native
  def startFuotaTask(callback: js.Function2[/* err */ AWSError, /* data */ StartFuotaTaskResponse, Unit]): Request[StartFuotaTaskResponse, AWSError] = js.native
  /**
    * Starts a FUOTA task.
    */
  def startFuotaTask(params: StartFuotaTaskRequest): Request[StartFuotaTaskResponse, AWSError] = js.native
  def startFuotaTask(
    params: StartFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFuotaTaskResponse, Unit]
  ): Request[StartFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Starts a multicast group session.
    */
  def startMulticastGroupSession(): Request[StartMulticastGroupSessionResponse, AWSError] = js.native
  def startMulticastGroupSession(callback: js.Function2[/* err */ AWSError, /* data */ StartMulticastGroupSessionResponse, Unit]): Request[StartMulticastGroupSessionResponse, AWSError] = js.native
  /**
    * Starts a multicast group session.
    */
  def startMulticastGroupSession(params: StartMulticastGroupSessionRequest): Request[StartMulticastGroupSessionResponse, AWSError] = js.native
  def startMulticastGroupSession(
    params: StartMulticastGroupSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMulticastGroupSessionResponse, Unit]
  ): Request[StartMulticastGroupSessionResponse, AWSError] = js.native
  
  /**
    * Adds a tag to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a tag to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Simulates a provisioned device by sending an uplink data payload of Hello.
    */
  def testWirelessDevice(): Request[TestWirelessDeviceResponse, AWSError] = js.native
  def testWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ TestWirelessDeviceResponse, Unit]): Request[TestWirelessDeviceResponse, AWSError] = js.native
  /**
    * Simulates a provisioned device by sending an uplink data payload of Hello.
    */
  def testWirelessDevice(params: TestWirelessDeviceRequest): Request[TestWirelessDeviceResponse, AWSError] = js.native
  def testWirelessDevice(
    params: TestWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestWirelessDeviceResponse, Unit]
  ): Request[TestWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates properties of a destination.
    */
  def updateDestination(): Request[UpdateDestinationResponse, AWSError] = js.native
  def updateDestination(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDestinationResponse, Unit]): Request[UpdateDestinationResponse, AWSError] = js.native
  /**
    * Updates properties of a destination.
    */
  def updateDestination(params: UpdateDestinationRequest): Request[UpdateDestinationResponse, AWSError] = js.native
  def updateDestination(
    params: UpdateDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDestinationResponse, Unit]
  ): Request[UpdateDestinationResponse, AWSError] = js.native
  
  /**
    * Update the event configuration based on resource types.
    */
  def updateEventConfigurationByResourceTypes(): Request[UpdateEventConfigurationByResourceTypesResponse, AWSError] = js.native
  def updateEventConfigurationByResourceTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventConfigurationByResourceTypesResponse, Unit]
  ): Request[UpdateEventConfigurationByResourceTypesResponse, AWSError] = js.native
  /**
    * Update the event configuration based on resource types.
    */
  def updateEventConfigurationByResourceTypes(params: UpdateEventConfigurationByResourceTypesRequest): Request[UpdateEventConfigurationByResourceTypesResponse, AWSError] = js.native
  def updateEventConfigurationByResourceTypes(
    params: UpdateEventConfigurationByResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventConfigurationByResourceTypesResponse, Unit]
  ): Request[UpdateEventConfigurationByResourceTypesResponse, AWSError] = js.native
  
  /**
    * Updates properties of a FUOTA task.
    */
  def updateFuotaTask(): Request[UpdateFuotaTaskResponse, AWSError] = js.native
  def updateFuotaTask(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFuotaTaskResponse, Unit]): Request[UpdateFuotaTaskResponse, AWSError] = js.native
  /**
    * Updates properties of a FUOTA task.
    */
  def updateFuotaTask(params: UpdateFuotaTaskRequest): Request[UpdateFuotaTaskResponse, AWSError] = js.native
  def updateFuotaTask(
    params: UpdateFuotaTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFuotaTaskResponse, Unit]
  ): Request[UpdateFuotaTaskResponse, AWSError] = js.native
  
  /**
    * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
    */
  def updateLogLevelsByResourceTypes(): Request[UpdateLogLevelsByResourceTypesResponse, AWSError] = js.native
  def updateLogLevelsByResourceTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLogLevelsByResourceTypesResponse, Unit]
  ): Request[UpdateLogLevelsByResourceTypesResponse, AWSError] = js.native
  /**
    * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
    */
  def updateLogLevelsByResourceTypes(params: UpdateLogLevelsByResourceTypesRequest): Request[UpdateLogLevelsByResourceTypesResponse, AWSError] = js.native
  def updateLogLevelsByResourceTypes(
    params: UpdateLogLevelsByResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLogLevelsByResourceTypesResponse, Unit]
  ): Request[UpdateLogLevelsByResourceTypesResponse, AWSError] = js.native
  
  /**
    * Updates properties of a multicast group session.
    */
  def updateMulticastGroup(): Request[UpdateMulticastGroupResponse, AWSError] = js.native
  def updateMulticastGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMulticastGroupResponse, Unit]): Request[UpdateMulticastGroupResponse, AWSError] = js.native
  /**
    * Updates properties of a multicast group session.
    */
  def updateMulticastGroup(params: UpdateMulticastGroupRequest): Request[UpdateMulticastGroupResponse, AWSError] = js.native
  def updateMulticastGroup(
    params: UpdateMulticastGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMulticastGroupResponse, Unit]
  ): Request[UpdateMulticastGroupResponse, AWSError] = js.native
  
  /**
    * Update network analyzer configuration.
    */
  def updateNetworkAnalyzerConfiguration(): Request[UpdateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def updateNetworkAnalyzerConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[UpdateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  /**
    * Update network analyzer configuration.
    */
  def updateNetworkAnalyzerConfiguration(params: UpdateNetworkAnalyzerConfigurationRequest): Request[UpdateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  def updateNetworkAnalyzerConfiguration(
    params: UpdateNetworkAnalyzerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkAnalyzerConfigurationResponse, Unit]
  ): Request[UpdateNetworkAnalyzerConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates properties of a partner account.
    */
  def updatePartnerAccount(): Request[UpdatePartnerAccountResponse, AWSError] = js.native
  def updatePartnerAccount(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePartnerAccountResponse, Unit]): Request[UpdatePartnerAccountResponse, AWSError] = js.native
  /**
    * Updates properties of a partner account.
    */
  def updatePartnerAccount(params: UpdatePartnerAccountRequest): Request[UpdatePartnerAccountResponse, AWSError] = js.native
  def updatePartnerAccount(
    params: UpdatePartnerAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePartnerAccountResponse, Unit]
  ): Request[UpdatePartnerAccountResponse, AWSError] = js.native
  
  /**
    * Update the position information of a resource.
    */
  def updatePosition(): Request[UpdatePositionResponse, AWSError] = js.native
  def updatePosition(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePositionResponse, Unit]): Request[UpdatePositionResponse, AWSError] = js.native
  /**
    * Update the position information of a resource.
    */
  def updatePosition(params: UpdatePositionRequest): Request[UpdatePositionResponse, AWSError] = js.native
  def updatePosition(
    params: UpdatePositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePositionResponse, Unit]
  ): Request[UpdatePositionResponse, AWSError] = js.native
  
  /**
    * Update the event configuration for a particular resource identifier.
    */
  def updateResourceEventConfiguration(): Request[UpdateResourceEventConfigurationResponse, AWSError] = js.native
  def updateResourceEventConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceEventConfigurationResponse, Unit]
  ): Request[UpdateResourceEventConfigurationResponse, AWSError] = js.native
  /**
    * Update the event configuration for a particular resource identifier.
    */
  def updateResourceEventConfiguration(params: UpdateResourceEventConfigurationRequest): Request[UpdateResourceEventConfigurationResponse, AWSError] = js.native
  def updateResourceEventConfiguration(
    params: UpdateResourceEventConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceEventConfigurationResponse, Unit]
  ): Request[UpdateResourceEventConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates properties of a wireless device.
    */
  def updateWirelessDevice(): Request[UpdateWirelessDeviceResponse, AWSError] = js.native
  def updateWirelessDevice(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWirelessDeviceResponse, Unit]): Request[UpdateWirelessDeviceResponse, AWSError] = js.native
  /**
    * Updates properties of a wireless device.
    */
  def updateWirelessDevice(params: UpdateWirelessDeviceRequest): Request[UpdateWirelessDeviceResponse, AWSError] = js.native
  def updateWirelessDevice(
    params: UpdateWirelessDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWirelessDeviceResponse, Unit]
  ): Request[UpdateWirelessDeviceResponse, AWSError] = js.native
  
  /**
    * Updates properties of a wireless gateway.
    */
  def updateWirelessGateway(): Request[UpdateWirelessGatewayResponse, AWSError] = js.native
  def updateWirelessGateway(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWirelessGatewayResponse, Unit]): Request[UpdateWirelessGatewayResponse, AWSError] = js.native
  /**
    * Updates properties of a wireless gateway.
    */
  def updateWirelessGateway(params: UpdateWirelessGatewayRequest): Request[UpdateWirelessGatewayResponse, AWSError] = js.native
  def updateWirelessGateway(
    params: UpdateWirelessGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWirelessGatewayResponse, Unit]
  ): Request[UpdateWirelessGatewayResponse, AWSError] = js.native
}
