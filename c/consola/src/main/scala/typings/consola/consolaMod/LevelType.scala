package typings.consola.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelType extends js.Object {
  var color: String
  var isError: js.UndefOr[Boolean] = js.undefined
  var level: Double
}

object LevelType {
  @scala.inline
  def apply(color: String, level: Double, isError: js.UndefOr[Boolean] = js.undefined): LevelType = {
    val __obj = js.Dynamic.literal(color = color, level = level)
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError)
    __obj.asInstanceOf[LevelType]
  }
}

