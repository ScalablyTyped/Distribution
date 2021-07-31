package typings.awsSdk.iotsitewiseMod

import typings.awsSdk.anon.DescribeAssetRequestwaite
import typings.awsSdk.anon.DescribePortalRequestwait
import typings.awsSdk.awsSdkStrings.assetActive
import typings.awsSdk.awsSdkStrings.assetModelActive
import typings.awsSdk.awsSdkStrings.assetModelNotExists
import typings.awsSdk.awsSdkStrings.assetNotExists
import typings.awsSdk.awsSdkStrings.portalActive
import typings.awsSdk.awsSdkStrings.portalNotExists
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTSiteWise extends Service {
  
  /**
    * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For more information, see Associating assets in the AWS IoT SiteWise User Guide.
    */
  def associateAssets(): Request[js.Object, AWSError] = js.native
  def associateAssets(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For more information, see Associating assets in the AWS IoT SiteWise User Guide.
    */
  def associateAssets(params: AssociateAssetsRequest): Request[js.Object, AWSError] = js.native
  def associateAssets(
    params: AssociateAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
    */
  def batchAssociateProjectAssets(): Request[BatchAssociateProjectAssetsResponse, AWSError] = js.native
  def batchAssociateProjectAssets(callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateProjectAssetsResponse, Unit]): Request[BatchAssociateProjectAssetsResponse, AWSError] = js.native
  /**
    * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
    */
  def batchAssociateProjectAssets(params: BatchAssociateProjectAssetsRequest): Request[BatchAssociateProjectAssetsResponse, AWSError] = js.native
  def batchAssociateProjectAssets(
    params: BatchAssociateProjectAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateProjectAssetsResponse, Unit]
  ): Request[BatchAssociateProjectAssetsResponse, AWSError] = js.native
  
  /**
    * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
    */
  def batchDisassociateProjectAssets(): Request[BatchDisassociateProjectAssetsResponse, AWSError] = js.native
  def batchDisassociateProjectAssets(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateProjectAssetsResponse, Unit]
  ): Request[BatchDisassociateProjectAssetsResponse, AWSError] = js.native
  /**
    * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
    */
  def batchDisassociateProjectAssets(params: BatchDisassociateProjectAssetsRequest): Request[BatchDisassociateProjectAssetsResponse, AWSError] = js.native
  def batchDisassociateProjectAssets(
    params: BatchDisassociateProjectAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateProjectAssetsResponse, Unit]
  ): Request[BatchDisassociateProjectAssetsResponse, AWSError] = js.native
  
  /**
    * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data point. For more information, see Ingesting data using the API in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.    With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 15 minutes in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the inclusive range of [-15, +5] minutes and returns a TimestampOutOfRangeException error. For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a different quality. For example, if you store a TQV {T1, GOOD, V1}, then storing {T1, GOOD, V2} replaces the existing TQV.  AWS IoT SiteWise authorizes access to each BatchPutAssetPropertyValue entry individually. For more information, see BatchPutAssetPropertyValue authorization in the AWS IoT SiteWise User Guide.
    */
  def batchPutAssetPropertyValue(): Request[BatchPutAssetPropertyValueResponse, AWSError] = js.native
  def batchPutAssetPropertyValue(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutAssetPropertyValueResponse, Unit]): Request[BatchPutAssetPropertyValueResponse, AWSError] = js.native
  /**
    * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data point. For more information, see Ingesting data using the API in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.    With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 15 minutes in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the inclusive range of [-15, +5] minutes and returns a TimestampOutOfRangeException error. For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a different quality. For example, if you store a TQV {T1, GOOD, V1}, then storing {T1, GOOD, V2} replaces the existing TQV.  AWS IoT SiteWise authorizes access to each BatchPutAssetPropertyValue entry individually. For more information, see BatchPutAssetPropertyValue authorization in the AWS IoT SiteWise User Guide.
    */
  def batchPutAssetPropertyValue(params: BatchPutAssetPropertyValueRequest): Request[BatchPutAssetPropertyValueResponse, AWSError] = js.native
  def batchPutAssetPropertyValue(
    params: BatchPutAssetPropertyValueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutAssetPropertyValueResponse, Unit]
  ): Request[BatchPutAssetPropertyValueResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTSiteWise: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an access policy that grants the specified identity (AWS SSO user, AWS SSO group, or IAM user) access to the specified AWS IoT SiteWise Monitor portal or project resource.
    */
  def createAccessPolicy(): Request[CreateAccessPolicyResponse, AWSError] = js.native
  def createAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPolicyResponse, Unit]): Request[CreateAccessPolicyResponse, AWSError] = js.native
  /**
    * Creates an access policy that grants the specified identity (AWS SSO user, AWS SSO group, or IAM user) access to the specified AWS IoT SiteWise Monitor portal or project resource.
    */
  def createAccessPolicy(params: CreateAccessPolicyRequest): Request[CreateAccessPolicyResponse, AWSError] = js.native
  def createAccessPolicy(
    params: CreateAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPolicyResponse, Unit]
  ): Request[CreateAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Creates an asset from an existing asset model. For more information, see Creating assets in the AWS IoT SiteWise User Guide.
    */
  def createAsset(): Request[CreateAssetResponse, AWSError] = js.native
  def createAsset(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetResponse, Unit]): Request[CreateAssetResponse, AWSError] = js.native
  /**
    * Creates an asset from an existing asset model. For more information, see Creating assets in the AWS IoT SiteWise User Guide.
    */
  def createAsset(params: CreateAssetRequest): Request[CreateAssetResponse, AWSError] = js.native
  def createAsset(
    params: CreateAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetResponse, Unit]
  ): Request[CreateAssetResponse, AWSError] = js.native
  
  /**
    * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models. With asset models, you can easily create assets of the same type that have standardized definitions. Each asset created from a model inherits the asset model's property and hierarchy definitions. For more information, see Defining asset models in the AWS IoT SiteWise User Guide.
    */
  def createAssetModel(): Request[CreateAssetModelResponse, AWSError] = js.native
  def createAssetModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetModelResponse, Unit]): Request[CreateAssetModelResponse, AWSError] = js.native
  /**
    * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models. With asset models, you can easily create assets of the same type that have standardized definitions. Each asset created from a model inherits the asset model's property and hierarchy definitions. For more information, see Defining asset models in the AWS IoT SiteWise User Guide.
    */
  def createAssetModel(params: CreateAssetModelRequest): Request[CreateAssetModelResponse, AWSError] = js.native
  def createAssetModel(
    params: CreateAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetModelResponse, Unit]
  ): Request[CreateAssetModelResponse, AWSError] = js.native
  
  /**
    * Creates a dashboard in an AWS IoT SiteWise Monitor project.
    */
  def createDashboard(): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]): Request[CreateDashboardResponse, AWSError] = js.native
  /**
    * Creates a dashboard in an AWS IoT SiteWise Monitor project.
    */
  def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(
    params: CreateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]
  ): Request[CreateDashboardResponse, AWSError] = js.native
  
  /**
    * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to AWS IoT SiteWise. For more information, see Ingesting data using a gateway in the AWS IoT SiteWise User Guide.
    */
  def createGateway(): Request[CreateGatewayResponse, AWSError] = js.native
  def createGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayResponse, Unit]): Request[CreateGatewayResponse, AWSError] = js.native
  /**
    * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to AWS IoT SiteWise. For more information, see Ingesting data using a gateway in the AWS IoT SiteWise User Guide.
    */
  def createGateway(params: CreateGatewayRequest): Request[CreateGatewayResponse, AWSError] = js.native
  def createGateway(
    params: CreateGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayResponse, Unit]
  ): Request[CreateGatewayResponse, AWSError] = js.native
  
  /**
    * Creates a portal, which can contain projects and dashboards. AWS IoT SiteWise Monitor uses AWS SSO or IAM to authenticate portal users and manage user permissions.  Before you can sign in to a new portal, you must add at least one identity to that portal. For more information, see Adding or removing portal administrators in the AWS IoT SiteWise User Guide. 
    */
  def createPortal(): Request[CreatePortalResponse, AWSError] = js.native
  def createPortal(callback: js.Function2[/* err */ AWSError, /* data */ CreatePortalResponse, Unit]): Request[CreatePortalResponse, AWSError] = js.native
  /**
    * Creates a portal, which can contain projects and dashboards. AWS IoT SiteWise Monitor uses AWS SSO or IAM to authenticate portal users and manage user permissions.  Before you can sign in to a new portal, you must add at least one identity to that portal. For more information, see Adding or removing portal administrators in the AWS IoT SiteWise User Guide. 
    */
  def createPortal(params: CreatePortalRequest): Request[CreatePortalResponse, AWSError] = js.native
  def createPortal(
    params: CreatePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePortalResponse, Unit]
  ): Request[CreatePortalResponse, AWSError] = js.native
  
  /**
    * Creates a pre-signed URL to a portal. Use this operation to create URLs to portals that use AWS Identity and Access Management (IAM) to authenticate users. An IAM user with access to a portal can call this API to get a URL to that portal. The URL contains a session token that lets the IAM user access the portal.
    */
  def createPresignedPortalUrl(): Request[CreatePresignedPortalUrlResponse, AWSError] = js.native
  def createPresignedPortalUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedPortalUrlResponse, Unit]): Request[CreatePresignedPortalUrlResponse, AWSError] = js.native
  /**
    * Creates a pre-signed URL to a portal. Use this operation to create URLs to portals that use AWS Identity and Access Management (IAM) to authenticate users. An IAM user with access to a portal can call this API to get a URL to that portal. The URL contains a session token that lets the IAM user access the portal.
    */
  def createPresignedPortalUrl(params: CreatePresignedPortalUrlRequest): Request[CreatePresignedPortalUrlResponse, AWSError] = js.native
  def createPresignedPortalUrl(
    params: CreatePresignedPortalUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePresignedPortalUrlResponse, Unit]
  ): Request[CreatePresignedPortalUrlResponse, AWSError] = js.native
  
  /**
    * Creates a project in the specified portal.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a project in the specified portal.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Deletes an access policy that grants the specified identity access to the specified AWS IoT SiteWise Monitor resource. You can use this operation to revoke access to an AWS IoT SiteWise Monitor resource.
    */
  def deleteAccessPolicy(): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  def deleteAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessPolicyResponse, Unit]): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  /**
    * Deletes an access policy that grants the specified identity access to the specified AWS IoT SiteWise Monitor resource. You can use this operation to revoke access to an AWS IoT SiteWise Monitor resource.
    */
  def deleteAccessPolicy(params: DeleteAccessPolicyRequest): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  def deleteAccessPolicy(
    params: DeleteAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessPolicyResponse, Unit]
  ): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an asset. This action can't be undone. For more information, see Deleting assets and models in the AWS IoT SiteWise User Guide.   You can't delete an asset that's associated to another asset. For more information, see DisassociateAssets. 
    */
  def deleteAsset(): Request[DeleteAssetResponse, AWSError] = js.native
  def deleteAsset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetResponse, Unit]): Request[DeleteAssetResponse, AWSError] = js.native
  /**
    * Deletes an asset. This action can't be undone. For more information, see Deleting assets and models in the AWS IoT SiteWise User Guide.   You can't delete an asset that's associated to another asset. For more information, see DisassociateAssets. 
    */
  def deleteAsset(params: DeleteAssetRequest): Request[DeleteAssetResponse, AWSError] = js.native
  def deleteAsset(
    params: DeleteAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetResponse, Unit]
  ): Request[DeleteAssetResponse, AWSError] = js.native
  
  /**
    * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that contains a property formula expression that depends on the asset model that you want to delete. For more information, see Deleting assets and models in the AWS IoT SiteWise User Guide.
    */
  def deleteAssetModel(): Request[DeleteAssetModelResponse, AWSError] = js.native
  def deleteAssetModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetModelResponse, Unit]): Request[DeleteAssetModelResponse, AWSError] = js.native
  /**
    * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that contains a property formula expression that depends on the asset model that you want to delete. For more information, see Deleting assets and models in the AWS IoT SiteWise User Guide.
    */
  def deleteAssetModel(params: DeleteAssetModelRequest): Request[DeleteAssetModelResponse, AWSError] = js.native
  def deleteAssetModel(
    params: DeleteAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetModelResponse, Unit]
  ): Request[DeleteAssetModelResponse, AWSError] = js.native
  
  /**
    * Deletes a dashboard from AWS IoT SiteWise Monitor.
    */
  def deleteDashboard(): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]): Request[DeleteDashboardResponse, AWSError] = js.native
  /**
    * Deletes a dashboard from AWS IoT SiteWise Monitor.
    */
  def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(
    params: DeleteDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]
  ): Request[DeleteDashboardResponse, AWSError] = js.native
  
  /**
    * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your gateway's file system.
    */
  def deleteGateway(): Request[js.Object, AWSError] = js.native
  def deleteGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your gateway's file system.
    */
  def deleteGateway(params: DeleteGatewayRequest): Request[js.Object, AWSError] = js.native
  def deleteGateway(
    params: DeleteGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a portal from AWS IoT SiteWise Monitor.
    */
  def deletePortal(): Request[DeletePortalResponse, AWSError] = js.native
  def deletePortal(callback: js.Function2[/* err */ AWSError, /* data */ DeletePortalResponse, Unit]): Request[DeletePortalResponse, AWSError] = js.native
  /**
    * Deletes a portal from AWS IoT SiteWise Monitor.
    */
  def deletePortal(params: DeletePortalRequest): Request[DeletePortalResponse, AWSError] = js.native
  def deletePortal(
    params: DeletePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePortalResponse, Unit]
  ): Request[DeletePortalResponse, AWSError] = js.native
  
  /**
    * Deletes a project from AWS IoT SiteWise Monitor.
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes a project from AWS IoT SiteWise Monitor.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Describes an access policy, which specifies an identity's access to an AWS IoT SiteWise Monitor portal or project.
    */
  def describeAccessPolicy(): Request[DescribeAccessPolicyResponse, AWSError] = js.native
  def describeAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessPolicyResponse, Unit]): Request[DescribeAccessPolicyResponse, AWSError] = js.native
  /**
    * Describes an access policy, which specifies an identity's access to an AWS IoT SiteWise Monitor portal or project.
    */
  def describeAccessPolicy(params: DescribeAccessPolicyRequest): Request[DescribeAccessPolicyResponse, AWSError] = js.native
  def describeAccessPolicy(
    params: DescribeAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessPolicyResponse, Unit]
  ): Request[DescribeAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an asset.
    */
  def describeAsset(): Request[DescribeAssetResponse, AWSError] = js.native
  def describeAsset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Retrieves information about an asset.
    */
  def describeAsset(params: DescribeAssetRequest): Request[DescribeAssetResponse, AWSError] = js.native
  def describeAsset(
    params: DescribeAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an asset model.
    */
  def describeAssetModel(): Request[DescribeAssetModelResponse, AWSError] = js.native
  def describeAssetModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]): Request[DescribeAssetModelResponse, AWSError] = js.native
  /**
    * Retrieves information about an asset model.
    */
  def describeAssetModel(params: DescribeAssetModelRequest): Request[DescribeAssetModelResponse, AWSError] = js.native
  def describeAssetModel(
    params: DescribeAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]
  ): Request[DescribeAssetModelResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an asset property.  When you call this operation for an attribute property, this response includes the default attribute value that you define in the asset model. If you update the default value in the model, this operation's response includes the new default value.  This operation doesn't return the value of the asset property. To get the value of an asset property, use GetAssetPropertyValue.
    */
  def describeAssetProperty(): Request[DescribeAssetPropertyResponse, AWSError] = js.native
  def describeAssetProperty(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetPropertyResponse, Unit]): Request[DescribeAssetPropertyResponse, AWSError] = js.native
  /**
    * Retrieves information about an asset property.  When you call this operation for an attribute property, this response includes the default attribute value that you define in the asset model. If you update the default value in the model, this operation's response includes the new default value.  This operation doesn't return the value of the asset property. To get the value of an asset property, use GetAssetPropertyValue.
    */
  def describeAssetProperty(params: DescribeAssetPropertyRequest): Request[DescribeAssetPropertyResponse, AWSError] = js.native
  def describeAssetProperty(
    params: DescribeAssetPropertyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetPropertyResponse, Unit]
  ): Request[DescribeAssetPropertyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a dashboard.
    */
  def describeDashboard(): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]): Request[DescribeDashboardResponse, AWSError] = js.native
  /**
    * Retrieves information about a dashboard.
    */
  def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(
    params: DescribeDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]
  ): Request[DescribeDashboardResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a gateway.
    */
  def describeGateway(): Request[DescribeGatewayResponse, AWSError] = js.native
  def describeGateway(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayResponse, Unit]): Request[DescribeGatewayResponse, AWSError] = js.native
  /**
    * Retrieves information about a gateway.
    */
  def describeGateway(params: DescribeGatewayRequest): Request[DescribeGatewayResponse, AWSError] = js.native
  def describeGateway(
    params: DescribeGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayResponse, Unit]
  ): Request[DescribeGatewayResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a gateway capability configuration. Each gateway capability defines data sources for a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability configuration. To list all capability configurations for a gateway, use DescribeGateway.
    */
  def describeGatewayCapabilityConfiguration(): Request[DescribeGatewayCapabilityConfigurationResponse, AWSError] = js.native
  def describeGatewayCapabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayCapabilityConfigurationResponse, Unit]
  ): Request[DescribeGatewayCapabilityConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves information about a gateway capability configuration. Each gateway capability defines data sources for a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability configuration. To list all capability configurations for a gateway, use DescribeGateway.
    */
  def describeGatewayCapabilityConfiguration(params: DescribeGatewayCapabilityConfigurationRequest): Request[DescribeGatewayCapabilityConfigurationResponse, AWSError] = js.native
  def describeGatewayCapabilityConfiguration(
    params: DescribeGatewayCapabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayCapabilityConfigurationResponse, Unit]
  ): Request[DescribeGatewayCapabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the current AWS IoT SiteWise logging options.
    */
  def describeLoggingOptions(): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves the current AWS IoT SiteWise logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]
  ): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a portal.
    */
  def describePortal(): Request[DescribePortalResponse, AWSError] = js.native
  def describePortal(callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]): Request[DescribePortalResponse, AWSError] = js.native
  /**
    * Retrieves information about a portal.
    */
  def describePortal(params: DescribePortalRequest): Request[DescribePortalResponse, AWSError] = js.native
  def describePortal(
    params: DescribePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]
  ): Request[DescribePortalResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a project.
    */
  def describeProject(): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Retrieves information about a project.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]
  ): Request[DescribeProjectResponse, AWSError] = js.native
  
  /**
    * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
    */
  def disassociateAssets(): Request[js.Object, AWSError] = js.native
  def disassociateAssets(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
    */
  def disassociateAssets(params: DisassociateAssetsRequest): Request[js.Object, AWSError] = js.native
  def disassociateAssets(
    params: DisassociateAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets aggregated values for an asset property. For more information, see Querying aggregates in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyAggregates(): Request[GetAssetPropertyAggregatesResponse, AWSError] = js.native
  def getAssetPropertyAggregates(callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyAggregatesResponse, Unit]): Request[GetAssetPropertyAggregatesResponse, AWSError] = js.native
  /**
    * Gets aggregated values for an asset property. For more information, see Querying aggregates in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyAggregates(params: GetAssetPropertyAggregatesRequest): Request[GetAssetPropertyAggregatesResponse, AWSError] = js.native
  def getAssetPropertyAggregates(
    params: GetAssetPropertyAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyAggregatesResponse, Unit]
  ): Request[GetAssetPropertyAggregatesResponse, AWSError] = js.native
  
  /**
    * Gets an asset property's current value. For more information, see Querying current values in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyValue(): Request[GetAssetPropertyValueResponse, AWSError] = js.native
  def getAssetPropertyValue(callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyValueResponse, Unit]): Request[GetAssetPropertyValueResponse, AWSError] = js.native
  /**
    * Gets an asset property's current value. For more information, see Querying current values in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyValue(params: GetAssetPropertyValueRequest): Request[GetAssetPropertyValueResponse, AWSError] = js.native
  def getAssetPropertyValue(
    params: GetAssetPropertyValueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyValueResponse, Unit]
  ): Request[GetAssetPropertyValueResponse, AWSError] = js.native
  
  /**
    * Gets the history of an asset property's values. For more information, see Querying historical values in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyValueHistory(): Request[GetAssetPropertyValueHistoryResponse, AWSError] = js.native
  def getAssetPropertyValueHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyValueHistoryResponse, Unit]): Request[GetAssetPropertyValueHistoryResponse, AWSError] = js.native
  /**
    * Gets the history of an asset property's values. For more information, see Querying historical values in the AWS IoT SiteWise User Guide. To identify an asset property, you must specify one of the following:   The assetId and propertyId of an asset property.   A propertyAlias, which is a data stream alias (for example, /company/windfarm/3/turbine/7/temperature). To define an asset property's alias, see UpdateAssetProperty.  
    */
  def getAssetPropertyValueHistory(params: GetAssetPropertyValueHistoryRequest): Request[GetAssetPropertyValueHistoryResponse, AWSError] = js.native
  def getAssetPropertyValueHistory(
    params: GetAssetPropertyValueHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssetPropertyValueHistoryResponse, Unit]
  ): Request[GetAssetPropertyValueHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of access policies for an identity (an AWS SSO user, an AWS SSO group, or an IAM user) or an AWS IoT SiteWise Monitor resource (a portal or project).
    */
  def listAccessPolicies(): Request[ListAccessPoliciesResponse, AWSError] = js.native
  def listAccessPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPoliciesResponse, Unit]): Request[ListAccessPoliciesResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of access policies for an identity (an AWS SSO user, an AWS SSO group, or an IAM user) or an AWS IoT SiteWise Monitor resource (a portal or project).
    */
  def listAccessPolicies(params: ListAccessPoliciesRequest): Request[ListAccessPoliciesResponse, AWSError] = js.native
  def listAccessPolicies(
    params: ListAccessPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPoliciesResponse, Unit]
  ): Request[ListAccessPoliciesResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of summaries of all asset models.
    */
  def listAssetModels(): Request[ListAssetModelsResponse, AWSError] = js.native
  def listAssetModels(callback: js.Function2[/* err */ AWSError, /* data */ ListAssetModelsResponse, Unit]): Request[ListAssetModelsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of summaries of all asset models.
    */
  def listAssetModels(params: ListAssetModelsRequest): Request[ListAssetModelsResponse, AWSError] = js.native
  def listAssetModels(
    params: ListAssetModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssetModelsResponse, Unit]
  ): Request[ListAssetModelsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of asset summaries. You can use this operation to do the following:   List assets based on a specific asset model.   List top-level assets.   You can't use this operation to list all assets. To retrieve summaries for all of your assets, use ListAssetModels to get all of your asset model IDs. Then, use ListAssets to get all assets for each asset model.
    */
  def listAssets(): Request[ListAssetsResponse, AWSError] = js.native
  def listAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsResponse, Unit]): Request[ListAssetsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of asset summaries. You can use this operation to do the following:   List assets based on a specific asset model.   List top-level assets.   You can't use this operation to list all assets. To retrieve summaries for all of your assets, use ListAssetModels to get all of your asset model IDs. Then, use ListAssets to get all assets for each asset model.
    */
  def listAssets(params: ListAssetsRequest): Request[ListAssetsResponse, AWSError] = js.native
  def listAssets(
    params: ListAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsResponse, Unit]
  ): Request[ListAssetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of associated assets. You can use this operation to do the following:   List child assets associated to a parent asset by a hierarchy that you specify.   List an asset's parent asset.  
    */
  def listAssociatedAssets(): Request[ListAssociatedAssetsResponse, AWSError] = js.native
  def listAssociatedAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedAssetsResponse, Unit]): Request[ListAssociatedAssetsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of associated assets. You can use this operation to do the following:   List child assets associated to a parent asset by a hierarchy that you specify.   List an asset's parent asset.  
    */
  def listAssociatedAssets(params: ListAssociatedAssetsRequest): Request[ListAssociatedAssetsResponse, AWSError] = js.native
  def listAssociatedAssets(
    params: ListAssociatedAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedAssetsResponse, Unit]
  ): Request[ListAssociatedAssetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
    */
  def listDashboards(): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]): Request[ListDashboardsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
    */
  def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(
    params: ListDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]
  ): Request[ListDashboardsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of gateways.
    */
  def listGateways(): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]): Request[ListGatewaysResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of gateways.
    */
  def listGateways(params: ListGatewaysRequest): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(
    params: ListGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]
  ): Request[ListGatewaysResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
    */
  def listPortals(): Request[ListPortalsResponse, AWSError] = js.native
  def listPortals(callback: js.Function2[/* err */ AWSError, /* data */ ListPortalsResponse, Unit]): Request[ListPortalsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
    */
  def listPortals(params: ListPortalsRequest): Request[ListPortalsResponse, AWSError] = js.native
  def listPortals(
    params: ListPortalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPortalsResponse, Unit]
  ): Request[ListPortalsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
    */
  def listProjectAssets(): Request[ListProjectAssetsResponse, AWSError] = js.native
  def listProjectAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectAssetsResponse, Unit]): Request[ListProjectAssetsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
    */
  def listProjectAssets(params: ListProjectAssetsRequest): Request[ListProjectAssetsResponse, AWSError] = js.native
  def listProjectAssets(
    params: ListProjectAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectAssetsResponse, Unit]
  ): Request[ListProjectAssetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of tags for an AWS IoT SiteWise resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the list of tags for an AWS IoT SiteWise resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sets logging options for AWS IoT SiteWise.
    */
  def putLoggingOptions(): Request[PutLoggingOptionsResponse, AWSError] = js.native
  def putLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingOptionsResponse, Unit]): Request[PutLoggingOptionsResponse, AWSError] = js.native
  /**
    * Sets logging options for AWS IoT SiteWise.
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): Request[PutLoggingOptionsResponse, AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingOptionsResponse, Unit]
  ): Request[PutLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the tag's value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the tag's value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from an AWS IoT SiteWise resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an AWS IoT SiteWise resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing access policy that specifies an identity's access to an AWS IoT SiteWise Monitor portal or project resource.
    */
  def updateAccessPolicy(): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  def updateAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessPolicyResponse, Unit]): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  /**
    * Updates an existing access policy that specifies an identity's access to an AWS IoT SiteWise Monitor portal or project resource.
    */
  def updateAccessPolicy(params: UpdateAccessPolicyRequest): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  def updateAccessPolicy(
    params: UpdateAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessPolicyResponse, Unit]
  ): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Updates an asset's name. For more information, see Updating assets and models in the AWS IoT SiteWise User Guide.
    */
  def updateAsset(): Request[UpdateAssetResponse, AWSError] = js.native
  def updateAsset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetResponse, Unit]): Request[UpdateAssetResponse, AWSError] = js.native
  /**
    * Updates an asset's name. For more information, see Updating assets and models in the AWS IoT SiteWise User Guide.
    */
  def updateAsset(params: UpdateAssetRequest): Request[UpdateAssetResponse, AWSError] = js.native
  def updateAsset(
    params: UpdateAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetResponse, Unit]
  ): Request[UpdateAssetResponse, AWSError] = js.native
  
  /**
    * Updates an asset model and all of the assets that were created from the model. Each asset created from the model inherits the updated asset model's property and hierarchy definitions. For more information, see Updating assets and models in the AWS IoT SiteWise User Guide.  This operation overwrites the existing model with the provided model. To avoid deleting your asset model's properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For more information, see DescribeAssetModel. If you remove a property from an asset model, AWS IoT SiteWise deletes all previous data for that property. If you remove a hierarchy definition from an asset model, AWS IoT SiteWise disassociates every asset associated with that hierarchy. You can't change the type or data type of an existing property. 
    */
  def updateAssetModel(): Request[UpdateAssetModelResponse, AWSError] = js.native
  def updateAssetModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetModelResponse, Unit]): Request[UpdateAssetModelResponse, AWSError] = js.native
  /**
    * Updates an asset model and all of the assets that were created from the model. Each asset created from the model inherits the updated asset model's property and hierarchy definitions. For more information, see Updating assets and models in the AWS IoT SiteWise User Guide.  This operation overwrites the existing model with the provided model. To avoid deleting your asset model's properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For more information, see DescribeAssetModel. If you remove a property from an asset model, AWS IoT SiteWise deletes all previous data for that property. If you remove a hierarchy definition from an asset model, AWS IoT SiteWise disassociates every asset associated with that hierarchy. You can't change the type or data type of an existing property. 
    */
  def updateAssetModel(params: UpdateAssetModelRequest): Request[UpdateAssetModelResponse, AWSError] = js.native
  def updateAssetModel(
    params: UpdateAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetModelResponse, Unit]
  ): Request[UpdateAssetModelResponse, AWSError] = js.native
  
  /**
    * Updates an asset property's alias and notification state.  This operation overwrites the property's existing alias and notification state. To keep your existing property's alias or notification state, you must include the existing values in the UpdateAssetProperty request. For more information, see DescribeAssetProperty. 
    */
  def updateAssetProperty(): Request[js.Object, AWSError] = js.native
  def updateAssetProperty(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an asset property's alias and notification state.  This operation overwrites the property's existing alias and notification state. To keep your existing property's alias or notification state, you must include the existing values in the UpdateAssetProperty request. For more information, see DescribeAssetProperty. 
    */
  def updateAssetProperty(params: UpdateAssetPropertyRequest): Request[js.Object, AWSError] = js.native
  def updateAssetProperty(
    params: UpdateAssetPropertyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an AWS IoT SiteWise Monitor dashboard.
    */
  def updateDashboard(): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]): Request[UpdateDashboardResponse, AWSError] = js.native
  /**
    * Updates an AWS IoT SiteWise Monitor dashboard.
    */
  def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(
    params: UpdateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]
  ): Request[UpdateDashboardResponse, AWSError] = js.native
  
  /**
    * Updates a gateway's name.
    */
  def updateGateway(): Request[js.Object, AWSError] = js.native
  def updateGateway(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a gateway's name.
    */
  def updateGateway(params: UpdateGatewayRequest): Request[js.Object, AWSError] = js.native
  def updateGateway(
    params: UpdateGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a gateway capability configuration or defines a new capability configuration. Each gateway capability defines data sources for a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability configuration. To list all capability configurations for a gateway, use DescribeGateway.
    */
  def updateGatewayCapabilityConfiguration(): Request[UpdateGatewayCapabilityConfigurationResponse, AWSError] = js.native
  def updateGatewayCapabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayCapabilityConfigurationResponse, Unit]
  ): Request[UpdateGatewayCapabilityConfigurationResponse, AWSError] = js.native
  /**
    * Updates a gateway capability configuration or defines a new capability configuration. Each gateway capability defines data sources for a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability configuration. To list all capability configurations for a gateway, use DescribeGateway.
    */
  def updateGatewayCapabilityConfiguration(params: UpdateGatewayCapabilityConfigurationRequest): Request[UpdateGatewayCapabilityConfigurationResponse, AWSError] = js.native
  def updateGatewayCapabilityConfiguration(
    params: UpdateGatewayCapabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayCapabilityConfigurationResponse, Unit]
  ): Request[UpdateGatewayCapabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates an AWS IoT SiteWise Monitor portal.
    */
  def updatePortal(): Request[UpdatePortalResponse, AWSError] = js.native
  def updatePortal(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortalResponse, Unit]): Request[UpdatePortalResponse, AWSError] = js.native
  /**
    * Updates an AWS IoT SiteWise Monitor portal.
    */
  def updatePortal(params: UpdatePortalRequest): Request[UpdatePortalResponse, AWSError] = js.native
  def updatePortal(
    params: UpdatePortalRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePortalResponse, Unit]
  ): Request[UpdatePortalResponse, AWSError] = js.native
  
  /**
    * Updates an AWS IoT SiteWise Monitor project.
    */
  def updateProject(): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]): Request[UpdateProjectResponse, AWSError] = js.native
  /**
    * Updates an AWS IoT SiteWise Monitor project.
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]
  ): Request[UpdateProjectResponse, AWSError] = js.native
  
  /**
    * Waits for the assetActive state by periodically calling the underlying IoTSiteWise.describeAssetoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetActive(state: assetActive): Request[DescribeAssetResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetActive(
    state: assetActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Waits for the assetActive state by periodically calling the underlying IoTSiteWise.describeAssetoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetActive(state: assetActive, params: DescribeAssetRequestwaite): Request[DescribeAssetResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetActive(
    state: assetActive,
    params: DescribeAssetRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Waits for the assetModelActive state by periodically calling the underlying IoTSiteWise.describeAssetModeloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetModelActive(state: assetModelActive): Request[DescribeAssetModelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetModelActive(
    state: assetModelActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]
  ): Request[DescribeAssetModelResponse, AWSError] = js.native
  /**
    * Waits for the assetModelActive state by periodically calling the underlying IoTSiteWise.describeAssetModeloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetModelActive(state: assetModelActive, params: typings.awsSdk.anon.DescribeAssetModelRequest): Request[DescribeAssetModelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetModelActive(
    state: assetModelActive,
    params: typings.awsSdk.anon.DescribeAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]
  ): Request[DescribeAssetModelResponse, AWSError] = js.native
  /**
    * Waits for the assetModelNotExists state by periodically calling the underlying IoTSiteWise.describeAssetModeloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetModelNotExists(state: assetModelNotExists): Request[DescribeAssetModelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetModelNotExists(
    state: assetModelNotExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]
  ): Request[DescribeAssetModelResponse, AWSError] = js.native
  /**
    * Waits for the assetModelNotExists state by periodically calling the underlying IoTSiteWise.describeAssetModeloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetModelNotExists(state: assetModelNotExists, params: typings.awsSdk.anon.DescribeAssetModelRequest): Request[DescribeAssetModelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetModelNotExists(
    state: assetModelNotExists,
    params: typings.awsSdk.anon.DescribeAssetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetModelResponse, Unit]
  ): Request[DescribeAssetModelResponse, AWSError] = js.native
  /**
    * Waits for the assetNotExists state by periodically calling the underlying IoTSiteWise.describeAssetoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetNotExists(state: assetNotExists): Request[DescribeAssetResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetNotExists(
    state: assetNotExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Waits for the assetNotExists state by periodically calling the underlying IoTSiteWise.describeAssetoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_assetNotExists(state: assetNotExists, params: DescribeAssetRequestwaite): Request[DescribeAssetResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_assetNotExists(
    state: assetNotExists,
    params: DescribeAssetRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Waits for the portalActive state by periodically calling the underlying IoTSiteWise.describePortaloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_portalActive(state: portalActive): Request[DescribePortalResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_portalActive(
    state: portalActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]
  ): Request[DescribePortalResponse, AWSError] = js.native
  /**
    * Waits for the portalActive state by periodically calling the underlying IoTSiteWise.describePortaloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_portalActive(state: portalActive, params: DescribePortalRequestwait): Request[DescribePortalResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_portalActive(
    state: portalActive,
    params: DescribePortalRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]
  ): Request[DescribePortalResponse, AWSError] = js.native
  /**
    * Waits for the portalNotExists state by periodically calling the underlying IoTSiteWise.describePortaloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_portalNotExists(state: portalNotExists): Request[DescribePortalResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_portalNotExists(
    state: portalNotExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]
  ): Request[DescribePortalResponse, AWSError] = js.native
  /**
    * Waits for the portalNotExists state by periodically calling the underlying IoTSiteWise.describePortaloperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_portalNotExists(state: portalNotExists, params: DescribePortalRequestwait): Request[DescribePortalResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_portalNotExists(
    state: portalNotExists,
    params: DescribePortalRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePortalResponse, Unit]
  ): Request[DescribePortalResponse, AWSError] = js.native
}
