package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.BaseGauge
import typings.canvasGauges.CanvasGauges.LinearGauge
import typings.canvasGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typings.canvasGauges.CanvasGauges.BaseGauge
  var LinearGauge: typings.canvasGauges.CanvasGauges.LinearGauge
  var RadialGauge: typings.canvasGauges.CanvasGauges.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

