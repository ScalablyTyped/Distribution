package typings.builderUtil

import typings.builderUtilRuntime.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncTaskManagerMod {
  
  @JSImport("builder-util/out/asyncTaskManager", "AsyncTaskManager")
  @js.native
  class AsyncTaskManager protected () extends StObject {
    def this(cancellationToken: CancellationToken) = this()
    
    def add(task: js.Function0[js.Promise[_]]): Unit = js.native
    
    def addTask(promise: js.Promise[_]): Unit = js.native
    
    def awaitTasks(): js.Promise[js.Array[_]] = js.native
    
    def cancelTasks(): Unit = js.native
    
    val cancellationToken: js.Any = js.native
    
    val errors: js.Any = js.native
    
    val tasks: js.Array[js.Promise[_]] = js.native
  }
}
