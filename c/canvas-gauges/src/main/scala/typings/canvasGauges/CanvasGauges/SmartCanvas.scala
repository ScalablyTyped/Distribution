package typings.canvasGauges.CanvasGauges

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartCanvas extends js.Object {
  
  def commit(): SmartCanvas = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  var contextClone: CanvasRenderingContext2D = js.native
  
  def destroy(): js.Any = js.native
  
  var drawHeight: Double = js.native
  
  var drawWidth: Double = js.native
  
  var drawX: Double = js.native
  
  var drawY: Double = js.native
  
  var element: HTMLCanvasElement = js.native
  
  var elementClone: HTMLCanvasElement = js.native
  
  var height: Double = js.native
  
  def init(): js.Any = js.native
  
  var minSide: Double = js.native
  
  def onRedraw(): js.Any = js.native
  
  var pixelRatio: Double = js.native
  
  def redraw(): SmartCanvas = js.native
  
  var width: Double = js.native
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
  
  @scala.inline
  implicit class SmartCanvasOps[Self <: SmartCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommit(value: () => SmartCanvas): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextClone(value: CanvasRenderingContext2D): Self = this.set("contextClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => js.Any): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawHeight(value: Double): Self = this.set("drawHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawWidth(value: Double): Self = this.set("drawWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawX(value: Double): Self = this.set("drawX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawY(value: Double): Self = this.set("drawY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLCanvasElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementClone(value: HTMLCanvasElement): Self = this.set("elementClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => js.Any): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinSide(value: Double): Self = this.set("minSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRedraw(value: () => js.Any): Self = this.set("onRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedraw(value: () => SmartCanvas): Self = this.set("redraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
