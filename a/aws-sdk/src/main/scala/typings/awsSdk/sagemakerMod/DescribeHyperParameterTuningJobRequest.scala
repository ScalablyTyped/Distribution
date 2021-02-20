package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHyperParameterTuningJobRequest extends StObject {
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
}
object DescribeHyperParameterTuningJobRequest {
  
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
  }
  
  @scala.inline
  implicit class DescribeHyperParameterTuningJobRequestMutableBuilder[Self <: DescribeHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
  }
}
