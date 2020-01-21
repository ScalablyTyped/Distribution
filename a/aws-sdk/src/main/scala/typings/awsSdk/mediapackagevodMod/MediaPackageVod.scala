package typings.awsSdk.mediapackagevodMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

