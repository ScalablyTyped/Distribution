package typings.builderUtil

import typings.builderUtilRuntime.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncTaskManagerMod {
  
  @JSImport("builder-util/out/asyncTaskManager", "AsyncTaskManager")
  @js.native
  open class AsyncTaskManager protected () extends StObject {
    def this(cancellationToken: CancellationToken) = this()
    
    def add(task: js.Function0[js.Promise[Any]]): Unit = js.native
    
    def addTask(promise: js.Promise[Any]): Unit = js.native
    
    def awaitTasks(): js.Promise[js.Array[Any]] = js.native
    
    def cancelTasks(): Unit = js.native
    
    /* private */ val cancellationToken: Any = js.native
    
    /* private */ val errors: Any = js.native
    
    val tasks: js.Array[js.Promise[Any]] = js.native
  }
}
