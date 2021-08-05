package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingStoppingCondition extends StObject {
  
  /**
    * Specifies the maximum runtime in seconds.
    */
  var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds
}
object ProcessingStoppingCondition {
  
  inline def apply(MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds): ProcessingStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingStoppingCondition]
  }
  
  extension [Self <: ProcessingStoppingCondition](x: Self) {
    
    inline def setMaxRuntimeInSeconds(value: ProcessingMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
