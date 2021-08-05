package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandActionComplete. */
trait ICommandActionComplete extends StObject {
  
  /** CommandActionComplete completedId */
  var completedId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandActionComplete snippet */
  var snippet: js.UndefOr[String | Null] = js.undefined
  
  /** CommandActionComplete testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.undefined
}
object ICommandActionComplete {
  
  inline def apply(): ICommandActionComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandActionComplete]
  }
  
  extension [Self <: ICommandActionComplete](x: Self) {
    
    inline def setCompletedId(value: String): Self = StObject.set(x, "completedId", value.asInstanceOf[js.Any])
    
    inline def setCompletedIdNull: Self = StObject.set(x, "completedId", null)
    
    inline def setCompletedIdUndefined: Self = StObject.set(x, "completedId", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setTestResult(value: ITestResult): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultNull: Self = StObject.set(x, "testResult", null)
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
  }
}
