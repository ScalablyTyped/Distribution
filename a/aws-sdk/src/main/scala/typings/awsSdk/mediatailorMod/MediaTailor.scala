package typings.awsSdk.mediatailorMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTailor extends Service {
  @JSName("config")
  var config_MediaTailor: ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the playback configuration for the specified name. 
    */
  def deletePlaybackConfiguration(): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the playback configuration for the specified name. 
    */
  def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(
    params: DeletePlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]
  ): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Returns the playback configuration for the specified name. 
    */
  def getPlaybackConfiguration(): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Returns the playback configuration for the specified name. 
    */
  def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(
    params: GetPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]
  ): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(
    params: ListPlaybackConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]
  ): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified playback configuration resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified playback configuration resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds a new playback configuration to AWS Elemental MediaTailor. 
    */
  def putPlaybackConfiguration(): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Adds a new playback configuration to AWS Elemental MediaTailor. 
    */
  def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(
    params: PutPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]
  ): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add. 
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add. 
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove. 
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove. 
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

