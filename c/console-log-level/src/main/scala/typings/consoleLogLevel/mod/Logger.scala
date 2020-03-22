package typings.consoleLogLevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<console-log-level.console-log-level.LogLevelNames, (args : ...any): void> */
@js.native
trait Logger extends js.Object {
  @JSName("debug")
  var debug_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSName("error")
  var error_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSName("fatal")
  var fatal_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSName("info")
  var info_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSName("trace")
  var trace_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSName("warn")
  var warn_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def fatal(args: js.Any*): Unit = js.native
  def info(args: js.Any*): Unit = js.native
  def trace(args: js.Any*): Unit = js.native
  def warn(args: js.Any*): Unit = js.native
}

