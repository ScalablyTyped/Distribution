package typings.canvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distViewPortMod {
  
  @JSImport("canvg/dist/ViewPort", "ViewPort")
  @js.native
  open class ViewPort () extends StObject {
    
    def clear(): Unit = js.native
    
    def computeSize(): Double = js.native
    def computeSize(d: Double): Double = js.native
    def computeSize(d: Axis): Double = js.native
    
    def getCurrent(): IViewPortSize = js.native
    
    def getRoot(): IViewPortSize = js.native
    
    def height: Double = js.native
    
    def removeCurrent(): Unit = js.native
    
    def setCurrent(width: Double, height: Double): Unit = js.native
    
    var viewPorts: js.Array[IViewPortSize] = js.native
    
    def width: Double = js.native
  }
  /* static members */
  object ViewPort {
    
    @JSImport("canvg/dist/ViewPort", "ViewPort")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvg/dist/ViewPort", "ViewPort.DEFAULT_VIEWPORT_HEIGHT")
    @js.native
    def DEFAULT_VIEWPORT_HEIGHT: Double = js.native
    inline def DEFAULT_VIEWPORT_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEWPORT_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("canvg/dist/ViewPort", "ViewPort.DEFAULT_VIEWPORT_WIDTH")
    @js.native
    def DEFAULT_VIEWPORT_WIDTH: Double = js.native
    inline def DEFAULT_VIEWPORT_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEWPORT_WIDTH")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvg.canvgStrings.x
    - typings.canvg.canvgStrings.y
  */
  trait Axis extends StObject
  object Axis {
    
    inline def x: typings.canvg.canvgStrings.x = "x".asInstanceOf[typings.canvg.canvgStrings.x]
    
    inline def y: typings.canvg.canvgStrings.y = "y".asInstanceOf[typings.canvg.canvgStrings.y]
  }
  
  trait IViewPortSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object IViewPortSize {
    
    inline def apply(height: Double, width: Double): IViewPortSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewPortSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IViewPortSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
