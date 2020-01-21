package typings.awsSdk.migrationhubconfigMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationHubConfig extends Service {
  @JSName("config")
  var config_MigrationHubConfig: ConfigBase with ClientConfiguration = js.native
  /**
    * This API sets up the home region for the calling account only.
    */
  def createHomeRegionControl(): Request[CreateHomeRegionControlResult, AWSError] = js.native
  def createHomeRegionControl(callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]): Request[CreateHomeRegionControlResult, AWSError] = js.native
  /**
    * This API sets up the home region for the calling account only.
    */
  def createHomeRegionControl(params: CreateHomeRegionControlRequest): Request[CreateHomeRegionControlResult, AWSError] = js.native
  def createHomeRegionControl(
    params: CreateHomeRegionControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]
  ): Request[CreateHomeRegionControlResult, AWSError] = js.native
  /**
    * This API permits filtering on the ControlId, HomeRegion, and RegionControlScope fields.
    */
  def describeHomeRegionControls(): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
  def describeHomeRegionControls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
  /**
    * This API permits filtering on the ControlId, HomeRegion, and RegionControlScope fields.
    */
  def describeHomeRegionControls(params: DescribeHomeRegionControlsRequest): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
  def describeHomeRegionControls(
    params: DescribeHomeRegionControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]
  ): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
  /**
    * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
    */
  def getHomeRegion(): Request[GetHomeRegionResult, AWSError] = js.native
  def getHomeRegion(callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]): Request[GetHomeRegionResult, AWSError] = js.native
  /**
    * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
    */
  def getHomeRegion(params: GetHomeRegionRequest): Request[GetHomeRegionResult, AWSError] = js.native
  def getHomeRegion(
    params: GetHomeRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]
  ): Request[GetHomeRegionResult, AWSError] = js.native
}

