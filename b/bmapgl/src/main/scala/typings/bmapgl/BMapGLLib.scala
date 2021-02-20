package typings.bmapgl

import typings.bmapgl.BMapGL.DrawingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BMapGLLib {
  
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait DistanceTool extends StObject {
    
    def addEventListener(event: String, handler: Callback): Unit = js.native
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
    
    def removeEventListener(event: String, handler: Callback): Unit = js.native
  }
  object DistanceTool {
    
    @scala.inline
    def apply(
      addEventListener: (String, Callback) => Unit,
      close: () => Unit,
      open: () => Unit,
      removeEventListener: (String, Callback) => Unit
    ): DistanceTool = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[DistanceTool]
    }
    
    @scala.inline
    implicit class DistanceToolMutableBuilder[Self <: DistanceTool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DrawingManager extends StObject {
    
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
    implicit class DrawingManagerMutableBuilder[Self <: DrawingManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableCalculate(value: () => Unit): Self = StObject.set(x, "disableCalculate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableCalculate(value: () => Unit): Self = StObject.set(x, "enableCalculate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDrawingMode(value: () => DrawingType): Self = StObject.set(x, "getDrawingMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDrawingMode(value: DrawingType => Unit): Self = StObject.set(x, "setDrawingMode", js.Any.fromFunction1(value))
    }
  }
}
