package typings.consola.distConsola3fef035aMod

import typings.consola.anon.Count
import typings.consola.anon.PartialConsolaOptions
import typings.consola.consolaBooleans.`false`
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consola extends StObject {
  
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
  
  def level: LogLevel = js.native
  def level_=(level: LogLevel): Unit = js.native
  
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
  
  def removeReporter(reporter: ConsolaReporter): this.type | js.Array[ConsolaReporter] = js.native
  
  def restoreAll(): Unit = js.native
  
  def restoreConsole(): Unit = js.native
  
  def restoreStd(): Unit = js.native
  
  def resumeLogs(): Unit = js.native
  
  def setReporters(reporters: js.Array[ConsolaReporter]): this.type = js.native
  
  def withDefaults(defaults: InputLogObject): ConsolaInstance = js.native
  
  def withTag(tag: String): ConsolaInstance = js.native
  
  def wrapAll(): Unit = js.native
  
  def wrapConsole(): Unit = js.native
  
  def wrapStd(): Unit = js.native
}
