package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.RenderTargetCreationOptions> */
trait PartialRenderTargetCreati extends StObject {
  
  var createMipMaps: js.UndefOr[Boolean] = js.undefined
  
  var creationFlags: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[Double] = js.undefined
  
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  var noColorTarget: js.UndefOr[Boolean] = js.undefined
  
  var samples: js.UndefOr[Double] = js.undefined
  
  var samplingMode: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
}
object PartialRenderTargetCreati {
  
  inline def apply(): PartialRenderTargetCreati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderTargetCreati]
  }
  
  extension [Self <: PartialRenderTargetCreati](x: Self) {
    
    inline def setCreateMipMaps(value: Boolean): Self = StObject.set(x, "createMipMaps", value.asInstanceOf[js.Any])
    
    inline def setCreateMipMapsUndefined: Self = StObject.set(x, "createMipMaps", js.undefined)
    
    inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
    
    inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    inline def setNoColorTarget(value: Boolean): Self = StObject.set(x, "noColorTarget", value.asInstanceOf[js.Any])
    
    inline def setNoColorTargetUndefined: Self = StObject.set(x, "noColorTarget", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
    
    inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
  }
}
