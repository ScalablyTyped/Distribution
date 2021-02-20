package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.RenderTargetCreationOptions> */
@js.native
trait PartialRenderTargetCreati extends StObject {
  
  var format: js.UndefOr[Double] = js.native
  
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  
  var samplingMode: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
}
object PartialRenderTargetCreati {
  
  @scala.inline
  def apply(): PartialRenderTargetCreati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderTargetCreati]
  }
  
  @scala.inline
  implicit class PartialRenderTargetCreatiMutableBuilder[Self <: PartialRenderTargetCreati] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    @scala.inline
    def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    @scala.inline
    def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
