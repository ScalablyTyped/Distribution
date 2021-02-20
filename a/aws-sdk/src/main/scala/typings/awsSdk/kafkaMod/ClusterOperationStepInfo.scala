package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationStepInfo extends StObject {
  
  /**
    * 
    The steps current status.
    
    */
  var StepStatus: js.UndefOr[string] = js.native
}
object ClusterOperationStepInfo {
  
  @scala.inline
  def apply(): ClusterOperationStepInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStepInfo]
  }
  
  @scala.inline
  implicit class ClusterOperationStepInfoMutableBuilder[Self <: ClusterOperationStepInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepStatus(value: string): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
  }
}
