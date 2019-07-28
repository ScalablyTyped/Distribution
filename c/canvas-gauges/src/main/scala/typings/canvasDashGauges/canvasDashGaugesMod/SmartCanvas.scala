package typings.canvasDashGauges.canvasDashGaugesMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "SmartCanvas")
@js.native
class SmartCanvas protected ()
  extends typings.canvasDashGauges.CanvasGaugesNs.SmartCanvas {
  def this(element: HTMLCanvasElement) = this()
  def this(element: HTMLCanvasElement, width: Double) = this()
  def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
}

/* static members */
@JSImport("canvas-gauges", "SmartCanvas")
@js.native
object SmartCanvas extends js.Object {
  var collection: js.Array[typings.canvasDashGauges.CanvasGaugesNs.SmartCanvas] = js.native
  def redraw(): js.Any = js.native
}

