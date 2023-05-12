package typings.consola

import typings.consola.distConsola3fef035aMod.ConsolaOptions
import typings.consola.distConsola3fef035aMod.ConsolaReporter
import typings.consola.distConsola3fef035aMod.FormatOptions
import typings.consola.distConsola3fef035aMod.InputLogObject
import typings.consola.distConsola3fef035aMod.LogLevel
import typings.consola.distConsola3fef035aMod.LogObject
import typings.consola.distConsola3fef035aMod.LogType
import typings.consola.distConsola3fef035aMod.PromptOptions
import typings.consola.distConsola3fef035aMod.inferPromptReturnType
import typings.node.processMod.global.NodeJS.WriteStream
import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var `object`: js.UndefOr[LogObject] = js.undefined
    
    var serialized: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[js.Date] = js.undefined
    
    var timeout: js.UndefOr[ReturnType[TypeofsetTimeout]] = js.undefined
  }
  object Count {
    
    inline def apply(): Count = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setObject(value: LogObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setSerialized(value: String): Self = StObject.set(x, "serialized", value.asInstanceOf[js.Any])
      
      inline def setSerializedUndefined: Self = StObject.set(x, "serialized", js.undefined)
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setTimeout(value: ReturnType[TypeofsetTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[_underscore, __, T /* <: PromptOptions */](message: String): js.Promise[inferPromptReturnType[T]] = js.native
    def apply[_underscore, __, T /* <: PromptOptions */](message: String, opts: PromptOptions): js.Promise[inferPromptReturnType[T]] = js.native
  }
  
  trait Options extends StObject {
    
    var options: ConsolaOptions
  }
  object Options {
    
    inline def apply(options: ConsolaOptions): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: ConsolaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<consola.consola/dist/consola-3fef035a.C> */
  trait PartialC extends StObject {
    
    var defaults: js.UndefOr[InputLogObject] = js.undefined
    
    var formatOptions: js.UndefOr[FormatOptions] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var mockFn: js.UndefOr[
        js.Function2[
          /* type */ LogType, 
          /* defaults */ InputLogObject, 
          js.Function1[/* args */ Any, Unit]
        ]
      ] = js.undefined
    
    var prompt: js.UndefOr[FnCall] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.undefined
    
    var stderr: js.UndefOr[WriteStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var throttleMin: js.UndefOr[Double] = js.undefined
    
    var types: js.UndefOr[RecordLogTypeInputLogObje] = js.undefined
  }
  object PartialC {
    
    inline def apply(): PartialC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialC]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialC] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: InputLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMockFn(value: (/* type */ LogType, /* defaults */ InputLogObject) => js.Function1[/* args */ Any, Unit]): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
      
      inline def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
      
      inline def setPrompt(value: FnCall): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleMin(value: Double): Self = StObject.set(x, "throttleMin", value.asInstanceOf[js.Any])
      
      inline def setThrottleMinUndefined: Self = StObject.set(x, "throttleMin", js.undefined)
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTypes(value: RecordLogTypeInputLogObje): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  /* Inlined std.Partial<consola.consola/dist/consola-3fef035a.C & {  fancy :boolean}> */
  trait PartialCfancyboolean extends StObject {
    
    var defaults: js.UndefOr[InputLogObject] = js.undefined
    
    var fancy: js.UndefOr[Boolean] = js.undefined
    
    var formatOptions: js.UndefOr[FormatOptions] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var mockFn: js.UndefOr[
        js.Function2[
          /* type */ LogType, 
          /* defaults */ InputLogObject, 
          js.Function1[/* args */ Any, Unit]
        ]
      ] = js.undefined
    
    var prompt: js.UndefOr[FnCall] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.undefined
    
    var stderr: js.UndefOr[WriteStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var throttleMin: js.UndefOr[Double] = js.undefined
    
    var types: js.UndefOr[RecordLogTypeInputLogObje] = js.undefined
  }
  object PartialCfancyboolean {
    
    inline def apply(): PartialCfancyboolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCfancyboolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCfancyboolean] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: InputLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setFancy(value: Boolean): Self = StObject.set(x, "fancy", value.asInstanceOf[js.Any])
      
      inline def setFancyUndefined: Self = StObject.set(x, "fancy", js.undefined)
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMockFn(value: (/* type */ LogType, /* defaults */ InputLogObject) => js.Function1[/* args */ Any, Unit]): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
      
      inline def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
      
      inline def setPrompt(value: FnCall): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleMin(value: Double): Self = StObject.set(x, "throttleMin", value.asInstanceOf[js.Any])
      
      inline def setThrottleMinUndefined: Self = StObject.set(x, "throttleMin", js.undefined)
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTypes(value: RecordLogTypeInputLogObje): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  /* Inlined std.Partial<consola.consola/dist/consola-3fef035a.ConsolaOptions> */
  trait PartialConsolaOptions extends StObject {
    
    var defaults: js.UndefOr[InputLogObject] = js.undefined
    
    var formatOptions: js.UndefOr[FormatOptions] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var mockFn: js.UndefOr[
        js.Function2[
          /* type */ LogType, 
          /* defaults */ InputLogObject, 
          js.Function1[/* args */ Any, Unit]
        ]
      ] = js.undefined
    
    var prompt: js.UndefOr[FnCall] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.undefined
    
    var stderr: js.UndefOr[WriteStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var throttleMin: js.UndefOr[Double] = js.undefined
    
    var types: js.UndefOr[RecordLogTypeInputLogObje] = js.undefined
  }
  object PartialConsolaOptions {
    
    inline def apply(): PartialConsolaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsolaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConsolaOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: InputLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMockFn(value: (/* type */ LogType, /* defaults */ InputLogObject) => js.Function1[/* args */ Any, Unit]): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
      
      inline def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
      
      inline def setPrompt(value: FnCall): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleMin(value: Double): Self = StObject.set(x, "throttleMin", value.asInstanceOf[js.Any])
      
      inline def setThrottleMinUndefined: Self = StObject.set(x, "throttleMin", js.undefined)
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTypes(value: RecordLogTypeInputLogObje): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  /* Inlined std.Partial<consola.consola/dist/consola-3fef035a.LogObject> */
  trait PartialLogObject extends StObject {
    
    var additional: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[LogType] = js.undefined
  }
  object PartialLogObject {
    
    inline def apply(): PartialLogObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLogObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLogObject] (val x: Self) extends AnyVal {
      
      inline def setAdditional(value: String | js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
      
      inline def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value*))
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: LogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Record<consola.consola/dist/consola-3fef035a.LogType, consola.consola/dist/consola-3fef035a.InputLogObject> */
  trait RecordLogTypeInputLogObje extends StObject {
    
    var debug: InputLogObject
    
    var error: InputLogObject
    
    var fail: InputLogObject
    
    var fatal: InputLogObject
    
    var info: InputLogObject
    
    var log: InputLogObject
    
    var ready: InputLogObject
    
    var silent: InputLogObject
    
    var start: InputLogObject
    
    var success: InputLogObject
    
    var trace: InputLogObject
    
    var verbose: InputLogObject
    
    var warn: InputLogObject
  }
  object RecordLogTypeInputLogObje {
    
    inline def apply(
      debug: InputLogObject,
      error: InputLogObject,
      fail: InputLogObject,
      fatal: InputLogObject,
      info: InputLogObject,
      log: InputLogObject,
      ready: InputLogObject,
      silent: InputLogObject,
      start: InputLogObject,
      success: InputLogObject,
      trace: InputLogObject,
      verbose: InputLogObject,
      warn: InputLogObject
    ): RecordLogTypeInputLogObje = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordLogTypeInputLogObje]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordLogTypeInputLogObje] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: InputLogObject): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: InputLogObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFail(value: InputLogObject): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: InputLogObject): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: InputLogObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLog(value: InputLogObject): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setReady(value: InputLogObject): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: InputLogObject): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: InputLogObject): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: InputLogObject): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: InputLogObject): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: InputLogObject): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: InputLogObject): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    /**
      * Schedules execution of a one-time `callback` after `delay` milliseconds.
      *
      * The `callback` will likely not be invoked in precisely `delay` milliseconds.
      * Node.js makes no guarantees about the exact timing of when callbacks will fire,
      * nor of their ordering. The callback will be called as close as possible to the
      * time specified.
      *
      * When `delay` is larger than `2147483647` or less than `1`, the `delay`will be set to `1`. Non-integer delays are truncated to an integer.
      *
      * If `callback` is not a function, a `TypeError` will be thrown.
      *
      * This method has a custom variant for promises that is available using `timersPromises.setTimeout()`.
      * @since v0.0.1
      * @param callback The function to call when the timer elapses.
      * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
      * @param args Optional arguments to pass when the `callback` is called.
      * @return for use with {@link clearTimeout}
      */
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
}
