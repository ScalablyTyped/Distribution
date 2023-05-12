package typings.chartJs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.chartJs.distScalesMod.TimeSeriesScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofscales extends StObject {
  
  var CategoryScale: TypeofCategoryScale
  
  var LinearScale: TypeofLinearScale
  
  var LogarithmicScale: TypeofLogarithmicScale
  
  var RadialLinearScale: TypeofRadialLinearScale
  
  var TimeScale: TypeofTimeScale
  
  var TimeSeriesScale: Instantiable0[typings.chartJs.distScalesMod.TimeSeriesScale]
}
object Typeofscales {
  
  inline def apply(
    CategoryScale: TypeofCategoryScale,
    LinearScale: TypeofLinearScale,
    LogarithmicScale: TypeofLogarithmicScale,
    RadialLinearScale: TypeofRadialLinearScale,
    TimeScale: TypeofTimeScale,
    TimeSeriesScale: Instantiable0[TimeSeriesScale]
  ): Typeofscales = {
    val __obj = js.Dynamic.literal(CategoryScale = CategoryScale.asInstanceOf[js.Any], LinearScale = LinearScale.asInstanceOf[js.Any], LogarithmicScale = LogarithmicScale.asInstanceOf[js.Any], RadialLinearScale = RadialLinearScale.asInstanceOf[js.Any], TimeScale = TimeScale.asInstanceOf[js.Any], TimeSeriesScale = TimeSeriesScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofscales]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofscales] (val x: Self) extends AnyVal {
    
    inline def setCategoryScale(value: TypeofCategoryScale): Self = StObject.set(x, "CategoryScale", value.asInstanceOf[js.Any])
    
    inline def setLinearScale(value: TypeofLinearScale): Self = StObject.set(x, "LinearScale", value.asInstanceOf[js.Any])
    
    inline def setLogarithmicScale(value: TypeofLogarithmicScale): Self = StObject.set(x, "LogarithmicScale", value.asInstanceOf[js.Any])
    
    inline def setRadialLinearScale(value: TypeofRadialLinearScale): Self = StObject.set(x, "RadialLinearScale", value.asInstanceOf[js.Any])
    
    inline def setTimeScale(value: TypeofTimeScale): Self = StObject.set(x, "TimeScale", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesScale(value: Instantiable0[TimeSeriesScale]): Self = StObject.set(x, "TimeSeriesScale", value.asInstanceOf[js.Any])
  }
}
