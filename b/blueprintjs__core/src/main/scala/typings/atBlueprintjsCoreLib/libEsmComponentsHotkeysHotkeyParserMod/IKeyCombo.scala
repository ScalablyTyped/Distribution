package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyCombo extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var modifiers: scala.Double
}

object IKeyCombo {
  @scala.inline
  def apply(modifiers: scala.Double, key: java.lang.String = null): IKeyCombo = {
    val __obj = js.Dynamic.literal(modifiers = modifiers)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[IKeyCombo]
  }
}

