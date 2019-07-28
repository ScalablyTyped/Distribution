package typings.canvasDashGauges.canvasDashGaugesMod

import typings.canvasDashGauges.CanvasGaugesNs.GenericOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "BaseGauge")
@js.native
abstract class BaseGauge protected ()
  extends typings.canvasDashGauges.CanvasGaugesNs.BaseGauge {
  def this(options: GenericOptions) = this()
}

/* static members */
@JSImport("canvas-gauges", "BaseGauge")
@js.native
object BaseGauge extends js.Object {
  val version: Double = js.native
  def ensureValue(value: Double): Double = js.native
  def fromElement(element: HTMLElement): js.Any = js.native
  def initialize(`type`: String, options: GenericOptions): js.Any = js.native
}

