package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
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
  var suggested_key: js.UndefOr[Anon_Chromeos] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    suggested_key: Anon_Chromeos = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key)
    __obj.asInstanceOf[Anon_Description]
  }
}

