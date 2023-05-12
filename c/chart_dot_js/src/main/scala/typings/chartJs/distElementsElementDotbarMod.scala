package typings.chartJs

import typings.chartJs.anon.X
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distElementsElementDotbarMod {
  
  @JSImport("chart.js/dist/elements/element.bar", JSImport.Default)
  @js.native
  open class default protected () extends BarElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/elements/element.bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/elements/element.bar", "default.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/elements/element.bar", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BarElement
    extends typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject] {
    
    var base: Any = js.native
    
    def draw(ctx: Any): Unit = js.native
    
    def getCenterPoint(useFinalPosition: Any): X = js.native
    
    def getRange(axis: Any): Double = js.native
    
    var height: Any = js.native
    
    var horizontal: Any = js.native
    
    def inRange(mouseX: Any, mouseY: Any, useFinalPosition: Any): Boolean = js.native
    
    def inXRange(mouseX: Any, useFinalPosition: Any): Boolean = js.native
    
    def inYRange(mouseY: Any, useFinalPosition: Any): Boolean = js.native
    
    var inflateAmount: Any = js.native
    
    var width: Any = js.native
  }
  
  trait BarProps extends StObject {
    
    var base: Double
    
    var height: Double
    
    var horizontal: Boolean
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object BarProps {
    
    inline def apply(base: Double, height: Double, horizontal: Boolean, width: Double, x: Double, y: Double): BarProps = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarProps] (val x: Self) extends AnyVal {
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
