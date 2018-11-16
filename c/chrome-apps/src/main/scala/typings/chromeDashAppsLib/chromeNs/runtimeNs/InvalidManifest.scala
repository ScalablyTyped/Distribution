package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InvalidManifest extends PartialManifest {
  /** Not for packaged apps */
  var browser_action: js.UndefOr[scala.Nothing] = js.undefined
  /**
               * Not for packaged apps
               * Only for extensions and legacy packaged apps
               */
  var chrome_url_overrides: js.UndefOr[scala.Nothing] = js.undefined
  /**
               * Not for packaged apps
               * Only for extensions and legacy packaged apps
               */
  var content_security_policy: js.UndefOr[scala.Nothing] = js.undefined
  /** Not for packaged apps */
  var options_page: js.UndefOr[scala.Nothing] = js.undefined
  //
  // Never types - should never exist
  // Are declared to prevent use since many
  // legacy app are using them. Will result
  // in errors. Many examples and code bases
  // have these included.
  //
  /** Not for packaged apps */
  var options_ui: js.UndefOr[scala.Nothing] = js.undefined
}

