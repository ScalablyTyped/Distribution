package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCasePreparedStep. */
trait ITestCasePreparedStep extends StObject {
  
  /** TestCasePreparedStep actionLocation */
  var actionLocation: js.UndefOr[ISourceReference | Null] = js.undefined
  
  /** TestCasePreparedStep sourceLocation */
  var sourceLocation: js.UndefOr[ISourceReference | Null] = js.undefined
}
object ITestCasePreparedStep {
  
  @scala.inline
  def apply(): ITestCasePreparedStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePreparedStep]
  }
  
  @scala.inline
  implicit class ITestCasePreparedStepMutableBuilder[Self <: ITestCasePreparedStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionLocation(value: ISourceReference): Self = StObject.set(x, "actionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionLocationNull: Self = StObject.set(x, "actionLocation", null)
    
    @scala.inline
    def setActionLocationUndefined: Self = StObject.set(x, "actionLocation", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: ISourceReference): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationNull: Self = StObject.set(x, "sourceLocation", null)
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
  }
}
