package typings.cucumberCucumber

import typings.cucumberCucumber.cucumberCucumberInts.`0`
import typings.cucumberCucumber.cucumberCucumberInts.`1`
import typings.cucumberCucumber.cucumberCucumberInts.`2`
import typings.cucumberCucumber.cucumberCucumberInts.`3`
import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libRuntimeMod.IRuntime
import typings.cucumberCucumber.libRuntimeMod.IRuntimeOptions
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.ICoordinatorReport
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.TestCaseFinished
import typings.node.childProcessMod.ChildProcess
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeParallelCoordinatorMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/parallel/coordinator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Coordinator {
    def this(param0: INewCoordinatorOptions) = this()
    
    /* CompleteClass */
    override def start(): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait Coordinator
    extends StObject
       with IRuntime {
    
    /* private */ var assembledTestCases: Any = js.native
    
    def awakenWorkers(triggeringWorker: IWorker): Unit = js.native
    
    /* private */ val cwd: Any = js.native
    
    /* private */ val eventBroadcaster: Any = js.native
    
    /* private */ val eventDataCollector: Any = js.native
    
    def giveWork(worker: IWorker): Unit = js.native
    def giveWork(worker: IWorker, force: Boolean): Unit = js.native
    
    /* private */ var idleInterventions: Any = js.native
    
    /* private */ val importPaths: Any = js.native
    
    /* private */ var inProgressPickles: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val newId: Any = js.native
    
    def nextPicklePlacement(): IPicklePlacement = js.native
    
    /* private */ val numberOfWorkers: Any = js.native
    
    /* private */ var onFinish: Any = js.native
    
    def onWorkerProcessClose(exitCode: Double): Unit = js.native
    
    /* private */ val options: Any = js.native
    
    def parseTestCaseResult(testCaseFinished: TestCaseFinished): Unit = js.native
    
    def parseWorkerMessage(worker: IWorker, message: ICoordinatorReport): Unit = js.native
    
    /* private */ val pickleIds: Any = js.native
    
    def placementAt(index: Double): IPicklePlacement = js.native
    
    /* private */ val requireModules: Any = js.native
    
    /* private */ val requirePaths: Any = js.native
    
    def startWorker(id: String, total: Double): Unit = js.native
    
    /* private */ val stopwatch: Any = js.native
    
    /* private */ var success: Any = js.native
    
    /* private */ val supportCodeLibrary: Any = js.native
    
    /* private */ var workers: Any = js.native
  }
  
  trait INewCoordinatorOptions extends StObject {
    
    var cwd: String
    
    var eventBroadcaster: EventEmitter
    
    var eventDataCollector: EventDataCollector
    
    var importPaths: js.Array[String]
    
    var logger: ILogger
    
    def newId(): String
    @JSName("newId")
    var newId_Original: NewId
    
    var numberOfWorkers: Double
    
    var options: IRuntimeOptions
    
    var pickleIds: js.Array[String]
    
    var requireModules: js.Array[String]
    
    var requirePaths: js.Array[String]
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object INewCoordinatorOptions {
    
    inline def apply(
      cwd: String,
      eventBroadcaster: EventEmitter,
      eventDataCollector: EventDataCollector,
      importPaths: js.Array[String],
      logger: ILogger,
      newId: () => String,
      numberOfWorkers: Double,
      options: IRuntimeOptions,
      pickleIds: js.Array[String],
      requireModules: js.Array[String],
      requirePaths: js.Array[String],
      supportCodeLibrary: ISupportCodeLibrary
    ): INewCoordinatorOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), numberOfWorkers = numberOfWorkers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pickleIds = pickleIds.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[INewCoordinatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INewCoordinatorOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
      
      inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
      
      inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setNumberOfWorkers(value: Double): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IRuntimeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPickleIds(value: js.Array[String]): Self = StObject.set(x, "pickleIds", value.asInstanceOf[js.Any])
      
      inline def setPickleIdsVarargs(value: String*): Self = StObject.set(x, "pickleIds", js.Array(value*))
      
      inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
      
      inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
      
      inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
      
      inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPicklePlacement extends StObject {
    
    var index: Double
    
    var pickle: Pickle
  }
  object IPicklePlacement {
    
    inline def apply(index: Double, pickle: Pickle): IPicklePlacement = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPicklePlacement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPicklePlacement] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorker extends StObject {
    
    var id: String
    
    var process: ChildProcess
    
    var state: WorkerState
  }
  object IWorker {
    
    inline def apply(id: String, process: ChildProcess, state: WorkerState): IWorker = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorker] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setState(value: WorkerState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cucumberCucumber.cucumberCucumberInts.`0`
    - typings.cucumberCucumber.cucumberCucumberInts.`1`
    - typings.cucumberCucumber.cucumberCucumberInts.`2`
    - typings.cucumberCucumber.cucumberCucumberInts.`3`
  */
  trait WorkerState extends StObject
  object WorkerState {
    
    inline def closed: `1` = 1.asInstanceOf[`1`]
    
    inline def idle: `0` = 0.asInstanceOf[`0`]
    
    inline def `new`: `3` = 3.asInstanceOf[`3`]
    
    inline def running: `2` = 2.asInstanceOf[`2`]
  }
}
