package typings.awsSdk.clientsWorkspaceswebMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkSpacesWeb extends Service {
  
  /**
    * Associates a browser settings resource with a web portal.
    */
  def associateBrowserSettings(): Request[AssociateBrowserSettingsResponse, AWSError] = js.native
  def associateBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ AssociateBrowserSettingsResponse, Unit]): Request[AssociateBrowserSettingsResponse, AWSError] = js.native
  /**
    * Associates a browser settings resource with a web portal.
    */
  def associateBrowserSettings(params: AssociateBrowserSettingsRequest): Request[AssociateBrowserSettingsResponse, AWSError] = js.native
  def associateBrowserSettings(
    params: AssociateBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateBrowserSettingsResponse, Unit]
  ): Request[AssociateBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Associates a network settings resource with a web portal.
    */
  def associateNetworkSettings(): Request[AssociateNetworkSettingsResponse, AWSError] = js.native
  def associateNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ AssociateNetworkSettingsResponse, Unit]): Request[AssociateNetworkSettingsResponse, AWSError] = js.native
  /**
    * Associates a network settings resource with a web portal.
    */
  def associateNetworkSettings(params: AssociateNetworkSettingsRequest): Request[AssociateNetworkSettingsResponse, AWSError] = js.native
  def associateNetworkSettings(
    params: AssociateNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateNetworkSettingsResponse, Unit]
  ): Request[AssociateNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Associates a trust store with a web portal.
    */
  def associateTrustStore(): Request[AssociateTrustStoreResponse, AWSError] = js.native
  def associateTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrustStoreResponse, Unit]): Request[AssociateTrustStoreResponse, AWSError] = js.native
  /**
    * Associates a trust store with a web portal.
    */
  def associateTrustStore(params: AssociateTrustStoreRequest): Request[AssociateTrustStoreResponse, AWSError] = js.native
  def associateTrustStore(
    params: AssociateTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrustStoreResponse, Unit]
  ): Request[AssociateTrustStoreResponse, AWSError] = js.native
  
  /**
    * Associates a user settings resource with a web portal.
    */
  def associateUserSettings(): Request[AssociateUserSettingsResponse, AWSError] = js.native
  def associateUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserSettingsResponse, Unit]): Request[AssociateUserSettingsResponse, AWSError] = js.native
  /**
    * Associates a user settings resource with a web portal.
    */
  def associateUserSettings(params: AssociateUserSettingsRequest): Request[AssociateUserSettingsResponse, AWSError] = js.native
  def associateUserSettings(
    params: AssociateUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserSettingsResponse, Unit]
  ): Request[AssociateUserSettingsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_WorkSpacesWeb: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal, browser settings control how the browser will behave once a user starts a streaming session for the web portal. 
    */
  def createBrowserSettings(): Request[CreateBrowserSettingsResponse, AWSError] = js.native
  def createBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ CreateBrowserSettingsResponse, Unit]): Request[CreateBrowserSettingsResponse, AWSError] = js.native
  /**
    * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal, browser settings control how the browser will behave once a user starts a streaming session for the web portal. 
    */
  def createBrowserSettings(params: CreateBrowserSettingsRequest): Request[CreateBrowserSettingsResponse, AWSError] = js.native
  def createBrowserSettings(
    params: CreateBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBrowserSettingsResponse, Unit]
  ): Request[CreateBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Creates an identity provider resource that is then associated with a web portal.
    */
  def createIdentityProvider(): Request[CreateIdentityProviderResponse, AWSError] = js.native
  def createIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateIdentityProviderResponse, Unit]): Request[CreateIdentityProviderResponse, AWSError] = js.native
  /**
    * Creates an identity provider resource that is then associated with a web portal.
    */
  def createIdentityProvider(params: CreateIdentityProviderRequest): Request[CreateIdentityProviderResponse, AWSError] = js.native
  def createIdentityProvider(
    params: CreateIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIdentityProviderResponse, Unit]
  ): Request[CreateIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal, network settings define how streaming instances will connect with your specified VPC. 
    */
  def createNetworkSettings(): Request[CreateNetworkSettingsResponse, AWSError] = js.native
  def createNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkSettingsResponse, Unit]): Request[CreateNetworkSettingsResponse, AWSError] = js.native
  /**
    * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal, network settings define how streaming instances will connect with your specified VPC. 
    */
  def createNetworkSettings(params: CreateNetworkSettingsRequest): Request[CreateNetworkSettingsResponse, AWSError] = js.native
  def createNetworkSettings(
    params: CreateNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkSettingsResponse, Unit]
  ): Request[CreateNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Creates a web portal.
    */
  def createPortal(): Request[CreatePortalResponse, AWSError] = js.native
  def createPortal(callback: js.Function2[/* err */ AWSError, /* data */ CreatePortalResponse, Unit]): Request[CreatePortalResponse, AWSError] = js.native
  /**
    * Creates a web portal.
    */
  def createPortal(params: CreatePortalRequest): Request[CreatePortalResponse, AWSError] = js.native
  def createPortal(
    params: CreatePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePortalResponse, Unit]
  ): Request[CreatePortalResponse, AWSError] = js.native
  
  /**
    * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA) certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates that have been issued using any of the CAs in the trust store. If your organization has internal websites that use certificates issued by private CAs, you should add the private CA certificate to the trust store. 
    */
  def createTrustStore(): Request[CreateTrustStoreResponse, AWSError] = js.native
  def createTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrustStoreResponse, Unit]): Request[CreateTrustStoreResponse, AWSError] = js.native
  /**
    * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA) certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates that have been issued using any of the CAs in the trust store. If your organization has internal websites that use certificates issued by private CAs, you should add the private CA certificate to the trust store. 
    */
  def createTrustStore(params: CreateTrustStoreRequest): Request[CreateTrustStoreResponse, AWSError] = js.native
  def createTrustStore(
    params: CreateTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrustStoreResponse, Unit]
  ): Request[CreateTrustStoreResponse, AWSError] = js.native
  
  /**
    * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal, user settings control how users can transfer data between a streaming session and the their local devices. 
    */
  def createUserSettings(): Request[CreateUserSettingsResponse, AWSError] = js.native
  def createUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserSettingsResponse, Unit]): Request[CreateUserSettingsResponse, AWSError] = js.native
  /**
    * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal, user settings control how users can transfer data between a streaming session and the their local devices. 
    */
  def createUserSettings(params: CreateUserSettingsRequest): Request[CreateUserSettingsResponse, AWSError] = js.native
  def createUserSettings(
    params: CreateUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserSettingsResponse, Unit]
  ): Request[CreateUserSettingsResponse, AWSError] = js.native
  
  /**
    * Deletes browser settings.
    */
  def deleteBrowserSettings(): Request[DeleteBrowserSettingsResponse, AWSError] = js.native
  def deleteBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBrowserSettingsResponse, Unit]): Request[DeleteBrowserSettingsResponse, AWSError] = js.native
  /**
    * Deletes browser settings.
    */
  def deleteBrowserSettings(params: DeleteBrowserSettingsRequest): Request[DeleteBrowserSettingsResponse, AWSError] = js.native
  def deleteBrowserSettings(
    params: DeleteBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBrowserSettingsResponse, Unit]
  ): Request[DeleteBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Deletes the identity provider.
    */
  def deleteIdentityProvider(): Request[DeleteIdentityProviderResponse, AWSError] = js.native
  def deleteIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityProviderResponse, Unit]): Request[DeleteIdentityProviderResponse, AWSError] = js.native
  /**
    * Deletes the identity provider.
    */
  def deleteIdentityProvider(params: DeleteIdentityProviderRequest): Request[DeleteIdentityProviderResponse, AWSError] = js.native
  def deleteIdentityProvider(
    params: DeleteIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityProviderResponse, Unit]
  ): Request[DeleteIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Deletes network settings.
    */
  def deleteNetworkSettings(): Request[DeleteNetworkSettingsResponse, AWSError] = js.native
  def deleteNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkSettingsResponse, Unit]): Request[DeleteNetworkSettingsResponse, AWSError] = js.native
  /**
    * Deletes network settings.
    */
  def deleteNetworkSettings(params: DeleteNetworkSettingsRequest): Request[DeleteNetworkSettingsResponse, AWSError] = js.native
  def deleteNetworkSettings(
    params: DeleteNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkSettingsResponse, Unit]
  ): Request[DeleteNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Deletes a web portal.
    */
  def deletePortal(): Request[DeletePortalResponse, AWSError] = js.native
  def deletePortal(callback: js.Function2[/* err */ AWSError, /* data */ DeletePortalResponse, Unit]): Request[DeletePortalResponse, AWSError] = js.native
  /**
    * Deletes a web portal.
    */
  def deletePortal(params: DeletePortalRequest): Request[DeletePortalResponse, AWSError] = js.native
  def deletePortal(
    params: DeletePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePortalResponse, Unit]
  ): Request[DeletePortalResponse, AWSError] = js.native
  
  /**
    * Deletes the trust store.
    */
  def deleteTrustStore(): Request[DeleteTrustStoreResponse, AWSError] = js.native
  def deleteTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrustStoreResponse, Unit]): Request[DeleteTrustStoreResponse, AWSError] = js.native
  /**
    * Deletes the trust store.
    */
  def deleteTrustStore(params: DeleteTrustStoreRequest): Request[DeleteTrustStoreResponse, AWSError] = js.native
  def deleteTrustStore(
    params: DeleteTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrustStoreResponse, Unit]
  ): Request[DeleteTrustStoreResponse, AWSError] = js.native
  
  /**
    * Deletes user settings.
    */
  def deleteUserSettings(): Request[DeleteUserSettingsResponse, AWSError] = js.native
  def deleteUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserSettingsResponse, Unit]): Request[DeleteUserSettingsResponse, AWSError] = js.native
  /**
    * Deletes user settings.
    */
  def deleteUserSettings(params: DeleteUserSettingsRequest): Request[DeleteUserSettingsResponse, AWSError] = js.native
  def deleteUserSettings(
    params: DeleteUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserSettingsResponse, Unit]
  ): Request[DeleteUserSettingsResponse, AWSError] = js.native
  
  /**
    * Disassociates browser settings from a web portal.
    */
  def disassociateBrowserSettings(): Request[DisassociateBrowserSettingsResponse, AWSError] = js.native
  def disassociateBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateBrowserSettingsResponse, Unit]): Request[DisassociateBrowserSettingsResponse, AWSError] = js.native
  /**
    * Disassociates browser settings from a web portal.
    */
  def disassociateBrowserSettings(params: DisassociateBrowserSettingsRequest): Request[DisassociateBrowserSettingsResponse, AWSError] = js.native
  def disassociateBrowserSettings(
    params: DisassociateBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateBrowserSettingsResponse, Unit]
  ): Request[DisassociateBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Disassociates network settings from a web portal.
    */
  def disassociateNetworkSettings(): Request[DisassociateNetworkSettingsResponse, AWSError] = js.native
  def disassociateNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateNetworkSettingsResponse, Unit]): Request[DisassociateNetworkSettingsResponse, AWSError] = js.native
  /**
    * Disassociates network settings from a web portal.
    */
  def disassociateNetworkSettings(params: DisassociateNetworkSettingsRequest): Request[DisassociateNetworkSettingsResponse, AWSError] = js.native
  def disassociateNetworkSettings(
    params: DisassociateNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateNetworkSettingsResponse, Unit]
  ): Request[DisassociateNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Disassociates a trust store from a web portal.
    */
  def disassociateTrustStore(): Request[DisassociateTrustStoreResponse, AWSError] = js.native
  def disassociateTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrustStoreResponse, Unit]): Request[DisassociateTrustStoreResponse, AWSError] = js.native
  /**
    * Disassociates a trust store from a web portal.
    */
  def disassociateTrustStore(params: DisassociateTrustStoreRequest): Request[DisassociateTrustStoreResponse, AWSError] = js.native
  def disassociateTrustStore(
    params: DisassociateTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrustStoreResponse, Unit]
  ): Request[DisassociateTrustStoreResponse, AWSError] = js.native
  
  /**
    * Disassociates user settings from a web portal.
    */
  def disassociateUserSettings(): Request[DisassociateUserSettingsResponse, AWSError] = js.native
  def disassociateUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserSettingsResponse, Unit]): Request[DisassociateUserSettingsResponse, AWSError] = js.native
  /**
    * Disassociates user settings from a web portal.
    */
  def disassociateUserSettings(params: DisassociateUserSettingsRequest): Request[DisassociateUserSettingsResponse, AWSError] = js.native
  def disassociateUserSettings(
    params: DisassociateUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserSettingsResponse, Unit]
  ): Request[DisassociateUserSettingsResponse, AWSError] = js.native
  
  /**
    * Gets browser settings.
    */
  def getBrowserSettings(): Request[GetBrowserSettingsResponse, AWSError] = js.native
  def getBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetBrowserSettingsResponse, Unit]): Request[GetBrowserSettingsResponse, AWSError] = js.native
  /**
    * Gets browser settings.
    */
  def getBrowserSettings(params: GetBrowserSettingsRequest): Request[GetBrowserSettingsResponse, AWSError] = js.native
  def getBrowserSettings(
    params: GetBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBrowserSettingsResponse, Unit]
  ): Request[GetBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Gets the identity provider.
    */
  def getIdentityProvider(): Request[GetIdentityProviderResponse, AWSError] = js.native
  def getIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityProviderResponse, Unit]): Request[GetIdentityProviderResponse, AWSError] = js.native
  /**
    * Gets the identity provider.
    */
  def getIdentityProvider(params: GetIdentityProviderRequest): Request[GetIdentityProviderResponse, AWSError] = js.native
  def getIdentityProvider(
    params: GetIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityProviderResponse, Unit]
  ): Request[GetIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Gets the network settings.
    */
  def getNetworkSettings(): Request[GetNetworkSettingsResponse, AWSError] = js.native
  def getNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkSettingsResponse, Unit]): Request[GetNetworkSettingsResponse, AWSError] = js.native
  /**
    * Gets the network settings.
    */
  def getNetworkSettings(params: GetNetworkSettingsRequest): Request[GetNetworkSettingsResponse, AWSError] = js.native
  def getNetworkSettings(
    params: GetNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkSettingsResponse, Unit]
  ): Request[GetNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Gets the web portal.
    */
  def getPortal(): Request[GetPortalResponse, AWSError] = js.native
  def getPortal(callback: js.Function2[/* err */ AWSError, /* data */ GetPortalResponse, Unit]): Request[GetPortalResponse, AWSError] = js.native
  /**
    * Gets the web portal.
    */
  def getPortal(params: GetPortalRequest): Request[GetPortalResponse, AWSError] = js.native
  def getPortal(
    params: GetPortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPortalResponse, Unit]
  ): Request[GetPortalResponse, AWSError] = js.native
  
  /**
    * Gets the service provider metadata.
    */
  def getPortalServiceProviderMetadata(): Request[GetPortalServiceProviderMetadataResponse, AWSError] = js.native
  def getPortalServiceProviderMetadata(
    callback: js.Function2[/* err */ AWSError, /* data */ GetPortalServiceProviderMetadataResponse, Unit]
  ): Request[GetPortalServiceProviderMetadataResponse, AWSError] = js.native
  /**
    * Gets the service provider metadata.
    */
  def getPortalServiceProviderMetadata(params: GetPortalServiceProviderMetadataRequest): Request[GetPortalServiceProviderMetadataResponse, AWSError] = js.native
  def getPortalServiceProviderMetadata(
    params: GetPortalServiceProviderMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPortalServiceProviderMetadataResponse, Unit]
  ): Request[GetPortalServiceProviderMetadataResponse, AWSError] = js.native
  
  /**
    * Gets the trust store.
    */
  def getTrustStore(): Request[GetTrustStoreResponse, AWSError] = js.native
  def getTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ GetTrustStoreResponse, Unit]): Request[GetTrustStoreResponse, AWSError] = js.native
  /**
    * Gets the trust store.
    */
  def getTrustStore(params: GetTrustStoreRequest): Request[GetTrustStoreResponse, AWSError] = js.native
  def getTrustStore(
    params: GetTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrustStoreResponse, Unit]
  ): Request[GetTrustStoreResponse, AWSError] = js.native
  
  /**
    * Gets the trust store certificate.
    */
  def getTrustStoreCertificate(): Request[GetTrustStoreCertificateResponse, AWSError] = js.native
  def getTrustStoreCertificate(callback: js.Function2[/* err */ AWSError, /* data */ GetTrustStoreCertificateResponse, Unit]): Request[GetTrustStoreCertificateResponse, AWSError] = js.native
  /**
    * Gets the trust store certificate.
    */
  def getTrustStoreCertificate(params: GetTrustStoreCertificateRequest): Request[GetTrustStoreCertificateResponse, AWSError] = js.native
  def getTrustStoreCertificate(
    params: GetTrustStoreCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrustStoreCertificateResponse, Unit]
  ): Request[GetTrustStoreCertificateResponse, AWSError] = js.native
  
  /**
    * Gets user settings.
    */
  def getUserSettings(): Request[GetUserSettingsResponse, AWSError] = js.native
  def getUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetUserSettingsResponse, Unit]): Request[GetUserSettingsResponse, AWSError] = js.native
  /**
    * Gets user settings.
    */
  def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse, AWSError] = js.native
  def getUserSettings(
    params: GetUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserSettingsResponse, Unit]
  ): Request[GetUserSettingsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of browser settings.
    */
  def listBrowserSettings(): Request[ListBrowserSettingsResponse, AWSError] = js.native
  def listBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ ListBrowserSettingsResponse, Unit]): Request[ListBrowserSettingsResponse, AWSError] = js.native
  /**
    * Retrieves a list of browser settings.
    */
  def listBrowserSettings(params: ListBrowserSettingsRequest): Request[ListBrowserSettingsResponse, AWSError] = js.native
  def listBrowserSettings(
    params: ListBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBrowserSettingsResponse, Unit]
  ): Request[ListBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of identity providers for a specific web portal.
    */
  def listIdentityProviders(): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]): Request[ListIdentityProvidersResponse, AWSError] = js.native
  /**
    * Retrieves a list of identity providers for a specific web portal.
    */
  def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(
    params: ListIdentityProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]
  ): Request[ListIdentityProvidersResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of network settings.
    */
  def listNetworkSettings(): Request[ListNetworkSettingsResponse, AWSError] = js.native
  def listNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkSettingsResponse, Unit]): Request[ListNetworkSettingsResponse, AWSError] = js.native
  /**
    * Retrieves a list of network settings.
    */
  def listNetworkSettings(params: ListNetworkSettingsRequest): Request[ListNetworkSettingsResponse, AWSError] = js.native
  def listNetworkSettings(
    params: ListNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkSettingsResponse, Unit]
  ): Request[ListNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list or web portals.
    */
  def listPortals(): Request[ListPortalsResponse, AWSError] = js.native
  def listPortals(callback: js.Function2[/* err */ AWSError, /* data */ ListPortalsResponse, Unit]): Request[ListPortalsResponse, AWSError] = js.native
  /**
    * Retrieves a list or web portals.
    */
  def listPortals(params: ListPortalsRequest): Request[ListPortalsResponse, AWSError] = js.native
  def listPortals(
    params: ListPortalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPortalsResponse, Unit]
  ): Request[ListPortalsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves a list of tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of trust store certificates.
    */
  def listTrustStoreCertificates(): Request[ListTrustStoreCertificatesResponse, AWSError] = js.native
  def listTrustStoreCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListTrustStoreCertificatesResponse, Unit]): Request[ListTrustStoreCertificatesResponse, AWSError] = js.native
  /**
    * Retrieves a list of trust store certificates.
    */
  def listTrustStoreCertificates(params: ListTrustStoreCertificatesRequest): Request[ListTrustStoreCertificatesResponse, AWSError] = js.native
  def listTrustStoreCertificates(
    params: ListTrustStoreCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrustStoreCertificatesResponse, Unit]
  ): Request[ListTrustStoreCertificatesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of trust stores.
    */
  def listTrustStores(): Request[ListTrustStoresResponse, AWSError] = js.native
  def listTrustStores(callback: js.Function2[/* err */ AWSError, /* data */ ListTrustStoresResponse, Unit]): Request[ListTrustStoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of trust stores.
    */
  def listTrustStores(params: ListTrustStoresRequest): Request[ListTrustStoresResponse, AWSError] = js.native
  def listTrustStores(
    params: ListTrustStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrustStoresResponse, Unit]
  ): Request[ListTrustStoresResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of user settings.
    */
  def listUserSettings(): Request[ListUserSettingsResponse, AWSError] = js.native
  def listUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ ListUserSettingsResponse, Unit]): Request[ListUserSettingsResponse, AWSError] = js.native
  /**
    * Retrieves a list of user settings.
    */
  def listUserSettings(params: ListUserSettingsRequest): Request[ListUserSettingsResponse, AWSError] = js.native
  def listUserSettings(
    params: ListUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserSettingsResponse, Unit]
  ): Request[ListUserSettingsResponse, AWSError] = js.native
  
  /**
    * Adds or overwrites one or more tags for the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates browser settings.
    */
  def updateBrowserSettings(): Request[UpdateBrowserSettingsResponse, AWSError] = js.native
  def updateBrowserSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrowserSettingsResponse, Unit]): Request[UpdateBrowserSettingsResponse, AWSError] = js.native
  /**
    * Updates browser settings.
    */
  def updateBrowserSettings(params: UpdateBrowserSettingsRequest): Request[UpdateBrowserSettingsResponse, AWSError] = js.native
  def updateBrowserSettings(
    params: UpdateBrowserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrowserSettingsResponse, Unit]
  ): Request[UpdateBrowserSettingsResponse, AWSError] = js.native
  
  /**
    * Updates the identity provider. 
    */
  def updateIdentityProvider(): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  def updateIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderResponse, Unit]): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  /**
    * Updates the identity provider. 
    */
  def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  def updateIdentityProvider(
    params: UpdateIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderResponse, Unit]
  ): Request[UpdateIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Updates network settings.
    */
  def updateNetworkSettings(): Request[UpdateNetworkSettingsResponse, AWSError] = js.native
  def updateNetworkSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSettingsResponse, Unit]): Request[UpdateNetworkSettingsResponse, AWSError] = js.native
  /**
    * Updates network settings.
    */
  def updateNetworkSettings(params: UpdateNetworkSettingsRequest): Request[UpdateNetworkSettingsResponse, AWSError] = js.native
  def updateNetworkSettings(
    params: UpdateNetworkSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSettingsResponse, Unit]
  ): Request[UpdateNetworkSettingsResponse, AWSError] = js.native
  
  /**
    * Updates a web portal.
    */
  def updatePortal(): Request[UpdatePortalResponse, AWSError] = js.native
  def updatePortal(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortalResponse, Unit]): Request[UpdatePortalResponse, AWSError] = js.native
  /**
    * Updates a web portal.
    */
  def updatePortal(params: UpdatePortalRequest): Request[UpdatePortalResponse, AWSError] = js.native
  def updatePortal(
    params: UpdatePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortalResponse, Unit]
  ): Request[UpdatePortalResponse, AWSError] = js.native
  
  /**
    * Updates the trust store.
    */
  def updateTrustStore(): Request[UpdateTrustStoreResponse, AWSError] = js.native
  def updateTrustStore(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrustStoreResponse, Unit]): Request[UpdateTrustStoreResponse, AWSError] = js.native
  /**
    * Updates the trust store.
    */
  def updateTrustStore(params: UpdateTrustStoreRequest): Request[UpdateTrustStoreResponse, AWSError] = js.native
  def updateTrustStore(
    params: UpdateTrustStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrustStoreResponse, Unit]
  ): Request[UpdateTrustStoreResponse, AWSError] = js.native
  
  /**
    * Updates the user settings.
    */
  def updateUserSettings(): Request[UpdateUserSettingsResponse, AWSError] = js.native
  def updateUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserSettingsResponse, Unit]): Request[UpdateUserSettingsResponse, AWSError] = js.native
  /**
    * Updates the user settings.
    */
  def updateUserSettings(params: UpdateUserSettingsRequest): Request[UpdateUserSettingsResponse, AWSError] = js.native
  def updateUserSettings(
    params: UpdateUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserSettingsResponse, Unit]
  ): Request[UpdateUserSettingsResponse, AWSError] = js.native
}
