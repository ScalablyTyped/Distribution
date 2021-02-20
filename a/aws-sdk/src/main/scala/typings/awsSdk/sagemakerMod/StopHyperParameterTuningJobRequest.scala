package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopHyperParameterTuningJobRequest extends StObject {
  
  /**
    * The name of the tuning job to stop.
    */
  var HyperParameterTuningJobName: typings.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
}
object StopHyperParameterTuningJobRequest {
  
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): StopHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHyperParameterTuningJobRequest]
  }
  
  @scala.inline
  implicit class StopHyperParameterTuningJobRequestMutableBuilder[Self <: StopHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
  }
}
