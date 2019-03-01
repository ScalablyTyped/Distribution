package typings
package canvasDashGaugesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: canvasDashGaugesLib.CanvasGaugesNs.BaseGauge
  var LinearGauge: canvasDashGaugesLib.CanvasGaugesNs.LinearGauge
  var RadialGauge: canvasDashGaugesLib.CanvasGaugesNs.RadialGauge
}

object Window {
  @scala.inline
  def apply(
    BaseGauge: canvasDashGaugesLib.CanvasGaugesNs.BaseGauge,
    LinearGauge: canvasDashGaugesLib.CanvasGaugesNs.LinearGauge,
    RadialGauge: canvasDashGaugesLib.CanvasGaugesNs.RadialGauge
  ): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BaseGauge")(BaseGauge)
    __obj.updateDynamic("LinearGauge")(LinearGauge)
    __obj.updateDynamic("RadialGauge")(RadialGauge)
    __obj.asInstanceOf[Window]
  }
}

