package typings.builderUtilRuntime.publishOptionsMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import typings.node.httpMod.OutgoingHttpHeaders
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
  ): BintrayOptions = {
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
    __obj.asInstanceOf[BintrayOptions]
  }
}

