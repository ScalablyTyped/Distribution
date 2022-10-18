package typings.builderUtil

import org.scalablytyped.runtime.StringDictionary
import typings.debug.mod.Debugger
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLogMod {
  
  @JSImport("builder-util/out/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util/out/log", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(stream: WritableStream) = this()
    
    /* private */ var _doLog: Any = js.native
    
    def debug(fields: Null, message: String): Unit = js.native
    def debug(fields: Fields, message: String): Unit = js.native
    
    /* private */ var doLog: Any = js.native
    
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
    
    def isDebugEnabled: Boolean = js.native
    
    def log(message: String): Unit = js.native
    
    def messageTransformer(message: String, level: LogLevel): String = js.native
    
    /* protected */ val stream: WritableStream = js.native
    
    def warn(): Unit = js.native
    def warn(messageOrFields: String): Unit = js.native
    def warn(messageOrFields: String, message: String): Unit = js.native
    def warn(messageOrFields: Null, message: String): Unit = js.native
    def warn(messageOrFields: Fields): Unit = js.native
    def warn(messageOrFields: Fields, message: String): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("builder-util/out/log", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessage(message: String, fields: Null, level: LogLevel, color: js.Function1[/* it */ String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(message.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], level.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createMessage(
      message: String,
      fields: Null,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(message.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], level.asInstanceOf[js.Any], color.asInstanceOf[js.Any], messagePadding.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createMessage(message: String, fields: Fields, level: LogLevel, color: js.Function1[/* it */ String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(message.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], level.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createMessage(
      message: String,
      fields: Fields,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(message.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], level.asInstanceOf[js.Any], color.asInstanceOf[js.Any], messagePadding.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("builder-util/out/log", "PADDING")
  @js.native
  val PADDING: /* 2 */ Double = js.native
  
  @JSImport("builder-util/out/log", "debug")
  @js.native
  val debug: Debugger = js.native
  
  @JSImport("builder-util/out/log", "log")
  @js.native
  val log: Logger = js.native
  
  inline def setPrinter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrinter")().asInstanceOf[Unit]
  inline def setPrinter(value: js.Function1[/* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrinter")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Fields = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.builderUtil.builderUtilStrings.info
    - typings.builderUtil.builderUtilStrings.warn
    - typings.builderUtil.builderUtilStrings.debug
    - typings.builderUtil.builderUtilStrings.notice
    - typings.builderUtil.builderUtilStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.builderUtil.builderUtilStrings.debug = "debug".asInstanceOf[typings.builderUtil.builderUtilStrings.debug]
    
    inline def error: typings.builderUtil.builderUtilStrings.error = "error".asInstanceOf[typings.builderUtil.builderUtilStrings.error]
    
    inline def info: typings.builderUtil.builderUtilStrings.info = "info".asInstanceOf[typings.builderUtil.builderUtilStrings.info]
    
    inline def notice: typings.builderUtil.builderUtilStrings.notice = "notice".asInstanceOf[typings.builderUtil.builderUtilStrings.notice]
    
    inline def warn: typings.builderUtil.builderUtilStrings.warn = "warn".asInstanceOf[typings.builderUtil.builderUtilStrings.warn]
  }
}
