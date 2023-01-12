package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

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
  
  inline def apply(): ITestCasePreparedStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePreparedStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITestCasePreparedStep] (val x: Self) extends AnyVal {
    
    inline def setActionLocation(value: ISourceReference): Self = StObject.set(x, "actionLocation", value.asInstanceOf[js.Any])
    
    inline def setActionLocationNull: Self = StObject.set(x, "actionLocation", null)
    
    inline def setActionLocationUndefined: Self = StObject.set(x, "actionLocation", js.undefined)
    
    inline def setSourceLocation(value: ISourceReference): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNull: Self = StObject.set(x, "sourceLocation", null)
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
  }
}
