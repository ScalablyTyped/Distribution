package typings.canvasDashGauges.CanvasGaugesNs

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.SmartCanvas")
@js.native
class SmartCanvas protected () extends js.Object {
  def this(element: HTMLCanvasElement) = this()
  def this(element: HTMLCanvasElement, width: Double) = this()
  def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
  var context: CanvasRenderingContext2D = js.native
  var contextClone: CanvasRenderingContext2D = js.native
  var drawHeight: Double = js.native
  var drawWidth: Double = js.native
  var drawX: Double = js.native
  var drawY: Double = js.native
  var element: HTMLCanvasElement = js.native
  var elementClone: HTMLCanvasElement = js.native
  var height: Double = js.native
  var minSide: Double = js.native
  var pixelRatio: Double = js.native
  var width: Double = js.native
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
  var collection: js.Array[SmartCanvas] = js.native
  def redraw(): js.Any = js.native
}

