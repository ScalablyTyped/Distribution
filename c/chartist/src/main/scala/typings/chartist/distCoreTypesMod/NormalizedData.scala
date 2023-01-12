package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedData[T /* <: AllNormalizedSeriesTypes */]
  extends StObject
     with Data[AllSeriesTypes] {
  
  @JSName("labels")
  var labels_NormalizedData: js.Array[Label]
  
  @JSName("series")
  var series_NormalizedData: T
}
object NormalizedData {
  
  inline def apply[T /* <: AllNormalizedSeriesTypes */](labels: js.Array[Label], series: T): NormalizedData[T] = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedData[?], T /* <: AllNormalizedSeriesTypes */] (val x: Self & NormalizedData[T]) extends AnyVal {
    
    inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setSeries(value: T): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
