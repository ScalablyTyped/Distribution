package typings.bricksJs.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: Node | String
  var packed: String
  var position: js.UndefOr[Boolean] = js.undefined
  var sizes: js.Array[SizeDetail]
}

object Options {
  @scala.inline
  def apply(
    container: Node | String,
    packed: String,
    sizes: js.Array[SizeDetail],
    position: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

