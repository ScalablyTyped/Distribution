package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  var all: js.Array[Double]
  
  var data: js.Array[Double]
  
  var labels: js.Array[Double]
}
object All {
  
  inline def apply(all: js.Array[Double], data: js.Array[Double], labels: js.Array[Double]): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: js.Array[Double]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: Double*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLabels(value: js.Array[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: Double*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
