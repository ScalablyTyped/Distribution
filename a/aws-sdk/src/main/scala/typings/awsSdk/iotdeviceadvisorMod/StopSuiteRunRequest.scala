package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSuiteRunRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite run to be stopped.
    */
  var suiteDefinitionId: UUID
  
  /**
    * Suite run ID of the test suite run to be stopped.
    */
  var suiteRunId: UUID
}
object StopSuiteRunRequest {
  
  inline def apply(suiteDefinitionId: UUID, suiteRunId: UUID): StopSuiteRunRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any], suiteRunId = suiteRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSuiteRunRequest]
  }
  
  extension [Self <: StopSuiteRunRequest](x: Self) {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
  }
}
