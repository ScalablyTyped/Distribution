package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.babylonjs/Helpers/environmentHelper.IEnvironmentHelperOptions> */
trait PartialIEnvironmentHelper extends js.Object {
  var backgroundYRotation: js.UndefOr[Double] = js.undefined
  var cameraContrast: js.UndefOr[Double] = js.undefined
  var cameraExposure: js.UndefOr[Double] = js.undefined
  var createGround: js.UndefOr[Boolean] = js.undefined
  var createSkybox: js.UndefOr[Boolean] = js.undefined
  var enableGroundMirror: js.UndefOr[Boolean] = js.undefined
  var enableGroundShadow: js.UndefOr[Boolean] = js.undefined
  var environmentTexture: js.UndefOr[String | BaseTexture] = js.undefined
  var groundColor: js.UndefOr[Color3] = js.undefined
  var groundMirrorAmount: js.UndefOr[Double] = js.undefined
  var groundMirrorBlurKernel: js.UndefOr[Double] = js.undefined
  var groundMirrorFallOffDistance: js.UndefOr[Double] = js.undefined
  var groundMirrorFresnelWeight: js.UndefOr[Double] = js.undefined
  var groundMirrorSizeRatio: js.UndefOr[Double] = js.undefined
  var groundMirrorTextureType: js.UndefOr[Double] = js.undefined
  var groundOpacity: js.UndefOr[Double] = js.undefined
  var groundShadowLevel: js.UndefOr[Double] = js.undefined
  var groundSize: js.UndefOr[Double] = js.undefined
  var groundTexture: js.UndefOr[String | BaseTexture] = js.undefined
  var groundYBias: js.UndefOr[Double] = js.undefined
  var rootPosition: js.UndefOr[Vector3] = js.undefined
  var setupImageProcessing: js.UndefOr[Boolean] = js.undefined
  var sizeAuto: js.UndefOr[Boolean] = js.undefined
  var skyboxColor: js.UndefOr[Color3] = js.undefined
  var skyboxSize: js.UndefOr[Double] = js.undefined
  var skyboxTexture: js.UndefOr[String | BaseTexture] = js.undefined
  var toneMappingEnabled: js.UndefOr[Boolean] = js.undefined
}

object PartialIEnvironmentHelper {
  @scala.inline
  def apply(
    backgroundYRotation: Int | Double = null,
    cameraContrast: Int | Double = null,
    cameraExposure: Int | Double = null,
    createGround: js.UndefOr[Boolean] = js.undefined,
    createSkybox: js.UndefOr[Boolean] = js.undefined,
    enableGroundMirror: js.UndefOr[Boolean] = js.undefined,
    enableGroundShadow: js.UndefOr[Boolean] = js.undefined,
    environmentTexture: String | BaseTexture = null,
    groundColor: Color3 = null,
    groundMirrorAmount: Int | Double = null,
    groundMirrorBlurKernel: Int | Double = null,
    groundMirrorFallOffDistance: Int | Double = null,
    groundMirrorFresnelWeight: Int | Double = null,
    groundMirrorSizeRatio: Int | Double = null,
    groundMirrorTextureType: Int | Double = null,
    groundOpacity: Int | Double = null,
    groundShadowLevel: Int | Double = null,
    groundSize: Int | Double = null,
    groundTexture: String | BaseTexture = null,
    groundYBias: Int | Double = null,
    rootPosition: Vector3 = null,
    setupImageProcessing: js.UndefOr[Boolean] = js.undefined,
    sizeAuto: js.UndefOr[Boolean] = js.undefined,
    skyboxColor: Color3 = null,
    skyboxSize: Int | Double = null,
    skyboxTexture: String | BaseTexture = null,
    toneMappingEnabled: js.UndefOr[Boolean] = js.undefined
  ): PartialIEnvironmentHelper = {
    val __obj = js.Dynamic.literal()
    if (backgroundYRotation != null) __obj.updateDynamic("backgroundYRotation")(backgroundYRotation.asInstanceOf[js.Any])
    if (cameraContrast != null) __obj.updateDynamic("cameraContrast")(cameraContrast.asInstanceOf[js.Any])
    if (cameraExposure != null) __obj.updateDynamic("cameraExposure")(cameraExposure.asInstanceOf[js.Any])
    if (!js.isUndefined(createGround)) __obj.updateDynamic("createGround")(createGround.asInstanceOf[js.Any])
    if (!js.isUndefined(createSkybox)) __obj.updateDynamic("createSkybox")(createSkybox.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroundMirror)) __obj.updateDynamic("enableGroundMirror")(enableGroundMirror.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroundShadow)) __obj.updateDynamic("enableGroundShadow")(enableGroundShadow.asInstanceOf[js.Any])
    if (environmentTexture != null) __obj.updateDynamic("environmentTexture")(environmentTexture.asInstanceOf[js.Any])
    if (groundColor != null) __obj.updateDynamic("groundColor")(groundColor.asInstanceOf[js.Any])
    if (groundMirrorAmount != null) __obj.updateDynamic("groundMirrorAmount")(groundMirrorAmount.asInstanceOf[js.Any])
    if (groundMirrorBlurKernel != null) __obj.updateDynamic("groundMirrorBlurKernel")(groundMirrorBlurKernel.asInstanceOf[js.Any])
    if (groundMirrorFallOffDistance != null) __obj.updateDynamic("groundMirrorFallOffDistance")(groundMirrorFallOffDistance.asInstanceOf[js.Any])
    if (groundMirrorFresnelWeight != null) __obj.updateDynamic("groundMirrorFresnelWeight")(groundMirrorFresnelWeight.asInstanceOf[js.Any])
    if (groundMirrorSizeRatio != null) __obj.updateDynamic("groundMirrorSizeRatio")(groundMirrorSizeRatio.asInstanceOf[js.Any])
    if (groundMirrorTextureType != null) __obj.updateDynamic("groundMirrorTextureType")(groundMirrorTextureType.asInstanceOf[js.Any])
    if (groundOpacity != null) __obj.updateDynamic("groundOpacity")(groundOpacity.asInstanceOf[js.Any])
    if (groundShadowLevel != null) __obj.updateDynamic("groundShadowLevel")(groundShadowLevel.asInstanceOf[js.Any])
    if (groundSize != null) __obj.updateDynamic("groundSize")(groundSize.asInstanceOf[js.Any])
    if (groundTexture != null) __obj.updateDynamic("groundTexture")(groundTexture.asInstanceOf[js.Any])
    if (groundYBias != null) __obj.updateDynamic("groundYBias")(groundYBias.asInstanceOf[js.Any])
    if (rootPosition != null) __obj.updateDynamic("rootPosition")(rootPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(setupImageProcessing)) __obj.updateDynamic("setupImageProcessing")(setupImageProcessing.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeAuto)) __obj.updateDynamic("sizeAuto")(sizeAuto.asInstanceOf[js.Any])
    if (skyboxColor != null) __obj.updateDynamic("skyboxColor")(skyboxColor.asInstanceOf[js.Any])
    if (skyboxSize != null) __obj.updateDynamic("skyboxSize")(skyboxSize.asInstanceOf[js.Any])
    if (skyboxTexture != null) __obj.updateDynamic("skyboxTexture")(skyboxTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(toneMappingEnabled)) __obj.updateDynamic("toneMappingEnabled")(toneMappingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIEnvironmentHelper]
  }
}

