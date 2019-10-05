package typings.builderDashUtil

import org.scalablytyped.runtime.StringDictionary
import typings.builderDashUtil.builderDashUtilNumbers.`2`
import typings.builderDashUtil.outLogMod.Fields
import typings.builderDashUtil.outLogMod.LogLevel
import typings.builderDashUtil.outLogMod.Logger
import typings.debug.debugMod.Debugger
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/log", JSImport.Namespace)
@js.native
object outLogMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.builderDashUtil.builderDashUtilStrings.info
    - typings.builderDashUtil.builderDashUtilStrings.warn
    - typings.builderDashUtil.builderDashUtilStrings.debug
    - typings.builderDashUtil.builderDashUtilStrings.notice
    - typings.builderDashUtil.builderDashUtilStrings.error
  */
  trait LogLevel extends js.Object
  
  @js.native
  class Logger protected () extends js.Object {
    def this(stream: WritableStream) = this()
    var _doLog: js.Any = js.native
    var doLog: js.Any = js.native
    val isDebugEnabled: Boolean = js.native
    val stream: WritableStream = js.native
    def debug(fields: Null, message: String): Unit = js.native
    def debug(fields: Fields, message: String): Unit = js.native
    def error(): Unit = js.native
    def error(messageOrFields: String): Unit = js.native
    def error(messageOrFields: String, message: String): Unit = js.native
    def error(messageOrFields: Null, message: String): Unit = js.native
    def error(messageOrFields: Fields): Unit = js.native
    def error(messageOrFields: Fields, message: String): Unit = js.native
    def filePath(file: String): String = js.native
    def info(): Unit = js.native
    def info(messageOrFields: String): Unit = js.native
    def info(messageOrFields: String, message: String): Unit = js.native
    def info(messageOrFields: Null, message: String): Unit = js.native
    def info(messageOrFields: Fields): Unit = js.native
    def info(messageOrFields: Fields, message: String): Unit = js.native
    def log(message: String): Unit = js.native
    def messageTransformer(message: String, level: LogLevel): String = js.native
    def warn(): Unit = js.native
    def warn(messageOrFields: String): Unit = js.native
    def warn(messageOrFields: String, message: String): Unit = js.native
    def warn(messageOrFields: Null, message: String): Unit = js.native
    def warn(messageOrFields: Fields): Unit = js.native
    def warn(messageOrFields: Fields, message: String): Unit = js.native
  }
  
  val PADDING: `2` = js.native
  val debug: Debugger = js.native
  val log: Logger = js.native
  def setPrinter(): Unit = js.native
  def setPrinter(value: js.Function1[/* message */ String, Unit]): Unit = js.native
  /* static members */
  @js.native
  object Logger extends js.Object {
    def createMessage(message: String, fields: Null, level: LogLevel, color: js.Function1[/* it */ String, String]): String = js.native
    def createMessage(
      message: String,
      fields: Null,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = js.native
    def createMessage(message: String, fields: Fields, level: LogLevel, color: js.Function1[/* it */ String, String]): String = js.native
    def createMessage(
      message: String,
      fields: Fields,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = js.native
  }
  
  type Fields = StringDictionary[js.Any]
}

