package typings.builderDashUtilDashRuntime.outPublishOptionsMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.bintray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BintrayOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The Bintray component (Debian only).
    */
  val component: js.UndefOr[String | Null] = js.undefined
  /**
    * The Bintray distribution (Debian only).
    * @default stable
    */
  val distribution: js.UndefOr[String | Null] = js.undefined
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.undefined
  /**
    * The Bintray package name.
    */
  val `package`: js.UndefOr[String | Null] = js.undefined
  /**
    * The provider. Must be `bintray`.
    */
  @JSName("provider")
  val provider_BintrayOptions: bintray
  /**
    * The Bintray repository name.
    * @default generic
    */
  val repo: js.UndefOr[String | Null] = js.undefined
  val token: js.UndefOr[String | Null] = js.undefined
  /**
    * The Bintray user account. Used in cases where the owner is an organization.
    */
  val user: js.UndefOr[String | Null] = js.undefined
}

object BintrayOptions {
  @scala.inline
  def apply(
    provider: bintray,
    component: String = null,
    distribution: String = null,
    owner: String = null,
    `package`: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    repo: String = null,
    token: String = null,
    updaterCacheDirName: String = null,
    user: String = null
  ): BintrayOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (component != null) __obj.updateDynamic("component")(component)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (repo != null) __obj.updateDynamic("repo")(repo)
    if (token != null) __obj.updateDynamic("token")(token)
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[BintrayOptions]
  }
}

