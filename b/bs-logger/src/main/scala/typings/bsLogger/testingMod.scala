package typings.bsLogger

import typings.bsLogger.loggerMod.CreateLoggerOptions
import typings.bsLogger.loggerMod.Logger
import typings.bsLogger.targetMockMod.ExtendedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("bs-logger/dist/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/testing", "LogTargetMock")
  @js.native
  open class LogTargetMock ()
    extends typings.bsLogger.targetMockMod.LogTargetMock {
    def this(minLevel: Double) = this()
  }
  
  inline def createLoggerMock(): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")().asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: Unit, target: typings.bsLogger.targetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: CreateLoggerOptions): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any]).asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: CreateLoggerOptions, target: typings.bsLogger.targetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
  
  inline def extendArray[T](array: js.Array[T]): ExtendedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(array.asInstanceOf[js.Any]).asInstanceOf[ExtendedArray[T]]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  inline def setup(target: typings.bsLogger.targetMockMod.LogTargetMock): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait LoggerMock
    extends StObject
       with Logger {
    
    val target: typings.bsLogger.targetMockMod.LogTargetMock = js.native
  }
}
