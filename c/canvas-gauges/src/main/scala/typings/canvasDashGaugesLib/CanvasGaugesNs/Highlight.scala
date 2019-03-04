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
    val __obj = js.Dynamic.literal(color = color, from = from, to = to)
  
    __obj.asInstanceOf[Highlight]
  }
}

