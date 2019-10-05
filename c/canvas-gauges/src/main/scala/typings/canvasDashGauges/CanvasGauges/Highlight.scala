package typings.canvasDashGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Highlight extends js.Object {
  var color: String
  var from: Double
  var to: Double
}

object Highlight {
  @scala.inline
  def apply(color: String, from: Double, to: Double): Highlight = {
    val __obj = js.Dynamic.literal(color = color, from = from, to = to)
  
    __obj.asInstanceOf[Highlight]
  }
}

