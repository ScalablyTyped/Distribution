package typings.consola.distConsola3fef035aMod

import typings.consola.anon.Count
import typings.consola.anon.PartialConsolaOptions
import typings.consola.consolaBooleans.`false`
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined consola.consola/dist/consola-3fef035a.Consola & std.Record<consola.consola/dist/consola-3fef035a.LogType, consola.consola/dist/consola-3fef035a.LogFn> */
@js.native
trait ConsolaInstance extends StObject {
  
  var _lastLog: Count = js.native
  
  def _log(logObj: LogObject): Unit = js.native
  
  def _logFn(defaults: InputLogObject, args: js.Array[Any]): js.UndefOr[`false`] = js.native
  def _logFn(defaults: InputLogObject, args: js.Array[Any], isRaw: Boolean): js.UndefOr[`false`] = js.native
  
  def _restoreStream(): Unit = js.native
  def _restoreStream(stream: WriteStream): Unit = js.native
  
  def _wrapLogFn(defaults: InputLogObject): js.Function1[/* repeated */ Any, js.UndefOr[`false`]] = js.native
  def _wrapLogFn(defaults: InputLogObject, isRaw: Boolean): js.Function1[/* repeated */ Any, js.UndefOr[`false`]] = js.native
  
  def _wrapStream(stream: Unit, `type`: LogType): Unit = js.native
  def _wrapStream(stream: WriteStream, `type`: LogType): Unit = js.native
  
  def addReporter(reporter: ConsolaReporter): this.type = js.native
  
  def create(options: PartialConsolaOptions): ConsolaInstance = js.native
  
  def debug(message: Any, args: Any*): Unit = js.native
  def debug(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: LogFn = js.native
  
  def error(message: Any, args: Any*): Unit = js.native
  def error(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("error")
  var error_Original: LogFn = js.native
  
  def fail(message: Any, args: Any*): Unit = js.native
  def fail(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("fail")
  var fail_Original: LogFn = js.native
  
  def fatal(message: Any, args: Any*): Unit = js.native
  def fatal(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("fatal")
  var fatal_Original: LogFn = js.native
  
  def info(message: Any, args: Any*): Unit = js.native
  def info(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("info")
  var info_Original: LogFn = js.native
  
  def level: LogLevel = js.native
  def level_=(level: LogLevel): Unit = js.native
  
  def log(message: Any, args: Any*): Unit = js.native
  def log(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("log")
  var log_Original: LogFn = js.native
  
  def mockTypes(): Unit = js.native
  def mockTypes(mockFn: js.Function2[/* type */ String, /* currentType */ Any, Any]): Unit = js.native
  
  var options: ConsolaOptions = js.native
  
  def pauseLogs(): Unit = js.native
  
  def prompt[T /* <: PromptOptions */](message: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends consola.consola/dist/consola-3fef035a.TextOptions ? string : T extends consola.consola/dist/consola-3fef035a.ConfirmOptions ? boolean : std.Array<string> */ js.Any
  ] = js.native
  def prompt[T /* <: PromptOptions */](message: String, opts: T): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends consola.consola/dist/consola-3fef035a.TextOptions ? string : T extends consola.consola/dist/consola-3fef035a.ConfirmOptions ? boolean : std.Array<string> */ js.Any
  ] = js.native
  
  def ready(message: Any, args: Any*): Unit = js.native
  def ready(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("ready")
  var ready_Original: LogFn = js.native
  
  def removeReporter(reporter: ConsolaReporter): this.type | js.Array[ConsolaReporter] = js.native
  
  def restoreAll(): Unit = js.native
  
  def restoreConsole(): Unit = js.native
  
  def restoreStd(): Unit = js.native
  
  def resumeLogs(): Unit = js.native
  
  def setReporters(reporters: js.Array[ConsolaReporter]): this.type = js.native
  
  def silent(message: Any, args: Any*): Unit = js.native
  def silent(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("silent")
  var silent_Original: LogFn = js.native
  
  def start(message: Any, args: Any*): Unit = js.native
  def start(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("start")
  var start_Original: LogFn = js.native
  
  def success(message: Any, args: Any*): Unit = js.native
  def success(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("success")
  var success_Original: LogFn = js.native
  
  def trace(message: Any, args: Any*): Unit = js.native
  def trace(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("trace")
  var trace_Original: LogFn = js.native
  
  def verbose(message: Any, args: Any*): Unit = js.native
  def verbose(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("verbose")
  var verbose_Original: LogFn = js.native
  
  def warn(message: Any, args: Any*): Unit = js.native
  def warn(message: InputLogObject, args: Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: LogFn = js.native
  
  def withDefaults(defaults: InputLogObject): ConsolaInstance = js.native
  
  def withTag(tag: String): ConsolaInstance = js.native
  
  def wrapAll(): Unit = js.native
  
  def wrapConsole(): Unit = js.native
  
  def wrapStd(): Unit = js.native
}
