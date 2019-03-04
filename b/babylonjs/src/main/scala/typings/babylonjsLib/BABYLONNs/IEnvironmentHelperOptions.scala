package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the different options available during the creation of
  * a Environment helper.
  *
  * This can control the default ground, skybox and image processing setup of your scene.
  */
trait IEnvironmentHelperOptions extends js.Object {
  /**
    * The background rotation around the Y axis of the scene.
    * This helps aligning the key lights of your scene with the background.
    * 0 by default.
    */
  var backgroundYRotation: scala.Double
  /**
    * The value of the contrast to apply to the scene.
    * 1.6 by default if setupImageProcessing is true.
    */
  var cameraContrast: scala.Double
  /**
    * The value of the exposure to apply to the scene.
    * 0.6 by default if setupImageProcessing is true.
    */
  var cameraExposure: scala.Double
  /**
    * Specifies wether or not to create a ground.
    * True by default.
    */
  var createGround: scala.Boolean
  /**
    * Specifies wether or not to create a skybox.
    * True by default.
    */
  var createSkybox: scala.Boolean
  /**
    * Creates a mirror texture attach to the ground.
    * false by default.
    */
  var enableGroundMirror: scala.Boolean
  /**
    * Enables the ground to receive shadows.
    * True by default.
    */
  var enableGroundShadow: scala.Boolean
  /**
    * The texture used as your environment texture in the scene.
    * Comes from the BabylonJS CDN by default and in use if setupImageProcessing is true.
    *
    * Remarks: Can be either a texture or a url.
    */
  var environmentTexture: java.lang.String | BaseTexture
  /**
    * The color mixed in the ground texture by default.
    * BabylonJS clearColor by default.
    */
  var groundColor: Color3
  /**
    * Specifies the ground mirror visibility amount.
    * 1 by default
    */
  var groundMirrorAmount: scala.Double
  /**
    * Specifies the ground mirror blur kernel size.
    * 64 by default.
    */
  var groundMirrorBlurKernel: scala.Double
  /**
    * Specifies the ground mirror Falloff distance.
    * This can helps reducing the size of the reflection.
    * 0 by Default.
    */
  var groundMirrorFallOffDistance: scala.Double
  /**
    * Specifies the ground mirror reflectance weight.
    * This uses the standard weight of the background material to setup the fresnel effect
    * of the mirror.
    * 1 by default.
    */
  var groundMirrorFresnelWeight: scala.Double
  /**
    * Specifies the ground mirror size ratio.
    * 0.3 by default as the default kernel is 64.
    */
  var groundMirrorSizeRatio: scala.Double
  /**
    * Specifies the ground mirror texture type.
    * Unsigned Int by Default.
    */
  var groundMirrorTextureType: scala.Double
  /**
    * Specifies the ground opacity.
    * 1 by default.
    */
  var groundOpacity: scala.Double
  /**
    * Helps preventing the shadow to be fully black on the ground.
    * 0.5 by default.
    */
  var groundShadowLevel: scala.Double
  /**
    * Specifies the ground size.
    * 15 by default.
    */
  var groundSize: scala.Double
  /**
    * The texture used on the ground for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var groundTexture: java.lang.String | BaseTexture
  /**
    * Specifies a bias applied to the ground vertical position to prevent z-fighting with
    * the shown objects.
    */
  var groundYBias: scala.Double
  /**
    * Default position of the rootMesh if autoSize is not true.
    */
  var rootPosition: Vector3
  /**
    * Sets up the image processing in the scene.
    * true by default.
    */
  var setupImageProcessing: scala.Boolean
  /**
    * Compute automatically the size of the elements to best fit with the scene.
    */
  var sizeAuto: scala.Boolean
  /**
    * The color mixed in the skybox texture by default.
    * BabylonJS clearColor by default.
    */
  var skyboxColor: Color3
  /**
    * Specifies the skybox size.
    * 20 by default.
    */
  var skyboxSize: scala.Double
  /**
    * The texture used on the skybox for the main color.
    * Comes from the BabylonJS CDN by default.
    *
    * Remarks: Can be either a texture or a url.
    */
  var skyboxTexture: java.lang.String | BaseTexture
  /**
    * Specifies wether or not tonemapping should be enabled in the scene.
    * true by default if setupImageProcessing is true.
    */
  var toneMappingEnabled: scala.Boolean
}

object IEnvironmentHelperOptions {
  @scala.inline
  def apply(
    backgroundYRotation: scala.Double,
    cameraContrast: scala.Double,
    cameraExposure: scala.Double,
    createGround: scala.Boolean,
    createSkybox: scala.Boolean,
    enableGroundMirror: scala.Boolean,
    enableGroundShadow: scala.Boolean,
    environmentTexture: java.lang.String | BaseTexture,
    groundColor: Color3,
    groundMirrorAmount: scala.Double,
    groundMirrorBlurKernel: scala.Double,
    groundMirrorFallOffDistance: scala.Double,
    groundMirrorFresnelWeight: scala.Double,
    groundMirrorSizeRatio: scala.Double,
    groundMirrorTextureType: scala.Double,
    groundOpacity: scala.Double,
    groundShadowLevel: scala.Double,
    groundSize: scala.Double,
    groundTexture: java.lang.String | BaseTexture,
    groundYBias: scala.Double,
    rootPosition: Vector3,
    setupImageProcessing: scala.Boolean,
    sizeAuto: scala.Boolean,
    skyboxColor: Color3,
    skyboxSize: scala.Double,
    skyboxTexture: java.lang.String | BaseTexture,
    toneMappingEnabled: scala.Boolean
  ): IEnvironmentHelperOptions = {
    val __obj = js.Dynamic.literal(backgroundYRotation = backgroundYRotation, cameraContrast = cameraContrast, cameraExposure = cameraExposure, createGround = createGround, createSkybox = createSkybox, enableGroundMirror = enableGroundMirror, enableGroundShadow = enableGroundShadow, environmentTexture = environmentTexture.asInstanceOf[js.Any], groundColor = groundColor, groundMirrorAmount = groundMirrorAmount, groundMirrorBlurKernel = groundMirrorBlurKernel, groundMirrorFallOffDistance = groundMirrorFallOffDistance, groundMirrorFresnelWeight = groundMirrorFresnelWeight, groundMirrorSizeRatio = groundMirrorSizeRatio, groundMirrorTextureType = groundMirrorTextureType, groundOpacity = groundOpacity, groundShadowLevel = groundShadowLevel, groundSize = groundSize, groundTexture = groundTexture.asInstanceOf[js.Any], groundYBias = groundYBias, rootPosition = rootPosition, setupImageProcessing = setupImageProcessing, sizeAuto = sizeAuto, skyboxColor = skyboxColor, skyboxSize = skyboxSize, skyboxTexture = skyboxTexture.asInstanceOf[js.Any], toneMappingEnabled = toneMappingEnabled)
  
    __obj.asInstanceOf[IEnvironmentHelperOptions]
  }
}

