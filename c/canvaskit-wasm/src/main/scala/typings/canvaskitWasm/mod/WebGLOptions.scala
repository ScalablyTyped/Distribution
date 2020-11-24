package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLOptions extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var antialias: js.UndefOr[Double] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var enableExtensionsByDefault: js.UndefOr[Double] = js.native
  
  var explicitSwapControl: js.UndefOr[Double] = js.native
  
  var failIfMajorPerformanceCaveat: js.UndefOr[Double] = js.native
  
  var majorVersion: js.UndefOr[Double] = js.native
  
  var minorVersion: js.UndefOr[Double] = js.native
  
  var preferLowPowerToHighPerformance: js.UndefOr[Double] = js.native
  
  var premultipliedAlpha: js.UndefOr[Double] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[Double] = js.native
  
  var renderViaOffscreenBackBuffer: js.UndefOr[Double] = js.native
  
  var stencil: js.UndefOr[Double] = js.native
}
object WebGLOptions {
  
  @scala.inline
  def apply(): WebGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLOptions]
  }
  
  @scala.inline
  implicit class WebGLOptionsOps[Self <: WebGLOptions] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: Double): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setEnableExtensionsByDefault(value: Double): Self = this.set("enableExtensionsByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExtensionsByDefault: Self = this.set("enableExtensionsByDefault", js.undefined)
    
    @scala.inline
    def setExplicitSwapControl(value: Double): Self = this.set("explicitSwapControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitSwapControl: Self = this.set("explicitSwapControl", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Double): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailIfMajorPerformanceCaveat: Self = this.set("failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorVersion: Self = this.set("majorVersion", js.undefined)
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorVersion: Self = this.set("minorVersion", js.undefined)
    
    @scala.inline
    def setPreferLowPowerToHighPerformance(value: Double): Self = this.set("preferLowPowerToHighPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferLowPowerToHighPerformance: Self = this.set("preferLowPowerToHighPerformance", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: Double): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Double): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setRenderViaOffscreenBackBuffer(value: Double): Self = this.set("renderViaOffscreenBackBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderViaOffscreenBackBuffer: Self = this.set("renderViaOffscreenBackBuffer", js.undefined)
    
    @scala.inline
    def setStencil(value: Double): Self = this.set("stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
}
