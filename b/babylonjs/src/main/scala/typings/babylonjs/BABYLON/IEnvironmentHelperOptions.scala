package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnvironmentHelperOptions extends js.Object {
  
  /**
    * The background rotation around the Y axis of the scene.
    * This helps aligning the key lights of your scene with the background.
    * 0 by default.
    */
  var backgroundYRotation: Double = js.native
  
  /**
    * The value of the contrast to apply to the scene.
    * 1.6 by default if setupImageProcessing is true.
    */
  var cameraContrast: Double = js.native
  
  /**
    * The value of the exposure to apply to the scene.
    * 0.6 by default if setupImageProcessing is true.
    */
  var cameraExposure: Double = js.native
  
  /**
    * Specifies whether or not to create a ground.
    * True by default.
    */
  var createGround: Boolean = js.native
  
  /**
    * Specifies whether or not to create a skybox.
    * True by default.
    */
  var createSkybox: Boolean = js.native
  
  /**
    * Creates a mirror texture attach to the ground.
    * false by default.
    */
  var enableGroundMirror: Boolean = js.native
  
  /**
    * Enables the ground to receive shadows.
    * True by default.
    */
  var enableGroundShadow: Boolean = js.native
  
  /**
    * The texture used as your environment texture in the scene.
    * Comes from the BabylonJS CDN by default and in use if setupImageProcessing is true.
    *
    * Remarks: Can be either a texture or a url.
    */
  var environmentTexture: String | BaseTexture = js.native
  
  /**
    * The color mixed in the ground texture by default.
    * BabylonJS clearColor by default.
    */
  var groundColor: Color3 = js.native
  
  /**
    * Specifies the ground mirror visibility amount.
    * 1 by default
    */
  var groundMirrorAmount: Double = js.native
  
  /**
    * Specifies the ground mirror blur kernel size.
    * 64 by default.
    */
  var groundMirrorBlurKernel: Double = js.native
  
  /**
    * Specifies the ground mirror Falloff distance.
    * This can helps reducing the size of the reflection.
    * 0 by Default.
    */
  var groundMirrorFallOffDistance: Double = js.native
  
  /**
    * Specifies the ground mirror reflectance weight.
    * This uses the standard weight of the background material to setup the fresnel effect
    * of the mirror.
    * 1 by default.
    */
  var groundMirrorFresnelWeight: Double = js.native
  
  /**
    * Specifies the ground mirror size ratio.
    * 0.3 by default as the default kernel is 64.
    */
  var groundMirrorSizeRatio: Double = js.native
  
  /**
    * Specifies the ground mirror texture type.
    * Unsigned Int by Default.
    */
  var groundMirrorTextureType: Double = js.native
  
  /**
    * Specifies the ground opacity.
    * 1 by default.
    */
  var groundOpacity: Double = js.native
  
  /**
    * Helps preventing the shadow to be fully black on the ground.
    * 0.5 by default.
    */
  var groundShadowLevel: Double = js.native
  
  /**
    * Specifies the ground size.
    * 15 by default.
    */
  var groundSize: Double = js.native
  
  /**
    * The texture used on the ground for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var groundTexture: String | BaseTexture = js.native
  
  /**
    * Specifies a bias applied to the ground vertical position to prevent z-fighting with
    * the shown objects.
    */
  var groundYBias: Double = js.native
  
  /**
    * Default position of the rootMesh if autoSize is not true.
    */
  var rootPosition: Vector3 = js.native
  
  /**
    * Sets up the image processing in the scene.
    * true by default.
    */
  var setupImageProcessing: Boolean = js.native
  
  /**
    * Compute automatically the size of the elements to best fit with the scene.
    */
  var sizeAuto: Boolean = js.native
  
  /**
    * The color mixed in the skybox texture by default.
    * BabylonJS clearColor by default.
    */
  var skyboxColor: Color3 = js.native
  
  /**
    * Specifies the skybox size.
    * 20 by default.
    */
  var skyboxSize: Double = js.native
  
  /**
    * The texture used on the skybox for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var skyboxTexture: String | BaseTexture = js.native
  
  /**
    * Specifies whether or not tonemapping should be enabled in the scene.
    * true by default if setupImageProcessing is true.
    */
  var toneMappingEnabled: Boolean = js.native
}
object IEnvironmentHelperOptions {
  
  @scala.inline
  def apply(
    backgroundYRotation: Double,
    cameraContrast: Double,
    cameraExposure: Double,
    createGround: Boolean,
    createSkybox: Boolean,
    enableGroundMirror: Boolean,
    enableGroundShadow: Boolean,
    environmentTexture: String | BaseTexture,
    groundColor: Color3,
    groundMirrorAmount: Double,
    groundMirrorBlurKernel: Double,
    groundMirrorFallOffDistance: Double,
    groundMirrorFresnelWeight: Double,
    groundMirrorSizeRatio: Double,
    groundMirrorTextureType: Double,
    groundOpacity: Double,
    groundShadowLevel: Double,
    groundSize: Double,
    groundTexture: String | BaseTexture,
    groundYBias: Double,
    rootPosition: Vector3,
    setupImageProcessing: Boolean,
    sizeAuto: Boolean,
    skyboxColor: Color3,
    skyboxSize: Double,
    skyboxTexture: String | BaseTexture,
    toneMappingEnabled: Boolean
  ): IEnvironmentHelperOptions = {
    val __obj = js.Dynamic.literal(backgroundYRotation = backgroundYRotation.asInstanceOf[js.Any], cameraContrast = cameraContrast.asInstanceOf[js.Any], cameraExposure = cameraExposure.asInstanceOf[js.Any], createGround = createGround.asInstanceOf[js.Any], createSkybox = createSkybox.asInstanceOf[js.Any], enableGroundMirror = enableGroundMirror.asInstanceOf[js.Any], enableGroundShadow = enableGroundShadow.asInstanceOf[js.Any], environmentTexture = environmentTexture.asInstanceOf[js.Any], groundColor = groundColor.asInstanceOf[js.Any], groundMirrorAmount = groundMirrorAmount.asInstanceOf[js.Any], groundMirrorBlurKernel = groundMirrorBlurKernel.asInstanceOf[js.Any], groundMirrorFallOffDistance = groundMirrorFallOffDistance.asInstanceOf[js.Any], groundMirrorFresnelWeight = groundMirrorFresnelWeight.asInstanceOf[js.Any], groundMirrorSizeRatio = groundMirrorSizeRatio.asInstanceOf[js.Any], groundMirrorTextureType = groundMirrorTextureType.asInstanceOf[js.Any], groundOpacity = groundOpacity.asInstanceOf[js.Any], groundShadowLevel = groundShadowLevel.asInstanceOf[js.Any], groundSize = groundSize.asInstanceOf[js.Any], groundTexture = groundTexture.asInstanceOf[js.Any], groundYBias = groundYBias.asInstanceOf[js.Any], rootPosition = rootPosition.asInstanceOf[js.Any], setupImageProcessing = setupImageProcessing.asInstanceOf[js.Any], sizeAuto = sizeAuto.asInstanceOf[js.Any], skyboxColor = skyboxColor.asInstanceOf[js.Any], skyboxSize = skyboxSize.asInstanceOf[js.Any], skyboxTexture = skyboxTexture.asInstanceOf[js.Any], toneMappingEnabled = toneMappingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvironmentHelperOptions]
  }
  
  @scala.inline
  implicit class IEnvironmentHelperOptionsOps[Self <: IEnvironmentHelperOptions] (val x: Self) extends AnyVal {
    
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
    def setCameraContrast(value: Double): Self = this.set("cameraContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraExposure(value: Double): Self = this.set("cameraExposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateGround(value: Boolean): Self = this.set("createGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSkybox(value: Boolean): Self = this.set("createSkybox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGroundMirror(value: Boolean): Self = this.set("enableGroundMirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGroundShadow(value: Boolean): Self = this.set("enableGroundShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentTexture(value: String | BaseTexture): Self = this.set("environmentTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundColor(value: Color3): Self = this.set("groundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorAmount(value: Double): Self = this.set("groundMirrorAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorBlurKernel(value: Double): Self = this.set("groundMirrorBlurKernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorFallOffDistance(value: Double): Self = this.set("groundMirrorFallOffDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorFresnelWeight(value: Double): Self = this.set("groundMirrorFresnelWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorSizeRatio(value: Double): Self = this.set("groundMirrorSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundMirrorTextureType(value: Double): Self = this.set("groundMirrorTextureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundOpacity(value: Double): Self = this.set("groundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundShadowLevel(value: Double): Self = this.set("groundShadowLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundSize(value: Double): Self = this.set("groundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundTexture(value: String | BaseTexture): Self = this.set("groundTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundYBias(value: Double): Self = this.set("groundYBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPosition(value: Vector3): Self = this.set("rootPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupImageProcessing(value: Boolean): Self = this.set("setupImageProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeAuto(value: Boolean): Self = this.set("sizeAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxColor(value: Color3): Self = this.set("skyboxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxSize(value: Double): Self = this.set("skyboxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyboxTexture(value: String | BaseTexture): Self = this.set("skyboxTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToneMappingEnabled(value: Boolean): Self = this.set("toneMappingEnabled", value.asInstanceOf[js.Any])
  }
}
