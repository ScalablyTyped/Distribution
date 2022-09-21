package typings.builderUtilRuntime

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressCallbackTransformMod {
  
  @JSImport("builder-util-runtime/out/ProgressCallbackTransform", "ProgressCallbackTransform")
  @js.native
  open class ProgressCallbackTransform protected () extends Transform {
    def this(
      total: Double,
      cancellationToken: CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, Any]
    ) = this()
    
    def _flush(callback: Any): Unit = js.native
    
    def _transform(chunk: Any, encoding: String, callback: Any): Unit = js.native
    
    /* private */ val cancellationToken: Any = js.native
    
    /* private */ var delta: Any = js.native
    
    /* private */ var nextUpdate: Any = js.native
    
    /* private */ val onProgress: Any = js.native
    
    /* private */ var start: Any = js.native
    
    /* private */ val total: Any = js.native
    
    /* private */ var transferred: Any = js.native
  }
  
  trait ProgressInfo extends StObject {
    
    var bytesPerSecond: Double
    
    var delta: Double
    
    var percent: Double
    
    var total: Double
    
    var transferred: Double
  }
  object ProgressInfo {
    
    inline def apply(bytesPerSecond: Double, delta: Double, percent: Double, total: Double, transferred: Double): ProgressInfo = {
      val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressInfo]
    }
    
    extension [Self <: ProgressInfo](x: Self) {
      
      inline def setBytesPerSecond(value: Double): Self = StObject.set(x, "bytesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
}
