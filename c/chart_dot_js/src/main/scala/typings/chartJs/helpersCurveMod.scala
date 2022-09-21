package typings.chartJs

import typings.chartJs.anon.Next
import typings.chartJs.anon.SplinePointskipbooleanund
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersCurveMod {
  
  @JSImport("chart.js/types/helpers/helpers.curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splineCurve(
    firstPoint: SplinePointskipbooleanund,
    middlePoint: SplinePoint,
    afterPoint: SplinePoint,
    t: Double
  ): Next = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurve")(firstPoint.asInstanceOf[js.Any], middlePoint.asInstanceOf[js.Any], afterPoint.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Next]
  
  inline def splineCurveMonotone(points: js.Array[MonotoneSplinePoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def splineCurveMonotone(points: js.Array[MonotoneSplinePoint], indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MonotoneSplinePoint
    extends StObject
       with SplinePoint {
    
    var cp1x: js.UndefOr[Double] = js.undefined
    
    var cp1y: js.UndefOr[Double] = js.undefined
    
    var cp2x: js.UndefOr[Double] = js.undefined
    
    var cp2y: js.UndefOr[Double] = js.undefined
    
    var skip: Boolean
  }
  object MonotoneSplinePoint {
    
    inline def apply(skip: Boolean, x: Double, y: Double): MonotoneSplinePoint = {
      val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonotoneSplinePoint]
    }
    
    extension [Self <: MonotoneSplinePoint](x: Self) {
      
      inline def setCp1x(value: Double): Self = StObject.set(x, "cp1x", value.asInstanceOf[js.Any])
      
      inline def setCp1xUndefined: Self = StObject.set(x, "cp1x", js.undefined)
      
      inline def setCp1y(value: Double): Self = StObject.set(x, "cp1y", value.asInstanceOf[js.Any])
      
      inline def setCp1yUndefined: Self = StObject.set(x, "cp1y", js.undefined)
      
      inline def setCp2x(value: Double): Self = StObject.set(x, "cp2x", value.asInstanceOf[js.Any])
      
      inline def setCp2xUndefined: Self = StObject.set(x, "cp2x", js.undefined)
      
      inline def setCp2y(value: Double): Self = StObject.set(x, "cp2y", value.asInstanceOf[js.Any])
      
      inline def setCp2yUndefined: Self = StObject.set(x, "cp2y", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplinePoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object SplinePoint {
    
    inline def apply(x: Double, y: Double): SplinePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplinePoint]
    }
    
    extension [Self <: SplinePoint](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
