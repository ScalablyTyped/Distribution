package typings.awsSdk.opensearchMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSearch extends Service {
  
  /**
    * Allows the remote domain owner to accept an inbound cross-cluster connection request.
    */
  def acceptInboundConnection(): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  def acceptInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInboundConnectionResponse, Unit]): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the remote domain owner to accept an inbound cross-cluster connection request.
    */
  def acceptInboundConnection(params: AcceptInboundConnectionRequest): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  def acceptInboundConnection(
    params: AcceptInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInboundConnectionResponse, Unit]
  ): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Attaches tags to an existing domain. Tags are a set of case-sensitive key value pairs. An domain can have up to 10 tags. See  Tagging Amazon OpenSearch Service domains for more information. 
    */
  def addTags(): Request[js.Object, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches tags to an existing domain. Tags are a set of case-sensitive key value pairs. An domain can have up to 10 tags. See  Tagging Amazon OpenSearch Service domains for more information. 
    */
  def addTags(params: AddTagsRequest): Request[js.Object, AWSError] = js.native
  def addTags(params: AddTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a package with an Amazon OpenSearch Service domain.
    */
  def associatePackage(): Request[AssociatePackageResponse, AWSError] = js.native
  def associatePackage(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePackageResponse, Unit]): Request[AssociatePackageResponse, AWSError] = js.native
  /**
    * Associates a package with an Amazon OpenSearch Service domain.
    */
  def associatePackage(params: AssociatePackageRequest): Request[AssociatePackageResponse, AWSError] = js.native
  def associatePackage(
    params: AssociatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePackageResponse, Unit]
  ): Request[AssociatePackageResponse, AWSError] = js.native
  
  /**
    * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state. 
    */
  def cancelServiceSoftwareUpdate(): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelServiceSoftwareUpdate(callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceSoftwareUpdateResponse, Unit]): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state. 
    */
  def cancelServiceSoftwareUpdate(params: CancelServiceSoftwareUpdateRequest): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelServiceSoftwareUpdate(
    params: CancelServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceSoftwareUpdateResponse, Unit]
  ): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  
  @JSName("config")
  var config_OpenSearch: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Amazon OpenSearch Service domain. For more information, see Creating and managing Amazon OpenSearch Service domains  in the Amazon OpenSearch Service Developer Guide. 
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a new Amazon OpenSearch Service domain. For more information, see Creating and managing Amazon OpenSearch Service domains  in the Amazon OpenSearch Service Developer Guide. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    * Creates a new cross-cluster connection from a local OpenSearch domain to a remote OpenSearch domain.
    */
  def createOutboundConnection(): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  def createOutboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateOutboundConnectionResponse, Unit]): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  /**
    * Creates a new cross-cluster connection from a local OpenSearch domain to a remote OpenSearch domain.
    */
  def createOutboundConnection(params: CreateOutboundConnectionRequest): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  def createOutboundConnection(
    params: CreateOutboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOutboundConnectionResponse, Unit]
  ): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  
  /**
    * Create a package for use with Amazon OpenSearch Service domains.
    */
  def createPackage(): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]): Request[CreatePackageResponse, AWSError] = js.native
  /**
    * Create a package for use with Amazon OpenSearch Service domains.
    */
  def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(
    params: CreatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]
  ): Request[CreatePackageResponse, AWSError] = js.native
  
  /**
    * Permanently deletes the specified domain and all of its data. Once a domain is deleted, it cannot be recovered. 
    */
  def deleteDomain(): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]): Request[DeleteDomainResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified domain and all of its data. Once a domain is deleted, it cannot be recovered. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]
  ): Request[DeleteDomainResponse, AWSError] = js.native
  
  /**
    * Allows the remote domain owner to delete an existing inbound cross-cluster connection.
    */
  def deleteInboundConnection(): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  def deleteInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInboundConnectionResponse, Unit]): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the remote domain owner to delete an existing inbound cross-cluster connection.
    */
  def deleteInboundConnection(params: DeleteInboundConnectionRequest): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  def deleteInboundConnection(
    params: DeleteInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInboundConnectionResponse, Unit]
  ): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Allows the local domain owner to delete an existing outbound cross-cluster connection.
    */
  def deleteOutboundConnection(): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  def deleteOutboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutboundConnectionResponse, Unit]): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the local domain owner to delete an existing outbound cross-cluster connection.
    */
  def deleteOutboundConnection(params: DeleteOutboundConnectionRequest): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  def deleteOutboundConnection(
    params: DeleteOutboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutboundConnectionResponse, Unit]
  ): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  
  /**
    * Deletes the package.
    */
  def deletePackage(): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]): Request[DeletePackageResponse, AWSError] = js.native
  /**
    * Deletes the package.
    */
  def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(
    params: DeletePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]
  ): Request[DeletePackageResponse, AWSError] = js.native
  
  /**
    * Returns domain configuration information about the specified domain, including the domain ID, domain endpoint, and domain ARN. 
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified domain, including the domain ID, domain endpoint, and domain ARN. 
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
  
  /**
    * Provides scheduled Auto-Tune action details for the domain, such as Auto-Tune action type, description, severity, and scheduled date. 
    */
  def describeDomainAutoTunes(): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  /**
    * Provides scheduled Auto-Tune action details for the domain, such as Auto-Tune action type, description, severity, and scheduled date. 
    */
  def describeDomainAutoTunes(params: DescribeDomainAutoTunesRequest): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(
    params: DescribeDomainAutoTunesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]
  ): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  
  /**
    * Returns information about the current blue/green deployment happening on a domain, including a change ID, status, and progress stages.
    */
  def describeDomainChangeProgress(): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  /**
    * Returns information about the current blue/green deployment happening on a domain, including a change ID, status, and progress stages.
    */
  def describeDomainChangeProgress(params: DescribeDomainChangeProgressRequest): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(
    params: DescribeDomainChangeProgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]
  ): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  
  /**
    * Provides cluster configuration information about the specified domain, such as the state, creation date, update version, and update date for cluster options. 
    */
  def describeDomainConfig(): Request[DescribeDomainConfigResponse, AWSError] = js.native
  def describeDomainConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigResponse, Unit]): Request[DescribeDomainConfigResponse, AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified domain, such as the state, creation date, update version, and update date for cluster options. 
    */
  def describeDomainConfig(params: DescribeDomainConfigRequest): Request[DescribeDomainConfigResponse, AWSError] = js.native
  def describeDomainConfig(
    params: DescribeDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigResponse, Unit]
  ): Request[DescribeDomainConfigResponse, AWSError] = js.native
  
  /**
    * Returns domain configuration information about the specified domains, including the domain ID, domain endpoint, and domain ARN. 
    */
  def describeDomains(): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]): Request[DescribeDomainsResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified domains, including the domain ID, domain endpoint, and domain ARN. 
    */
  def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(
    params: DescribeDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]
  ): Request[DescribeDomainsResponse, AWSError] = js.native
  
  /**
    * Lists all the inbound cross-cluster connections for a remote domain.
    */
  def describeInboundConnections(): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  def describeInboundConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundConnectionsResponse, Unit]): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the inbound cross-cluster connections for a remote domain.
    */
  def describeInboundConnections(params: DescribeInboundConnectionsRequest): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  def describeInboundConnections(
    params: DescribeInboundConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundConnectionsResponse, Unit]
  ): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  
  /**
    *  Describe the limits for a given instance type and OpenSearch or Elasticsearch version. When modifying an existing domain, specify the  DomainName  to see which limits you can modify. 
    */
  def describeInstanceTypeLimits(): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  def describeInstanceTypeLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeLimitsResponse, Unit]): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  /**
    *  Describe the limits for a given instance type and OpenSearch or Elasticsearch version. When modifying an existing domain, specify the  DomainName  to see which limits you can modify. 
    */
  def describeInstanceTypeLimits(params: DescribeInstanceTypeLimitsRequest): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  def describeInstanceTypeLimits(
    params: DescribeInstanceTypeLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  
  /**
    * Lists all the outbound cross-cluster connections for a local domain.
    */
  def describeOutboundConnections(): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  def describeOutboundConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOutboundConnectionsResponse, Unit]): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the outbound cross-cluster connections for a local domain.
    */
  def describeOutboundConnections(params: DescribeOutboundConnectionsRequest): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  def describeOutboundConnections(
    params: DescribeOutboundConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOutboundConnectionsResponse, Unit]
  ): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  
  /**
    * Describes all packages available to Amazon OpenSearch Service domains. Includes options for filtering, limiting the number of results, and pagination. 
    */
  def describePackages(): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]): Request[DescribePackagesResponse, AWSError] = js.native
  /**
    * Describes all packages available to Amazon OpenSearch Service domains. Includes options for filtering, limiting the number of results, and pagination. 
    */
  def describePackages(params: DescribePackagesRequest): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(
    params: DescribePackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]
  ): Request[DescribePackagesResponse, AWSError] = js.native
  
  /**
    * Lists available reserved OpenSearch instance offerings.
    */
  def describeReservedInstanceOfferings(): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedInstanceOfferings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstanceOfferingsResponse, Unit]
  ): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  /**
    * Lists available reserved OpenSearch instance offerings.
    */
  def describeReservedInstanceOfferings(params: DescribeReservedInstanceOfferingsRequest): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedInstanceOfferings(
    params: DescribeReservedInstanceOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstanceOfferingsResponse, Unit]
  ): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  
  /**
    * Returns information about reserved OpenSearch instances for this account.
    */
  def describeReservedInstances(): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  def describeReservedInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResponse, Unit]): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  /**
    * Returns information about reserved OpenSearch instances for this account.
    */
  def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  def describeReservedInstances(
    params: DescribeReservedInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResponse, Unit]
  ): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  
  /**
    * Dissociates a package from the Amazon OpenSearch Service domain.
    */
  def dissociatePackage(): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]): Request[DissociatePackageResponse, AWSError] = js.native
  /**
    * Dissociates a package from the Amazon OpenSearch Service domain.
    */
  def dissociatePackage(params: DissociatePackageRequest): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(
    params: DissociatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]
  ): Request[DissociatePackageResponse, AWSError] = js.native
  
  /**
    *  Returns a list of upgrade-compatible versions of OpenSearch/Elasticsearch. You can optionally pass a  DomainName  to get all upgrade-compatible versions of OpenSearch/Elasticsearch for that specific domain. 
    */
  def getCompatibleVersions(): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  def getCompatibleVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleVersionsResponse, Unit]): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  /**
    *  Returns a list of upgrade-compatible versions of OpenSearch/Elasticsearch. You can optionally pass a  DomainName  to get all upgrade-compatible versions of OpenSearch/Elasticsearch for that specific domain. 
    */
  def getCompatibleVersions(params: GetCompatibleVersionsRequest): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  def getCompatibleVersions(
    params: GetCompatibleVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleVersionsResponse, Unit]
  ): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of package versions, along with their creation time and commit message.
    */
  def getPackageVersionHistory(): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  /**
    * Returns a list of package versions, along with their creation time and commit message.
    */
  def getPackageVersionHistory(params: GetPackageVersionHistoryRequest): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(
    params: GetPackageVersionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]
  ): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the complete history of the last 10 upgrades performed on the domain.
    */
  def getUpgradeHistory(): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades performed on the domain.
    */
  def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(
    params: GetUpgradeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]
  ): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check performed on the domain. 
    */
  def getUpgradeStatus(): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]): Request[GetUpgradeStatusResponse, AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check performed on the domain. 
    */
  def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(
    params: GetUpgradeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]
  ): Request[GetUpgradeStatusResponse, AWSError] = js.native
  
  /**
    * Returns the names of all domains owned by the current user's account.
    */
  def listDomainNames(): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]): Request[ListDomainNamesResponse, AWSError] = js.native
  /**
    * Returns the names of all domains owned by the current user's account.
    */
  def listDomainNames(params: ListDomainNamesRequest): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(
    params: ListDomainNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]
  ): Request[ListDomainNamesResponse, AWSError] = js.native
  
  /**
    * Lists all Amazon OpenSearch Service domains associated with the package.
    */
  def listDomainsForPackage(): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]): Request[ListDomainsForPackageResponse, AWSError] = js.native
  /**
    * Lists all Amazon OpenSearch Service domains associated with the package.
    */
  def listDomainsForPackage(params: ListDomainsForPackageRequest): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(
    params: ListDomainsForPackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]
  ): Request[ListDomainsForPackageResponse, AWSError] = js.native
  
  /**
    * 
    */
  def listInstanceTypeDetails(): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  def listInstanceTypeDetails(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceTypeDetailsResponse, Unit]): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  /**
    * 
    */
  def listInstanceTypeDetails(params: ListInstanceTypeDetailsRequest): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  def listInstanceTypeDetails(
    params: ListInstanceTypeDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceTypeDetailsResponse, Unit]
  ): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  
  /**
    * Lists all packages associated with the Amazon OpenSearch Service domain.
    */
  def listPackagesForDomain(): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]): Request[ListPackagesForDomainResponse, AWSError] = js.native
  /**
    * Lists all packages associated with the Amazon OpenSearch Service domain.
    */
  def listPackagesForDomain(params: ListPackagesForDomainRequest): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(
    params: ListPackagesForDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]
  ): Request[ListPackagesForDomainResponse, AWSError] = js.native
  
  /**
    * Returns all tags for the given domain.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns all tags for the given domain.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * List all supported versions of OpenSearch and Elasticsearch.
    */
  def listVersions(): Request[ListVersionsResponse, AWSError] = js.native
  def listVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsResponse, Unit]): Request[ListVersionsResponse, AWSError] = js.native
  /**
    * List all supported versions of OpenSearch and Elasticsearch.
    */
  def listVersions(params: ListVersionsRequest): Request[ListVersionsResponse, AWSError] = js.native
  def listVersions(
    params: ListVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsResponse, Unit]
  ): Request[ListVersionsResponse, AWSError] = js.native
  
  /**
    * Allows you to purchase reserved OpenSearch instances.
    */
  def purchaseReservedInstanceOffering(): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedInstanceOffering(
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstanceOfferingResponse, Unit]
  ): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  /**
    * Allows you to purchase reserved OpenSearch instances.
    */
  def purchaseReservedInstanceOffering(params: PurchaseReservedInstanceOfferingRequest): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedInstanceOffering(
    params: PurchaseReservedInstanceOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstanceOfferingResponse, Unit]
  ): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  
  /**
    * Allows the remote domain owner to reject an inbound cross-cluster connection request.
    */
  def rejectInboundConnection(): Request[RejectInboundConnectionResponse, AWSError] = js.native
  def rejectInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ RejectInboundConnectionResponse, Unit]): Request[RejectInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the remote domain owner to reject an inbound cross-cluster connection request.
    */
  def rejectInboundConnection(params: RejectInboundConnectionRequest): Request[RejectInboundConnectionResponse, AWSError] = js.native
  def rejectInboundConnection(
    params: RejectInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectInboundConnectionResponse, Unit]
  ): Request[RejectInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Removes the specified set of tags from the given domain.
    */
  def removeTags(): Request[js.Object, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified set of tags from the given domain.
    */
  def removeTags(params: RemoveTagsRequest): Request[js.Object, AWSError] = js.native
  def removeTags(params: RemoveTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Schedules a service software update for an Amazon OpenSearch Service domain.
    */
  def startServiceSoftwareUpdate(): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  def startServiceSoftwareUpdate(callback: js.Function2[/* err */ AWSError, /* data */ StartServiceSoftwareUpdateResponse, Unit]): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon OpenSearch Service domain.
    */
  def startServiceSoftwareUpdate(params: StartServiceSoftwareUpdateRequest): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  def startServiceSoftwareUpdate(
    params: StartServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartServiceSoftwareUpdateResponse, Unit]
  ): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  
  /**
    * Modifies the cluster configuration of the specified domain, such as setting the instance type and the number of instances. 
    */
  def updateDomainConfig(): Request[UpdateDomainConfigResponse, AWSError] = js.native
  def updateDomainConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigResponse, Unit]): Request[UpdateDomainConfigResponse, AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified domain, such as setting the instance type and the number of instances. 
    */
  def updateDomainConfig(params: UpdateDomainConfigRequest): Request[UpdateDomainConfigResponse, AWSError] = js.native
  def updateDomainConfig(
    params: UpdateDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigResponse, Unit]
  ): Request[UpdateDomainConfigResponse, AWSError] = js.native
  
  /**
    * Updates a package for use with Amazon OpenSearch Service domains.
    */
  def updatePackage(): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]): Request[UpdatePackageResponse, AWSError] = js.native
  /**
    * Updates a package for use with Amazon OpenSearch Service domains.
    */
  def updatePackage(params: UpdatePackageRequest): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(
    params: UpdatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]
  ): Request[UpdatePackageResponse, AWSError] = js.native
  
  /**
    * Allows you to either upgrade your domain or perform an upgrade eligibility check to a compatible version of OpenSearch or Elasticsearch. 
    */
  def upgradeDomain(): Request[UpgradeDomainResponse, AWSError] = js.native
  def upgradeDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpgradeDomainResponse, Unit]): Request[UpgradeDomainResponse, AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an upgrade eligibility check to a compatible version of OpenSearch or Elasticsearch. 
    */
  def upgradeDomain(params: UpgradeDomainRequest): Request[UpgradeDomainResponse, AWSError] = js.native
  def upgradeDomain(
    params: UpgradeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradeDomainResponse, Unit]
  ): Request[UpgradeDomainResponse, AWSError] = js.native
}
