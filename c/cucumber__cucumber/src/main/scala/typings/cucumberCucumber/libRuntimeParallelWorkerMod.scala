package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Exit
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.ICoordinatorReport
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.IWorkerCommand
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.IWorkerCommandInitialize
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.IWorkerCommandRun
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeParallelWorkerMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/parallel/worker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Worker {
    def this(param0: Exit) = this()
    
    /* private */ /* CompleteClass */
    override val cwd: Any = js.native
    
    /* private */ /* CompleteClass */
    override val eventBroadcaster: Any = js.native
    
    /* private */ /* CompleteClass */
    override val exit: Any = js.native
    
    /* private */ /* CompleteClass */
    var filterStacktraces: Any = js.native
    
    /* private */ /* CompleteClass */
    override val id: Any = js.native
    
    /* CompleteClass */
    override def initialize(param0: IWorkerCommandInitialize): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    override val newId: Any = js.native
    
    /* CompleteClass */
    override def receiveMessage(message: IWorkerCommand): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def runTestCase(param0: IWorkerCommandRun): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var runTestRunHooks: Any = js.native
    
    /* private */ /* CompleteClass */
    override val sendMessage: Any = js.native
    
    /* private */ /* CompleteClass */
    var supportCodeLibrary: Any = js.native
    
    /* private */ /* CompleteClass */
    var worldParameters: Any = js.native
  }
  
  type IExitFunction = js.Function3[
    /* exitCode */ Double, 
    /* error */ js.UndefOr[js.Error], 
    /* message */ js.UndefOr[String], 
    Unit
  ]
  
  type IMessageSender = js.Function1[/* command */ ICoordinatorReport, Unit]
  
  trait Worker extends StObject {
    
    /* private */ val cwd: Any
    
    /* private */ val eventBroadcaster: Any
    
    /* private */ val exit: Any
    
    /* private */ var filterStacktraces: Any
    
    /* private */ val id: Any
    
    def initialize(param0: IWorkerCommandInitialize): js.Promise[Unit]
    
    /* private */ val newId: Any
    
    def receiveMessage(message: IWorkerCommand): js.Promise[Unit]
    
    def runTestCase(param0: IWorkerCommandRun): js.Promise[Unit]
    
    /* private */ var runTestRunHooks: Any
    
    /* private */ val sendMessage: Any
    
    /* private */ var supportCodeLibrary: Any
    
    /* private */ var worldParameters: Any
  }
  object Worker {
    
    inline def apply(
      cwd: Any,
      eventBroadcaster: Any,
      exit: Any,
      filterStacktraces: Any,
      id: Any,
      initialize: IWorkerCommandInitialize => js.Promise[Unit],
      newId: Any,
      receiveMessage: IWorkerCommand => js.Promise[Unit],
      runTestCase: IWorkerCommandRun => js.Promise[Unit],
      runTestRunHooks: Any,
      sendMessage: Any,
      supportCodeLibrary: Any,
      worldParameters: Any
    ): Worker = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], filterStacktraces = filterStacktraces.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), newId = newId.asInstanceOf[js.Any], receiveMessage = js.Any.fromFunction1(receiveMessage), runTestCase = js.Any.fromFunction1(runTestCase), runTestRunHooks = runTestRunHooks.asInstanceOf[js.Any], sendMessage = sendMessage.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any], worldParameters = worldParameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Worker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: Any): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEventBroadcaster(value: Any): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Any): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setFilterStacktraces(value: Any): Self = StObject.set(x, "filterStacktraces", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: IWorkerCommandInitialize => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setNewId(value: Any): Self = StObject.set(x, "newId", value.asInstanceOf[js.Any])
      
      inline def setReceiveMessage(value: IWorkerCommand => js.Promise[Unit]): Self = StObject.set(x, "receiveMessage", js.Any.fromFunction1(value))
      
      inline def setRunTestCase(value: IWorkerCommandRun => js.Promise[Unit]): Self = StObject.set(x, "runTestCase", js.Any.fromFunction1(value))
      
      inline def setRunTestRunHooks(value: Any): Self = StObject.set(x, "runTestRunHooks", value.asInstanceOf[js.Any])
      
      inline def setSendMessage(value: Any): Self = StObject.set(x, "sendMessage", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: Any): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
      
      inline def setWorldParameters(value: Any): Self = StObject.set(x, "worldParameters", value.asInstanceOf[js.Any])
    }
  }
}
