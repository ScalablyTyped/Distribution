package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetDetails extends js.Object {
  /** The pattern for the primary URL. For details on the format of a pattern, see Content Setting Patterns. */
  var primaryPattern: java.lang.String
  /** Optional. The resource identifier for the content type.  */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  /** Optional. Where to set the setting (default: regular).  */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of a pattern, see Content Setting Patterns.  */
  var secondaryPattern: js.UndefOr[java.lang.String] = js.undefined
  /** The setting applied by this rule. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any
}

