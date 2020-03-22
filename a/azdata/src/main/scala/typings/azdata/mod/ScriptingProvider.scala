package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptingProvider extends DataProvider {
  def registerOnScriptingComplete(handler: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _]): Unit
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
    registerOnScriptingComplete: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _] => Unit,
    scriptAsOperation: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult],
    handle: Int | Double = null
  ): ScriptingProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], registerOnScriptingComplete = js.Any.fromFunction1(registerOnScriptingComplete), scriptAsOperation = js.Any.fromFunction4(scriptAsOperation))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingProvider]
  }
}

