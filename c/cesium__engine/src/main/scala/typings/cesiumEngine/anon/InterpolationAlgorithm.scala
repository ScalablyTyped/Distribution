package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationAlgorithm extends StObject {
  
  var interpolationAlgorithm: js.UndefOr[typings.cesiumEngine.mod.InterpolationAlgorithm] = js.undefined
  
  var interpolationDegree: js.UndefOr[Double] = js.undefined
}
object InterpolationAlgorithm {
  
  inline def apply(): InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setInterpolationAlgorithm(value: typings.cesiumEngine.mod.InterpolationAlgorithm): Self = StObject.set(x, "interpolationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setInterpolationAlgorithmUndefined: Self = StObject.set(x, "interpolationAlgorithm", js.undefined)
    
    inline def setInterpolationDegree(value: Double): Self = StObject.set(x, "interpolationDegree", value.asInstanceOf[js.Any])
    
    inline def setInterpolationDegreeUndefined: Self = StObject.set(x, "interpolationDegree", js.undefined)
  }
}
