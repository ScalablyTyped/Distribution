package typings.canvasGauges.CanvasGauges

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartCanvas extends js.Object {
  var context: CanvasRenderingContext2D
  var contextClone: CanvasRenderingContext2D
  var drawHeight: Double
  var drawWidth: Double
  var drawX: Double
  var drawY: Double
  var element: HTMLCanvasElement
  var elementClone: HTMLCanvasElement
  var height: Double
  var minSide: Double
  var pixelRatio: Double
  var width: Double
  def commit(): SmartCanvas
  def destroy(): js.Any
  def init(): js.Any
  def onRedraw(): js.Any
  def redraw(): SmartCanvas
}

object SmartCanvas {
  @scala.inline
  def apply(
    commit: () => SmartCanvas,
    context: CanvasRenderingContext2D,
    contextClone: CanvasRenderingContext2D,
    destroy: () => js.Any,
    drawHeight: Double,
    drawWidth: Double,
    drawX: Double,
    drawY: Double,
    element: HTMLCanvasElement,
    elementClone: HTMLCanvasElement,
    height: Double,
    init: () => js.Any,
    minSide: Double,
    onRedraw: () => js.Any,
    pixelRatio: Double,
    redraw: () => SmartCanvas,
    width: Double
  ): SmartCanvas = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), context = context.asInstanceOf[js.Any], contextClone = contextClone.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), drawHeight = drawHeight.asInstanceOf[js.Any], drawWidth = drawWidth.asInstanceOf[js.Any], drawX = drawX.asInstanceOf[js.Any], drawY = drawY.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], elementClone = elementClone.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), minSide = minSide.asInstanceOf[js.Any], onRedraw = js.Any.fromFunction0(onRedraw), pixelRatio = pixelRatio.asInstanceOf[js.Any], redraw = js.Any.fromFunction0(redraw), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCanvas]
  }
}

