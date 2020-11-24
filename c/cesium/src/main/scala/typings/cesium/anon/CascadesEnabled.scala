package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascadesEnabled extends js.Object {
  
  var cascadesEnabled: js.UndefOr[Boolean] = js.native
  
  var darkness: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var isPointLight: js.UndefOr[Boolean] = js.native
  
  var lightCamera: typings.cesium.mod.Camera = js.native
  
  var maximumDistance: js.UndefOr[Double] = js.native
  
  var normalOffset: js.UndefOr[Boolean] = js.native
  
  var numberOfCascades: js.UndefOr[Double] = js.native
  
  var pointLightRadius: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var softShadows: js.UndefOr[Boolean] = js.native
}
object CascadesEnabled {
  
  @scala.inline
  def apply(lightCamera: typings.cesium.mod.Camera): CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadesEnabled]
  }
  
  @scala.inline
  implicit class CascadesEnabledOps[Self <: CascadesEnabled] (val x: Self) extends AnyVal {
    
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
    def setLightCamera(value: typings.cesium.mod.Camera): Self = this.set("lightCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadesEnabled(value: Boolean): Self = this.set("cascadesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascadesEnabled: Self = this.set("cascadesEnabled", js.undefined)
    
    @scala.inline
    def setDarkness(value: Double): Self = this.set("darkness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkness: Self = this.set("darkness", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIsPointLight(value: Boolean): Self = this.set("isPointLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPointLight: Self = this.set("isPointLight", js.undefined)
    
    @scala.inline
    def setMaximumDistance(value: Double): Self = this.set("maximumDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDistance: Self = this.set("maximumDistance", js.undefined)
    
    @scala.inline
    def setNormalOffset(value: Boolean): Self = this.set("normalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalOffset: Self = this.set("normalOffset", js.undefined)
    
    @scala.inline
    def setNumberOfCascades(value: Double): Self = this.set("numberOfCascades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfCascades: Self = this.set("numberOfCascades", js.undefined)
    
    @scala.inline
    def setPointLightRadius(value: Double): Self = this.set("pointLightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointLightRadius: Self = this.set("pointLightRadius", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSoftShadows(value: Boolean): Self = this.set("softShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftShadows: Self = this.set("softShadows", js.undefined)
  }
}
