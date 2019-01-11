package typings
package cloudflareDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * This is undocumented global variable.
    * The documentation may arrive later.
    */
  val CloudflareApps: cloudflareDashAppsLib.CloudflareAppsNs.CloudflareApps = js.native
  /**
    * It's the same as CloudflareApps variable.
    *
    * DON'T use this variable directly.
    * BAD Example:
    * ```ts
    * const apps: cloudflareApps.CloudflareApps = INSTALL;
    * ```
    * -------------------------------------------------
    * Use directly properties and methods.
    * GOOD Example:
    * ```ts
    * const siteId: string = INSTALL.siteId;
    * ```
    */
  val INSTALL: cloudflareDashAppsLib.CloudflareAppsNs.CloudflareApps = js.native
  /**
    * A string ID which is equal to the ID of this install.
    * Its primary purpose is to allow you to easily distinguish between your app being loaded
    * in the Cloudflare Preview or the installer’s live website.
    */
  val INSTALL_ID: java.lang.String = js.native
  val INSTALL_OPTIONS: cloudflareDashAppsLib.CloudflareAppsNs.InstallOptions = js.native
  /**
    * This object is specific to paid apps. It allows you to know which product the user has purchased.
    * When you create a paid app you will be given product ids for each of the plans you wish to sell the product for.
    * `INSTALL_PRODUCT.id` will then be that id for the plan the user has purchased.
    * This value is absent for free apps and will always be set for paid apps even if the user is on a free plan.
    */
  val INSTALL_PRODUCT: js.UndefOr[cloudflareDashAppsLib.CloudflareAppsNs.InstallProduct] = js.native
  /**
    * An object which you can use to store arbitrary values
    * which you would like to be accessable from other Cloudflare scripts,
    * without polluting the global scope.
    * For example, it’s commonly used to share an update function with its update handler.
    */
  val INSTALL_SCOPE: cloudflareDashAppsLib.CloudflareAppsNs.InstallScope = js.native
}

