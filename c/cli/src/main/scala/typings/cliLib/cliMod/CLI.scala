package typings
package cliLib.cliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLI extends js.Object {
  var app: java.lang.String = js.native
  var argc: scala.Double = js.native
  var args: js.Array[java.lang.String] = js.native
  var argv: js.Array[java.lang.String] = js.native
  var command: java.lang.String = js.native
  var native: js.Any = js.native
  var no_color: scala.Boolean = js.native
  var option_width: scala.Double = js.native
  var options: js.Any = js.native
  var version: java.lang.String = js.native
  var width: scala.Double = js.native
  def autocompleteCommand(command: java.lang.String): java.lang.String = js.native
  def createServer(args: js.Any*): js.Any = js.native
  def daemon(arg: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def debug(msg: java.lang.String): scala.Unit = js.native
  def disable(plugins: java.lang.String*): CLI = js.native
  def enable(plugins: java.lang.String*): CLI = js.native
  def error(msg: java.lang.String): scala.Unit = js.native
  def exec(cmd: java.lang.String): scala.Unit = js.native
  def exec(cmd: java.lang.String, callback: js.Function1[/* lines */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def exec(
    cmd: java.lang.String,
    callback: js.Function1[/* lines */ js.Array[java.lang.String], scala.Unit],
    errback: js.Function2[/* err */ js.Any, /* stdout */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def exit(code: scala.Double): scala.Unit = js.native
  def fatal(msg: java.lang.String): scala.Unit = js.native
  def getArrayValue[T](arr: js.Array[T], defaultVal: T): T = js.native
  def getDate(defaultVal: stdLib.Date): stdLib.Date = js.native
  def getEmail(defaultVal: java.lang.String): java.lang.String = js.native
  def getFloat(defaultVal: scala.Double): scala.Double = js.native
  def getInt(defaultVal: scala.Double): scala.Double = js.native
  def getIp(defaultVal: java.lang.String): java.lang.String = js.native
  def getOptError(expects: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def getPath(defaultVal: java.lang.String): java.lang.String = js.native
  def getPath(defaultVal: java.lang.String, identifier: java.lang.String): java.lang.String = js.native
  def getUrl(defautltVal: java.lang.String): java.lang.String = js.native
  def getUrl(defautltVal: java.lang.String, identifier: java.lang.String): java.lang.String = js.native
  def getUsage(): scala.Unit = js.native
  def getUsage(code: scala.Double): scala.Unit = js.native
  def getValue(
    defaultVal: java.lang.String,
    validateFunc: js.Function1[/* value */ js.Any, _],
    errMsg: java.lang.String
  ): scala.Unit = js.native
  def info(msg: java.lang.String): scala.Unit = js.native
  def main(callback: js.Function2[/* args */ js.Array[java.lang.String], /* options */ js.Any, scala.Unit]): scala.Unit = js.native
  def next(): java.lang.String = js.native
  def ok(msg: java.lang.String): scala.Unit = js.native
  def output(): scala.Unit = js.native
  def output(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def parse(): js.Any = js.native
  def parse(opts: ScalablyTyped.runtime.StringDictionary[cliLib.Anon_2]): js.Any = js.native
  def parse(
    opts: ScalablyTyped.runtime.StringDictionary[cliLib.Anon_2],
    commands: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  def parse(opts: ScalablyTyped.runtime.StringDictionary[cliLib.Anon_2], commands: js.Array[java.lang.String]): js.Any = js.native
  def parsePackageJson(): scala.Unit = js.native
  def parsePackageJson(path: java.lang.String): scala.Unit = js.native
  def progress(progress: scala.Double): scala.Unit = js.native
  def progress(progress: scala.Double, decimals: scala.Double): scala.Unit = js.native
  def progress(progress: scala.Double, decimals: scala.Double, stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def setApp(appName: java.lang.String, version: java.lang.String): CLI = js.native
  def setApp(packageJson: java.lang.String): CLI = js.native
  def setArgv(argv: java.lang.String): scala.Unit = js.native
  def setArgv(argv: java.lang.String, keepArg0: scala.Boolean): scala.Unit = js.native
  def setArgv(argv: js.Array[_]): scala.Unit = js.native
  def setArgv(argv: js.Array[_], keepArg0: scala.Boolean): scala.Unit = js.native
  def setUsage(usage: java.lang.String): CLI = js.native
  def spinner(): scala.Unit = js.native
  def spinner(prefix: java.lang.String): scala.Unit = js.native
  def spinner(prefix: java.lang.String, end: scala.Boolean): scala.Unit = js.native
  def spinner(prefix: java.lang.String, end: scala.Boolean, stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def spinner(prefix: scala.Boolean): scala.Unit = js.native
  def spinner(prefix: scala.Boolean, end: scala.Boolean): scala.Unit = js.native
  def spinner(prefix: scala.Boolean, end: scala.Boolean, stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def toType(`object`: js.Any): java.lang.String = js.native
  def withInput(
    callback: js.Function3[
      /* line */ java.lang.String, 
      /* newline */ java.lang.String, 
      /* eof */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def withInput(
    file: java.lang.String,
    callback: js.Function3[
      /* line */ java.lang.String, 
      /* newline */ java.lang.String, 
      /* eof */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def withInput(
    file: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function3[
      /* line */ java.lang.String, 
      /* newline */ java.lang.String, 
      /* eof */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def withStdin(callback: js.Function1[/* data */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def withStdin(encoding: java.lang.String, callback: js.Function1[/* text */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def withStdinLines(
    callback: js.Function2[/* lines */ js.Array[java.lang.String], /* newline */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

