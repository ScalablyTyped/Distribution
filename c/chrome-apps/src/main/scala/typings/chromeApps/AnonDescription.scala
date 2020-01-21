package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  /** Command description */
  var description: js.UndefOr[String] = js.undefined
  /** Global scope? */
  var global: js.UndefOr[Boolean] = js.undefined
  /**
    * Keys can be provided matching this pattern:
    * ^(Ctrl|Command|MacCtrl|Alt|Option)\\+(Shift\\+)?[A-Z]
    * @example
    * 'suggested_key': {
    *     'default': 'Ctrl+Shift+Y',
    *     'mac': 'Command+Shift+Y'
    * },
    */
  var suggested_key: js.UndefOr[AnonChromeos] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(
    description: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    suggested_key: AnonChromeos = null
  ): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

