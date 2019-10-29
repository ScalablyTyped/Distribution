package typings.consola.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", "Consola")
@js.native
class Consola protected () extends js.Object {
  def this(options: ConsolaOptions) = this()
  var level: Double = js.native
  val stderr: js.Any = js.native
  val stdout: js.Any = js.native
  // Reporter
  def addReporter(reporter: ConsolaReporter): Consola = js.native
  def clear(reporter: ConsolaReporter): Consola = js.native
  // Create
  def create(options: ConsolaOptions): Consola = js.native
  def debug(message: js.Any, args: js.Any*): Unit = js.native
  def debug(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def error(message: js.Any, args: js.Any*): Unit = js.native
  def error(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def fatal(message: js.Any, args: js.Any*): Unit = js.native
  // Built-in log levels
  def fatal(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def info(message: js.Any, args: js.Any*): Unit = js.native
  def info(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def log(message: js.Any, args: js.Any*): Unit = js.native
  def log(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def mock(mockFn: ConsolaMockFn): js.Any = js.native
  // Mock
  def mockTypes(mockFn: ConsolaMockFn): js.Any = js.native
  def pause(): Unit = js.native
  // Pause/Resume
  def pauseLogs(): Unit = js.native
  def ready(message: js.Any, args: js.Any*): Unit = js.native
  def ready(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def remove(reporter: ConsolaReporter): Consola = js.native
  def removeReporter(reporter: ConsolaReporter): Consola = js.native
  def restoreAll(): Unit = js.native
  def restoreConsole(): Unit = js.native
  def restoreStd(): Unit = js.native
  def resume(): Unit = js.native
  def resumeLogs(): Unit = js.native
  def setReporters(reporters: js.Array[ConsolaReporter]): Consola = js.native
  def start(message: js.Any, args: js.Any*): Unit = js.native
  def start(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def success(message: js.Any, args: js.Any*): Unit = js.native
  def success(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def trace(message: js.Any, args: js.Any*): Unit = js.native
  def trace(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def warn(message: js.Any, args: js.Any*): Unit = js.native
  def warn(message: ConsolaLogObject, args: js.Any*): Unit = js.native
  def withDefaults(defaults: ConsolaLogObject): Consola = js.native
  def withScope(tag: String): Consola = js.native
  def withTag(tag: String): Consola = js.native
  // Wrappers
  def wrapAll(): Unit = js.native
  def wrapConsole(): Unit = js.native
  def wrapStd(): Unit = js.native
}

