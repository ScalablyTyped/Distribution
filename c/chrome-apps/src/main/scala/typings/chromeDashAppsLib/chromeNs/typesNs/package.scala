package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[DetailsCallback]
  /**
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
    *     when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  type ChromeSettingScope = chromeDashAppsLib.chromeDashAppsLibStrings.regular | chromeDashAppsLib.chromeDashAppsLibStrings.regular_only | chromeDashAppsLib.chromeDashAppsLibStrings.incognito_persistent | chromeDashAppsLib.chromeDashAppsLibStrings.incognito_session_only
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, scala.Unit]
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  type LevelOfControl = chromeDashAppsLib.chromeDashAppsLibStrings.not_controllable | chromeDashAppsLib.chromeDashAppsLibStrings.controlled_by_other_extensions | chromeDashAppsLib.chromeDashAppsLibStrings.controllable_by_this_extension | chromeDashAppsLib.chromeDashAppsLibStrings.controlled_by_this_extension
}
