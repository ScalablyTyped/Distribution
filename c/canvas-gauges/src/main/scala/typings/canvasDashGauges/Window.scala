package typings.canvasDashGauges

import typings.canvasDashGauges.CanvasGauges.BaseGauge
import typings.canvasDashGauges.CanvasGauges.LinearGauge
import typings.canvasDashGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typings.canvasDashGauges.CanvasGauges.BaseGauge
  var LinearGauge: typings.canvasDashGauges.CanvasGauges.LinearGauge
  var RadialGauge: typings.canvasDashGauges.CanvasGauges.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

