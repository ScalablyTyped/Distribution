package typings.chalk.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChalkOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Level] = js.undefined
}

object ChalkOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, level: Level = null): ChalkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChalkOptions]
  }
}

