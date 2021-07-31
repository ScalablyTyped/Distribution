package typings.awsSdk.directoryserviceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryService extends Service {
  
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(): Request[AcceptSharedDirectoryResult, AWSError] = js.native
  def acceptSharedDirectory(callback: js.Function2[/* err */ AWSError, /* data */ AcceptSharedDirectoryResult, Unit]): Request[AcceptSharedDirectoryResult, AWSError] = js.native
  /**
    * Accepts a directory sharing request that was sent from the directory owner account.
    */
  def acceptSharedDirectory(params: AcceptSharedDirectoryRequest): Request[AcceptSharedDirectoryResult, AWSError] = js.native
  def acceptSharedDirectory(
    params: AcceptSharedDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptSharedDirectoryResult, Unit]
  ): Request[AcceptSharedDirectoryResult, AWSError] = js.native
  
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(): Request[AddIpRoutesResult, AWSError] = js.native
  def addIpRoutes(callback: js.Function2[/* err */ AWSError, /* data */ AddIpRoutesResult, Unit]): Request[AddIpRoutesResult, AWSError] = js.native
  /**
    * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def addIpRoutes(params: AddIpRoutesRequest): Request[AddIpRoutesResult, AWSError] = js.native
  def addIpRoutes(
    params: AddIpRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddIpRoutesResult, Unit]
  ): Request[AddIpRoutesResult, AWSError] = js.native
  
  /**
    * Adds two domain controllers in the specified Region for the specified directory.
    */
  def addRegion(): Request[AddRegionResult, AWSError] = js.native
  def addRegion(callback: js.Function2[/* err */ AWSError, /* data */ AddRegionResult, Unit]): Request[AddRegionResult, AWSError] = js.native
  /**
    * Adds two domain controllers in the specified Region for the specified directory.
    */
  def addRegion(params: AddRegionRequest): Request[AddRegionResult, AWSError] = js.native
  def addRegion(
    params: AddRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddRegionResult, Unit]
  ): Request[AddRegionResult, AWSError] = js.native
  
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(): Request[AddTagsToResourceResult, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResult, Unit]): Request[AddTagsToResourceResult, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResult, Unit]
  ): Request[AddTagsToResourceResult, AWSError] = js.native
  
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(): Request[CancelSchemaExtensionResult, AWSError] = js.native
  def cancelSchemaExtension(callback: js.Function2[/* err */ AWSError, /* data */ CancelSchemaExtensionResult, Unit]): Request[CancelSchemaExtensionResult, AWSError] = js.native
  /**
    * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
    */
  def cancelSchemaExtension(params: CancelSchemaExtensionRequest): Request[CancelSchemaExtensionResult, AWSError] = js.native
  def cancelSchemaExtension(
    params: CancelSchemaExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelSchemaExtensionResult, Unit]
  ): Request[CancelSchemaExtensionResult, AWSError] = js.native
  
  @JSName("config")
  var config_DirectoryService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(): Request[ConnectDirectoryResult, AWSError] = js.native
  def connectDirectory(callback: js.Function2[/* err */ AWSError, /* data */ ConnectDirectoryResult, Unit]): Request[ConnectDirectoryResult, AWSError] = js.native
  /**
    * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def connectDirectory(params: ConnectDirectoryRequest): Request[ConnectDirectoryResult, AWSError] = js.native
  def connectDirectory(
    params: ConnectDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConnectDirectoryResult, Unit]
  ): Request[ConnectDirectoryResult, AWSError] = js.native
  
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(): Request[CreateAliasResult, AWSError] = js.native
  def createAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResult, Unit]): Request[CreateAliasResult, AWSError] = js.native
  /**
    * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
    */
  def createAlias(params: CreateAliasRequest): Request[CreateAliasResult, AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResult, Unit]
  ): Request[CreateAliasResult, AWSError] = js.native
  
  /**
    * Creates an Active Directory computer object in the specified directory.
    */
  def createComputer(): Request[CreateComputerResult, AWSError] = js.native
  def createComputer(callback: js.Function2[/* err */ AWSError, /* data */ CreateComputerResult, Unit]): Request[CreateComputerResult, AWSError] = js.native
  /**
    * Creates an Active Directory computer object in the specified directory.
    */
  def createComputer(params: CreateComputerRequest): Request[CreateComputerResult, AWSError] = js.native
  def createComputer(
    params: CreateComputerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComputerResult, Unit]
  ): Request[CreateComputerResult, AWSError] = js.native
  
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(): Request[CreateConditionalForwarderResult, AWSError] = js.native
  def createConditionalForwarder(callback: js.Function2[/* err */ AWSError, /* data */ CreateConditionalForwarderResult, Unit]): Request[CreateConditionalForwarderResult, AWSError] = js.native
  /**
    * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
    */
  def createConditionalForwarder(params: CreateConditionalForwarderRequest): Request[CreateConditionalForwarderResult, AWSError] = js.native
  def createConditionalForwarder(
    params: CreateConditionalForwarderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConditionalForwarderResult, Unit]
  ): Request[CreateConditionalForwarderResult, AWSError] = js.native
  
  /**
    * Creates a Simple AD directory. For more information, see Simple Active Directory in the AWS Directory Service Admin Guide. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(): Request[CreateDirectoryResult, AWSError] = js.native
  def createDirectory(callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryResult, Unit]): Request[CreateDirectoryResult, AWSError] = js.native
  /**
    * Creates a Simple AD directory. For more information, see Simple Active Directory in the AWS Directory Service Admin Guide. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResult, AWSError] = js.native
  def createDirectory(
    params: CreateDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryResult, Unit]
  ): Request[CreateDirectoryResult, AWSError] = js.native
  
  /**
    * Creates a subscription to forward real-time Directory Service domain controller security logs to the specified Amazon CloudWatch log group in your AWS account.
    */
  def createLogSubscription(): Request[CreateLogSubscriptionResult, AWSError] = js.native
  def createLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateLogSubscriptionResult, Unit]): Request[CreateLogSubscriptionResult, AWSError] = js.native
  /**
    * Creates a subscription to forward real-time Directory Service domain controller security logs to the specified Amazon CloudWatch log group in your AWS account.
    */
  def createLogSubscription(params: CreateLogSubscriptionRequest): Request[CreateLogSubscriptionResult, AWSError] = js.native
  def createLogSubscription(
    params: CreateLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLogSubscriptionResult, Unit]
  ): Request[CreateLogSubscriptionResult, AWSError] = js.native
  
  /**
    * Creates a Microsoft AD directory in the AWS Cloud. For more information, see AWS Managed Microsoft AD in the AWS Directory Service Admin Guide. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(): Request[CreateMicrosoftADResult, AWSError] = js.native
  def createMicrosoftAD(callback: js.Function2[/* err */ AWSError, /* data */ CreateMicrosoftADResult, Unit]): Request[CreateMicrosoftADResult, AWSError] = js.native
  /**
    * Creates a Microsoft AD directory in the AWS Cloud. For more information, see AWS Managed Microsoft AD in the AWS Directory Service Admin Guide. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def createMicrosoftAD(params: CreateMicrosoftADRequest): Request[CreateMicrosoftADResult, AWSError] = js.native
  def createMicrosoftAD(
    params: CreateMicrosoftADRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMicrosoftADResult, Unit]
  ): Request[CreateMicrosoftADResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]): Request[CreateSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]
  ): Request[CreateSnapshotResult, AWSError] = js.native
  
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(): Request[CreateTrustResult, AWSError] = js.native
  def createTrust(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrustResult, Unit]): Request[CreateTrustResult, AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
    */
  def createTrust(params: CreateTrustRequest): Request[CreateTrustResult, AWSError] = js.native
  def createTrust(
    params: CreateTrustRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrustResult, Unit]
  ): Request[CreateTrustResult, AWSError] = js.native
  
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(): Request[DeleteConditionalForwarderResult, AWSError] = js.native
  def deleteConditionalForwarder(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConditionalForwarderResult, Unit]): Request[DeleteConditionalForwarderResult, AWSError] = js.native
  /**
    * Deletes a conditional forwarder that has been set up for your AWS directory.
    */
  def deleteConditionalForwarder(params: DeleteConditionalForwarderRequest): Request[DeleteConditionalForwarderResult, AWSError] = js.native
  def deleteConditionalForwarder(
    params: DeleteConditionalForwarderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConditionalForwarderResult, Unit]
  ): Request[DeleteConditionalForwarderResult, AWSError] = js.native
  
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(): Request[DeleteDirectoryResult, AWSError] = js.native
  def deleteDirectory(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryResult, Unit]): Request[DeleteDirectoryResult, AWSError] = js.native
  /**
    * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
    */
  def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResult, AWSError] = js.native
  def deleteDirectory(
    params: DeleteDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryResult, Unit]
  ): Request[DeleteDirectoryResult, AWSError] = js.native
  
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(): Request[DeleteLogSubscriptionResult, AWSError] = js.native
  def deleteLogSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLogSubscriptionResult, Unit]): Request[DeleteLogSubscriptionResult, AWSError] = js.native
  /**
    * Deletes the specified log subscription.
    */
  def deleteLogSubscription(params: DeleteLogSubscriptionRequest): Request[DeleteLogSubscriptionResult, AWSError] = js.native
  def deleteLogSubscription(
    params: DeleteLogSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLogSubscriptionResult, Unit]
  ): Request[DeleteLogSubscriptionResult, AWSError] = js.native
  
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(): Request[DeleteSnapshotResult, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResult, Unit]): Request[DeleteSnapshotResult, AWSError] = js.native
  /**
    * Deletes a directory snapshot.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResult, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResult, Unit]
  ): Request[DeleteSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(): Request[DeleteTrustResult, AWSError] = js.native
  def deleteTrust(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrustResult, Unit]): Request[DeleteTrustResult, AWSError] = js.native
  /**
    * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def deleteTrust(params: DeleteTrustRequest): Request[DeleteTrustResult, AWSError] = js.native
  def deleteTrust(
    params: DeleteTrustRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrustResult, Unit]
  ): Request[DeleteTrustResult, AWSError] = js.native
  
  /**
    * Deletes from the system the certificate that was registered for a secured LDAP connection.
    */
  def deregisterCertificate(): Request[DeregisterCertificateResult, AWSError] = js.native
  def deregisterCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterCertificateResult, Unit]): Request[DeregisterCertificateResult, AWSError] = js.native
  /**
    * Deletes from the system the certificate that was registered for a secured LDAP connection.
    */
  def deregisterCertificate(params: DeregisterCertificateRequest): Request[DeregisterCertificateResult, AWSError] = js.native
  def deregisterCertificate(
    params: DeregisterCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterCertificateResult, Unit]
  ): Request[DeregisterCertificateResult, AWSError] = js.native
  
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(): Request[DeregisterEventTopicResult, AWSError] = js.native
  def deregisterEventTopic(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterEventTopicResult, Unit]): Request[DeregisterEventTopicResult, AWSError] = js.native
  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  def deregisterEventTopic(params: DeregisterEventTopicRequest): Request[DeregisterEventTopicResult, AWSError] = js.native
  def deregisterEventTopic(
    params: DeregisterEventTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterEventTopicResult, Unit]
  ): Request[DeregisterEventTopicResult, AWSError] = js.native
  
  /**
    * Displays information about the certificate registered for a secured LDAP connection.
    */
  def describeCertificate(): Request[DescribeCertificateResult, AWSError] = js.native
  def describeCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResult, Unit]): Request[DescribeCertificateResult, AWSError] = js.native
  /**
    * Displays information about the certificate registered for a secured LDAP connection.
    */
  def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResult, AWSError] = js.native
  def describeCertificate(
    params: DescribeCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResult, Unit]
  ): Request[DescribeCertificateResult, AWSError] = js.native
  
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(): Request[DescribeConditionalForwardersResult, AWSError] = js.native
  def describeConditionalForwarders(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConditionalForwardersResult, Unit]): Request[DescribeConditionalForwardersResult, AWSError] = js.native
  /**
    * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
    */
  def describeConditionalForwarders(params: DescribeConditionalForwardersRequest): Request[DescribeConditionalForwardersResult, AWSError] = js.native
  def describeConditionalForwarders(
    params: DescribeConditionalForwardersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConditionalForwardersResult, Unit]
  ): Request[DescribeConditionalForwardersResult, AWSError] = js.native
  
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(): Request[DescribeDirectoriesResult, AWSError] = js.native
  def describeDirectories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectoriesResult, Unit]): Request[DescribeDirectoriesResult, AWSError] = js.native
  /**
    * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeDirectories(params: DescribeDirectoriesRequest): Request[DescribeDirectoriesResult, AWSError] = js.native
  def describeDirectories(
    params: DescribeDirectoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectoriesResult, Unit]
  ): Request[DescribeDirectoriesResult, AWSError] = js.native
  
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(): Request[DescribeDomainControllersResult, AWSError] = js.native
  def describeDomainControllers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainControllersResult, Unit]): Request[DescribeDomainControllersResult, AWSError] = js.native
  /**
    * Provides information about any domain controllers in your directory.
    */
  def describeDomainControllers(params: DescribeDomainControllersRequest): Request[DescribeDomainControllersResult, AWSError] = js.native
  def describeDomainControllers(
    params: DescribeDomainControllersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainControllersResult, Unit]
  ): Request[DescribeDomainControllersResult, AWSError] = js.native
  
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(): Request[DescribeEventTopicsResult, AWSError] = js.native
  def describeEventTopics(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTopicsResult, Unit]): Request[DescribeEventTopicsResult, AWSError] = js.native
  /**
    * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
    */
  def describeEventTopics(params: DescribeEventTopicsRequest): Request[DescribeEventTopicsResult, AWSError] = js.native
  def describeEventTopics(
    params: DescribeEventTopicsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTopicsResult, Unit]
  ): Request[DescribeEventTopicsResult, AWSError] = js.native
  
  /**
    * Describes the status of LDAP security for the specified directory.
    */
  def describeLDAPSSettings(): Request[DescribeLDAPSSettingsResult, AWSError] = js.native
  def describeLDAPSSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLDAPSSettingsResult, Unit]): Request[DescribeLDAPSSettingsResult, AWSError] = js.native
  /**
    * Describes the status of LDAP security for the specified directory.
    */
  def describeLDAPSSettings(params: DescribeLDAPSSettingsRequest): Request[DescribeLDAPSSettingsResult, AWSError] = js.native
  def describeLDAPSSettings(
    params: DescribeLDAPSSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLDAPSSettingsResult, Unit]
  ): Request[DescribeLDAPSSettingsResult, AWSError] = js.native
  
  /**
    * Provides information about the Regions that are configured for multi-Region replication.
    */
  def describeRegions(): Request[DescribeRegionsResult, AWSError] = js.native
  def describeRegions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionsResult, Unit]): Request[DescribeRegionsResult, AWSError] = js.native
  /**
    * Provides information about the Regions that are configured for multi-Region replication.
    */
  def describeRegions(params: DescribeRegionsRequest): Request[DescribeRegionsResult, AWSError] = js.native
  def describeRegions(
    params: DescribeRegionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionsResult, Unit]
  ): Request[DescribeRegionsResult, AWSError] = js.native
  
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(): Request[DescribeSharedDirectoriesResult, AWSError] = js.native
  def describeSharedDirectories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSharedDirectoriesResult, Unit]): Request[DescribeSharedDirectoriesResult, AWSError] = js.native
  /**
    * Returns the shared directories in your account. 
    */
  def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): Request[DescribeSharedDirectoriesResult, AWSError] = js.native
  def describeSharedDirectories(
    params: DescribeSharedDirectoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSharedDirectoriesResult, Unit]
  ): Request[DescribeSharedDirectoriesResult, AWSError] = js.native
  
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(): Request[DescribeSnapshotsResult, AWSError] = js.native
  def describeSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]): Request[DescribeSnapshotsResult, AWSError] = js.native
  /**
    * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
    */
  def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult, AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResult, Unit]
  ): Request[DescribeSnapshotsResult, AWSError] = js.native
  
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(): Request[DescribeTrustsResult, AWSError] = js.native
  def describeTrusts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustsResult, Unit]): Request[DescribeTrustsResult, AWSError] = js.native
  /**
    * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
    */
  def describeTrusts(params: DescribeTrustsRequest): Request[DescribeTrustsResult, AWSError] = js.native
  def describeTrusts(
    params: DescribeTrustsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrustsResult, Unit]
  ): Request[DescribeTrustsResult, AWSError] = js.native
  
  /**
    * Deactivates LDAP secure calls for the specified directory.
    */
  def disableLDAPS(): Request[DisableLDAPSResult, AWSError] = js.native
  def disableLDAPS(callback: js.Function2[/* err */ AWSError, /* data */ DisableLDAPSResult, Unit]): Request[DisableLDAPSResult, AWSError] = js.native
  /**
    * Deactivates LDAP secure calls for the specified directory.
    */
  def disableLDAPS(params: DisableLDAPSRequest): Request[DisableLDAPSResult, AWSError] = js.native
  def disableLDAPS(
    params: DisableLDAPSRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableLDAPSResult, Unit]
  ): Request[DisableLDAPSResult, AWSError] = js.native
  
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(): Request[DisableRadiusResult, AWSError] = js.native
  def disableRadius(callback: js.Function2[/* err */ AWSError, /* data */ DisableRadiusResult, Unit]): Request[DisableRadiusResult, AWSError] = js.native
  /**
    * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def disableRadius(params: DisableRadiusRequest): Request[DisableRadiusResult, AWSError] = js.native
  def disableRadius(
    params: DisableRadiusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableRadiusResult, Unit]
  ): Request[DisableRadiusResult, AWSError] = js.native
  
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(): Request[DisableSsoResult, AWSError] = js.native
  def disableSso(callback: js.Function2[/* err */ AWSError, /* data */ DisableSsoResult, Unit]): Request[DisableSsoResult, AWSError] = js.native
  /**
    * Disables single-sign on for a directory.
    */
  def disableSso(params: DisableSsoRequest): Request[DisableSsoResult, AWSError] = js.native
  def disableSso(
    params: DisableSsoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSsoResult, Unit]
  ): Request[DisableSsoResult, AWSError] = js.native
  
  /**
    * Activates the switch for the specific directory to always use LDAP secure calls.
    */
  def enableLDAPS(): Request[EnableLDAPSResult, AWSError] = js.native
  def enableLDAPS(callback: js.Function2[/* err */ AWSError, /* data */ EnableLDAPSResult, Unit]): Request[EnableLDAPSResult, AWSError] = js.native
  /**
    * Activates the switch for the specific directory to always use LDAP secure calls.
    */
  def enableLDAPS(params: EnableLDAPSRequest): Request[EnableLDAPSResult, AWSError] = js.native
  def enableLDAPS(
    params: EnableLDAPSRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableLDAPSResult, Unit]
  ): Request[EnableLDAPSResult, AWSError] = js.native
  
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(): Request[EnableRadiusResult, AWSError] = js.native
  def enableRadius(callback: js.Function2[/* err */ AWSError, /* data */ EnableRadiusResult, Unit]): Request[EnableRadiusResult, AWSError] = js.native
  /**
    * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
    */
  def enableRadius(params: EnableRadiusRequest): Request[EnableRadiusResult, AWSError] = js.native
  def enableRadius(
    params: EnableRadiusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableRadiusResult, Unit]
  ): Request[EnableRadiusResult, AWSError] = js.native
  
  /**
    * Enables single sign-on for a directory. Single sign-on allows users in your directory to access certain AWS services from a computer joined to the directory without having to enter their credentials separately.
    */
  def enableSso(): Request[EnableSsoResult, AWSError] = js.native
  def enableSso(callback: js.Function2[/* err */ AWSError, /* data */ EnableSsoResult, Unit]): Request[EnableSsoResult, AWSError] = js.native
  /**
    * Enables single sign-on for a directory. Single sign-on allows users in your directory to access certain AWS services from a computer joined to the directory without having to enter their credentials separately.
    */
  def enableSso(params: EnableSsoRequest): Request[EnableSsoResult, AWSError] = js.native
  def enableSso(
    params: EnableSsoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSsoResult, Unit]
  ): Request[EnableSsoResult, AWSError] = js.native
  
  /**
    * Obtains directory limit information for the current Region.
    */
  def getDirectoryLimits(): Request[GetDirectoryLimitsResult, AWSError] = js.native
  def getDirectoryLimits(callback: js.Function2[/* err */ AWSError, /* data */ GetDirectoryLimitsResult, Unit]): Request[GetDirectoryLimitsResult, AWSError] = js.native
  /**
    * Obtains directory limit information for the current Region.
    */
  def getDirectoryLimits(params: GetDirectoryLimitsRequest): Request[GetDirectoryLimitsResult, AWSError] = js.native
  def getDirectoryLimits(
    params: GetDirectoryLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDirectoryLimitsResult, Unit]
  ): Request[GetDirectoryLimitsResult, AWSError] = js.native
  
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(): Request[GetSnapshotLimitsResult, AWSError] = js.native
  def getSnapshotLimits(callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotLimitsResult, Unit]): Request[GetSnapshotLimitsResult, AWSError] = js.native
  /**
    * Obtains the manual snapshot limits for a directory.
    */
  def getSnapshotLimits(params: GetSnapshotLimitsRequest): Request[GetSnapshotLimitsResult, AWSError] = js.native
  def getSnapshotLimits(
    params: GetSnapshotLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotLimitsResult, Unit]
  ): Request[GetSnapshotLimitsResult, AWSError] = js.native
  
  /**
    * For the specified directory, lists all the certificates registered for a secured LDAP connection.
    */
  def listCertificates(): Request[ListCertificatesResult, AWSError] = js.native
  def listCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResult, Unit]): Request[ListCertificatesResult, AWSError] = js.native
  /**
    * For the specified directory, lists all the certificates registered for a secured LDAP connection.
    */
  def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResult, AWSError] = js.native
  def listCertificates(
    params: ListCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResult, Unit]
  ): Request[ListCertificatesResult, AWSError] = js.native
  
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(): Request[ListIpRoutesResult, AWSError] = js.native
  def listIpRoutes(callback: js.Function2[/* err */ AWSError, /* data */ ListIpRoutesResult, Unit]): Request[ListIpRoutesResult, AWSError] = js.native
  /**
    * Lists the address blocks that you have added to a directory.
    */
  def listIpRoutes(params: ListIpRoutesRequest): Request[ListIpRoutesResult, AWSError] = js.native
  def listIpRoutes(
    params: ListIpRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIpRoutesResult, Unit]
  ): Request[ListIpRoutesResult, AWSError] = js.native
  
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(): Request[ListLogSubscriptionsResult, AWSError] = js.native
  def listLogSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListLogSubscriptionsResult, Unit]): Request[ListLogSubscriptionsResult, AWSError] = js.native
  /**
    * Lists the active log subscriptions for the AWS account.
    */
  def listLogSubscriptions(params: ListLogSubscriptionsRequest): Request[ListLogSubscriptionsResult, AWSError] = js.native
  def listLogSubscriptions(
    params: ListLogSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLogSubscriptionsResult, Unit]
  ): Request[ListLogSubscriptionsResult, AWSError] = js.native
  
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(): Request[ListSchemaExtensionsResult, AWSError] = js.native
  def listSchemaExtensions(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemaExtensionsResult, Unit]): Request[ListSchemaExtensionsResult, AWSError] = js.native
  /**
    * Lists all schema extensions applied to a Microsoft AD Directory.
    */
  def listSchemaExtensions(params: ListSchemaExtensionsRequest): Request[ListSchemaExtensionsResult, AWSError] = js.native
  def listSchemaExtensions(
    params: ListSchemaExtensionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemaExtensionsResult, Unit]
  ): Request[ListSchemaExtensionsResult, AWSError] = js.native
  
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Lists all tags on a directory.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    * Registers a certificate for secured LDAP connection.
    */
  def registerCertificate(): Request[RegisterCertificateResult, AWSError] = js.native
  def registerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateResult, Unit]): Request[RegisterCertificateResult, AWSError] = js.native
  /**
    * Registers a certificate for secured LDAP connection.
    */
  def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResult, AWSError] = js.native
  def registerCertificate(
    params: RegisterCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterCertificateResult, Unit]
  ): Request[RegisterCertificateResult, AWSError] = js.native
  
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(): Request[RegisterEventTopicResult, AWSError] = js.native
  def registerEventTopic(callback: js.Function2[/* err */ AWSError, /* data */ RegisterEventTopicResult, Unit]): Request[RegisterEventTopicResult, AWSError] = js.native
  /**
    * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
    */
  def registerEventTopic(params: RegisterEventTopicRequest): Request[RegisterEventTopicResult, AWSError] = js.native
  def registerEventTopic(
    params: RegisterEventTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterEventTopicResult, Unit]
  ): Request[RegisterEventTopicResult, AWSError] = js.native
  
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(): Request[RejectSharedDirectoryResult, AWSError] = js.native
  def rejectSharedDirectory(callback: js.Function2[/* err */ AWSError, /* data */ RejectSharedDirectoryResult, Unit]): Request[RejectSharedDirectoryResult, AWSError] = js.native
  /**
    * Rejects a directory sharing request that was sent from the directory owner account.
    */
  def rejectSharedDirectory(params: RejectSharedDirectoryRequest): Request[RejectSharedDirectoryResult, AWSError] = js.native
  def rejectSharedDirectory(
    params: RejectSharedDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectSharedDirectoryResult, Unit]
  ): Request[RejectSharedDirectoryResult, AWSError] = js.native
  
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(): Request[RemoveIpRoutesResult, AWSError] = js.native
  def removeIpRoutes(callback: js.Function2[/* err */ AWSError, /* data */ RemoveIpRoutesResult, Unit]): Request[RemoveIpRoutesResult, AWSError] = js.native
  /**
    * Removes IP address blocks from a directory.
    */
  def removeIpRoutes(params: RemoveIpRoutesRequest): Request[RemoveIpRoutesResult, AWSError] = js.native
  def removeIpRoutes(
    params: RemoveIpRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveIpRoutesResult, Unit]
  ): Request[RemoveIpRoutesResult, AWSError] = js.native
  
  /**
    * Stops all replication and removes the domain controllers from the specified Region. You cannot remove the primary Region with this operation. Instead, use the DeleteDirectory API.
    */
  def removeRegion(): Request[RemoveRegionResult, AWSError] = js.native
  def removeRegion(callback: js.Function2[/* err */ AWSError, /* data */ RemoveRegionResult, Unit]): Request[RemoveRegionResult, AWSError] = js.native
  /**
    * Stops all replication and removes the domain controllers from the specified Region. You cannot remove the primary Region with this operation. Instead, use the DeleteDirectory API.
    */
  def removeRegion(params: RemoveRegionRequest): Request[RemoveRegionResult, AWSError] = js.native
  def removeRegion(
    params: RemoveRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveRegionResult, Unit]
  ): Request[RemoveRegionResult, AWSError] = js.native
  
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResult, Unit]): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  /**
    * Removes tags from a directory.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResult, Unit]
  ): Request[RemoveTagsFromResourceResult, AWSError] = js.native
  
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory. You can reset the password for any user in your directory with the following exceptions:   For Simple AD, you cannot reset the password for any user that is a member of either the Domain Admins or Enterprise Admins group except for the administrator user.   For AWS Managed Microsoft AD, you can only reset the password for a user that is in an OU based off of the NetBIOS name that you typed when you created your directory. For example, you cannot reset the password for a user in the AWS Reserved OU. For more information about the OU structure for an AWS Managed Microsoft AD directory, see What Gets Created in the AWS Directory Service Administration Guide.  
    */
  def resetUserPassword(): Request[ResetUserPasswordResult, AWSError] = js.native
  def resetUserPassword(callback: js.Function2[/* err */ AWSError, /* data */ ResetUserPasswordResult, Unit]): Request[ResetUserPasswordResult, AWSError] = js.native
  /**
    * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory. You can reset the password for any user in your directory with the following exceptions:   For Simple AD, you cannot reset the password for any user that is a member of either the Domain Admins or Enterprise Admins group except for the administrator user.   For AWS Managed Microsoft AD, you can only reset the password for a user that is in an OU based off of the NetBIOS name that you typed when you created your directory. For example, you cannot reset the password for a user in the AWS Reserved OU. For more information about the OU structure for an AWS Managed Microsoft AD directory, see What Gets Created in the AWS Directory Service Administration Guide.  
    */
  def resetUserPassword(params: ResetUserPasswordRequest): Request[ResetUserPasswordResult, AWSError] = js.native
  def resetUserPassword(
    params: ResetUserPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetUserPasswordResult, Unit]
  ): Request[ResetUserPasswordResult, AWSError] = js.native
  
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(): Request[RestoreFromSnapshotResult, AWSError] = js.native
  def restoreFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromSnapshotResult, Unit]): Request[RestoreFromSnapshotResult, AWSError] = js.native
  /**
    * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
    */
  def restoreFromSnapshot(params: RestoreFromSnapshotRequest): Request[RestoreFromSnapshotResult, AWSError] = js.native
  def restoreFromSnapshot(
    params: RestoreFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromSnapshotResult, Unit]
  ): Request[RestoreFromSnapshotResult, AWSError] = js.native
  
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(): Request[ShareDirectoryResult, AWSError] = js.native
  def shareDirectory(callback: js.Function2[/* err */ AWSError, /* data */ ShareDirectoryResult, Unit]): Request[ShareDirectoryResult, AWSError] = js.native
  /**
    * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
    */
  def shareDirectory(params: ShareDirectoryRequest): Request[ShareDirectoryResult, AWSError] = js.native
  def shareDirectory(
    params: ShareDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ShareDirectoryResult, Unit]
  ): Request[ShareDirectoryResult, AWSError] = js.native
  
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(): Request[StartSchemaExtensionResult, AWSError] = js.native
  def startSchemaExtension(callback: js.Function2[/* err */ AWSError, /* data */ StartSchemaExtensionResult, Unit]): Request[StartSchemaExtensionResult, AWSError] = js.native
  /**
    * Applies a schema extension to a Microsoft AD directory.
    */
  def startSchemaExtension(params: StartSchemaExtensionRequest): Request[StartSchemaExtensionResult, AWSError] = js.native
  def startSchemaExtension(
    params: StartSchemaExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSchemaExtensionResult, Unit]
  ): Request[StartSchemaExtensionResult, AWSError] = js.native
  
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(): Request[UnshareDirectoryResult, AWSError] = js.native
  def unshareDirectory(callback: js.Function2[/* err */ AWSError, /* data */ UnshareDirectoryResult, Unit]): Request[UnshareDirectoryResult, AWSError] = js.native
  /**
    * Stops the directory sharing between the directory owner and consumer accounts. 
    */
  def unshareDirectory(params: UnshareDirectoryRequest): Request[UnshareDirectoryResult, AWSError] = js.native
  def unshareDirectory(
    params: UnshareDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnshareDirectoryResult, Unit]
  ): Request[UnshareDirectoryResult, AWSError] = js.native
  
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(): Request[UpdateConditionalForwarderResult, AWSError] = js.native
  def updateConditionalForwarder(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConditionalForwarderResult, Unit]): Request[UpdateConditionalForwarderResult, AWSError] = js.native
  /**
    * Updates a conditional forwarder that has been set up for your AWS directory.
    */
  def updateConditionalForwarder(params: UpdateConditionalForwarderRequest): Request[UpdateConditionalForwarderResult, AWSError] = js.native
  def updateConditionalForwarder(
    params: UpdateConditionalForwarderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConditionalForwarderResult, Unit]
  ): Request[UpdateConditionalForwarderResult, AWSError] = js.native
  
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(): Request[UpdateNumberOfDomainControllersResult, AWSError] = js.native
  def updateNumberOfDomainControllers(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNumberOfDomainControllersResult, Unit]): Request[UpdateNumberOfDomainControllersResult, AWSError] = js.native
  /**
    * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
    */
  def updateNumberOfDomainControllers(params: UpdateNumberOfDomainControllersRequest): Request[UpdateNumberOfDomainControllersResult, AWSError] = js.native
  def updateNumberOfDomainControllers(
    params: UpdateNumberOfDomainControllersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNumberOfDomainControllersResult, Unit]
  ): Request[UpdateNumberOfDomainControllersResult, AWSError] = js.native
  
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(): Request[UpdateRadiusResult, AWSError] = js.native
  def updateRadius(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRadiusResult, Unit]): Request[UpdateRadiusResult, AWSError] = js.native
  /**
    * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
    */
  def updateRadius(params: UpdateRadiusRequest): Request[UpdateRadiusResult, AWSError] = js.native
  def updateRadius(
    params: UpdateRadiusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRadiusResult, Unit]
  ): Request[UpdateRadiusResult, AWSError] = js.native
  
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(): Request[UpdateTrustResult, AWSError] = js.native
  def updateTrust(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrustResult, Unit]): Request[UpdateTrustResult, AWSError] = js.native
  /**
    * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
    */
  def updateTrust(params: UpdateTrustRequest): Request[UpdateTrustResult, AWSError] = js.native
  def updateTrust(
    params: UpdateTrustRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrustResult, Unit]
  ): Request[UpdateTrustResult, AWSError] = js.native
  
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(): Request[VerifyTrustResult, AWSError] = js.native
  def verifyTrust(callback: js.Function2[/* err */ AWSError, /* data */ VerifyTrustResult, Unit]): Request[VerifyTrustResult, AWSError] = js.native
  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
    */
  def verifyTrust(params: VerifyTrustRequest): Request[VerifyTrustResult, AWSError] = js.native
  def verifyTrust(
    params: VerifyTrustRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifyTrustResult, Unit]
  ): Request[VerifyTrustResult, AWSError] = js.native
}
