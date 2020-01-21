package typings.awsSdk.worklinkMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkLink extends Service {
  @JSName("config")
  var config_WorkLink: ConfigBase with ClientConfiguration = js.native
  /**
    * Specifies a domain to be associated to Amazon WorkLink.
    */
  def associateDomain(): Request[AssociateDomainResponse, AWSError] = js.native
  def associateDomain(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDomainResponse, Unit]): Request[AssociateDomainResponse, AWSError] = js.native
  /**
    * Specifies a domain to be associated to Amazon WorkLink.
    */
  def associateDomain(params: AssociateDomainRequest): Request[AssociateDomainResponse, AWSError] = js.native
  def associateDomain(
    params: AssociateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDomainResponse, Unit]
  ): Request[AssociateDomainResponse, AWSError] = js.native
  /**
    * Associates a website authorization provider with a specified fleet. This is used to authorize users against associated websites in the company network.
    */
  def associateWebsiteAuthorizationProvider(): Request[AssociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  def associateWebsiteAuthorizationProvider(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebsiteAuthorizationProviderResponse, Unit]
  ): Request[AssociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  /**
    * Associates a website authorization provider with a specified fleet. This is used to authorize users against associated websites in the company network.
    */
  def associateWebsiteAuthorizationProvider(params: AssociateWebsiteAuthorizationProviderRequest): Request[AssociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  def associateWebsiteAuthorizationProvider(
    params: AssociateWebsiteAuthorizationProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebsiteAuthorizationProviderResponse, Unit]
  ): Request[AssociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(): Request[AssociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def associateWebsiteCertificateAuthority(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebsiteCertificateAuthorityResponse, Unit]
  ): Request[AssociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(params: AssociateWebsiteCertificateAuthorityRequest): Request[AssociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def associateWebsiteCertificateAuthority(
    params: AssociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebsiteCertificateAuthorityResponse, Unit]
  ): Request[AssociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]): Request[CreateFleetResponse, AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]
  ): Request[CreateFleetResponse, AWSError] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]): Request[DeleteFleetResponse, AWSError] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]
  ): Request[DeleteFleetResponse, AWSError] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(): Request[DescribeAuditStreamConfigurationResponse, AWSError] = js.native
  def describeAuditStreamConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditStreamConfigurationResponse, Unit]
  ): Request[DescribeAuditStreamConfigurationResponse, AWSError] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(params: DescribeAuditStreamConfigurationRequest): Request[DescribeAuditStreamConfigurationResponse, AWSError] = js.native
  def describeAuditStreamConfiguration(
    params: DescribeAuditStreamConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAuditStreamConfigurationResponse, Unit]
  ): Request[DescribeAuditStreamConfigurationResponse, AWSError] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(): Request[DescribeCompanyNetworkConfigurationResponse, AWSError] = js.native
  def describeCompanyNetworkConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompanyNetworkConfigurationResponse, Unit]
  ): Request[DescribeCompanyNetworkConfigurationResponse, AWSError] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(params: DescribeCompanyNetworkConfigurationRequest): Request[DescribeCompanyNetworkConfigurationResponse, AWSError] = js.native
  def describeCompanyNetworkConfiguration(
    params: DescribeCompanyNetworkConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCompanyNetworkConfigurationResponse, Unit]
  ): Request[DescribeCompanyNetworkConfigurationResponse, AWSError] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]
  ): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(): Request[DescribeDevicePolicyConfigurationResponse, AWSError] = js.native
  def describeDevicePolicyConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDevicePolicyConfigurationResponse, Unit]
  ): Request[DescribeDevicePolicyConfigurationResponse, AWSError] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(params: DescribeDevicePolicyConfigurationRequest): Request[DescribeDevicePolicyConfigurationResponse, AWSError] = js.native
  def describeDevicePolicyConfiguration(
    params: DescribeDevicePolicyConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDevicePolicyConfigurationResponse, Unit]
  ): Request[DescribeDevicePolicyConfigurationResponse, AWSError] = js.native
  /**
    * Provides information about the domain.
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * Provides information about the domain.
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(): Request[DescribeFleetMetadataResponse, AWSError] = js.native
  def describeFleetMetadata(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetMetadataResponse, Unit]): Request[DescribeFleetMetadataResponse, AWSError] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(params: DescribeFleetMetadataRequest): Request[DescribeFleetMetadataResponse, AWSError] = js.native
  def describeFleetMetadata(
    params: DescribeFleetMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetMetadataResponse, Unit]
  ): Request[DescribeFleetMetadataResponse, AWSError] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(): Request[DescribeIdentityProviderConfigurationResponse, AWSError] = js.native
  def describeIdentityProviderConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityProviderConfigurationResponse, Unit]
  ): Request[DescribeIdentityProviderConfigurationResponse, AWSError] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(params: DescribeIdentityProviderConfigurationRequest): Request[DescribeIdentityProviderConfigurationResponse, AWSError] = js.native
  def describeIdentityProviderConfiguration(
    params: DescribeIdentityProviderConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityProviderConfigurationResponse, Unit]
  ): Request[DescribeIdentityProviderConfigurationResponse, AWSError] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(): Request[DescribeWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def describeWebsiteCertificateAuthority(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWebsiteCertificateAuthorityResponse, Unit]
  ): Request[DescribeWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(params: DescribeWebsiteCertificateAuthorityRequest): Request[DescribeWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def describeWebsiteCertificateAuthority(
    params: DescribeWebsiteCertificateAuthorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWebsiteCertificateAuthorityResponse, Unit]
  ): Request[DescribeWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon WorkLink. 
    */
  def disassociateDomain(): Request[DisassociateDomainResponse, AWSError] = js.native
  def disassociateDomain(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDomainResponse, Unit]): Request[DisassociateDomainResponse, AWSError] = js.native
  /**
    * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon WorkLink. 
    */
  def disassociateDomain(params: DisassociateDomainRequest): Request[DisassociateDomainResponse, AWSError] = js.native
  def disassociateDomain(
    params: DisassociateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDomainResponse, Unit]
  ): Request[DisassociateDomainResponse, AWSError] = js.native
  /**
    * Disassociates a website authorization provider from a specified fleet. After the disassociation, users can't load any associated websites that require this authorization provider.
    */
  def disassociateWebsiteAuthorizationProvider(): Request[DisassociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  def disassociateWebsiteAuthorizationProvider(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWebsiteAuthorizationProviderResponse, 
      Unit
    ]
  ): Request[DisassociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  /**
    * Disassociates a website authorization provider from a specified fleet. After the disassociation, users can't load any associated websites that require this authorization provider.
    */
  def disassociateWebsiteAuthorizationProvider(params: DisassociateWebsiteAuthorizationProviderRequest): Request[DisassociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  def disassociateWebsiteAuthorizationProvider(
    params: DisassociateWebsiteAuthorizationProviderRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateWebsiteAuthorizationProviderResponse, 
      Unit
    ]
  ): Request[DisassociateWebsiteAuthorizationProviderResponse, AWSError] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(): Request[DisassociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def disassociateWebsiteCertificateAuthority(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebsiteCertificateAuthorityResponse, Unit]
  ): Request[DisassociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(params: DisassociateWebsiteCertificateAuthorityRequest): Request[DisassociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  def disassociateWebsiteCertificateAuthority(
    params: DisassociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebsiteCertificateAuthorityResponse, Unit]
  ): Request[DisassociateWebsiteCertificateAuthorityResponse, AWSError] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]
  ): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Retrieves a list of domains associated to a specified fleet.
    */
  def listDomains(): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Retrieves a list of domains associated to a specified fleet.
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]
  ): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]): Request[ListFleetsResponse, AWSError] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(
    params: ListFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]
  ): Request[ListFleetsResponse, AWSError] = js.native
  /**
    * Retrieves a list of website authorization providers associated with a specified fleet.
    */
  def listWebsiteAuthorizationProviders(): Request[ListWebsiteAuthorizationProvidersResponse, AWSError] = js.native
  def listWebsiteAuthorizationProviders(
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebsiteAuthorizationProvidersResponse, Unit]
  ): Request[ListWebsiteAuthorizationProvidersResponse, AWSError] = js.native
  /**
    * Retrieves a list of website authorization providers associated with a specified fleet.
    */
  def listWebsiteAuthorizationProviders(params: ListWebsiteAuthorizationProvidersRequest): Request[ListWebsiteAuthorizationProvidersResponse, AWSError] = js.native
  def listWebsiteAuthorizationProviders(
    params: ListWebsiteAuthorizationProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebsiteAuthorizationProvidersResponse, Unit]
  ): Request[ListWebsiteAuthorizationProvidersResponse, AWSError] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(): Request[ListWebsiteCertificateAuthoritiesResponse, AWSError] = js.native
  def listWebsiteCertificateAuthorities(
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebsiteCertificateAuthoritiesResponse, Unit]
  ): Request[ListWebsiteCertificateAuthoritiesResponse, AWSError] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(params: ListWebsiteCertificateAuthoritiesRequest): Request[ListWebsiteCertificateAuthoritiesResponse, AWSError] = js.native
  def listWebsiteCertificateAuthorities(
    params: ListWebsiteCertificateAuthoritiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebsiteCertificateAuthoritiesResponse, Unit]
  ): Request[ListWebsiteCertificateAuthoritiesResponse, AWSError] = js.native
  /**
    * Moves a domain to ACTIVE status if it was in the INACTIVE status.
    */
  def restoreDomainAccess(): Request[RestoreDomainAccessResponse, AWSError] = js.native
  def restoreDomainAccess(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDomainAccessResponse, Unit]): Request[RestoreDomainAccessResponse, AWSError] = js.native
  /**
    * Moves a domain to ACTIVE status if it was in the INACTIVE status.
    */
  def restoreDomainAccess(params: RestoreDomainAccessRequest): Request[RestoreDomainAccessResponse, AWSError] = js.native
  def restoreDomainAccess(
    params: RestoreDomainAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDomainAccessResponse, Unit]
  ): Request[RestoreDomainAccessResponse, AWSError] = js.native
  /**
    * Moves a domain to INACTIVE status if it was in the ACTIVE status.
    */
  def revokeDomainAccess(): Request[RevokeDomainAccessResponse, AWSError] = js.native
  def revokeDomainAccess(callback: js.Function2[/* err */ AWSError, /* data */ RevokeDomainAccessResponse, Unit]): Request[RevokeDomainAccessResponse, AWSError] = js.native
  /**
    * Moves a domain to INACTIVE status if it was in the ACTIVE status.
    */
  def revokeDomainAccess(params: RevokeDomainAccessRequest): Request[RevokeDomainAccessResponse, AWSError] = js.native
  def revokeDomainAccess(
    params: RevokeDomainAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeDomainAccessResponse, Unit]
  ): Request[RevokeDomainAccessResponse, AWSError] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(): Request[SignOutUserResponse, AWSError] = js.native
  def signOutUser(callback: js.Function2[/* err */ AWSError, /* data */ SignOutUserResponse, Unit]): Request[SignOutUserResponse, AWSError] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(params: SignOutUserRequest): Request[SignOutUserResponse, AWSError] = js.native
  def signOutUser(
    params: SignOutUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SignOutUserResponse, Unit]
  ): Request[SignOutUserResponse, AWSError] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(): Request[UpdateAuditStreamConfigurationResponse, AWSError] = js.native
  def updateAuditStreamConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuditStreamConfigurationResponse, Unit]
  ): Request[UpdateAuditStreamConfigurationResponse, AWSError] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(params: UpdateAuditStreamConfigurationRequest): Request[UpdateAuditStreamConfigurationResponse, AWSError] = js.native
  def updateAuditStreamConfiguration(
    params: UpdateAuditStreamConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuditStreamConfigurationResponse, Unit]
  ): Request[UpdateAuditStreamConfigurationResponse, AWSError] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(): Request[UpdateCompanyNetworkConfigurationResponse, AWSError] = js.native
  def updateCompanyNetworkConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCompanyNetworkConfigurationResponse, Unit]
  ): Request[UpdateCompanyNetworkConfigurationResponse, AWSError] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(params: UpdateCompanyNetworkConfigurationRequest): Request[UpdateCompanyNetworkConfigurationResponse, AWSError] = js.native
  def updateCompanyNetworkConfiguration(
    params: UpdateCompanyNetworkConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCompanyNetworkConfigurationResponse, Unit]
  ): Request[UpdateCompanyNetworkConfigurationResponse, AWSError] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(): Request[UpdateDevicePolicyConfigurationResponse, AWSError] = js.native
  def updateDevicePolicyConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevicePolicyConfigurationResponse, Unit]
  ): Request[UpdateDevicePolicyConfigurationResponse, AWSError] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(params: UpdateDevicePolicyConfigurationRequest): Request[UpdateDevicePolicyConfigurationResponse, AWSError] = js.native
  def updateDevicePolicyConfiguration(
    params: UpdateDevicePolicyConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevicePolicyConfigurationResponse, Unit]
  ): Request[UpdateDevicePolicyConfigurationResponse, AWSError] = js.native
  /**
    * Updates domain metadata, such as DisplayName.
    */
  def updateDomainMetadata(): Request[UpdateDomainMetadataResponse, AWSError] = js.native
  def updateDomainMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainMetadataResponse, Unit]): Request[UpdateDomainMetadataResponse, AWSError] = js.native
  /**
    * Updates domain metadata, such as DisplayName.
    */
  def updateDomainMetadata(params: UpdateDomainMetadataRequest): Request[UpdateDomainMetadataResponse, AWSError] = js.native
  def updateDomainMetadata(
    params: UpdateDomainMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainMetadataResponse, Unit]
  ): Request[UpdateDomainMetadataResponse, AWSError] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(): Request[UpdateFleetMetadataResponse, AWSError] = js.native
  def updateFleetMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetMetadataResponse, Unit]): Request[UpdateFleetMetadataResponse, AWSError] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(params: UpdateFleetMetadataRequest): Request[UpdateFleetMetadataResponse, AWSError] = js.native
  def updateFleetMetadata(
    params: UpdateFleetMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetMetadataResponse, Unit]
  ): Request[UpdateFleetMetadataResponse, AWSError] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(): Request[UpdateIdentityProviderConfigurationResponse, AWSError] = js.native
  def updateIdentityProviderConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderConfigurationResponse, Unit]
  ): Request[UpdateIdentityProviderConfigurationResponse, AWSError] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(params: UpdateIdentityProviderConfigurationRequest): Request[UpdateIdentityProviderConfigurationResponse, AWSError] = js.native
  def updateIdentityProviderConfiguration(
    params: UpdateIdentityProviderConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderConfigurationResponse, Unit]
  ): Request[UpdateIdentityProviderConfigurationResponse, AWSError] = js.native
}

