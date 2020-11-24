package typings.babylonjs.anon

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/Helpers/environmentHelper.IEnvironmentHelperOptions> */
@js.native
trait PartialIEnvironmentHelper extends js.Object {
  
  var backgroundYRotation: js.UndefOr[Double] = js.native
  
  var cameraContrast: js.UndefOr[Double] = js.native
  
  var cameraExposure: js.UndefOr[Double] = js.native
  
  var createGround: js.UndefOr[Boolean] = js.native
  
  var createSkybox: js.UndefOr[Boolean] = js.native
  
  var enableGroundMirror: js.UndefOr[Boolean] = js.native
  
  var enableGroundShadow: js.UndefOr[Boolean] = js.native
  
  var environmentTexture: js.UndefOr[String | BaseTexture] = js.native
  
  var groundColor: js.UndefOr[Color3] = js.native
  
  var groundMirrorAmount: js.UndefOr[Double] = js.native
  
  var groundMirrorBlurKernel: js.UndefOr[Double] = js.native
  
  var groundMirrorFallOffDistance: js.UndefOr[Double] = js.native
  
  var groundMirrorFresnelWeight: js.UndefOr[Double] = js.native
  
  var groundMirrorSizeRatio: js.UndefOr[Double] = js.native
  
  var groundMirrorTextureType: js.UndefOr[Double] = js.native
  
  var groundOpacity: js.UndefOr[Double] = js.native
  
  var groundShadowLevel: js.UndefOr[Double] = js.native
  
  var groundSize: js.UndefOr[Double] = js.native
  
  var groundTexture: js.UndefOr[String | BaseTexture] = js.native
  
  var groundYBias: js.UndefOr[Double] = js.native
  
  var rootPosition: js.UndefOr[Vector3] = js.native
  
  var setupImageProcessing: js.UndefOr[Boolean] = js.native
  
  var sizeAuto: js.UndefOr[Boolean] = js.native
  
  var skyboxColor: js.UndefOr[Color3] = js.native
  
  var skyboxSize: js.UndefOr[Double] = js.native
  
  var skyboxTexture: js.UndefOr[String | BaseTexture] = js.native
  
  var toneMappingEnabled: js.UndefOr[Boolean] = js.native
}
object PartialIEnvironmentHelper {
  
  @scala.inline
  def apply(): PartialIEnvironmentHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEnvironmentHelper]
  }
  
  @scala.inline
  implicit class PartialIEnvironmentHelperOps[Self <: PartialIEnvironmentHelper] (val x: Self) extends AnyVal {
    
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
    def setBackgroundYRotation(value: Double): Self = this.set("backgroundYRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundYRotation: Self = this.set("backgroundYRotation", js.undefined)
    
    @scala.inline
    def setCameraContrast(value: Double): Self = this.set("cameraContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraContrast: Self = this.set("cameraContrast", js.undefined)
    
    @scala.inline
    def setCameraExposure(value: Double): Self = this.set("cameraExposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraExposure: Self = this.set("cameraExposure", js.undefined)
    
    @scala.inline
    def setCreateGround(value: Boolean): Self = this.set("createGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateGround: Self = this.set("createGround", js.undefined)
    
    @scala.inline
    def setCreateSkybox(value: Boolean): Self = this.set("createSkybox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSkybox: Self = this.set("createSkybox", js.undefined)
    
    @scala.inline
    def setEnableGroundMirror(value: Boolean): Self = this.set("enableGroundMirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroundMirror: Self = this.set("enableGroundMirror", js.undefined)
    
    @scala.inline
    def setEnableGroundShadow(value: Boolean): Self = this.set("enableGroundShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroundShadow: Self = this.set("enableGroundShadow", js.undefined)
    
    @scala.inline
    def setEnvironmentTexture(value: String | BaseTexture): Self = this.set("environmentTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentTexture: Self = this.set("environmentTexture", js.undefined)
    
    @scala.inline
    def setGroundColor(value: Color3): Self = this.set("groundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundColor: Self = this.set("groundColor", js.undefined)
    
    @scala.inline
    def setGroundMirrorAmount(value: Double): Self = this.set("groundMirrorAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorAmount: Self = this.set("groundMirrorAmount", js.undefined)
    
    @scala.inline
    def setGroundMirrorBlurKernel(value: Double): Self = this.set("groundMirrorBlurKernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorBlurKernel: Self = this.set("groundMirrorBlurKernel", js.undefined)
    
    @scala.inline
    def setGroundMirrorFallOffDistance(value: Double): Self = this.set("groundMirrorFallOffDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorFallOffDistance: Self = this.set("groundMirrorFallOffDistance", js.undefined)
    
    @scala.inline
    def setGroundMirrorFresnelWeight(value: Double): Self = this.set("groundMirrorFresnelWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorFresnelWeight: Self = this.set("groundMirrorFresnelWeight", js.undefined)
    
    @scala.inline
    def setGroundMirrorSizeRatio(value: Double): Self = this.set("groundMirrorSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorSizeRatio: Self = this.set("groundMirrorSizeRatio", js.undefined)
    
    @scala.inline
    def setGroundMirrorTextureType(value: Double): Self = this.set("groundMirrorTextureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundMirrorTextureType: Self = this.set("groundMirrorTextureType", js.undefined)
    
    @scala.inline
    def setGroundOpacity(value: Double): Self = this.set("groundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundOpacity: Self = this.set("groundOpacity", js.undefined)
    
    @scala.inline
    def setGroundShadowLevel(value: Double): Self = this.set("groundShadowLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundShadowLevel: Self = this.set("groundShadowLevel", js.undefined)
    
    @scala.inline
    def setGroundSize(value: Double): Self = this.set("groundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundSize: Self = this.set("groundSize", js.undefined)
    
    @scala.inline
    def setGroundTexture(value: String | BaseTexture): Self = this.set("groundTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundTexture: Self = this.set("groundTexture", js.undefined)
    
    @scala.inline
    def setGroundYBias(value: Double): Self = this.set("groundYBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundYBias: Self = this.set("groundYBias", js.undefined)
    
    @scala.inline
    def setRootPosition(value: Vector3): Self = this.set("rootPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootPosition: Self = this.set("rootPosition", js.undefined)
    
    @scala.inline
    def setSetupImageProcessing(value: Boolean): Self = this.set("setupImageProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupImageProcessing: Self = this.set("setupImageProcessing", js.undefined)
    
    @scala.inline
    def setSizeAuto(value: Boolean): Self = this.set("sizeAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeAuto: Self = this.set("sizeAuto", js.undefined)
    
    @scala.inline
    def setSkyboxColor(value: Color3): Self = this.set("skyboxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyboxColor: Self = this.set("skyboxColor", js.undefined)
    
    @scala.inline
    def setSkyboxSize(value: Double): Self = this.set("skyboxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyboxSize: Self = this.set("skyboxSize", js.undefined)
    
    @scala.inline
    def setSkyboxTexture(value: String | BaseTexture): Self = this.set("skyboxTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyboxTexture: Self = this.set("skyboxTexture", js.undefined)
    
    @scala.inline
    def setToneMappingEnabled(value: Boolean): Self = this.set("toneMappingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToneMappingEnabled: Self = this.set("toneMappingEnabled", js.undefined)
  }
}
