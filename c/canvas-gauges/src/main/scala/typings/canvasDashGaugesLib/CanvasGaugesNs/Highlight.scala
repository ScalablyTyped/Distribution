package typings
package canvasDashGaugesLib.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Highlight extends js.Object {
  var color: java.lang.String
  var from: scala.Double
  var to: scala.Double
}

object Highlight {
  @scala.inline
  def apply(color: java.lang.String, from: scala.Double, to: scala.Double): Highlight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Highlight]
  }
}

