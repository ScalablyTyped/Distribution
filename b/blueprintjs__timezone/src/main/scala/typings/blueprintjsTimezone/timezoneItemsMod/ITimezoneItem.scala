package typings.blueprintjsTimezone.timezoneItemsMod

import typings.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimezoneItem extends js.Object {
  /** Optional icon for the timezone. */
  var iconName: js.UndefOr[IconName] = js.undefined
  /** Key to be used as the rendered react key. */
  var key: String
  /** Label for the timezone. */
  var label: String
  /** Text for the timezone. */
  var text: String
  /** The actual timezone. */
  var timezone: String
}

object ITimezoneItem {
  @scala.inline
  def apply(key: String, label: String, text: String, timezone: String, iconName: IconName = null): ITimezoneItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    if (iconName != null) __obj.updateDynamic("iconName")(iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneItem]
  }
}

