package typings.browserBunyan.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Logger
import typings.bunyan.mod.LoggerOptions
import typings.bunyan.mod.RingBuffer
import typings.bunyan.mod.RingBufferOptions
import typings.bunyan.mod.RotatingFileStream
import typings.bunyan.mod.RotatingFileStreamOptions
import typings.bunyan.mod.StdSerializers_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbunyan extends js.Object {
  
  val DEBUG: Double = js.native
  
  val ERROR: Double = js.native
  
  val FATAL: Double = js.native
  
  val INFO: Double = js.native
  
  var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typings.bunyan.mod.RingBuffer] = js.native
  
  var RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, typings.bunyan.mod.RotatingFileStream] = js.native
  
  val TRACE: Double = js.native
  
  val WARN: Double = js.native
  
  def createLogger(options: LoggerOptions): Logger = js.native
  
  val levelFromName: nameinLogLevelStringnumbe = js.native
  
  val nameFromLevel: NumberDictionary[String] = js.native
  
  def resolveLevel(value: LogLevel): Double = js.native
  
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
  
  val stdSerializers: StdSerializers_ = js.native
}
object Typeofbunyan {
  
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    FATAL: Double,
    INFO: Double,
    RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
    RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
    TRACE: Double,
    WARN: Double,
    createLogger: LoggerOptions => Logger,
    levelFromName: nameinLogLevelStringnumbe,
    nameFromLevel: NumberDictionary[String],
    resolveLevel: LogLevel => Double,
    safeCycles: () => js.Function2[/* key */ String, /* value */ js.Any, _],
    stdSerializers: StdSerializers_
  ): Typeofbunyan = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], RingBuffer = RingBuffer.asInstanceOf[js.Any], RotatingFileStream = RotatingFileStream.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName.asInstanceOf[js.Any], nameFromLevel = nameFromLevel.asInstanceOf[js.Any], resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbunyan]
  }
  
  @scala.inline
  implicit class TypeofbunyanOps[Self <: Typeofbunyan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFATAL(value: Double): Self = this.set("FATAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingBuffer(value: Instantiable1[/* options */ RingBufferOptions, RingBuffer]): Self = this.set("RingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatingFileStream(value: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream]): Self = this.set("RotatingFileStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: Double): Self = this.set("TRACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLogger(value: LoggerOptions => Logger): Self = this.set("createLogger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelFromName(value: nameinLogLevelStringnumbe): Self = this.set("levelFromName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFromLevel(value: NumberDictionary[String]): Self = this.set("nameFromLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveLevel(value: LogLevel => Double): Self = this.set("resolveLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSafeCycles(value: () => js.Function2[/* key */ String, /* value */ js.Any, _]): Self = this.set("safeCycles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStdSerializers(value: StdSerializers_): Self = this.set("stdSerializers", value.asInstanceOf[js.Any])
  }
}
