package typings
package canvasDashGaugesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var gauges: canvasDashGaugesLib.CanvasGaugesNs.Collection
}

object Document {
  @scala.inline
  def apply(gauges: canvasDashGaugesLib.CanvasGaugesNs.Collection): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gauges")(gauges)
    __obj.asInstanceOf[Document]
  }
}

