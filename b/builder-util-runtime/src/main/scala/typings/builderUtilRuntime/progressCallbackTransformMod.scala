package typings.builderUtilRuntime

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressCallbackTransformMod {
  
  @JSImport("builder-util-runtime/out/ProgressCallbackTransform", "ProgressCallbackTransform")
  @js.native
  class ProgressCallbackTransform protected () extends Transform {
    def this(
      total: Double,
      cancellationToken: CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
    ) = this()
    
    def _flush(callback: js.Any): Unit = js.native
    
    def _transform(chunk: js.Any, encoding: String, callback: js.Any): Unit = js.native
    
    val cancellationToken: js.Any = js.native
    
    var delta: js.Any = js.native
    
    var nextUpdate: js.Any = js.native
    
    val onProgress: js.Any = js.native
    
    var start: js.Any = js.native
    
    val total: js.Any = js.native
    
    var transferred: js.Any = js.native
  }
  
  @js.native
  trait ProgressInfo extends StObject {
    
    var bytesPerSecond: Double = js.native
    
    var delta: Double = js.native
    
    var percent: Double = js.native
    
    var total: Double = js.native
    
    var transferred: Double = js.native
  }
  object ProgressInfo {
    
    @scala.inline
    def apply(bytesPerSecond: Double, delta: Double, percent: Double, total: Double, transferred: Double): ProgressInfo = {
      val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressInfo]
    }
    
    @scala.inline
    implicit class ProgressInfoMutableBuilder[Self <: ProgressInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesPerSecond(value: Double): Self = StObject.set(x, "bytesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
}
