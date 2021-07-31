package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingParametersStatus extends StObject {
  
  var Options: ScalingParameters
  
  var Status: OptionStatus
}
object ScalingParametersStatus {
  
  @scala.inline
  def apply(Options: ScalingParameters, Status: OptionStatus): ScalingParametersStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingParametersStatus]
  }
  
  @scala.inline
  implicit class ScalingParametersStatusMutableBuilder[Self <: ScalingParametersStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: ScalingParameters): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
