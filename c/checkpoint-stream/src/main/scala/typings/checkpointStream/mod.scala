package typings.checkpointStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: CheckpointConfig): CheckpointStream = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[CheckpointStream]
  inline def apply(isCheckpointFn: CheckpointFunction): CheckpointStream = ^.asInstanceOf[js.Dynamic].apply(isCheckpointFn.asInstanceOf[js.Any]).asInstanceOf[CheckpointStream]
  
  @JSImport("checkpoint-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def obj(config: CheckpointConfig): CheckpointStream = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(config.asInstanceOf[js.Any]).asInstanceOf[CheckpointStream]
  /**
    * Convenience method for creating object streams.
    */
  inline def obj(isCheckpointFn: CheckpointFunction): CheckpointStream = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(isCheckpointFn.asInstanceOf[js.Any]).asInstanceOf[CheckpointStream]
  
  trait CheckpointConfig extends StObject {
    
    def isCheckpointFn(chunk: Any): Boolean
    @JSName("isCheckpointFn")
    var isCheckpointFn_Original: CheckpointFunction
    
    var maxQueued: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object CheckpointConfig {
    
    inline def apply(isCheckpointFn: /* chunk */ Any => Boolean): CheckpointConfig = {
      val __obj = js.Dynamic.literal(isCheckpointFn = js.Any.fromFunction1(isCheckpointFn))
      __obj.asInstanceOf[CheckpointConfig]
    }
    
    extension [Self <: CheckpointConfig](x: Self) {
      
      inline def setIsCheckpointFn(value: /* chunk */ Any => Boolean): Self = StObject.set(x, "isCheckpointFn", js.Any.fromFunction1(value))
      
      inline def setMaxQueued(value: Double): Self = StObject.set(x, "maxQueued", value.asInstanceOf[js.Any])
      
      inline def setMaxQueuedUndefined: Self = StObject.set(x, "maxQueued", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type CheckpointFunction = js.Function1[/* chunk */ Any, Boolean]
  
  @js.native
  trait CheckpointStream
    extends typings.pumpify.mod.^ {
    
    def flush(callback: FlushCallback): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  type FlushCallback = js.Function1[/* streamEnded */ Boolean, Unit]
}
