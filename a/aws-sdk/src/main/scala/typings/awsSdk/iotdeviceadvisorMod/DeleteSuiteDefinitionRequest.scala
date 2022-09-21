package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSuiteDefinitionRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite to be deleted.
    */
  var suiteDefinitionId: UUID
}
object DeleteSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionId: UUID): DeleteSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuiteDefinitionRequest]
  }
  
  extension [Self <: DeleteSuiteDefinitionRequest](x: Self) {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
  }
}
