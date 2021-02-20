package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationAlgorithm extends StObject {
  
  var interpolationAlgorithm: js.UndefOr[typings.cesium.mod.InterpolationAlgorithm] = js.native
  
  var interpolationDegree: js.UndefOr[Double] = js.native
}
object InterpolationAlgorithm {
  
  @scala.inline
  def apply(): InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationAlgorithm]
  }
  
  @scala.inline
  implicit class InterpolationAlgorithmMutableBuilder[Self <: InterpolationAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpolationAlgorithm(value: typings.cesium.mod.InterpolationAlgorithm): Self = StObject.set(x, "interpolationAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationAlgorithmUndefined: Self = StObject.set(x, "interpolationAlgorithm", js.undefined)
    
    @scala.inline
    def setInterpolationDegree(value: Double): Self = StObject.set(x, "interpolationDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationDegreeUndefined: Self = StObject.set(x, "interpolationDegree", js.undefined)
  }
}
