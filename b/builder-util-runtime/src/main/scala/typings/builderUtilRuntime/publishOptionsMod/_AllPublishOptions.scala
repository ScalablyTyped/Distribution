package typings.builderUtilRuntime.publishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.builderUtilRuntimeStrings.AES256
import typings.builderUtilRuntime.builderUtilRuntimeStrings.REDUCED_REDUNDANCY
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD
import typings.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD_IA
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.awsColonkms
import typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import typings.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
import typings.builderUtilRuntime.builderUtilRuntimeStrings.github
import typings.builderUtilRuntime.builderUtilRuntimeStrings.http
import typings.builderUtilRuntime.builderUtilRuntimeStrings.https
import typings.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typings.builderUtilRuntime.builderUtilRuntimeStrings.release
import typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
import typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AllPublishOptions extends js.Object

object _AllPublishOptions {
  @scala.inline
  def SpacesOptions(
    name: String,
    provider: spaces,
    region: String,
    acl: js.UndefOr[Null | `private` | `public-read`] = js.undefined,
    channel: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (!js.isUndefined(acl)) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def GenericServerOptions(
    provider: generic,
    url: String,
    channel: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined,
    useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(useMultipleRangeRequest)) __obj.updateDynamic("useMultipleRangeRequest")(useMultipleRangeRequest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def S3Options(
    bucket: String,
    provider: s3,
    acl: js.UndefOr[Null | `private` | `public-read`] = js.undefined,
    channel: js.UndefOr[Null | String] = js.undefined,
    encryption: js.UndefOr[Null | AES256 | awsColonkms] = js.undefined,
    endpoint: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    region: js.UndefOr[Null | String] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    storageClass: js.UndefOr[Null | STANDARD | REDUCED_REDUNDANCY | STANDARD_IA] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(acl)) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(encryption)) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(endpoint)) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(region)) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(storageClass)) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def CustomPublishOptions(
    provider: PublishProvider,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def GithubOptions(
    provider: github,
    host: js.UndefOr[Null | String] = js.undefined,
    owner: js.UndefOr[Null | String] = js.undefined,
    `private`: js.UndefOr[Null | Boolean] = js.undefined,
    protocol: js.UndefOr[Null | https | http] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    releaseType: js.UndefOr[Null | draft | prerelease | release] = js.undefined,
    repo: js.UndefOr[Null | String] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    token: js.UndefOr[Null | String] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined,
    vPrefixedTagName: js.UndefOr[Boolean] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (!js.isUndefined(protocol)) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseType)) __obj.updateDynamic("releaseType")(releaseType.asInstanceOf[js.Any])
    if (!js.isUndefined(repo)) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(vPrefixedTagName)) __obj.updateDynamic("vPrefixedTagName")(vPrefixedTagName.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def BintrayOptions(
    provider: bintray,
    _package: js.UndefOr[Null | String] = js.undefined,
    component: js.UndefOr[Null | String] = js.undefined,
    distribution: js.UndefOr[Null | String] = js.undefined,
    owner: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    repo: js.UndefOr[Null | String] = js.undefined,
    requestHeaders: OutgoingHttpHeaders = null,
    token: js.UndefOr[Null | String] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined,
    user: js.UndefOr[Null | String] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(_package)) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(distribution)) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(repo)) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(user)) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
}

