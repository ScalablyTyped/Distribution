package typings.bmapgl.BMapGLLib

import typings.bmapgl.BMapGL.DrawingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManager extends js.Object {
  
  def addEventListener(event: String, handler: Callback): Unit = js.native
  
  def close(): Unit = js.native
  
  def disableCalculate(): Unit = js.native
  
  def enableCalculate(): Unit = js.native
  
  def getDrawingMode(): DrawingType = js.native
  
  def open(): Unit = js.native
  
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  def setDrawingMode(drawingType: DrawingType): Unit = js.native
}
object DrawingManager {
  
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    close: () => Unit,
    disableCalculate: () => Unit,
    enableCalculate: () => Unit,
    getDrawingMode: () => DrawingType,
    open: () => Unit,
    removeEventListener: (String, Callback) => Unit,
    setDrawingMode: DrawingType => Unit
  ): DrawingManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), disableCalculate = js.Any.fromFunction0(disableCalculate), enableCalculate = js.Any.fromFunction0(enableCalculate), getDrawingMode = js.Any.fromFunction0(getDrawingMode), open = js.Any.fromFunction0(open), removeEventListener = js.Any.fromFunction2(removeEventListener), setDrawingMode = js.Any.fromFunction1(setDrawingMode))
    __obj.asInstanceOf[DrawingManager]
  }
  
  @scala.inline
  implicit class DrawingManagerOps[Self <: DrawingManager] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, Callback) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableCalculate(value: () => Unit): Self = this.set("disableCalculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableCalculate(value: () => Unit): Self = this.set("enableCalculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDrawingMode(value: () => DrawingType): Self = this.set("getDrawingMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDrawingMode(value: DrawingType => Unit): Self = this.set("setDrawingMode", js.Any.fromFunction1(value))
  }
}
