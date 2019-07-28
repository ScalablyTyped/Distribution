package typings.canvasDashGauges

import typings.canvasDashGauges.CanvasGaugesNs.BaseGauge
import typings.canvasDashGauges.CanvasGaugesNs.LinearGauge
import typings.canvasDashGauges.CanvasGaugesNs.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typings.canvasDashGauges.CanvasGaugesNs.BaseGauge
  var LinearGauge: typings.canvasDashGauges.CanvasGaugesNs.LinearGauge
  var RadialGauge: typings.canvasDashGauges.CanvasGaugesNs.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge, LinearGauge = LinearGauge, RadialGauge = RadialGauge)
  
    __obj.asInstanceOf[Window]
  }
}

