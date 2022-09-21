package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDataPoint extends StObject {
  
  var datasetIndex: Double
  
  var index: Double
}
object ActiveDataPoint {
  
  inline def apply(datasetIndex: Double, index: Double): ActiveDataPoint = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDataPoint]
  }
  
  extension [Self <: ActiveDataPoint](x: Self) {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
