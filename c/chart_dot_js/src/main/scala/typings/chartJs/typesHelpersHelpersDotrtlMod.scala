package typings.chartJs

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.ltr
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.rtl
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotrtlMod {
  
  @JSImport("chart.js/types/helpers/helpers.rtl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRtlAdapter(rtl: Boolean, rectX: Double, width: Double): RTLAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("getRtlAdapter")(rtl.asInstanceOf[js.Any], rectX.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RTLAdapter]
  
  inline def overrideTextDirection(ctx: CanvasRenderingContext2D, direction: ltr | rtl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTextDirection")(ctx.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D, original: js.Tuple2[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait RTLAdapter extends StObject {
    
    def leftForLtr(x: Double, itemWidth: Double): Double
    
    def setWidth(w: Double): Unit
    
    def textAlign(align: center | left | right): center | left | right
    
    def x(x: Double): Double
    
    def xPlus(x: Double, value: Double): Double
  }
  object RTLAdapter {
    
    inline def apply(
      leftForLtr: (Double, Double) => Double,
      setWidth: Double => Unit,
      textAlign: center | left | right => center | left | right,
      x: Double => Double,
      xPlus: (Double, Double) => Double
    ): RTLAdapter = {
      val __obj = js.Dynamic.literal(leftForLtr = js.Any.fromFunction2(leftForLtr), setWidth = js.Any.fromFunction1(setWidth), textAlign = js.Any.fromFunction1(textAlign), x = js.Any.fromFunction1(x), xPlus = js.Any.fromFunction2(xPlus))
      __obj.asInstanceOf[RTLAdapter]
    }
    
    extension [Self <: RTLAdapter](x: Self) {
      
      inline def setLeftForLtr(value: (Double, Double) => Double): Self = StObject.set(x, "leftForLtr", js.Any.fromFunction2(value))
      
      inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setTextAlign(value: center | left | right => center | left | right): Self = StObject.set(x, "textAlign", js.Any.fromFunction1(value))
      
      inline def setX(value: Double => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXPlus(value: (Double, Double) => Double): Self = StObject.set(x, "xPlus", js.Any.fromFunction2(value))
    }
  }
}
