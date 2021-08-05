package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTestGridProjectResult extends StObject {
  
  /**
    * ARN of the Selenium testing project that was created.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.undefined
}
object CreateTestGridProjectResult {
  
  inline def apply(): CreateTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTestGridProjectResult]
  }
  
  extension [Self <: CreateTestGridProjectResult](x: Self) {
    
    inline def setTestGridProject(value: TestGridProject): Self = StObject.set(x, "testGridProject", value.asInstanceOf[js.Any])
    
    inline def setTestGridProjectUndefined: Self = StObject.set(x, "testGridProject", js.undefined)
  }
}
