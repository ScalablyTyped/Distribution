package typings.awsSdk.outpostsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outposts extends Service {
  
  /**
    *  Cancels an order for an Outpost. 
    */
  def cancelOrder(): Request[CancelOrderOutput, AWSError] = js.native
  def cancelOrder(callback: js.Function2[/* err */ AWSError, /* data */ CancelOrderOutput, Unit]): Request[CancelOrderOutput, AWSError] = js.native
  /**
    *  Cancels an order for an Outpost. 
    */
  def cancelOrder(params: CancelOrderInput): Request[CancelOrderOutput, AWSError] = js.native
  def cancelOrder(
    params: CancelOrderInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelOrderOutput, Unit]
  ): Request[CancelOrderOutput, AWSError] = js.native
  
  @JSName("config")
  var config_Outposts: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an order for an Outpost.
    */
  def createOrder(): Request[CreateOrderOutput, AWSError] = js.native
  def createOrder(callback: js.Function2[/* err */ AWSError, /* data */ CreateOrderOutput, Unit]): Request[CreateOrderOutput, AWSError] = js.native
  /**
    * Creates an order for an Outpost.
    */
  def createOrder(params: CreateOrderInput): Request[CreateOrderOutput, AWSError] = js.native
  def createOrder(
    params: CreateOrderInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOrderOutput, Unit]
  ): Request[CreateOrderOutput, AWSError] = js.native
  
  /**
    * Creates an Outpost. You can specify AvailabilityZone or AvailabilityZoneId.
    */
  def createOutpost(): Request[CreateOutpostOutput, AWSError] = js.native
  def createOutpost(callback: js.Function2[/* err */ AWSError, /* data */ CreateOutpostOutput, Unit]): Request[CreateOutpostOutput, AWSError] = js.native
  /**
    * Creates an Outpost. You can specify AvailabilityZone or AvailabilityZoneId.
    */
  def createOutpost(params: CreateOutpostInput): Request[CreateOutpostOutput, AWSError] = js.native
  def createOutpost(
    params: CreateOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOutpostOutput, Unit]
  ): Request[CreateOutpostOutput, AWSError] = js.native
  
  /**
    *  Creates a site for an Outpost. 
    */
  def createSite(): Request[CreateSiteOutput, AWSError] = js.native
  def createSite(callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteOutput, Unit]): Request[CreateSiteOutput, AWSError] = js.native
  /**
    *  Creates a site for an Outpost. 
    */
  def createSite(params: CreateSiteInput): Request[CreateSiteOutput, AWSError] = js.native
  def createSite(
    params: CreateSiteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteOutput, Unit]
  ): Request[CreateSiteOutput, AWSError] = js.native
  
  /**
    * Deletes the Outpost.
    */
  def deleteOutpost(): Request[DeleteOutpostOutput, AWSError] = js.native
  def deleteOutpost(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutpostOutput, Unit]): Request[DeleteOutpostOutput, AWSError] = js.native
  /**
    * Deletes the Outpost.
    */
  def deleteOutpost(params: DeleteOutpostInput): Request[DeleteOutpostOutput, AWSError] = js.native
  def deleteOutpost(
    params: DeleteOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutpostOutput, Unit]
  ): Request[DeleteOutpostOutput, AWSError] = js.native
  
  /**
    * Deletes the site.
    */
  def deleteSite(): Request[DeleteSiteOutput, AWSError] = js.native
  def deleteSite(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteOutput, Unit]): Request[DeleteSiteOutput, AWSError] = js.native
  /**
    * Deletes the site.
    */
  def deleteSite(params: DeleteSiteInput): Request[DeleteSiteOutput, AWSError] = js.native
  def deleteSite(
    params: DeleteSiteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteOutput, Unit]
  ): Request[DeleteSiteOutput, AWSError] = js.native
  
  /**
    * Gets information about a catalog item.
    */
  def getCatalogItem(): Request[GetCatalogItemOutput, AWSError] = js.native
  def getCatalogItem(callback: js.Function2[/* err */ AWSError, /* data */ GetCatalogItemOutput, Unit]): Request[GetCatalogItemOutput, AWSError] = js.native
  /**
    * Gets information about a catalog item.
    */
  def getCatalogItem(params: GetCatalogItemInput): Request[GetCatalogItemOutput, AWSError] = js.native
  def getCatalogItem(
    params: GetCatalogItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCatalogItemOutput, Unit]
  ): Request[GetCatalogItemOutput, AWSError] = js.native
  
  /**
    *   Amazon Web Services uses this action to install Outpost servers.   Gets information about a specified connection.   Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to secure it. For more information, see  Amazon Web Services managed policies for Amazon Web Services Outposts and  Logging Amazon Web Services Outposts API calls with Amazon Web Services CloudTrail in the Amazon Web Services Outposts User Guide. 
    */
  def getConnection(): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]): Request[GetConnectionResponse, AWSError] = js.native
  /**
    *   Amazon Web Services uses this action to install Outpost servers.   Gets information about a specified connection.   Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to secure it. For more information, see  Amazon Web Services managed policies for Amazon Web Services Outposts and  Logging Amazon Web Services Outposts API calls with Amazon Web Services CloudTrail in the Amazon Web Services Outposts User Guide. 
    */
  def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(
    params: GetConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]
  ): Request[GetConnectionResponse, AWSError] = js.native
  
  /**
    * Gets an order.
    */
  def getOrder(): Request[GetOrderOutput, AWSError] = js.native
  def getOrder(callback: js.Function2[/* err */ AWSError, /* data */ GetOrderOutput, Unit]): Request[GetOrderOutput, AWSError] = js.native
  /**
    * Gets an order.
    */
  def getOrder(params: GetOrderInput): Request[GetOrderOutput, AWSError] = js.native
  def getOrder(params: GetOrderInput, callback: js.Function2[/* err */ AWSError, /* data */ GetOrderOutput, Unit]): Request[GetOrderOutput, AWSError] = js.native
  
  /**
    * Gets information about the specified Outpost.
    */
  def getOutpost(): Request[GetOutpostOutput, AWSError] = js.native
  def getOutpost(callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostOutput, Unit]): Request[GetOutpostOutput, AWSError] = js.native
  /**
    * Gets information about the specified Outpost.
    */
  def getOutpost(params: GetOutpostInput): Request[GetOutpostOutput, AWSError] = js.native
  def getOutpost(
    params: GetOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostOutput, Unit]
  ): Request[GetOutpostOutput, AWSError] = js.native
  
  /**
    * Gets the instance types for the specified Outpost.
    */
  def getOutpostInstanceTypes(): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  def getOutpostInstanceTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostInstanceTypesOutput, Unit]): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  /**
    * Gets the instance types for the specified Outpost.
    */
  def getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  def getOutpostInstanceTypes(
    params: GetOutpostInstanceTypesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostInstanceTypesOutput, Unit]
  ): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  
  /**
    *  Gets information about the specified Outpost site. 
    */
  def getSite(): Request[GetSiteOutput, AWSError] = js.native
  def getSite(callback: js.Function2[/* err */ AWSError, /* data */ GetSiteOutput, Unit]): Request[GetSiteOutput, AWSError] = js.native
  /**
    *  Gets information about the specified Outpost site. 
    */
  def getSite(params: GetSiteInput): Request[GetSiteOutput, AWSError] = js.native
  def getSite(params: GetSiteInput, callback: js.Function2[/* err */ AWSError, /* data */ GetSiteOutput, Unit]): Request[GetSiteOutput, AWSError] = js.native
  
  /**
    *  Gets the site address. 
    */
  def getSiteAddress(): Request[GetSiteAddressOutput, AWSError] = js.native
  def getSiteAddress(callback: js.Function2[/* err */ AWSError, /* data */ GetSiteAddressOutput, Unit]): Request[GetSiteAddressOutput, AWSError] = js.native
  /**
    *  Gets the site address. 
    */
  def getSiteAddress(params: GetSiteAddressInput): Request[GetSiteAddressOutput, AWSError] = js.native
  def getSiteAddress(
    params: GetSiteAddressInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSiteAddressOutput, Unit]
  ): Request[GetSiteAddressOutput, AWSError] = js.native
  
  /**
    *  Lists the hardware assets in an Outpost. If you are using Dedicated Hosts on Amazon Web Services Outposts, you can filter your request by host ID to return a list of hardware assets that allocate resources for Dedicated Hosts. 
    */
  def listAssets(): Request[ListAssetsOutput, AWSError] = js.native
  def listAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsOutput, Unit]): Request[ListAssetsOutput, AWSError] = js.native
  /**
    *  Lists the hardware assets in an Outpost. If you are using Dedicated Hosts on Amazon Web Services Outposts, you can filter your request by host ID to return a list of hardware assets that allocate resources for Dedicated Hosts. 
    */
  def listAssets(params: ListAssetsInput): Request[ListAssetsOutput, AWSError] = js.native
  def listAssets(
    params: ListAssetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsOutput, Unit]
  ): Request[ListAssetsOutput, AWSError] = js.native
  
  /**
    * Lists the items in the catalog. Add filters to your request to return a more specific list of results. Use filters to match an item class, storage option, or EC2 family.  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listCatalogItems(): Request[ListCatalogItemsOutput, AWSError] = js.native
  def listCatalogItems(callback: js.Function2[/* err */ AWSError, /* data */ ListCatalogItemsOutput, Unit]): Request[ListCatalogItemsOutput, AWSError] = js.native
  /**
    * Lists the items in the catalog. Add filters to your request to return a more specific list of results. Use filters to match an item class, storage option, or EC2 family.  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listCatalogItems(params: ListCatalogItemsInput): Request[ListCatalogItemsOutput, AWSError] = js.native
  def listCatalogItems(
    params: ListCatalogItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCatalogItemsOutput, Unit]
  ): Request[ListCatalogItemsOutput, AWSError] = js.native
  
  /**
    * Lists the Outpost orders for your Amazon Web Services account. You can filter your request by Outpost to return a more specific list of results. 
    */
  def listOrders(): Request[ListOrdersOutput, AWSError] = js.native
  def listOrders(callback: js.Function2[/* err */ AWSError, /* data */ ListOrdersOutput, Unit]): Request[ListOrdersOutput, AWSError] = js.native
  /**
    * Lists the Outpost orders for your Amazon Web Services account. You can filter your request by Outpost to return a more specific list of results. 
    */
  def listOrders(params: ListOrdersInput): Request[ListOrdersOutput, AWSError] = js.native
  def listOrders(
    params: ListOrdersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrdersOutput, Unit]
  ): Request[ListOrdersOutput, AWSError] = js.native
  
  /**
    * Lists the Outposts for your Amazon Web Services account. Add filters to your request to return a more specific list of results. Use filters to match an Outpost lifecycle status, Availability Zone (us-east-1a), and AZ ID (use1-az1).  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listOutposts(): Request[ListOutpostsOutput, AWSError] = js.native
  def listOutposts(callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsOutput, Unit]): Request[ListOutpostsOutput, AWSError] = js.native
  /**
    * Lists the Outposts for your Amazon Web Services account. Add filters to your request to return a more specific list of results. Use filters to match an Outpost lifecycle status, Availability Zone (us-east-1a), and AZ ID (use1-az1).  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listOutposts(params: ListOutpostsInput): Request[ListOutpostsOutput, AWSError] = js.native
  def listOutposts(
    params: ListOutpostsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsOutput, Unit]
  ): Request[ListOutpostsOutput, AWSError] = js.native
  
  /**
    * Lists the Outpost sites for your Amazon Web Services account. Add operating address filters to your request to return a more specific list of results. Use filters to match site city, country code, or state/region of the operating address.  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listSites(): Request[ListSitesOutput, AWSError] = js.native
  def listSites(callback: js.Function2[/* err */ AWSError, /* data */ ListSitesOutput, Unit]): Request[ListSitesOutput, AWSError] = js.native
  /**
    * Lists the Outpost sites for your Amazon Web Services account. Add operating address filters to your request to return a more specific list of results. Use filters to match site city, country code, or state/region of the operating address.  If you specify multiple filters, the filters are joined with an AND, and the request returns only results that match all of the specified filters.
    */
  def listSites(params: ListSitesInput): Request[ListSitesOutput, AWSError] = js.native
  def listSites(
    params: ListSitesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSitesOutput, Unit]
  ): Request[ListSitesOutput, AWSError] = js.native
  
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
    *   Amazon Web Services uses this action to install Outpost servers.   Starts the connection required for Outpost server installation.   Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to secure it. For more information, see  Amazon Web Services managed policies for Amazon Web Services Outposts and  Logging Amazon Web Services Outposts API calls with Amazon Web Services CloudTrail in the Amazon Web Services Outposts User Guide. 
    */
  def startConnection(): Request[StartConnectionResponse, AWSError] = js.native
  def startConnection(callback: js.Function2[/* err */ AWSError, /* data */ StartConnectionResponse, Unit]): Request[StartConnectionResponse, AWSError] = js.native
  /**
    *   Amazon Web Services uses this action to install Outpost servers.   Starts the connection required for Outpost server installation.   Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to secure it. For more information, see  Amazon Web Services managed policies for Amazon Web Services Outposts and  Logging Amazon Web Services Outposts API calls with Amazon Web Services CloudTrail in the Amazon Web Services Outposts User Guide. 
    */
  def startConnection(params: StartConnectionRequest): Request[StartConnectionResponse, AWSError] = js.native
  def startConnection(
    params: StartConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartConnectionResponse, Unit]
  ): Request[StartConnectionResponse, AWSError] = js.native
  
  /**
    * Adds tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Updates an Outpost. 
    */
  def updateOutpost(): Request[UpdateOutpostOutput, AWSError] = js.native
  def updateOutpost(callback: js.Function2[/* err */ AWSError, /* data */ UpdateOutpostOutput, Unit]): Request[UpdateOutpostOutput, AWSError] = js.native
  /**
    *  Updates an Outpost. 
    */
  def updateOutpost(params: UpdateOutpostInput): Request[UpdateOutpostOutput, AWSError] = js.native
  def updateOutpost(
    params: UpdateOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOutpostOutput, Unit]
  ): Request[UpdateOutpostOutput, AWSError] = js.native
  
  /**
    *  Updates the site. 
    */
  def updateSite(): Request[UpdateSiteOutput, AWSError] = js.native
  def updateSite(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteOutput, Unit]): Request[UpdateSiteOutput, AWSError] = js.native
  /**
    *  Updates the site. 
    */
  def updateSite(params: UpdateSiteInput): Request[UpdateSiteOutput, AWSError] = js.native
  def updateSite(
    params: UpdateSiteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteOutput, Unit]
  ): Request[UpdateSiteOutput, AWSError] = js.native
  
  /**
    *  Updates the site address.   To update a site address with an order IN_PROGRESS, you must wait for the order to complete or cancel the order.  You can update the operating address before you place an order at the site, or after all Outposts that belong to the site have been deactivated. 
    */
  def updateSiteAddress(): Request[UpdateSiteAddressOutput, AWSError] = js.native
  def updateSiteAddress(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteAddressOutput, Unit]): Request[UpdateSiteAddressOutput, AWSError] = js.native
  /**
    *  Updates the site address.   To update a site address with an order IN_PROGRESS, you must wait for the order to complete or cancel the order.  You can update the operating address before you place an order at the site, or after all Outposts that belong to the site have been deactivated. 
    */
  def updateSiteAddress(params: UpdateSiteAddressInput): Request[UpdateSiteAddressOutput, AWSError] = js.native
  def updateSiteAddress(
    params: UpdateSiteAddressInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteAddressOutput, Unit]
  ): Request[UpdateSiteAddressOutput, AWSError] = js.native
  
  /**
    * Update the physical and logistical details for a rack at a site. For more information about hardware requirements for racks, see Network readiness checklist in the Amazon Web Services Outposts User Guide.  To update a rack at a site with an order of IN_PROGRESS, you must wait for the order to complete or cancel the order.
    */
  def updateSiteRackPhysicalProperties(): Request[UpdateSiteRackPhysicalPropertiesOutput, AWSError] = js.native
  def updateSiteRackPhysicalProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteRackPhysicalPropertiesOutput, Unit]
  ): Request[UpdateSiteRackPhysicalPropertiesOutput, AWSError] = js.native
  /**
    * Update the physical and logistical details for a rack at a site. For more information about hardware requirements for racks, see Network readiness checklist in the Amazon Web Services Outposts User Guide.  To update a rack at a site with an order of IN_PROGRESS, you must wait for the order to complete or cancel the order.
    */
  def updateSiteRackPhysicalProperties(params: UpdateSiteRackPhysicalPropertiesInput): Request[UpdateSiteRackPhysicalPropertiesOutput, AWSError] = js.native
  def updateSiteRackPhysicalProperties(
    params: UpdateSiteRackPhysicalPropertiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteRackPhysicalPropertiesOutput, Unit]
  ): Request[UpdateSiteRackPhysicalPropertiesOutput, AWSError] = js.native
}
