package typings
package bricksDotJsLib.bricksDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BricksOptions extends js.Object {
  var container: stdLib.Node | java.lang.String
  var packed: java.lang.String
  var position: js.UndefOr[scala.Boolean] = js.undefined
  var sizes: js.Array[SizeDetail]
}

object BricksOptions {
  @scala.inline
  def apply(
    container: stdLib.Node | java.lang.String,
    packed: java.lang.String,
    sizes: js.Array[SizeDetail],
    position: js.UndefOr[scala.Boolean] = js.undefined
  ): BricksOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], packed = packed, sizes = sizes)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[BricksOptions]
  }
}

