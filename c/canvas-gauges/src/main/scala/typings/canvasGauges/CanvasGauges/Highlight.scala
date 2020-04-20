package typings.canvasGauges.CanvasGauges

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
}

