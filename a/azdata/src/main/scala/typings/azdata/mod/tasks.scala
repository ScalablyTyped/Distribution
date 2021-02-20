package typings.azdata.mod

import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("azdata", "tasks.registerTask")
  @js.native
  def registerTask(task: String, callback: ITaskHandler): Disposable = js.native
  @JSImport("azdata", "tasks.registerTask")
  @js.native
  def registerTask(task: String, callback: ITaskHandler, thisArg: js.Any): Disposable = js.native
  
  @JSImport("azdata", "tasks.startBackgroundOperation")
  @js.native
  def startBackgroundOperation(operationInfo: BackgroundOperationInfo): Unit = js.native
  
  type ITaskHandler = js.Function2[/* profile */ IConnectionProfile, /* repeated */ js.Any, js.Any]
}
