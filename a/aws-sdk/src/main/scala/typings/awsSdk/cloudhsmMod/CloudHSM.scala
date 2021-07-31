package typings.awsSdk.cloudhsmMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudHSM extends Service {
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]): Request[AddTagsToResourceResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]
  ): Request[AddTagsToResourceResponse, AWSError] = js.native
  
  @JSName("config")
  var config_CloudHSM: ConfigBase & ClientConfiguration = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
    */
  def createHapg(): Request[CreateHapgResponse, AWSError] = js.native
  def createHapg(callback: js.Function2[/* err */ AWSError, /* data */ CreateHapgResponse, Unit]): Request[CreateHapgResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
    */
  def createHapg(params: CreateHapgRequest): Request[CreateHapgResponse, AWSError] = js.native
  def createHapg(
    params: CreateHapgRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHapgResponse, Unit]
  ): Request[CreateHapgResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
    */
  def createHsm(): Request[CreateHsmResponse, AWSError] = js.native
  def createHsm(callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmResponse, Unit]): Request[CreateHsmResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
    */
  def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse, AWSError] = js.native
  def createHsm(
    params: CreateHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmResponse, Unit]
  ): Request[CreateHsmResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
    */
  def createLunaClient(): Request[CreateLunaClientResponse, AWSError] = js.native
  def createLunaClient(callback: js.Function2[/* err */ AWSError, /* data */ CreateLunaClientResponse, Unit]): Request[CreateLunaClientResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
    */
  def createLunaClient(params: CreateLunaClientRequest): Request[CreateLunaClientResponse, AWSError] = js.native
  def createLunaClient(
    params: CreateLunaClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLunaClientResponse, Unit]
  ): Request[CreateLunaClientResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
    */
  def deleteHapg(): Request[DeleteHapgResponse, AWSError] = js.native
  def deleteHapg(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHapgResponse, Unit]): Request[DeleteHapgResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
    */
  def deleteHapg(params: DeleteHapgRequest): Request[DeleteHapgResponse, AWSError] = js.native
  def deleteHapg(
    params: DeleteHapgRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHapgResponse, Unit]
  ): Request[DeleteHapgResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
    */
  def deleteHsm(): Request[DeleteHsmResponse, AWSError] = js.native
  def deleteHsm(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHsmResponse, Unit]): Request[DeleteHsmResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
    */
  def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse, AWSError] = js.native
  def deleteHsm(
    params: DeleteHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHsmResponse, Unit]
  ): Request[DeleteHsmResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
    */
  def deleteLunaClient(): Request[DeleteLunaClientResponse, AWSError] = js.native
  def deleteLunaClient(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLunaClientResponse, Unit]): Request[DeleteLunaClientResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
    */
  def deleteLunaClient(params: DeleteLunaClientRequest): Request[DeleteLunaClientResponse, AWSError] = js.native
  def deleteLunaClient(
    params: DeleteLunaClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLunaClientResponse, Unit]
  ): Request[DeleteLunaClientResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
    */
  def describeHapg(): Request[DescribeHapgResponse, AWSError] = js.native
  def describeHapg(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHapgResponse, Unit]): Request[DescribeHapgResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
    */
  def describeHapg(params: DescribeHapgRequest): Request[DescribeHapgResponse, AWSError] = js.native
  def describeHapg(
    params: DescribeHapgRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHapgResponse, Unit]
  ): Request[DescribeHapgResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
    */
  def describeHsm(): Request[DescribeHsmResponse, AWSError] = js.native
  def describeHsm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHsmResponse, Unit]): Request[DescribeHsmResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
    */
  def describeHsm(params: DescribeHsmRequest): Request[DescribeHsmResponse, AWSError] = js.native
  def describeHsm(
    params: DescribeHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHsmResponse, Unit]
  ): Request[DescribeHsmResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
    */
  def describeLunaClient(): Request[DescribeLunaClientResponse, AWSError] = js.native
  def describeLunaClient(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLunaClientResponse, Unit]): Request[DescribeLunaClientResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
    */
  def describeLunaClient(params: DescribeLunaClientRequest): Request[DescribeLunaClientResponse, AWSError] = js.native
  def describeLunaClient(
    params: DescribeLunaClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLunaClientResponse, Unit]
  ): Request[DescribeLunaClientResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
    */
  def getConfig(): Request[GetConfigResponse, AWSError] = js.native
  def getConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetConfigResponse, Unit]): Request[GetConfigResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
    */
  def getConfig(params: GetConfigRequest): Request[GetConfigResponse, AWSError] = js.native
  def getConfig(
    params: GetConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigResponse, Unit]
  ): Request[GetConfigResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
    */
  def listAvailableZones(): Request[ListAvailableZonesResponse, AWSError] = js.native
  def listAvailableZones(callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableZonesResponse, Unit]): Request[ListAvailableZonesResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
    */
  def listAvailableZones(params: ListAvailableZonesRequest): Request[ListAvailableZonesResponse, AWSError] = js.native
  def listAvailableZones(
    params: ListAvailableZonesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableZonesResponse, Unit]
  ): Request[ListAvailableZonesResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
    */
  def listHapgs(): Request[ListHapgsResponse, AWSError] = js.native
  def listHapgs(callback: js.Function2[/* err */ AWSError, /* data */ ListHapgsResponse, Unit]): Request[ListHapgsResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
    */
  def listHapgs(params: ListHapgsRequest): Request[ListHapgsResponse, AWSError] = js.native
  def listHapgs(
    params: ListHapgsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHapgsResponse, Unit]
  ): Request[ListHapgsResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
    */
  def listHsms(): Request[ListHsmsResponse, AWSError] = js.native
  def listHsms(callback: js.Function2[/* err */ AWSError, /* data */ ListHsmsResponse, Unit]): Request[ListHsmsResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
    */
  def listHsms(params: ListHsmsRequest): Request[ListHsmsResponse, AWSError] = js.native
  def listHsms(
    params: ListHsmsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHsmsResponse, Unit]
  ): Request[ListHsmsResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
    */
  def listLunaClients(): Request[ListLunaClientsResponse, AWSError] = js.native
  def listLunaClients(callback: js.Function2[/* err */ AWSError, /* data */ ListLunaClientsResponse, Unit]): Request[ListLunaClientsResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
    */
  def listLunaClients(params: ListLunaClientsRequest): Request[ListLunaClientsResponse, AWSError] = js.native
  def listLunaClients(
    params: ListLunaClientsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLunaClientsResponse, Unit]
  ): Request[ListLunaClientsResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
    */
  def modifyHapg(): Request[ModifyHapgResponse, AWSError] = js.native
  def modifyHapg(callback: js.Function2[/* err */ AWSError, /* data */ ModifyHapgResponse, Unit]): Request[ModifyHapgResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
    */
  def modifyHapg(params: ModifyHapgRequest): Request[ModifyHapgResponse, AWSError] = js.native
  def modifyHapg(
    params: ModifyHapgRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyHapgResponse, Unit]
  ): Request[ModifyHapgResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
    */
  def modifyHsm(): Request[ModifyHsmResponse, AWSError] = js.native
  def modifyHsm(callback: js.Function2[/* err */ AWSError, /* data */ ModifyHsmResponse, Unit]): Request[ModifyHsmResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
    */
  def modifyHsm(params: ModifyHsmRequest): Request[ModifyHsmResponse, AWSError] = js.native
  def modifyHsm(
    params: ModifyHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyHsmResponse, Unit]
  ): Request[ModifyHsmResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
    */
  def modifyLunaClient(): Request[ModifyLunaClientResponse, AWSError] = js.native
  def modifyLunaClient(callback: js.Function2[/* err */ AWSError, /* data */ ModifyLunaClientResponse, Unit]): Request[ModifyLunaClientResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
    */
  def modifyLunaClient(params: ModifyLunaClientRequest): Request[ModifyLunaClientResponse, AWSError] = js.native
  def modifyLunaClient(
    params: ModifyLunaClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyLunaClientResponse, Unit]
  ): Request[ModifyLunaClientResponse, AWSError] = js.native
  
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]
  ): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
}
