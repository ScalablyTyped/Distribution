package typings
package consolaLib.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelType extends js.Object {
  var color: java.lang.String
  var isError: js.UndefOr[scala.Boolean] = js.undefined
  var level: scala.Double
}

object LevelType {
  @scala.inline
  def apply(color: java.lang.String, level: scala.Double, isError: js.UndefOr[scala.Boolean] = js.undefined): LevelType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("level")(level)
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError)
    __obj.asInstanceOf[LevelType]
  }
}

