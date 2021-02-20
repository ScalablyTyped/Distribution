package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingStoppingCondition extends StObject {
  
  /**
    * Specifies the maximum runtime in seconds.
    */
  var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds = js.native
}
object ProcessingStoppingCondition {
  
  @scala.inline
  def apply(MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds): ProcessingStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingStoppingCondition]
  }
  
  @scala.inline
  implicit class ProcessingStoppingConditionMutableBuilder[Self <: ProcessingStoppingCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRuntimeInSeconds(value: ProcessingMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
