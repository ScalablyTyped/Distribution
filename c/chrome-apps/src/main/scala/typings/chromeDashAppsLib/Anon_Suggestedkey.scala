package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Suggestedkey extends js.Object {
  /** Command description */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Global scope? */
  var global: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Keys can be provided matching this pattern:
    * ^(Ctrl|Command|MacCtrl|Alt|Option)\\+(Shift\\+)?[A-Z]
    * @example
    * 'suggested_key': {
    *     'default': 'Ctrl+Shift+Y',
    *     'mac': 'Command+Shift+Y'
    * },
    */
  var suggested_key: js.UndefOr[Anon_Mac] = js.undefined
}

