package typings.awsSdk.mediapackagevodMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPackageVod extends Service {
  
  @JSName("config")
  var config_MediaPackageVod: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new MediaPackage VOD Asset resource.
    */
  def createAsset(): Request[CreateAssetResponse, AWSError] = js.native
  def createAsset(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetResponse, Unit]): Request[CreateAssetResponse, AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD Asset resource.
    */
  def createAsset(params: CreateAssetRequest): Request[CreateAssetResponse, AWSError] = js.native
  def createAsset(
    params: CreateAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssetResponse, Unit]
  ): Request[CreateAssetResponse, AWSError] = js.native
  
  /**
    * Creates a new MediaPackage VOD PackagingConfiguration resource.
    */
  def createPackagingConfiguration(): Request[CreatePackagingConfigurationResponse, AWSError] = js.native
  def createPackagingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackagingConfigurationResponse, Unit]): Request[CreatePackagingConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingConfiguration resource.
    */
  def createPackagingConfiguration(params: CreatePackagingConfigurationRequest): Request[CreatePackagingConfigurationResponse, AWSError] = js.native
  def createPackagingConfiguration(
    params: CreatePackagingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackagingConfigurationResponse, Unit]
  ): Request[CreatePackagingConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a new MediaPackage VOD PackagingGroup resource.
    */
  def createPackagingGroup(): Request[CreatePackagingGroupResponse, AWSError] = js.native
  def createPackagingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackagingGroupResponse, Unit]): Request[CreatePackagingGroupResponse, AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingGroup resource.
    */
  def createPackagingGroup(params: CreatePackagingGroupRequest): Request[CreatePackagingGroupResponse, AWSError] = js.native
  def createPackagingGroup(
    params: CreatePackagingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackagingGroupResponse, Unit]
  ): Request[CreatePackagingGroupResponse, AWSError] = js.native
  
  /**
    * Deletes an existing MediaPackage VOD Asset resource.
    */
  def deleteAsset(): Request[DeleteAssetResponse, AWSError] = js.native
  def deleteAsset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetResponse, Unit]): Request[DeleteAssetResponse, AWSError] = js.native
  /**
    * Deletes an existing MediaPackage VOD Asset resource.
    */
  def deleteAsset(params: DeleteAssetRequest): Request[DeleteAssetResponse, AWSError] = js.native
  def deleteAsset(
    params: DeleteAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssetResponse, Unit]
  ): Request[DeleteAssetResponse, AWSError] = js.native
  
  /**
    * Deletes a MediaPackage VOD PackagingConfiguration resource.
    */
  def deletePackagingConfiguration(): Request[DeletePackagingConfigurationResponse, AWSError] = js.native
  def deletePackagingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackagingConfigurationResponse, Unit]): Request[DeletePackagingConfigurationResponse, AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingConfiguration resource.
    */
  def deletePackagingConfiguration(params: DeletePackagingConfigurationRequest): Request[DeletePackagingConfigurationResponse, AWSError] = js.native
  def deletePackagingConfiguration(
    params: DeletePackagingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackagingConfigurationResponse, Unit]
  ): Request[DeletePackagingConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes a MediaPackage VOD PackagingGroup resource.
    */
  def deletePackagingGroup(): Request[DeletePackagingGroupResponse, AWSError] = js.native
  def deletePackagingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackagingGroupResponse, Unit]): Request[DeletePackagingGroupResponse, AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingGroup resource.
    */
  def deletePackagingGroup(params: DeletePackagingGroupRequest): Request[DeletePackagingGroupResponse, AWSError] = js.native
  def deletePackagingGroup(
    params: DeletePackagingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackagingGroupResponse, Unit]
  ): Request[DeletePackagingGroupResponse, AWSError] = js.native
  
  /**
    * Returns a description of a MediaPackage VOD Asset resource.
    */
  def describeAsset(): Request[DescribeAssetResponse, AWSError] = js.native
  def describeAsset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]): Request[DescribeAssetResponse, AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD Asset resource.
    */
  def describeAsset(params: DescribeAssetRequest): Request[DescribeAssetResponse, AWSError] = js.native
  def describeAsset(
    params: DescribeAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAssetResponse, Unit]
  ): Request[DescribeAssetResponse, AWSError] = js.native
  
  /**
    * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
    */
  def describePackagingConfiguration(): Request[DescribePackagingConfigurationResponse, AWSError] = js.native
  def describePackagingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagingConfigurationResponse, Unit]
  ): Request[DescribePackagingConfigurationResponse, AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
    */
  def describePackagingConfiguration(params: DescribePackagingConfigurationRequest): Request[DescribePackagingConfigurationResponse, AWSError] = js.native
  def describePackagingConfiguration(
    params: DescribePackagingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagingConfigurationResponse, Unit]
  ): Request[DescribePackagingConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns a description of a MediaPackage VOD PackagingGroup resource.
    */
  def describePackagingGroup(): Request[DescribePackagingGroupResponse, AWSError] = js.native
  def describePackagingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagingGroupResponse, Unit]): Request[DescribePackagingGroupResponse, AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingGroup resource.
    */
  def describePackagingGroup(params: DescribePackagingGroupRequest): Request[DescribePackagingGroupResponse, AWSError] = js.native
  def describePackagingGroup(
    params: DescribePackagingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagingGroupResponse, Unit]
  ): Request[DescribePackagingGroupResponse, AWSError] = js.native
  
  /**
    * Returns a collection of MediaPackage VOD Asset resources.
    */
  def listAssets(): Request[ListAssetsResponse, AWSError] = js.native
  def listAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsResponse, Unit]): Request[ListAssetsResponse, AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD Asset resources.
    */
  def listAssets(params: ListAssetsRequest): Request[ListAssetsResponse, AWSError] = js.native
  def listAssets(
    params: ListAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssetsResponse, Unit]
  ): Request[ListAssetsResponse, AWSError] = js.native
  
  /**
    * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
    */
  def listPackagingConfigurations(): Request[ListPackagingConfigurationsResponse, AWSError] = js.native
  def listPackagingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagingConfigurationsResponse, Unit]): Request[ListPackagingConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
    */
  def listPackagingConfigurations(params: ListPackagingConfigurationsRequest): Request[ListPackagingConfigurationsResponse, AWSError] = js.native
  def listPackagingConfigurations(
    params: ListPackagingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagingConfigurationsResponse, Unit]
  ): Request[ListPackagingConfigurationsResponse, AWSError] = js.native
  
  /**
    * Returns a collection of MediaPackage VOD PackagingGroup resources.
    */
  def listPackagingGroups(): Request[ListPackagingGroupsResponse, AWSError] = js.native
  def listPackagingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagingGroupsResponse, Unit]): Request[ListPackagingGroupsResponse, AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingGroup resources.
    */
  def listPackagingGroups(params: ListPackagingGroupsRequest): Request[ListPackagingGroupsResponse, AWSError] = js.native
  def listPackagingGroups(
    params: ListPackagingGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagingGroupsResponse, Unit]
  ): Request[ListPackagingGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds tags to the specified resource. You can specify one or more tags to add.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to the specified resource. You can specify one or more tags to add.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes tags from the specified resource. You can specify one or more tags to remove.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from the specified resource. You can specify one or more tags to remove.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specific packaging group. You can't change the id attribute or any other system-generated attributes.
    */
  def updatePackagingGroup(): Request[UpdatePackagingGroupResponse, AWSError] = js.native
  def updatePackagingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackagingGroupResponse, Unit]): Request[UpdatePackagingGroupResponse, AWSError] = js.native
  /**
    * Updates a specific packaging group. You can't change the id attribute or any other system-generated attributes.
    */
  def updatePackagingGroup(params: UpdatePackagingGroupRequest): Request[UpdatePackagingGroupResponse, AWSError] = js.native
  def updatePackagingGroup(
    params: UpdatePackagingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackagingGroupResponse, Unit]
  ): Request[UpdatePackagingGroupResponse, AWSError] = js.native
}
