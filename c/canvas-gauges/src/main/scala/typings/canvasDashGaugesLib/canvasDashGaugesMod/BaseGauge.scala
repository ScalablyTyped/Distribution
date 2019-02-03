package typings
package canvasDashGaugesLib.canvasDashGaugesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "BaseGauge")
@js.native
abstract class BaseGauge protected ()
  extends canvasDashGaugesLib.CanvasGaugesNs.BaseGauge {
  def this(options: canvasDashGaugesLib.CanvasGaugesNs.GenericOptions) = this()
}

/* static members */
@JSImport("canvas-gauges", "BaseGauge")
@js.native
object BaseGauge extends js.Object {
  val version: scala.Double = js.native
  def ensureValue(value: scala.Double): scala.Double = js.native
  def fromElement(element: stdLib.HTMLElement): js.Any = js.native
  def initialize(`type`: java.lang.String, options: canvasDashGaugesLib.CanvasGaugesNs.GenericOptions): js.Any = js.native
}

