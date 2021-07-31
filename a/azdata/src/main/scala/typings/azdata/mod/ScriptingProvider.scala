package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingProvider
  extends StObject
     with DataProvider {
  
  def registerOnScriptingComplete(handler: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, js.Any]): Unit
  
  def scriptAsOperation(
    connectionUri: String,
    operation: ScriptOperation,
    metadata: ObjectMetadata,
    paramDetails: ScriptingParamDetails
  ): Thenable[ScriptingResult]
}
object ScriptingProvider {
  
  @scala.inline
  def apply(
    providerId: String,
    registerOnScriptingComplete: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, js.Any] => Unit,
    scriptAsOperation: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
  ): ScriptingProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], registerOnScriptingComplete = js.Any.fromFunction1(registerOnScriptingComplete), scriptAsOperation = js.Any.fromFunction4(scriptAsOperation))
    __obj.asInstanceOf[ScriptingProvider]
  }
  
  @scala.inline
  implicit class ScriptingProviderMutableBuilder[Self <: ScriptingProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterOnScriptingComplete(value: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, js.Any] => Unit): Self = StObject.set(x, "registerOnScriptingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScriptAsOperation(
      value: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
    ): Self = StObject.set(x, "scriptAsOperation", js.Any.fromFunction4(value))
  }
}
