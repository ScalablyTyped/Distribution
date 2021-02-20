package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCasePrepared. */
@js.native
trait ITestCasePrepared extends StObject {
  
  /** TestCasePrepared pickleId */
  var pickleId: js.UndefOr[String | Null] = js.native
  
  /** TestCasePrepared steps */
  var steps: js.UndefOr[js.Array[ITestCasePreparedStep] | Null] = js.native
}
object ITestCasePrepared {
  
  @scala.inline
  def apply(): ITestCasePrepared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePrepared]
  }
  
  @scala.inline
  implicit class ITestCasePreparedMutableBuilder[Self <: ITestCasePrepared] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    @scala.inline
    def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[ITestCasePreparedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsNull: Self = StObject.set(x, "steps", null)
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: ITestCasePreparedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
