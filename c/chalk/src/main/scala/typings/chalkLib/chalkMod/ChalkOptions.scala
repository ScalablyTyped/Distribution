package typings
package chalkLib.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChalkOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[Level] = js.undefined
}

object ChalkOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, level: Level = null): ChalkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[ChalkOptions]
  }
}

