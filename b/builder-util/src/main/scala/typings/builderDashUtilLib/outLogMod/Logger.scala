package typings
package builderDashUtilLib.outLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/log", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(stream: nodeLib.NodeJSNs.WritableStream) = this()
  var _doLog: js.Any = js.native
  var doLog: js.Any = js.native
  val isDebugEnabled: scala.Boolean = js.native
  val stream: nodeLib.NodeJSNs.WritableStream = js.native
  def debug(fields: Fields, message: java.lang.String): scala.Unit = js.native
  def debug(fields: scala.Null, message: java.lang.String): scala.Unit = js.native
  def filePath(file: java.lang.String): java.lang.String = js.native
  def info(): scala.Unit = js.native
  def info(messageOrFields: Fields): scala.Unit = js.native
  def info(messageOrFields: Fields, message: java.lang.String): scala.Unit = js.native
  def info(messageOrFields: java.lang.String): scala.Unit = js.native
  def info(messageOrFields: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def info(messageOrFields: scala.Null, message: java.lang.String): scala.Unit = js.native
  def log(message: java.lang.String): scala.Unit = js.native
  def messageTransformer(message: java.lang.String, level: LogLevel): java.lang.String = js.native
  def notice(): scala.Unit = js.native
  def notice(messageOrFields: Fields): scala.Unit = js.native
  def notice(messageOrFields: Fields, message: java.lang.String): scala.Unit = js.native
  def notice(messageOrFields: java.lang.String): scala.Unit = js.native
  def notice(messageOrFields: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def notice(messageOrFields: scala.Null, message: java.lang.String): scala.Unit = js.native
  def warn(): scala.Unit = js.native
  def warn(messageOrFields: Fields): scala.Unit = js.native
  def warn(messageOrFields: Fields, message: java.lang.String): scala.Unit = js.native
  def warn(messageOrFields: java.lang.String): scala.Unit = js.native
  def warn(messageOrFields: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def warn(messageOrFields: scala.Null, message: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("builder-util/out/log", "Logger")
@js.native
object Logger extends js.Object {
  def createMessage(
    message: java.lang.String,
    fields: builderDashUtilLib.outLogMod.Fields,
    level: builderDashUtilLib.outLogMod.LogLevel,
    color: js.Function1[/* it */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def createMessage(
    message: java.lang.String,
    fields: builderDashUtilLib.outLogMod.Fields,
    level: builderDashUtilLib.outLogMod.LogLevel,
    color: js.Function1[/* it */ java.lang.String, java.lang.String],
    messagePadding: scala.Double
  ): java.lang.String = js.native
  def createMessage(
    message: java.lang.String,
    fields: scala.Null,
    level: builderDashUtilLib.outLogMod.LogLevel,
    color: js.Function1[/* it */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def createMessage(
    message: java.lang.String,
    fields: scala.Null,
    level: builderDashUtilLib.outLogMod.LogLevel,
    color: js.Function1[/* it */ java.lang.String, java.lang.String],
    messagePadding: scala.Double
  ): java.lang.String = js.native
}

