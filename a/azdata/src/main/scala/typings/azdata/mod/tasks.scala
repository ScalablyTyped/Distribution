package typings.azdata.mod

import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "tasks")
@js.native
object tasks extends js.Object {
  
  def registerTask(task: String, callback: ITaskHandler): Disposable = js.native
  def registerTask(task: String, callback: ITaskHandler, thisArg: js.Any): Disposable = js.native
  
  def startBackgroundOperation(operationInfo: BackgroundOperationInfo): Unit = js.native
  
  type ITaskHandler = js.Function2[/* profile */ IConnectionProfile, /* repeated */ js.Any, js.Any]
}
