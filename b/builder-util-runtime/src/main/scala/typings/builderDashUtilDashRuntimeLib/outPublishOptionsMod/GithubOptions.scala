package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GithubOptions extends PublishConfiguration {
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
       * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update.md#private-github-update-repo).
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
       * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update.md#appupdatersetfeedurloptions).
       */
  val token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Whether to use `v`-prefixed tag name.
       * @default true
       */
  val vPrefixedTagName: js.UndefOr[scala.Boolean] = js.undefined
}

