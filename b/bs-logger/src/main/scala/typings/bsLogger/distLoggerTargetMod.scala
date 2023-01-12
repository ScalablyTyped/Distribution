package typings.bsLogger

import typings.bsLogger.distLoggerMessageMod.LogMessage
import typings.bsLogger.distLoggerMessageMod.LogMessageFormatter
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerTargetMod {
  
  @JSImport("bs-logger/dist/logger/target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/logger/target", "DEFAULT_LOG_TARGET")
  @js.native
  val DEFAULT_LOG_TARGET: String = js.native
  
  inline def parseLogTargets(): js.Array[LogTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogTargets")().asInstanceOf[js.Array[LogTarget]]
  inline def parseLogTargets(targetString: String): js.Array[LogTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogTargets")(targetString.asInstanceOf[js.Any]).asInstanceOf[js.Array[LogTarget]]
  
  trait LogTarget extends StObject {
    
    def format(msg: LogMessage): String
    @JSName("format")
    var format_Original: LogMessageFormatter
    
    var minLevel: Double
    
    var stream: Writable
  }
  object LogTarget {
    
    inline def apply(format: /* msg */ LogMessage => String, minLevel: Double, stream: Writable): LogTarget = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), minLevel = minLevel.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogTarget] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: /* msg */ LogMessage => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setMinLevel(value: Double): Self = StObject.set(x, "minLevel", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Writable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
