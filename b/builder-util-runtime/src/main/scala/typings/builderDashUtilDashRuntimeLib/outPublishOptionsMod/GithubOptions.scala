package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

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
  val host: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The owner.
    */
  val owner: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update#private-github-update-repo).
    */
  val `private`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The protocol. GitHub Publisher supports only `https`.
    * @default https
    */
  val protocol: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.https | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.http | scala.Null
  ] = js.undefined
  /**
    * The provider. Must be `github`.
    */
  @JSName("provider")
  val provider_GithubOptions: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.github
  /**
    * The type of release. By default `draft` release will be created.
    *
    * Also you can set release type using environment variable. If `EP_DRAFT`is set to `true` — `draft`, if `EP_PRE_RELEASE`is set to `true` — `prerelease`.
    * @default draft
    */
  var releaseType: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.draft | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.prerelease | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.release | scala.Null
  ] = js.undefined
  /**
    * The repository name. [Detected automatically](#github-repository-and-bintray-package).
    */
  val repo: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update#appupdatersetfeedurloptions).
    */
  val token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to use `v`-prefixed tag name.
    * @default true
    */
  val vPrefixedTagName: js.UndefOr[scala.Boolean] = js.undefined
}

object GithubOptions {
  @scala.inline
  def apply(
    provider: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.github,
    host: java.lang.String = null,
    owner: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.https | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.http = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    releaseType: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.draft | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.prerelease | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.release = null,
    repo: java.lang.String = null,
    token: java.lang.String = null,
    updaterCacheDirName: java.lang.String = null,
    vPrefixedTagName: js.UndefOr[scala.Boolean] = js.undefined
  ): GithubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    if (host != null) __obj.updateDynamic("host")(host)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (releaseType != null) __obj.updateDynamic("releaseType")(releaseType.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo)
    if (token != null) __obj.updateDynamic("token")(token)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    if (!js.isUndefined(vPrefixedTagName)) __obj.updateDynamic("vPrefixedTagName")(vPrefixedTagName)
    __obj.asInstanceOf[GithubOptions]
  }
}

