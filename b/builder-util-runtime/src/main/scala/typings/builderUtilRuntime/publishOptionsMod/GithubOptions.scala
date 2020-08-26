package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typings.builderUtilRuntime.builderUtilRuntimeStrings.github
import typings.builderUtilRuntime.builderUtilRuntimeStrings.http
import typings.builderUtilRuntime.builderUtilRuntimeStrings.https
import typings.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typings.builderUtilRuntime.builderUtilRuntimeStrings.release
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GithubOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The host (including the port if need).
    * @default github.com
    */
  val host: js.UndefOr[String | Null] = js.native
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.native
  /**
    * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update#private-github-update-repo).
    */
  val `private`: js.UndefOr[Boolean | Null] = js.native
  /**
    * The protocol. GitHub Publisher supports only `https`.
    * @default https
    */
  val protocol: js.UndefOr[https | http | Null] = js.native
  /**
    * The provider. Must be `github`.
    */
  @JSName("provider")
  val provider_GithubOptions: github = js.native
  /**
    * The type of release. By default `draft` release will be created.
    *
    * Also you can set release type using environment variable. If `EP_DRAFT`is set to `true` — `draft`, if `EP_PRE_RELEASE`is set to `true` — `prerelease`.
    * @default draft
    */
  var releaseType: js.UndefOr[draft | prerelease | release | Null] = js.native
  /**
    * The repository name. [Detected automatically](#github-repository-and-bintray-package).
    */
  val repo: js.UndefOr[String | Null] = js.native
  /**
    * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update#appupdatersetfeedurloptions).
    */
  val token: js.UndefOr[String | Null] = js.native
  /**
    * Whether to use `v`-prefixed tag name.
    * @default true
    */
  val vPrefixedTagName: js.UndefOr[Boolean] = js.native
}

object GithubOptions {
  @scala.inline
  def apply(provider: github): GithubOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubOptions]
  }
  @scala.inline
  implicit class GithubOptionsOps[Self <: GithubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvider(value: github): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setPrivateNull: Self = this.set("private", null)
    @scala.inline
    def setProtocol(value: https | http): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    @scala.inline
    def setReleaseType(value: draft | prerelease | release): Self = this.set("releaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseType: Self = this.set("releaseType", js.undefined)
    @scala.inline
    def setReleaseTypeNull: Self = this.set("releaseType", null)
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    @scala.inline
    def setRepoNull: Self = this.set("repo", null)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTokenNull: Self = this.set("token", null)
    @scala.inline
    def setVPrefixedTagName(value: Boolean): Self = this.set("vPrefixedTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPrefixedTagName: Self = this.set("vPrefixedTagName", js.undefined)
  }
  
}

