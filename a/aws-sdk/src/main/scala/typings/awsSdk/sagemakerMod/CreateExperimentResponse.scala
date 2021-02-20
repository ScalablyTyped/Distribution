package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
}
object CreateExperimentResponse {
  
  @scala.inline
  def apply(): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExperimentResponse]
  }
  
  @scala.inline
  implicit class CreateExperimentResponseMutableBuilder[Self <: CreateExperimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
