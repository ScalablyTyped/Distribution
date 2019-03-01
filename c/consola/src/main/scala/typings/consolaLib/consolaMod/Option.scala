package typings
package consolaLib.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var level: js.UndefOr[scala.Double] = js.undefined
  var reporters: js.UndefOr[js.Array[Reporter]] = js.undefined
  var types: js.UndefOr[LevelType] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    level: scala.Int | scala.Double = null,
    reporters: js.Array[Reporter] = null,
    types: LevelType = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[Option]
  }
}

