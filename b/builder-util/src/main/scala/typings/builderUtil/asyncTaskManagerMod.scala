package typings.builderUtil

import typings.builderUtilRuntime.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncTaskManagerMod {
  
  @JSImport("builder-util/out/asyncTaskManager", "AsyncTaskManager")
  @js.native
  class AsyncTaskManager protected () extends StObject {
    def this(cancellationToken: CancellationToken) = this()
    
    def add(task: js.Function0[js.Promise[js.Any]]): Unit = js.native
    
    def addTask(promise: js.Promise[js.Any]): Unit = js.native
    
    def awaitTasks(): js.Promise[js.Array[js.Any]] = js.native
    
    def cancelTasks(): Unit = js.native
    
    /* private */ val cancellationToken: js.Any = js.native
    
    /* private */ val errors: js.Any = js.native
    
    val tasks: js.Array[js.Promise[js.Any]] = js.native
  }
}
