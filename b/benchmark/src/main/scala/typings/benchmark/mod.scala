package typings.benchmark

import typings.benchmark.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("benchmark", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Benchmark {
    def this(fn: String) = this()
    def this(fn: js.Function) = this()
    def this(options: Options_) = this()
    def this(fn: String, options: Options_) = this()
    def this(fn: js.Function, options: Options_) = this()
    def this(name: String, fn: String) = this()
    def this(name: String, fn: js.Function) = this()
    def this(name: String, fn: String, options: Options_) = this()
    def this(name: String, fn: js.Function, options: Options_) = this()
  }
  @JSImport("benchmark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("benchmark", "Deferred")
  @js.native
  open class Deferred protected () extends StObject {
    def this(clone: Benchmark) = this()
    
    var benchmark: Benchmark = js.native
    
    var cycles: Double = js.native
    
    var elapsed: Double = js.native
    
    def resolve(): Unit = js.native
    
    var timeStamp: Double = js.native
  }
  
  @JSImport("benchmark", "Event")
  @js.native
  open class Event protected () extends StObject {
    def this(`type`: String) = this()
    def this(`type`: js.Object) = this()
    
    var aborted: Boolean = js.native
    
    var cancelled: Boolean = js.native
    
    var currentTarget: js.Object = js.native
    
    var result: Any = js.native
    
    var target: Target = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("benchmark", "Suite")
  @js.native
  open class Suite () extends StObject {
    def this(name: String) = this()
    def this(options: Options_) = this()
    def this(name: String, options: Options_) = this()
    def this(name: Unit, options: Options_) = this()
    
    def abort(): Suite = js.native
    
    var aborted: Boolean = js.native
    
    def add(fn: String): Suite = js.native
    def add(fn: String, options: Options_): Suite = js.native
    def add(fn: js.Function): Suite = js.native
    def add(fn: js.Function, options: Options_): Suite = js.native
    def add(name: String, fn: String): Suite = js.native
    def add(name: String, fn: String, options: Options_): Suite = js.native
    def add(name: String, fn: js.Function): Suite = js.native
    def add(name: String, fn: js.Function, options: Options_): Suite = js.native
    def add(options: Options_): Suite = js.native
    
    def clone(options: Options_): Suite = js.native
    
    def each(callback: js.Function): Suite = js.native
    
    def emit(`type`: String): Any = js.native
    def emit(`type`: js.Object): Any = js.native
    
    def filter(callback: String): Suite = js.native
    def filter(callback: js.Function): Suite = js.native
    
    def forEach(callback: js.Function): Suite = js.native
    
    def indexOf(value: Any): Double = js.native
    
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    var length: Double = js.native
    
    def listeners(`type`: String): js.Array[js.Function] = js.native
    
    def map(callback: String): js.Array[Any] = js.native
    def map(callback: js.Function): js.Array[Any] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def off(): Suite = js.native
    def off(`type`: String): Suite = js.native
    def off(`type`: String, callback: js.Function): Suite = js.native
    def off(`type`: Unit, callback: js.Function): Suite = js.native
    def off(types: js.Array[String]): Suite = js.native
    
    def on(): Suite = js.native
    def on(`type`: String): Suite = js.native
    def on(`type`: String, callback: js.Function): Suite = js.native
    def on(`type`: Unit, callback: js.Function): Suite = js.native
    def on(types: js.Array[String]): Suite = js.native
    
    def pop(): js.Function = js.native
    
    def push(benchmark: Benchmark): Double = js.native
    
    def reduce[T](callback: js.Function, accumulator: T): T = js.native
    
    def reset(): Suite = js.native
    
    def reverse(): js.Array[Any] = js.native
    
    def run(): Suite = js.native
    def run(options: Options_): Suite = js.native
    
    var running: Boolean = js.native
    
    def shift(): Benchmark = js.native
    
    def slice(start: Double, deleteCount: Double, values: Any*): js.Array[Any] = js.native
    def slice(start: Double, end: Double): js.Array[Any] = js.native
    
    def sort(compareFn: js.Function2[/* a */ Any, /* b */ Any, Double]): js.Array[Any] = js.native
    
    def splice(start: Double): js.Array[Any] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[Any] = js.native
    
    def unshift(benchmark: Benchmark): Double = js.native
  }
  /* static members */
  object Suite {
    
    @JSImport("benchmark", "Suite")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("benchmark", "Suite.options")
    @js.native
    def options: Name = js.native
    inline def options_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  inline def each(obj: js.Array[Any], callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(obj: js.Array[Any], callback: js.Function, thisArg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def each(obj: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(obj: js.Object, callback: js.Function, thisArg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, Any]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, Any], thisArg: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  /* static member */
  inline def filter[T](arr: js.Array[T], filter: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filter[T](arr: js.Array[T], filter: String, thisArg: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, Any], thisArg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def forOwn(obj: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forOwn(obj: js.Object, callback: js.Function, thisArg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forOwn")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def formatNumber(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def has(obj: js.Object, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /* static member */
  inline def has(obj: js.Object, path: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def indexOf[T](arr: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf[T](arr: js.Array[T], value: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def invoke(benches: js.Array[Benchmark], name: String, args: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")((scala.List(benches.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  inline def invoke(benches: js.Array[Benchmark], name: js.Object, args: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")((scala.List(benches.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  
  /* static member */
  inline def join(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def join(obj: js.Object, separator1: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(obj.asInstanceOf[js.Any], separator1.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def join(obj: js.Object, separator1: String, separator2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(obj.asInstanceOf[js.Any], separator1.asInstanceOf[js.Any], separator2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def join(obj: js.Object, separator1: Unit, separator2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(obj.asInstanceOf[js.Any], separator1.asInstanceOf[js.Any], separator2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
  inline def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K], thisArg: Any): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
  
  /* static member */
  @JSImport("benchmark", "options")
  @js.native
  def options: Options_ = js.native
  inline def options_=(x: Options_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("benchmark", "platform")
  @js.native
  def platform: Platform_ = js.native
  inline def platform_=(x: Platform_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K]): K = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[K]
  inline def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K], thisArg: Any): K = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[K]
  
  /* static member */
  inline def runInContext(context: js.Object): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /* static member */
  @JSImport("benchmark", "support")
  @js.native
  def support: Support_ = js.native
  inline def support_=(x: Support_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("support")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("benchmark", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Benchmark extends StObject {
    
    def abort(): Benchmark = js.native
    
    var aborted: Boolean = js.native
    
    def clone(options: Options_): Benchmark = js.native
    
    def compare(benchmark: Benchmark): Double = js.native
    
    var compiled: js.Function | String = js.native
    
    var count: Double = js.native
    
    var cycles: Double = js.native
    
    def emit(`type`: String): Any = js.native
    def emit(`type`: js.Object): Any = js.native
    
    var error: js.Error = js.native
    
    var fn: js.Function | String = js.native
    
    var hz: Double = js.native
    
    var id: Double = js.native
    
    def listeners(`type`: String): js.Array[js.Function] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def off(): Benchmark = js.native
    def off(`type`: String): Benchmark = js.native
    def off(`type`: String, listener: js.Function): Benchmark = js.native
    def off(`type`: Unit, listener: js.Function): Benchmark = js.native
    def off(types: js.Array[String]): Benchmark = js.native
    
    def on(): Benchmark = js.native
    def on(`type`: String): Benchmark = js.native
    def on(`type`: String, listener: js.Function): Benchmark = js.native
    def on(`type`: Unit, listener: js.Function): Benchmark = js.native
    def on(types: js.Array[String]): Benchmark = js.native
    
    def reset(): Benchmark = js.native
    
    def run(): Benchmark = js.native
    def run(options: Options_): Benchmark = js.native
    
    var running: Boolean = js.native
    
    var setup: js.Function | String = js.native
    
    var stats: Stats = js.native
    
    var teardown: js.Function | String = js.native
    
    var times: Times = js.native
  }
  
  trait Options_ extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var fn: js.UndefOr[js.Function | String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initCount: js.UndefOr[Double] = js.undefined
    
    var maxTime: js.UndefOr[Double] = js.undefined
    
    var minSamples: js.UndefOr[Double] = js.undefined
    
    var minTime: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[js.Function] = js.undefined
    
    var onComplete: js.UndefOr[js.Function] = js.undefined
    
    var onCycle: js.UndefOr[js.Function] = js.undefined
    
    var onError: js.UndefOr[js.Function] = js.undefined
    
    var onReset: js.UndefOr[js.Function] = js.undefined
    
    var onStart: js.UndefOr[js.Function] = js.undefined
    
    var queued: js.UndefOr[Boolean] = js.undefined
    
    var setup: js.UndefOr[js.Function | String] = js.undefined
    
    var teardown: js.UndefOr[js.Function | String] = js.undefined
  }
  object Options_ {
    
    inline def apply(): Options_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options_]
    }
    
    extension [Self <: Options_](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFn(value: js.Function | String): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitCount(value: Double): Self = StObject.set(x, "initCount", value.asInstanceOf[js.Any])
      
      inline def setInitCountUndefined: Self = StObject.set(x, "initCount", js.undefined)
      
      inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinSamples(value: Double): Self = StObject.set(x, "minSamples", value.asInstanceOf[js.Any])
      
      inline def setMinSamplesUndefined: Self = StObject.set(x, "minSamples", js.undefined)
      
      inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: js.Function): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnCycle(value: js.Function): Self = StObject.set(x, "onCycle", value.asInstanceOf[js.Any])
      
      inline def setOnCycleUndefined: Self = StObject.set(x, "onCycle", js.undefined)
      
      inline def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: js.Function): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnStart(value: js.Function): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
      
      inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
      
      inline def setSetup(value: js.Function | String): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setTeardown(value: js.Function | String): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
  
  trait Platform_ extends StObject {
    
    var description: String
    
    var layout: String
    
    var manufacturer: String
    
    var name: String
    
    var os: String
    
    var prerelease: String
    
    var product: String
    
    var version: String
  }
  object Platform_ {
    
    inline def apply(
      description: String,
      layout: String,
      manufacturer: String,
      name: String,
      os: String,
      prerelease: String,
      product: String,
      version: String
    ): Platform_ = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Platform_]
    }
    
    extension [Self <: Platform_](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var deviation: Double
    
    var mean: Double
    
    var moe: Double
    
    var rme: Double
    
    var sample: js.Array[Any]
    
    var sem: Double
    
    var variance: Double
  }
  object Stats {
    
    inline def apply(
      deviation: Double,
      mean: Double,
      moe: Double,
      rme: Double,
      sample: js.Array[Any],
      sem: Double,
      variance: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], moe = moe.asInstanceOf[js.Any], rme = rme.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sem = sem.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setDeviation(value: Double): Self = StObject.set(x, "deviation", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMoe(value: Double): Self = StObject.set(x, "moe", value.asInstanceOf[js.Any])
      
      inline def setRme(value: Double): Self = StObject.set(x, "rme", value.asInstanceOf[js.Any])
      
      inline def setSample(value: js.Array[Any]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleVarargs(value: Any*): Self = StObject.set(x, "sample", js.Array(value*))
      
      inline def setSem(value: Double): Self = StObject.set(x, "sem", value.asInstanceOf[js.Any])
      
      inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    }
  }
  
  trait Support_ extends StObject {
    
    var browser: Boolean
    
    var decompilation: Boolean
    
    var timeout: Boolean
  }
  object Support_ {
    
    inline def apply(browser: Boolean, decompilation: Boolean, timeout: Boolean): Support_ = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Support_]
    }
    
    extension [Self <: Support_](x: Self) {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setDecompilation(value: Boolean): Self = StObject.set(x, "decompilation", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var compiled: js.UndefOr[js.Function] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var cycles: js.UndefOr[Double] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var fn: js.UndefOr[js.Function] = js.undefined
    
    var hz: js.UndefOr[Double] = js.undefined
    
    var id: Double
    
    var initCount: js.UndefOr[Double] = js.undefined
    
    var maxTime: js.UndefOr[Double] = js.undefined
    
    var minSamples: js.UndefOr[Double] = js.undefined
    
    var minTime: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: Options_
    
    var running: Boolean
    
    var stats: js.UndefOr[Stats] = js.undefined
    
    var times: js.UndefOr[Times] = js.undefined
  }
  object Target {
    
    inline def apply(id: Double, options: Options_, running: Boolean): Target = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCompiled(value: js.Function): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setCycles(value: Double): Self = StObject.set(x, "cycles", value.asInstanceOf[js.Any])
      
      inline def setCyclesUndefined: Self = StObject.set(x, "cycles", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setHz(value: Double): Self = StObject.set(x, "hz", value.asInstanceOf[js.Any])
      
      inline def setHzUndefined: Self = StObject.set(x, "hz", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitCount(value: Double): Self = StObject.set(x, "initCount", value.asInstanceOf[js.Any])
      
      inline def setInitCountUndefined: Self = StObject.set(x, "initCount", js.undefined)
      
      inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinSamples(value: Double): Self = StObject.set(x, "minSamples", value.asInstanceOf[js.Any])
      
      inline def setMinSamplesUndefined: Self = StObject.set(x, "minSamples", js.undefined)
      
      inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Options_): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setTimes(value: Times): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  trait Times extends StObject {
    
    var cycle: Double
    
    var elapsed: Double
    
    var period: Double
    
    var timeStamp: Double
  }
  object Times {
    
    inline def apply(cycle: Double, elapsed: Double, period: Double, timeStamp: Double): Times = {
      val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Times]
    }
    
    extension [Self <: Times](x: Self) {
      
      inline def setCycle(value: Double): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
}
