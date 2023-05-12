package typings.bree

import org.scalablytyped.runtime.Instantiable1
import typings.bree.anon.PartialWorkerOptions
import typings.safeTimers.mod.Interval
import typings.safeTimers.mod.Timeout
import typings.std.Map
import typings.std.Record
import typings.std.Worker
import typings.std.WorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bree", JSImport.Namespace)
  @js.native
  // init: Promise() => void;
  // _init: boolean;
  open class ^ ()
    extends StObject
       with Bree {
    def this(config: BreeOptions) = this()
  }
  @JSImport("bree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend[T](plugin: PluginFunc[T]): Bree = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[Bree]
  inline def extend[T](plugin: PluginFunc[T], options: T): Bree = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bree]
  
  type AsyncFunction[A /* <: js.Array[Any] */, O] = js.Function1[/* args */ A, js.Promise[O]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @js.native
  trait Bree extends StObject {
    
    def add(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Array[
          /* jobs */ String | js.Function0[Unit] | JobOptions | (js.Array[String | js.Function0[Unit] | JobOptions])
        ]
    ): js.Promise[Unit] = js.native
    @JSName("add")
    var add_Original: AsyncFunction[
        js.Array[
          /* jobs */ String | js.Function0[Unit] | JobOptions | (js.Array[String | js.Function0[Unit] | JobOptions])
        ], 
        Unit
      ] = js.native
    
    var closeWorkerAfterMs: Map[String, Timeout] = js.native
    
    var config: BreeConfigs = js.native
    
    def createWorker(filename: String, options: PartialWorkerOptions): Worker = js.native
    
    def getHumanToMs(_value: String): Double = js.native
    
    def getName(job: String): String = js.native
    def getName(job: js.Function0[Unit]): String = js.native
    def getName(job: Record[String, Any]): String = js.native
    
    def getWorkerMetadata(name: String): Record[String, Any] = js.native
    def getWorkerMetadata(name: String, meta: Record[String, Any]): Record[String, Any] = js.native
    
    def handleJobCompletion(name: String): Unit = js.native
    
    var intervals: Map[String, Interval] = js.native
    
    def isSchedule(value: Any): Boolean = js.native
    
    def parseValue(value: String): Double | Boolean | (Record[String, Any]) = js.native
    def parseValue(value: Boolean): Double | Boolean | (Record[String, Any]) = js.native
    def parseValue(value: Double): Double | Boolean | (Record[String, Any]) = js.native
    def parseValue(value: Record[String, Any]): Double | Boolean | (Record[String, Any]) = js.native
    
    def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Array[/* name */ js.UndefOr[String]]
    ): js.Promise[Unit] = js.native
    
    def removeSafeTimer(`type`: String, name: String): Unit = js.native
    
    @JSName("remove")
    var remove_Original: AsyncFunction[js.Array[/* name */ js.UndefOr[String]], Unit] = js.native
    
    def run(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Array[/* name */ js.UndefOr[String]]
    ): js.Promise[Unit] = js.native
    @JSName("run")
    var run_Original: AsyncFunction[js.Array[/* name */ js.UndefOr[String]], Unit] = js.native
    
    def start(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Array[/* name */ js.UndefOr[String]]
    ): js.Promise[Unit] = js.native
    @JSName("start")
    var start_Original: AsyncFunction[js.Array[/* name */ js.UndefOr[String]], Unit] = js.native
    
    def stop(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Array[/* name */ js.UndefOr[String]]
    ): js.Promise[Unit] = js.native
    @JSName("stop")
    var stop_Original: AsyncFunction[js.Array[/* name */ js.UndefOr[String]], Unit] = js.native
    
    var timeouts: Map[String, Timeout] = js.native
    
    def validateJob(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: js.Tuple4[
          /* job */ String | js.Function0[Unit] | JobOptions, 
          /* i */ Double, 
          /* names */ js.Array[String], 
          /* config */ BreeOptions
        ]
    ): js.Promise[Unit] = js.native
    @JSName("validateJob")
    var validateJob_Original: AsyncFunction[
        js.Tuple4[
          /* job */ String | js.Function0[Unit] | JobOptions, 
          /* i */ Double, 
          /* names */ js.Array[String], 
          /* config */ BreeOptions
        ], 
        Unit
      ] = js.native
    
    var workers: Map[String, Worker] = js.native
  }
  
  trait BreeConfigs extends StObject {
    
    var acceptedExtensions: js.Array[String]
    
    var closeWorkerAfterMs: Double
    
    var cronValidate: Record[String, Any]
    
    var defaultExtension: String
    
    var defaultRootIndex: String
    
    var doRootCheck: Boolean
    
    var errorHandler: js.UndefOr[js.Function2[/* error */ Any, /* workerMetadata */ Any, Unit]] = js.undefined
    
    var hasSeconds: Boolean
    
    var interval: Double
    
    var jobs: js.Array[Job]
    
    var logger: BreeLogger | Boolean
    
    var outputWorkerMetadata: Boolean
    
    var removeCompleted: Boolean
    
    var root: String | Boolean
    
    var silenceRootCheckError: Boolean
    
    var timeout: Double | Boolean
    
    var timezone: String
    
    var worker: WorkerOptions
    
    var workerMessageHandler: js.UndefOr[js.Function2[/* message */ Any, /* workerMetadata */ Any, Unit]] = js.undefined
  }
  object BreeConfigs {
    
    inline def apply(
      acceptedExtensions: js.Array[String],
      closeWorkerAfterMs: Double,
      cronValidate: Record[String, Any],
      defaultExtension: String,
      defaultRootIndex: String,
      doRootCheck: Boolean,
      hasSeconds: Boolean,
      interval: Double,
      jobs: js.Array[Job],
      logger: BreeLogger | Boolean,
      outputWorkerMetadata: Boolean,
      removeCompleted: Boolean,
      root: String | Boolean,
      silenceRootCheckError: Boolean,
      timeout: Double | Boolean,
      timezone: String,
      worker: WorkerOptions
    ): BreeConfigs = {
      val __obj = js.Dynamic.literal(acceptedExtensions = acceptedExtensions.asInstanceOf[js.Any], closeWorkerAfterMs = closeWorkerAfterMs.asInstanceOf[js.Any], cronValidate = cronValidate.asInstanceOf[js.Any], defaultExtension = defaultExtension.asInstanceOf[js.Any], defaultRootIndex = defaultRootIndex.asInstanceOf[js.Any], doRootCheck = doRootCheck.asInstanceOf[js.Any], hasSeconds = hasSeconds.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], outputWorkerMetadata = outputWorkerMetadata.asInstanceOf[js.Any], removeCompleted = removeCompleted.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], silenceRootCheckError = silenceRootCheckError.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreeConfigs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreeConfigs] (val x: Self) extends AnyVal {
      
      inline def setAcceptedExtensions(value: js.Array[String]): Self = StObject.set(x, "acceptedExtensions", value.asInstanceOf[js.Any])
      
      inline def setAcceptedExtensionsVarargs(value: String*): Self = StObject.set(x, "acceptedExtensions", js.Array(value*))
      
      inline def setCloseWorkerAfterMs(value: Double): Self = StObject.set(x, "closeWorkerAfterMs", value.asInstanceOf[js.Any])
      
      inline def setCronValidate(value: Record[String, Any]): Self = StObject.set(x, "cronValidate", value.asInstanceOf[js.Any])
      
      inline def setDefaultExtension(value: String): Self = StObject.set(x, "defaultExtension", value.asInstanceOf[js.Any])
      
      inline def setDefaultRootIndex(value: String): Self = StObject.set(x, "defaultRootIndex", value.asInstanceOf[js.Any])
      
      inline def setDoRootCheck(value: Boolean): Self = StObject.set(x, "doRootCheck", value.asInstanceOf[js.Any])
      
      inline def setErrorHandler(value: (/* error */ Any, /* workerMetadata */ Any) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setHasSeconds(value: Boolean): Self = StObject.set(x, "hasSeconds", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
      
      inline def setLogger(value: BreeLogger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadata(value: Boolean): Self = StObject.set(x, "outputWorkerMetadata", value.asInstanceOf[js.Any])
      
      inline def setRemoveCompleted(value: Boolean): Self = StObject.set(x, "removeCompleted", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String | Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSilenceRootCheckError(value: Boolean): Self = StObject.set(x, "silenceRootCheckError", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: WorkerOptions): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerMessageHandler(value: (/* message */ Any, /* workerMetadata */ Any) => Unit): Self = StObject.set(x, "workerMessageHandler", js.Any.fromFunction2(value))
      
      inline def setWorkerMessageHandlerUndefined: Self = StObject.set(x, "workerMessageHandler", js.undefined)
    }
  }
  
  trait BreeLogger extends StObject {
    
    def error(args: Any*): Any
    
    def info(args: Any*): Any
    
    def warn(args: Any*): Any
  }
  object BreeLogger {
    
    inline def apply(error: /* repeated */ Any => Any, info: /* repeated */ Any => Any, warn: /* repeated */ Any => Any): BreeLogger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[BreeLogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreeLogger] (val x: Self) extends AnyVal {
      
      inline def setError(value: /* repeated */ Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<std.Omit<bree.bree.BreeConfigs, 'jobs'>> & {  jobs :std.Array<string | (): void | bree.bree.JobOptions> | undefined} */
  trait BreeOptions extends StObject {
    
    var acceptedExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var closeWorkerAfterMs: js.UndefOr[Double] = js.undefined
    
    var cronValidate: js.UndefOr[Record[String, Any]] = js.undefined
    
    var defaultExtension: js.UndefOr[String] = js.undefined
    
    var defaultRootIndex: js.UndefOr[String] = js.undefined
    
    var doRootCheck: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function2[/* error */ Any, /* workerMetadata */ Any, Unit]] = js.undefined
    
    var hasSeconds: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var jobs: js.UndefOr[js.Array[String | js.Function0[Unit] | JobOptions]] = js.undefined
    
    var logger: js.UndefOr[BreeLogger | Boolean] = js.undefined
    
    var outputWorkerMetadata: js.UndefOr[Boolean] = js.undefined
    
    var removeCompleted: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String | Boolean] = js.undefined
    
    var silenceRootCheckError: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double | Boolean] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var worker: js.UndefOr[WorkerOptions] = js.undefined
    
    var workerMessageHandler: js.UndefOr[js.Function2[/* message */ Any, /* workerMetadata */ Any, Unit]] = js.undefined
  }
  object BreeOptions {
    
    inline def apply(): BreeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreeOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptedExtensions(value: js.Array[String]): Self = StObject.set(x, "acceptedExtensions", value.asInstanceOf[js.Any])
      
      inline def setAcceptedExtensionsUndefined: Self = StObject.set(x, "acceptedExtensions", js.undefined)
      
      inline def setAcceptedExtensionsVarargs(value: String*): Self = StObject.set(x, "acceptedExtensions", js.Array(value*))
      
      inline def setCloseWorkerAfterMs(value: Double): Self = StObject.set(x, "closeWorkerAfterMs", value.asInstanceOf[js.Any])
      
      inline def setCloseWorkerAfterMsUndefined: Self = StObject.set(x, "closeWorkerAfterMs", js.undefined)
      
      inline def setCronValidate(value: Record[String, Any]): Self = StObject.set(x, "cronValidate", value.asInstanceOf[js.Any])
      
      inline def setCronValidateUndefined: Self = StObject.set(x, "cronValidate", js.undefined)
      
      inline def setDefaultExtension(value: String): Self = StObject.set(x, "defaultExtension", value.asInstanceOf[js.Any])
      
      inline def setDefaultExtensionUndefined: Self = StObject.set(x, "defaultExtension", js.undefined)
      
      inline def setDefaultRootIndex(value: String): Self = StObject.set(x, "defaultRootIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultRootIndexUndefined: Self = StObject.set(x, "defaultRootIndex", js.undefined)
      
      inline def setDoRootCheck(value: Boolean): Self = StObject.set(x, "doRootCheck", value.asInstanceOf[js.Any])
      
      inline def setDoRootCheckUndefined: Self = StObject.set(x, "doRootCheck", js.undefined)
      
      inline def setErrorHandler(value: (/* error */ Any, /* workerMetadata */ Any) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setHasSeconds(value: Boolean): Self = StObject.set(x, "hasSeconds", value.asInstanceOf[js.Any])
      
      inline def setHasSecondsUndefined: Self = StObject.set(x, "hasSeconds", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setJobs(value: js.Array[String | js.Function0[Unit] | JobOptions]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
      
      inline def setJobsVarargs(value: (String | js.Function0[Unit] | JobOptions)*): Self = StObject.set(x, "jobs", js.Array(value*))
      
      inline def setLogger(value: BreeLogger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOutputWorkerMetadata(value: Boolean): Self = StObject.set(x, "outputWorkerMetadata", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadataUndefined: Self = StObject.set(x, "outputWorkerMetadata", js.undefined)
      
      inline def setRemoveCompleted(value: Boolean): Self = StObject.set(x, "removeCompleted", value.asInstanceOf[js.Any])
      
      inline def setRemoveCompletedUndefined: Self = StObject.set(x, "removeCompleted", js.undefined)
      
      inline def setRoot(value: String | Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSilenceRootCheckError(value: Boolean): Self = StObject.set(x, "silenceRootCheckError", value.asInstanceOf[js.Any])
      
      inline def setSilenceRootCheckErrorUndefined: Self = StObject.set(x, "silenceRootCheckError", js.undefined)
      
      inline def setTimeout(value: Double | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setWorker(value: WorkerOptions): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerMessageHandler(value: (/* message */ Any, /* workerMetadata */ Any) => Unit): Self = StObject.set(x, "workerMessageHandler", js.Any.fromFunction2(value))
      
      inline def setWorkerMessageHandlerUndefined: Self = StObject.set(x, "workerMessageHandler", js.undefined)
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  trait Job extends StObject {
    
    var closeWorkerAfterMs: js.UndefOr[Double] = js.undefined
    
    var cron: js.UndefOr[String] = js.undefined
    
    var cronValidate: js.UndefOr[Record[String, Any]] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var hasSeconds: js.UndefOr[Boolean] = js.undefined
    
    var interval: Double | String
    
    var name: String
    
    var outputWorkerMetadata: js.UndefOr[Boolean] = js.undefined
    
    var path: String | js.Function0[Unit]
    
    var timeout: Double | String | Boolean
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var worker: js.UndefOr[PartialWorkerOptions] = js.undefined
  }
  object Job {
    
    inline def apply(
      interval: Double | String,
      name: String,
      path: String | js.Function0[Unit],
      timeout: Double | String | Boolean
    ): Job = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      inline def setCloseWorkerAfterMs(value: Double): Self = StObject.set(x, "closeWorkerAfterMs", value.asInstanceOf[js.Any])
      
      inline def setCloseWorkerAfterMsUndefined: Self = StObject.set(x, "closeWorkerAfterMs", js.undefined)
      
      inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
      
      inline def setCronUndefined: Self = StObject.set(x, "cron", js.undefined)
      
      inline def setCronValidate(value: Record[String, Any]): Self = StObject.set(x, "cronValidate", value.asInstanceOf[js.Any])
      
      inline def setCronValidateUndefined: Self = StObject.set(x, "cronValidate", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setHasSeconds(value: Boolean): Self = StObject.set(x, "hasSeconds", value.asInstanceOf[js.Any])
      
      inline def setHasSecondsUndefined: Self = StObject.set(x, "hasSeconds", js.undefined)
      
      inline def setInterval(value: Double | String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadata(value: Boolean): Self = StObject.set(x, "outputWorkerMetadata", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadataUndefined: Self = StObject.set(x, "outputWorkerMetadata", js.undefined)
      
      inline def setPath(value: String | js.Function0[Unit]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathFunction0(value: () => Unit): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setTimeout(value: Double | String | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setWorker(value: PartialWorkerOptions): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<bree.bree.Job, 'name'>> & std.Partial<std.Omit<bree.bree.Job, 'name'>> */
  trait JobOptions extends StObject {
    
    var closeWorkerAfterMs: js.UndefOr[Double] = js.undefined
    
    var cron: js.UndefOr[String] = js.undefined
    
    var cronValidate: js.UndefOr[Record[String, Any]] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var hasSeconds: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double | String] = js.undefined
    
    var name: String
    
    var outputWorkerMetadata: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String | js.Function0[Unit]] = js.undefined
    
    var timeout: js.UndefOr[Double | String | Boolean] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var worker: js.UndefOr[PartialWorkerOptions] = js.undefined
  }
  object JobOptions {
    
    inline def apply(name: String): JobOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JobOptions] (val x: Self) extends AnyVal {
      
      inline def setCloseWorkerAfterMs(value: Double): Self = StObject.set(x, "closeWorkerAfterMs", value.asInstanceOf[js.Any])
      
      inline def setCloseWorkerAfterMsUndefined: Self = StObject.set(x, "closeWorkerAfterMs", js.undefined)
      
      inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
      
      inline def setCronUndefined: Self = StObject.set(x, "cron", js.undefined)
      
      inline def setCronValidate(value: Record[String, Any]): Self = StObject.set(x, "cronValidate", value.asInstanceOf[js.Any])
      
      inline def setCronValidateUndefined: Self = StObject.set(x, "cronValidate", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setHasSeconds(value: Boolean): Self = StObject.set(x, "hasSeconds", value.asInstanceOf[js.Any])
      
      inline def setHasSecondsUndefined: Self = StObject.set(x, "hasSeconds", js.undefined)
      
      inline def setInterval(value: Double | String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadata(value: Boolean): Self = StObject.set(x, "outputWorkerMetadata", value.asInstanceOf[js.Any])
      
      inline def setOutputWorkerMetadataUndefined: Self = StObject.set(x, "outputWorkerMetadata", js.undefined)
      
      inline def setPath(value: String | js.Function0[Unit]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathFunction0(value: () => Unit): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTimeout(value: Double | String | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setWorker(value: PartialWorkerOptions): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  type PluginFunc[T] = js.Function2[
    /* options */ T, 
    /* c */ Instantiable1[/* config */ js.UndefOr[BreeOptions], Bree], 
    Unit
  ]
}
