package typings.cesium.anon

import typings.cesium.mod.ImageryLayer
import typings.cesium.mod.ImageryLayer.ValueFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brightness extends js.Object {
  
  var alpha: js.UndefOr[Double | ValueFunc] = js.native
  
  var brightness: js.UndefOr[Double | ValueFunc] = js.native
  
  var contrast: js.UndefOr[Double | ValueFunc] = js.native
  
  var gamma: js.UndefOr[Double | ValueFunc] = js.native
  
  var hue: js.UndefOr[Double | ValueFunc] = js.native
  
  var maximumAnisotropy: js.UndefOr[Double] = js.native
  
  var maximumTerrainLevel: js.UndefOr[Double] = js.native
  
  var minimumTerrainLevel: js.UndefOr[Double] = js.native
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  
  var saturation: js.UndefOr[Double | ValueFunc] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object Brightness {
  
  @scala.inline
  def apply(): Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brightness]
  }
  
  @scala.inline
  implicit class BrightnessOps[Self <: Brightness] (val x: Self) extends AnyVal {
    
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
    def setAlphaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("alpha", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAlpha(value: Double | ValueFunc): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setBrightnessFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("brightness", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBrightness(value: Double | ValueFunc): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    
    @scala.inline
    def setContrastFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("contrast", js.Any.fromFunction5(value))
    
    @scala.inline
    def setContrast(value: Double | ValueFunc): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    
    @scala.inline
    def setGammaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("gamma", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGamma(value: Double | ValueFunc): Self = this.set("gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
    
    @scala.inline
    def setHueFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("hue", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHue(value: Double | ValueFunc): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setMaximumAnisotropy(value: Double): Self = this.set("maximumAnisotropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumAnisotropy: Self = this.set("maximumAnisotropy", js.undefined)
    
    @scala.inline
    def setMaximumTerrainLevel(value: Double): Self = this.set("maximumTerrainLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTerrainLevel: Self = this.set("maximumTerrainLevel", js.undefined)
    
    @scala.inline
    def setMinimumTerrainLevel(value: Double): Self = this.set("minimumTerrainLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTerrainLevel: Self = this.set("minimumTerrainLevel", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    
    @scala.inline
    def setSaturationFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = this.set("saturation", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSaturation(value: Double | ValueFunc): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
