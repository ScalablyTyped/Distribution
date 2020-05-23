package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typings.builderUtilRuntime.builderUtilRuntimeStrings.github
import typings.builderUtilRuntime.builderUtilRuntimeStrings.http
import typings.builderUtilRuntime.builderUtilRuntimeStrings.https
import typings.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typings.builderUtilRuntime.builderUtilRuntimeStrings.release
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The host (including the port if need).
    * @default github.com
    */
  val host: js.UndefOr[String | Null] = js.undefined
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update#private-github-update-repo).
    */
  val `private`: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * The protocol. GitHub Publisher supports only `https`.
    * @default https
    */
  val protocol: js.UndefOr[https | http | Null] = js.undefined
  /**
    * The provider. Must be `github`.
    */
  @JSName("provider")
  val provider_GithubOptions: github
  /**
    * The type of release. By default `draft` release will be created.
    *
    * Also you can set release type using environment variable. If `EP_DRAFT`is set to `true` — `draft`, if `EP_PRE_RELEASE`is set to `true` — `prerelease`.
    * @default draft
    */
  var releaseType: js.UndefOr[draft | prerelease | release | Null] = js.undefined
  /**
    * The repository name. [Detected automatically](#github-repository-and-bintray-package).
    */
  val repo: js.UndefOr[String | Null] = js.undefined
  /**
    * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update#appupdatersetfeedurloptions).
    */
  val token: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to use `v`-prefixed tag name.
    * @default true
    */
  val vPrefixedTagName: js.UndefOr[Boolean] = js.undefined
}

object GithubOptions {
  @scala.inline
  def apply(
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
  ): GithubOptions = {
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
    __obj.asInstanceOf[GithubOptions]
  }
}

