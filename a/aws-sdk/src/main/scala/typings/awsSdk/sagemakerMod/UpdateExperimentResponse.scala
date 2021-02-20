package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
}
object UpdateExperimentResponse {
  
  @scala.inline
  def apply(): UpdateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExperimentResponse]
  }
  
  @scala.inline
  implicit class UpdateExperimentResponseMutableBuilder[Self <: UpdateExperimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
