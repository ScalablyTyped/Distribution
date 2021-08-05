package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScalingParametersResponse extends StObject {
  
  var ScalingParameters: ScalingParametersStatus
}
object UpdateScalingParametersResponse {
  
  inline def apply(ScalingParameters: ScalingParametersStatus): UpdateScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersResponse]
  }
  
  extension [Self <: UpdateScalingParametersResponse](x: Self) {
    
    inline def setScalingParameters(value: ScalingParametersStatus): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
