package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineReadTextureMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.readTexture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: js.typedarray.ArrayBuffer,
    sizeInBytes: Boolean,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: js.typedarray.ArrayBuffer,
    sizeInBytes: Unit,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: Double,
    sizeInBytes: Boolean,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Unit, copyBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /** @internal */
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[Double],
        level: js.UndefOr[Double],
        buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
        flushRenderer: js.UndefOr[Boolean],
        noDataConversion: js.UndefOr[Boolean],
        x: js.UndefOr[Double],
        y: js.UndefOr[Double]
      ): js.Promise[js.typedarray.ArrayBufferView]
      
      /** @internal */
      def _readTexturePixelsSync(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[Double],
        level: js.UndefOr[Double],
        buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
        flushRenderer: js.UndefOr[Boolean],
        noDataConversion: js.UndefOr[Boolean],
        x: js.UndefOr[Double],
        y: js.UndefOr[Double]
      ): js.typedarray.ArrayBufferView
    }
    object ThinEngine {
      
      inline def apply(
        _readTexturePixels: (InternalTexture, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Nullable[js.typedarray.ArrayBufferView]], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Double]) => js.Promise[js.typedarray.ArrayBufferView],
        _readTexturePixelsSync: (InternalTexture, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Nullable[js.typedarray.ArrayBufferView]], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Double]) => js.typedarray.ArrayBufferView
      ): ThinEngine = {
        val __obj = js.Dynamic.literal(_readTexturePixels = js.Any.fromFunction10(_readTexturePixels), _readTexturePixelsSync = js.Any.fromFunction10(_readTexturePixelsSync))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def set_readTexturePixels(
          value: (InternalTexture, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Nullable[js.typedarray.ArrayBufferView]], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Double]) => js.Promise[js.typedarray.ArrayBufferView]
        ): Self = StObject.set(x, "_readTexturePixels", js.Any.fromFunction10(value))
        
        inline def set_readTexturePixelsSync(
          value: (InternalTexture, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Nullable[js.typedarray.ArrayBufferView]], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Double]) => js.typedarray.ArrayBufferView
        ): Self = StObject.set(x, "_readTexturePixelsSync", js.Any.fromFunction10(value))
      }
    }
  }
}
