package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCasePrepared. */
trait ITestCasePrepared extends StObject {
  
  /** TestCasePrepared pickleId */
  var pickleId: js.UndefOr[String | Null] = js.undefined
  
  /** TestCasePrepared steps */
  var steps: js.UndefOr[js.Array[ITestCasePreparedStep] | Null] = js.undefined
}
object ITestCasePrepared {
  
  inline def apply(): ITestCasePrepared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePrepared]
  }
  
  extension [Self <: ITestCasePrepared](x: Self) {
    
    inline def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    inline def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    inline def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
    
    inline def setSteps(value: js.Array[ITestCasePreparedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsNull: Self = StObject.set(x, "steps", null)
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: ITestCasePreparedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
