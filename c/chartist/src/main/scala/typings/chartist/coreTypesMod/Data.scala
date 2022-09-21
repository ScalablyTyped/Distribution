package typings.chartist.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T /* <: AllSeriesTypes */] extends StObject {
  
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
  
  var series: T
}
object Data {
  
  inline def apply[T /* <: AllSeriesTypes */](series: T): Data[T] = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  extension [Self <: Data[?], T /* <: AllSeriesTypes */](x: Self & Data[T]) {
    
    inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setSeries(value: T): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
