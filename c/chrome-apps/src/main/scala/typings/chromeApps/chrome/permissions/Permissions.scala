package typings.chromeApps.chrome.permissions

import typings.chromeApps.chrome.runtime.OptionalPermission
import typings.chromeApps.chrome.runtime.UrlMatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  /**
    * List of origin permissions.
    * Anything listed here must be a subset of a host that appears in the
    * optional_permissions list in the manifest. For example, if
    * http:// *.example.com/ or http:// * appears in optional_permissions,
    * you can request an origin of http://help.example.com/.
    * Any path is ignored.
    */
  var origins: js.UndefOr[js.Array[String | UrlMatches]] = js.undefined
  /**
    * List of named permissions (does not include hosts or origins).
    * Anything listed here must appear in the optional_permissions list in the manifest.
    */
  var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.undefined
}

object Permissions {
  @scala.inline
  def apply(origins: js.Array[String | UrlMatches] = null, permissions: js.Array[OptionalPermission] = null): Permissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
}

