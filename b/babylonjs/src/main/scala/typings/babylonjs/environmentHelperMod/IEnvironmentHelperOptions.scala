package typings.babylonjs.environmentHelperMod

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvironmentHelperOptions extends js.Object {
  /**
    * The background rotation around the Y axis of the scene.
    * This helps aligning the key lights of your scene with the background.
    * 0 by default.
    */
  var backgroundYRotation: Double
  /**
    * The value of the contrast to apply to the scene.
    * 1.6 by default if setupImageProcessing is true.
    */
  var cameraContrast: Double
  /**
    * The value of the exposure to apply to the scene.
    * 0.6 by default if setupImageProcessing is true.
    */
  var cameraExposure: Double
  /**
    * Specifies whether or not to create a ground.
    * True by default.
    */
  var createGround: Boolean
  /**
    * Specifies whether or not to create a skybox.
    * True by default.
    */
  var createSkybox: Boolean
  /**
    * Creates a mirror texture attach to the ground.
    * false by default.
    */
  var enableGroundMirror: Boolean
  /**
    * Enables the ground to receive shadows.
    * True by default.
    */
  var enableGroundShadow: Boolean
  /**
    * The texture used as your environment texture in the scene.
    * Comes from the BabylonJS CDN by default and in use if setupImageProcessing is true.
    *
    * Remarks: Can be either a texture or a url.
    */
  var environmentTexture: String | BaseTexture
  /**
    * The color mixed in the ground texture by default.
    * BabylonJS clearColor by default.
    */
  var groundColor: Color3
  /**
    * Specifies the ground mirror visibility amount.
    * 1 by default
    */
  var groundMirrorAmount: Double
  /**
    * Specifies the ground mirror blur kernel size.
    * 64 by default.
    */
  var groundMirrorBlurKernel: Double
  /**
    * Specifies the ground mirror Falloff distance.
    * This can helps reducing the size of the reflection.
    * 0 by Default.
    */
  var groundMirrorFallOffDistance: Double
  /**
    * Specifies the ground mirror reflectance weight.
    * This uses the standard weight of the background material to setup the fresnel effect
    * of the mirror.
    * 1 by default.
    */
  var groundMirrorFresnelWeight: Double
  /**
    * Specifies the ground mirror size ratio.
    * 0.3 by default as the default kernel is 64.
    */
  var groundMirrorSizeRatio: Double
  /**
    * Specifies the ground mirror texture type.
    * Unsigned Int by Default.
    */
  var groundMirrorTextureType: Double
  /**
    * Specifies the ground opacity.
    * 1 by default.
    */
  var groundOpacity: Double
  /**
    * Helps preventing the shadow to be fully black on the ground.
    * 0.5 by default.
    */
  var groundShadowLevel: Double
  /**
    * Specifies the ground size.
    * 15 by default.
    */
  var groundSize: Double
  /**
    * The texture used on the ground for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var groundTexture: String | BaseTexture
  /**
    * Specifies a bias applied to the ground vertical position to prevent z-fighting with
    * the shown objects.
    */
  var groundYBias: Double
  /**
    * Default position of the rootMesh if autoSize is not true.
    */
  var rootPosition: Vector3
  /**
    * Sets up the image processing in the scene.
    * true by default.
    */
  var setupImageProcessing: Boolean
  /**
    * Compute automatically the size of the elements to best fit with the scene.
    */
  var sizeAuto: Boolean
  /**
    * The color mixed in the skybox texture by default.
    * BabylonJS clearColor by default.
    */
  var skyboxColor: Color3
  /**
    * Specifies the skybox size.
    * 20 by default.
    */
  var skyboxSize: Double
  /**
    * The texture used on the skybox for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var skyboxTexture: String | BaseTexture
  /**
    * Specifies whether or not tonemapping should be enabled in the scene.
    * true by default if setupImageProcessing is true.
    */
  var toneMappingEnabled: Boolean
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
}

