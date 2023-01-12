package typings.brotliSize

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.PassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("brotli-size/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(incoming: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(incoming.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def default(incoming: String, options: BrotliEncodeParams): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(incoming.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def default(incoming: Buffer): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(incoming.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def default(incoming: Buffer, options: BrotliEncodeParams): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(incoming.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def file(path: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def file(path: String, options: BrotliEncodeParams): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def fileSync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def fileSync(path: String, options: BrotliEncodeParams): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stream(): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[PassThrough]
  inline def stream(options: BrotliEncodeParams): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any]).asInstanceOf[PassThrough]
  
  inline def sync(incoming: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(incoming.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sync(incoming: String, options: BrotliEncodeParams): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(incoming.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def sync(incoming: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(incoming.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sync(incoming: Buffer, options: BrotliEncodeParams): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(incoming.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait BrotliEncodeParams extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object BrotliEncodeParams {
    
    inline def apply(): BrotliEncodeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrotliEncodeParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrotliEncodeParams] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
