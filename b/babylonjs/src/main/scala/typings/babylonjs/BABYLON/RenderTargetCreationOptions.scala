package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderTargetCreationOptions extends js.Object {
  
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[Double] = js.native
  
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies is mipmaps must be generated
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[Double] = js.native
  
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[Double] = js.native
}
object RenderTargetCreationOptions {
  
  @scala.inline
  def apply(): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
  
  @scala.inline
  implicit class RenderTargetCreationOptionsOps[Self <: RenderTargetCreationOptions] (val x: Self) extends AnyVal {
    
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
