package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHyperParameterTuningJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
    */
  var HyperParameterTuningJobArn: typings.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
}
object CreateHyperParameterTuningJobResponse {
  
  @scala.inline
  def apply(HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
  }
  
  @scala.inline
  implicit class CreateHyperParameterTuningJobResponseMutableBuilder[Self <: CreateHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
  }
}
