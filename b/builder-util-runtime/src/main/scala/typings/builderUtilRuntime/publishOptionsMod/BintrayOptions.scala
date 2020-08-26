package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BintrayOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The Bintray package name.
    */
  @JSName("package")
  val _package: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray component (Debian only).
    */
  val component: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray distribution (Debian only).
    * @default stable
    */
  val distribution: js.UndefOr[String | Null] = js.native
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.native
  /**
    * The provider. Must be `bintray`.
    */
  @JSName("provider")
  val provider_BintrayOptions: bintray = js.native
  /**
    * The Bintray repository name.
    * @default generic
    */
  val repo: js.UndefOr[String | Null] = js.native
  val token: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray user account. Used in cases where the owner is an organization.
    */
  val user: js.UndefOr[String | Null] = js.native
}

object BintrayOptions {
  @scala.inline
  def apply(provider: bintray): BintrayOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BintrayOptions]
  }
  @scala.inline
  implicit class BintrayOptionsOps[Self <: BintrayOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: bintray): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def set_packageNull: Self = this.set("package", null)
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    @scala.inline
    def setDistribution(value: String): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setDistributionNull: Self = this.set("distribution", null)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
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
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

