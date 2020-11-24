package typings.cli.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cli.anon.`0`
import typings.node.NodeJS.WritableStream
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLI extends js.Object {
  
  var app: String = js.native
  
  var argc: Double = js.native
  
  var args: js.Array[String] = js.native
  
  var argv: js.Array[String] = js.native
  
  def autocompleteCommand(command: String): String = js.native
  
  var command: String = js.native
  
  def createServer(args: js.Any*): js.Any = js.native
  
  def daemon(arg: String, callback: js.Function0[Unit]): Unit = js.native
  
  def debug(msg: String): Unit = js.native
  
  def disable(plugins: String*): CLI = js.native
  
  def enable(plugins: String*): CLI = js.native
  
  def error(msg: String): Unit = js.native
  
  def exec(cmd: String): Unit = js.native
  def exec(
    cmd: String,
    callback: js.UndefOr[scala.Nothing],
    errback: js.Function2[/* err */ js.Any, /* stdout */ String, Unit]
  ): Unit = js.native
  def exec(cmd: String, callback: js.Function1[/* lines */ js.Array[String], Unit]): Unit = js.native
  def exec(
    cmd: String,
    callback: js.Function1[/* lines */ js.Array[String], Unit],
    errback: js.Function2[/* err */ js.Any, /* stdout */ String, Unit]
  ): Unit = js.native
  
  def exit(code: Double): Unit = js.native
  
  def fatal(msg: String): Unit = js.native
  
  def getArrayValue[T](arr: js.Array[T], defaultVal: T): T = js.native
  
  def getDate(defaultVal: Date): Date = js.native
  
  def getEmail(defaultVal: String): String = js.native
  
  def getFloat(defaultVal: Double): Double = js.native
  
  def getInt(defaultVal: Double): Double = js.native
  
  def getIp(defaultVal: String): String = js.native
  
  def getOptError(expects: String, `type`: String): String = js.native
  
  def getPath(defaultVal: String): String = js.native
  def getPath(defaultVal: String, identifier: String): String = js.native
  
  def getUrl(defautltVal: String): String = js.native
  def getUrl(defautltVal: String, identifier: String): String = js.native
  
  def getUsage(): Unit = js.native
  def getUsage(code: Double): Unit = js.native
  
  def getValue(defaultVal: String, validateFunc: js.Function1[/* value */ js.Any, _], errMsg: String): Unit = js.native
  
  def info(msg: String): Unit = js.native
  
  def main(callback: js.Function2[/* args */ js.Array[String], /* options */ js.Any, Unit]): Unit = js.native
  
  var native: js.Any = js.native
  
  def next(): String = js.native
  
  var no_color: Boolean = js.native
  
  def ok(msg: String): Unit = js.native
  
  var option_width: Double = js.native
  
  var options: js.Any = js.native
  
  def output(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def output(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  def parse(): js.Any = js.native
  def parse(opts: js.UndefOr[scala.Nothing], commands: js.Array[String]): js.Any = js.native
  def parse(opts: js.UndefOr[scala.Nothing], commands: StringDictionary[String]): js.Any = js.native
  def parse(opts: StringDictionary[`0`]): js.Any = js.native
  def parse(opts: StringDictionary[`0`], commands: js.Array[String]): js.Any = js.native
  def parse(opts: StringDictionary[`0`], commands: StringDictionary[String]): js.Any = js.native
  
  def parsePackageJson(): Unit = js.native
  def parsePackageJson(path: String): Unit = js.native
  
  def progress(progress: Double): Unit = js.native
  def progress(progress: Double, decimals: js.UndefOr[scala.Nothing], stream: WritableStream): Unit = js.native
  def progress(progress: Double, decimals: Double): Unit = js.native
  def progress(progress: Double, decimals: Double, stream: WritableStream): Unit = js.native
  
  def setApp(appName: String, version: String): CLI = js.native
  def setApp(packageJson: String): CLI = js.native
  
  def setArgv(argv: String): Unit = js.native
  def setArgv(argv: String, keepArg0: Boolean): Unit = js.native
  def setArgv(argv: js.Array[_]): Unit = js.native
  def setArgv(argv: js.Array[_], keepArg0: Boolean): Unit = js.native
  
  def setUsage(usage: String): CLI = js.native
  
  def spinner(): Unit = js.native
  def spinner(prefix: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], stream: WritableStream): Unit = js.native
  def spinner(prefix: js.UndefOr[scala.Nothing], end: Boolean): Unit = js.native
  def spinner(prefix: js.UndefOr[scala.Nothing], end: Boolean, stream: WritableStream): Unit = js.native
  def spinner(prefix: String): Unit = js.native
  def spinner(prefix: String, end: js.UndefOr[scala.Nothing], stream: WritableStream): Unit = js.native
  def spinner(prefix: String, end: Boolean): Unit = js.native
  def spinner(prefix: String, end: Boolean, stream: WritableStream): Unit = js.native
  def spinner(prefix: Boolean): Unit = js.native
  def spinner(prefix: Boolean, end: js.UndefOr[scala.Nothing], stream: WritableStream): Unit = js.native
  def spinner(prefix: Boolean, end: Boolean): Unit = js.native
  def spinner(prefix: Boolean, end: Boolean, stream: WritableStream): Unit = js.native
  
  def toType(`object`: js.Any): String = js.native
  
  var version: String = js.native
  
  var width: Double = js.native
  
  def withInput(callback: js.Function3[/* line */ String, /* newline */ String, /* eof */ Boolean, Unit]): Unit = js.native
  def withInput(
    file: String,
    callback: js.Function3[/* line */ String, /* newline */ String, /* eof */ Boolean, Unit]
  ): Unit = js.native
  def withInput(
    file: String,
    encoding: String,
    callback: js.Function3[/* line */ String, /* newline */ String, /* eof */ Boolean, Unit]
  ): Unit = js.native
  
  def withStdin(callback: js.Function1[/* data */ String, Unit]): Unit = js.native
  def withStdin(encoding: String, callback: js.Function1[/* text */ String, Unit]): Unit = js.native
  
  def withStdinLines(callback: js.Function2[/* lines */ js.Array[String], /* newline */ String, Unit]): Unit = js.native
}
