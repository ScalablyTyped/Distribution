package typings.bizcharts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var points: js.UndefOr[js.Array[js.Tuple2[Double, Double]]] = js.undefined
}
object Points {
  
  inline def apply(): Points = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
