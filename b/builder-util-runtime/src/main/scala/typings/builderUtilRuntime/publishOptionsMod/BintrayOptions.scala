package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BintrayOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The Bintray package name.
    */
  @JSName("package")
  val _package: js.UndefOr[String | Null] = js.undefined
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
    _package: String = null,
    component: String = null,
    distribution: String = null,
    owner: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    repo: String = null,
    token: String = null,
    updaterCacheDirName: String = null,
    user: String = null
  ): BintrayOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BintrayOptions]
  }
}

