package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
import typings.builderUtilRuntime.builderUtilRuntimeStrings.github
import typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
import typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AllPublishOptions extends js.Object

object _AllPublishOptions {
  @scala.inline
  def SpacesOptions(name: String, provider: spaces, region: String): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def GenericServerOptions(provider: generic, url: String): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def S3Options(bucket: String, provider: s3): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def CustomPublishOptions(provider: PublishProvider): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def GithubOptions(provider: github): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def BintrayOptions(provider: bintray): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
}

