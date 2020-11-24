package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.RenderTargetCreationOptions> */
@js.native
trait PartialRenderTargetCreati extends js.Object {
  
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
  implicit class PartialRenderTargetCreatiOps[Self <: PartialRenderTargetCreati] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: Double): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGenerateDepthBuffer(value: Boolean): Self = this.set("generateDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateDepthBuffer: Self = this.set("generateDepthBuffer", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = this.set("generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateMipMaps: Self = this.set("generateMipMaps", js.undefined)
    
    @scala.inline
    def setGenerateStencilBuffer(value: Boolean): Self = this.set("generateStencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateStencilBuffer: Self = this.set("generateStencilBuffer", js.undefined)
    
    @scala.inline
    def setSamplingMode(value: Double): Self = this.set("samplingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingMode: Self = this.set("samplingMode", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
