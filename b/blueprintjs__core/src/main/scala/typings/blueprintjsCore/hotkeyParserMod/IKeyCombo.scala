package typings.blueprintjsCore.hotkeyParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyCombo extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var modifiers: Double
}

object IKeyCombo {
  @scala.inline
  def apply(modifiers: Double, key: String = null): IKeyCombo = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyCombo]
  }
}

