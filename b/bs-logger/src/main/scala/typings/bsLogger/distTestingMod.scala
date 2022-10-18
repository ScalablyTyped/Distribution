package typings.bsLogger

import typings.bsLogger.distLoggerMod.CreateLoggerOptions
import typings.bsLogger.distLoggerMod.Logger
import typings.bsLogger.distTestingTargetMockMod.ExtendedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestingMod {
  
  @JSImport("bs-logger/dist/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/testing", "LogTargetMock")
  @js.native
  open class LogTargetMock ()
    extends typings.bsLogger.distTestingTargetMockMod.LogTargetMock {
    def this(minLevel: Double) = this()
  }
  
  inline def createLoggerMock(): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")().asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: Unit, target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: CreateLoggerOptions): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any]).asInstanceOf[LoggerMock]
  inline def createLoggerMock(options: CreateLoggerOptions, target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
  
  inline def extendArray[T](array: js.Array[T]): ExtendedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(array.asInstanceOf[js.Any]).asInstanceOf[ExtendedArray[T]]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  inline def setup(target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait LoggerMock
    extends StObject
       with Logger {
    
    val target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock = js.native
  }
}
