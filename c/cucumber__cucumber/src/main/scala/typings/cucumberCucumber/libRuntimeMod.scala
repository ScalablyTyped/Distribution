package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.mod.TestCase
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Runtime {
    def this(param0: INewRuntimeOptions) = this()
    
    /* private */ /* CompleteClass */
    override val eventBroadcaster: Any = js.native
    
    /* private */ /* CompleteClass */
    override val eventDataCollector: Any = js.native
    
    /* private */ /* CompleteClass */
    override val newId: Any = js.native
    
    /* private */ /* CompleteClass */
    override val options: Any = js.native
    
    /* private */ /* CompleteClass */
    override val pickleIds: Any = js.native
    
    /* CompleteClass */
    override def runTestCase(pickleId: String, testCase: TestCase): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var runTestRunHooks: Any = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[Boolean] = js.native
    
    /* private */ /* CompleteClass */
    override val stopwatch: Any = js.native
    
    /* private */ /* CompleteClass */
    var success: Any = js.native
    
    /* private */ /* CompleteClass */
    override val supportCodeLibrary: Any = js.native
  }
  
  trait INewRuntimeOptions extends StObject {
    
    var eventBroadcaster: EventEmitter
    
    var eventDataCollector: EventDataCollector
    
    def newId(): String
    @JSName("newId")
    var newId_Original: NewId
    
    var options: IRuntimeOptions
    
    var pickleIds: js.Array[String]
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object INewRuntimeOptions {
    
    inline def apply(
      eventBroadcaster: EventEmitter,
      eventDataCollector: EventDataCollector,
      newId: () => String,
      options: IRuntimeOptions,
      pickleIds: js.Array[String],
      supportCodeLibrary: ISupportCodeLibrary
    ): INewRuntimeOptions = {
      val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), options = options.asInstanceOf[js.Any], pickleIds = pickleIds.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[INewRuntimeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INewRuntimeOptions] (val x: Self) extends AnyVal {
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setOptions(value: IRuntimeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPickleIds(value: js.Array[String]): Self = StObject.set(x, "pickleIds", value.asInstanceOf[js.Any])
      
      inline def setPickleIdsVarargs(value: String*): Self = StObject.set(x, "pickleIds", js.Array(value*))
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRuntime extends StObject {
    
    def start(): js.Promise[Boolean]
  }
  object IRuntime {
    
    inline def apply(start: () => js.Promise[Boolean]): IRuntime = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[IRuntime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuntime] (val x: Self) extends AnyVal {
      
      inline def setStart(value: () => js.Promise[Boolean]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait IRuntimeOptions extends StObject {
    
    var dryRun: Boolean
    
    var failFast: Boolean
    
    var filterStacktraces: Boolean
    
    var retry: Double
    
    var retryTagFilter: String
    
    var strict: Boolean
    
    var worldParameters: Any
  }
  object IRuntimeOptions {
    
    inline def apply(
      dryRun: Boolean,
      failFast: Boolean,
      filterStacktraces: Boolean,
      retry: Double,
      retryTagFilter: String,
      strict: Boolean,
      worldParameters: Any
    ): IRuntimeOptions = {
      val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], filterStacktraces = filterStacktraces.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], retryTagFilter = retryTagFilter.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], worldParameters = worldParameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRuntimeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuntimeOptions] (val x: Self) extends AnyVal {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setFilterStacktraces(value: Boolean): Self = StObject.set(x, "filterStacktraces", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryTagFilter(value: String): Self = StObject.set(x, "retryTagFilter", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setWorldParameters(value: Any): Self = StObject.set(x, "worldParameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait Runtime
    extends StObject
       with IRuntime {
    
    /* private */ val eventBroadcaster: Any
    
    /* private */ val eventDataCollector: Any
    
    /* private */ val newId: Any
    
    /* private */ val options: Any
    
    /* private */ val pickleIds: Any
    
    def runTestCase(pickleId: String, testCase: TestCase): js.Promise[Unit]
    
    /* private */ var runTestRunHooks: Any
    
    /* private */ val stopwatch: Any
    
    /* private */ var success: Any
    
    /* private */ val supportCodeLibrary: Any
  }
  object Runtime {
    
    inline def apply(
      eventBroadcaster: Any,
      eventDataCollector: Any,
      newId: Any,
      options: Any,
      pickleIds: Any,
      runTestCase: (String, TestCase) => js.Promise[Unit],
      runTestRunHooks: Any,
      start: () => js.Promise[Boolean],
      stopwatch: Any,
      success: Any,
      supportCodeLibrary: Any
    ): Runtime = {
      val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], newId = newId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pickleIds = pickleIds.asInstanceOf[js.Any], runTestCase = js.Any.fromFunction2(runTestCase), runTestRunHooks = runTestRunHooks.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stopwatch = stopwatch.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Runtime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Runtime] (val x: Self) extends AnyVal {
      
      inline def setEventBroadcaster(value: Any): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: Any): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setNewId(value: Any): Self = StObject.set(x, "newId", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPickleIds(value: Any): Self = StObject.set(x, "pickleIds", value.asInstanceOf[js.Any])
      
      inline def setRunTestCase(value: (String, TestCase) => js.Promise[Unit]): Self = StObject.set(x, "runTestCase", js.Any.fromFunction2(value))
      
      inline def setRunTestRunHooks(value: Any): Self = StObject.set(x, "runTestRunHooks", value.asInstanceOf[js.Any])
      
      inline def setStopwatch(value: Any): Self = StObject.set(x, "stopwatch", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: Any): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
}
