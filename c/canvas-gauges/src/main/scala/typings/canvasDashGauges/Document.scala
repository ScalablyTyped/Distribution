package typings.canvasDashGauges

import typings.canvasDashGauges.CanvasGauges.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var gauges: Collection
}

object Document {
  @scala.inline
  def apply(gauges: Collection): Document = {
    val __obj = js.Dynamic.literal(gauges = gauges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Document]
  }
}

