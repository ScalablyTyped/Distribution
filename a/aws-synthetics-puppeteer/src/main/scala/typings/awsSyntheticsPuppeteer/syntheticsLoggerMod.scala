package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsLoggerMod extends Shortcut {
  
  @JSImport("SyntheticsLogger", JSImport.Namespace)
  @js.native
  val ^ : SyntheticsLogger = js.native
  
  @js.native
  trait SyntheticsLogger extends StObject {
    
    var LOG_LEVEL_DEBUG: Double = js.native
    
    var LOG_LEVEL_ERROR: Double = js.native
    
    var LOG_LEVEL_INFO: Double = js.native
    
    var LOG_LEVEL_WARN: Double = js.native
    
    var _logFilePath: String = js.native
    
    var _logLevel: Double = js.native
    
    var _logStream: WriteStream = js.native
    
    def debug(message: Any): Unit = js.native
    def debug(message: Any, ex: Any): Unit = js.native
    
    def deleteLogFile(): js.Promise[Unit] = js.native
    
    def end(): Unit = js.native
    
    def error(message: Any): Unit = js.native
    def error(message: Any, ex: Any): Unit = js.native
    
    def getLogFilePath(): String = js.native
    
    def getLogLevel(): Double = js.native
    
    def info(message: Any): Unit = js.native
    def info(message: Any, ex: Any): Unit = js.native
    
    def log(message: Any): Unit = js.native
    def log(message: Any, ex: Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetLogName(): Unit = js.native
    
    def setLogLevel(logLevel: Any): Unit = js.native
    
    def warn(message: Any): Unit = js.native
    def warn(message: Any, ex: Any): Unit = js.native
    
    def write(message: Any): Unit = js.native
    def write(message: Any, exception: Any): Unit = js.native
  }
  
  type _To = SyntheticsLogger
  
  /* This means you don't have to write `^`, but can instead just say `syntheticsLoggerMod.foo` */
  override def _to: SyntheticsLogger = ^
}
