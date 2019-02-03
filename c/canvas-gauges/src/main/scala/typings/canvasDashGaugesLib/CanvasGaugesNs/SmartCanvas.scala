package typings
package canvasDashGaugesLib.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.SmartCanvas")
@js.native
class SmartCanvas protected () extends js.Object {
  def this(element: stdLib.HTMLCanvasElement) = this()
  def this(element: stdLib.HTMLCanvasElement, width: scala.Double) = this()
  def this(element: stdLib.HTMLCanvasElement, width: scala.Double, height: scala.Double) = this()
  var context: stdLib.CanvasRenderingContext2D = js.native
  var contextClone: stdLib.CanvasRenderingContext2D = js.native
  var drawHeight: scala.Double = js.native
  var drawWidth: scala.Double = js.native
  var drawX: scala.Double = js.native
  var drawY: scala.Double = js.native
  var element: stdLib.HTMLCanvasElement = js.native
  var elementClone: stdLib.HTMLCanvasElement = js.native
  var height: scala.Double = js.native
  var minSide: scala.Double = js.native
  var pixelRatio: scala.Double = js.native
  var width: scala.Double = js.native
  def commit(): SmartCanvas = js.native
  def destroy(): js.Any = js.native
  def init(): js.Any = js.native
  def onRedraw(): js.Any = js.native
  def redraw(): SmartCanvas = js.native
}

/* static members */
@JSGlobal("CanvasGauges.SmartCanvas")
@js.native
object SmartCanvas extends js.Object {
  var collection: js.Array[canvasDashGaugesLib.CanvasGaugesNs.SmartCanvas] = js.native
  def redraw(): js.Any = js.native
}

