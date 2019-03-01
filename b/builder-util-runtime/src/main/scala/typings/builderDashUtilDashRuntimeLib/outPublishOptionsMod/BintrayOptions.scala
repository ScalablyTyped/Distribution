package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BintrayOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The Bintray component (Debian only).
    */
  val component: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray distribution (Debian only).
    * @default stable
    */
  val distribution: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The owner.
    */
  val owner: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray package name.
    */
  val `package`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The provider. Must be `bintray`.
    */
  @JSName("provider")
  val provider_BintrayOptions: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.bintray
  /**
    * The Bintray repository name.
    * @default generic
    */
  val repo: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray user account. Used in cases where the owner is an organization.
    */
  val user: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object BintrayOptions {
  @scala.inline
  def apply(
    provider: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.bintray,
    component: java.lang.String = null,
    distribution: java.lang.String = null,
    owner: java.lang.String = null,
    `package`: java.lang.String = null,
    publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    publisherName: js.Array[java.lang.String] = null,
    repo: java.lang.String = null,
    token: java.lang.String = null,
    updaterCacheDirName: java.lang.String = null,
    user: java.lang.String = null
  ): BintrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
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

