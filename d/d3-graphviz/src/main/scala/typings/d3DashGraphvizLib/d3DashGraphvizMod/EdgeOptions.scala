package typings
package d3DashGraphvizLib.d3DashGraphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeOptions extends js.Object {
  var shortening: scala.Double
}

object EdgeOptions {
  @scala.inline
  def apply(shortening: scala.Double): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shortening")(shortening)
    __obj.asInstanceOf[EdgeOptions]
  }
}

