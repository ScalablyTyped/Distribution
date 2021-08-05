package typings.azdata.mod

import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("azdata", "tasks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerTask(task: String, callback: ITaskHandler): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTask")(task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerTask(task: String, callback: ITaskHandler, thisArg: js.Any): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTask")(task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def startBackgroundOperation(operationInfo: BackgroundOperationInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundOperation")(operationInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ITaskHandler = js.Function2[/* profile */ IConnectionProfile, /* repeated */ js.Any, js.Any]
}
