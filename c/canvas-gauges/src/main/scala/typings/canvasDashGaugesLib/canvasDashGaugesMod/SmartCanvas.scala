package typings
package canvasDashGaugesLib.canvasDashGaugesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "SmartCanvas")
@js.native
class SmartCanvas protected ()
  extends canvasDashGaugesLib.CanvasGaugesNs.SmartCanvas {
  def this(element: stdLib.HTMLCanvasElement) = this()
  def this(element: stdLib.HTMLCanvasElement, width: scala.Double) = this()
  def this(element: stdLib.HTMLCanvasElement, width: scala.Double, height: scala.Double) = this()
}

/* static members */
@JSImport("canvas-gauges", "SmartCanvas")
@js.native
object SmartCanvas extends js.Object {
  var collection: js.Array[canvasDashGaugesLib.CanvasGaugesNs.SmartCanvas] = js.native
  def redraw(): js.Any = js.native
}

