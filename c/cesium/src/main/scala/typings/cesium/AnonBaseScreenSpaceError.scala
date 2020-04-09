package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cesium3DTileset
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Resource
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseScreenSpaceError extends js.Object {
  var baseScreenSpaceError: js.UndefOr[Double] = js.undefined
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  var clippingPlane: js.UndefOr[ClippingPlaneCollection] = js.undefined
  var cullRequestsWhileMoving: js.UndefOr[Boolean] = js.undefined
  var cullRequestsWhileMovingMultiplier: js.UndefOr[Double] = js.undefined
  var cullWithChildrenBounds: js.UndefOr[Boolean] = js.undefined
  var debugColorizeTiles: js.UndefOr[Boolean] = js.undefined
  var debugFreezeFrame: js.UndefOr[Boolean] = js.undefined
  var debugHeatmapTilePropertyName: js.UndefOr[String] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugShowContentBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var debugShowGeometricError: js.UndefOr[Boolean] = js.undefined
  var debugShowMemoryUsage: js.UndefOr[Boolean] = js.undefined
  var debugShowRenderingStatistics: js.UndefOr[Boolean] = js.undefined
  var debugShowUrl: js.UndefOr[Boolean] = js.undefined
  var debugShowViewerRequestVolume: js.UndefOr[Boolean] = js.undefined
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  var dynamicScreenSpaceError: js.UndefOr[Boolean] = js.undefined
  var dynamicScreenSpaceErrorDensity: js.UndefOr[Double] = js.undefined
  var dynamicScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined
  var dynamicScreenSpaceErrorHeightFalloff: js.UndefOr[Double] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var foveatedConeSize: js.UndefOr[Double] = js.undefined
  var foveatedInterpolationCallback: js.UndefOr[Cesium3DTileset] = js.undefined
  var foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.undefined
  var foveatedScreenSpaceError: js.UndefOr[Boolean] = js.undefined
  var foveatedTimeDelay: js.UndefOr[Double] = js.undefined
  var imageBasedLightingFactor: js.UndefOr[Cartesian2] = js.undefined
  var immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.undefined
  var lightColor: js.UndefOr[Cartesian3] = js.undefined
  var loadSiblings: js.UndefOr[Boolean] = js.undefined
  var luminanceAtZenith: js.UndefOr[Double] = js.undefined
  var maximumMemoryUsage: js.UndefOr[Double] = js.undefined
  var maximumNumberOfLoadedTiles: js.UndefOr[Double] = js.undefined
  var maximumScreenSpaceError: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var pointCloudShading: js.UndefOr[js.Any] = js.undefined
  var preferLeaves: js.UndefOr[Boolean] = js.undefined
  var preloadFlightDestinations: js.UndefOr[Boolean] = js.undefined
  var preloadWhenHidden: js.UndefOr[Boolean] = js.undefined
  var progressiveResolutionHeightFraction: js.UndefOr[Double] = js.undefined
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Optimization option.
    * Determines if level of detail skipping should be applied during the traversal.
    * @default false
    */
  var skipLevelOfDetail: js.UndefOr[Boolean] = js.undefined
  var skipLevels: js.UndefOr[Double] = js.undefined
  var skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined
  var specularEnvironmentMaps: js.UndefOr[String] = js.undefined
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.undefined
  var url: Resource | String | (js.Promise[Resource | String])
}

object AnonBaseScreenSpaceError {
  @scala.inline
  def apply(
    url: Resource | String | (js.Promise[Resource | String]),
    baseScreenSpaceError: Int | Double = null,
    classificationType: ClassificationType = null,
    clippingPlane: ClippingPlaneCollection = null,
    cullRequestsWhileMoving: js.UndefOr[Boolean] = js.undefined,
    cullRequestsWhileMovingMultiplier: Int | Double = null,
    cullWithChildrenBounds: js.UndefOr[Boolean] = js.undefined,
    debugColorizeTiles: js.UndefOr[Boolean] = js.undefined,
    debugFreezeFrame: js.UndefOr[Boolean] = js.undefined,
    debugHeatmapTilePropertyName: String = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugShowContentBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    debugShowGeometricError: js.UndefOr[Boolean] = js.undefined,
    debugShowMemoryUsage: js.UndefOr[Boolean] = js.undefined,
    debugShowRenderingStatistics: js.UndefOr[Boolean] = js.undefined,
    debugShowUrl: js.UndefOr[Boolean] = js.undefined,
    debugShowViewerRequestVolume: js.UndefOr[Boolean] = js.undefined,
    debugWireframe: js.UndefOr[Boolean] = js.undefined,
    dynamicScreenSpaceError: js.UndefOr[Boolean] = js.undefined,
    dynamicScreenSpaceErrorDensity: Int | Double = null,
    dynamicScreenSpaceErrorFactor: Int | Double = null,
    dynamicScreenSpaceErrorHeightFalloff: Int | Double = null,
    ellipsoid: Ellipsoid = null,
    foveatedConeSize: Int | Double = null,
    foveatedInterpolationCallback: Cesium3DTileset = null,
    foveatedMinimumScreenSpaceErrorRelaxation: Int | Double = null,
    foveatedScreenSpaceError: js.UndefOr[Boolean] = js.undefined,
    foveatedTimeDelay: Int | Double = null,
    imageBasedLightingFactor: Cartesian2 = null,
    immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.undefined,
    lightColor: Cartesian3 = null,
    loadSiblings: js.UndefOr[Boolean] = js.undefined,
    luminanceAtZenith: Int | Double = null,
    maximumMemoryUsage: Int | Double = null,
    maximumNumberOfLoadedTiles: Int | Double = null,
    maximumScreenSpaceError: Int | Double = null,
    modelMatrix: Matrix4 = null,
    pointCloudShading: js.Any = null,
    preferLeaves: js.UndefOr[Boolean] = js.undefined,
    preloadFlightDestinations: js.UndefOr[Boolean] = js.undefined,
    preloadWhenHidden: js.UndefOr[Boolean] = js.undefined,
    progressiveResolutionHeightFraction: Int | Double = null,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    skipLevelOfDetail: js.UndefOr[Boolean] = js.undefined,
    skipLevels: Int | Double = null,
    skipScreenSpaceErrorFactor: Int | Double = null,
    specularEnvironmentMaps: String = null,
    sphericalHarmonicCoefficients: js.Array[Cartesian3] = null
  ): AnonBaseScreenSpaceError = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (baseScreenSpaceError != null) __obj.updateDynamic("baseScreenSpaceError")(baseScreenSpaceError.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (clippingPlane != null) __obj.updateDynamic("clippingPlane")(clippingPlane.asInstanceOf[js.Any])
    if (!js.isUndefined(cullRequestsWhileMoving)) __obj.updateDynamic("cullRequestsWhileMoving")(cullRequestsWhileMoving.asInstanceOf[js.Any])
    if (cullRequestsWhileMovingMultiplier != null) __obj.updateDynamic("cullRequestsWhileMovingMultiplier")(cullRequestsWhileMovingMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(cullWithChildrenBounds)) __obj.updateDynamic("cullWithChildrenBounds")(cullWithChildrenBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(debugColorizeTiles)) __obj.updateDynamic("debugColorizeTiles")(debugColorizeTiles.asInstanceOf[js.Any])
    if (!js.isUndefined(debugFreezeFrame)) __obj.updateDynamic("debugFreezeFrame")(debugFreezeFrame.asInstanceOf[js.Any])
    if (debugHeatmapTilePropertyName != null) __obj.updateDynamic("debugHeatmapTilePropertyName")(debugHeatmapTilePropertyName.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowContentBoundingVolume)) __obj.updateDynamic("debugShowContentBoundingVolume")(debugShowContentBoundingVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowGeometricError)) __obj.updateDynamic("debugShowGeometricError")(debugShowGeometricError.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowMemoryUsage)) __obj.updateDynamic("debugShowMemoryUsage")(debugShowMemoryUsage.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowRenderingStatistics)) __obj.updateDynamic("debugShowRenderingStatistics")(debugShowRenderingStatistics.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowUrl)) __obj.updateDynamic("debugShowUrl")(debugShowUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowViewerRequestVolume)) __obj.updateDynamic("debugShowViewerRequestVolume")(debugShowViewerRequestVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicScreenSpaceError)) __obj.updateDynamic("dynamicScreenSpaceError")(dynamicScreenSpaceError.asInstanceOf[js.Any])
    if (dynamicScreenSpaceErrorDensity != null) __obj.updateDynamic("dynamicScreenSpaceErrorDensity")(dynamicScreenSpaceErrorDensity.asInstanceOf[js.Any])
    if (dynamicScreenSpaceErrorFactor != null) __obj.updateDynamic("dynamicScreenSpaceErrorFactor")(dynamicScreenSpaceErrorFactor.asInstanceOf[js.Any])
    if (dynamicScreenSpaceErrorHeightFalloff != null) __obj.updateDynamic("dynamicScreenSpaceErrorHeightFalloff")(dynamicScreenSpaceErrorHeightFalloff.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (foveatedConeSize != null) __obj.updateDynamic("foveatedConeSize")(foveatedConeSize.asInstanceOf[js.Any])
    if (foveatedInterpolationCallback != null) __obj.updateDynamic("foveatedInterpolationCallback")(foveatedInterpolationCallback.asInstanceOf[js.Any])
    if (foveatedMinimumScreenSpaceErrorRelaxation != null) __obj.updateDynamic("foveatedMinimumScreenSpaceErrorRelaxation")(foveatedMinimumScreenSpaceErrorRelaxation.asInstanceOf[js.Any])
    if (!js.isUndefined(foveatedScreenSpaceError)) __obj.updateDynamic("foveatedScreenSpaceError")(foveatedScreenSpaceError.asInstanceOf[js.Any])
    if (foveatedTimeDelay != null) __obj.updateDynamic("foveatedTimeDelay")(foveatedTimeDelay.asInstanceOf[js.Any])
    if (imageBasedLightingFactor != null) __obj.updateDynamic("imageBasedLightingFactor")(imageBasedLightingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(immediatelyLoadDesiredLevelOfDetail)) __obj.updateDynamic("immediatelyLoadDesiredLevelOfDetail")(immediatelyLoadDesiredLevelOfDetail.asInstanceOf[js.Any])
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSiblings)) __obj.updateDynamic("loadSiblings")(loadSiblings.asInstanceOf[js.Any])
    if (luminanceAtZenith != null) __obj.updateDynamic("luminanceAtZenith")(luminanceAtZenith.asInstanceOf[js.Any])
    if (maximumMemoryUsage != null) __obj.updateDynamic("maximumMemoryUsage")(maximumMemoryUsage.asInstanceOf[js.Any])
    if (maximumNumberOfLoadedTiles != null) __obj.updateDynamic("maximumNumberOfLoadedTiles")(maximumNumberOfLoadedTiles.asInstanceOf[js.Any])
    if (maximumScreenSpaceError != null) __obj.updateDynamic("maximumScreenSpaceError")(maximumScreenSpaceError.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (pointCloudShading != null) __obj.updateDynamic("pointCloudShading")(pointCloudShading.asInstanceOf[js.Any])
    if (!js.isUndefined(preferLeaves)) __obj.updateDynamic("preferLeaves")(preferLeaves.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadFlightDestinations)) __obj.updateDynamic("preloadFlightDestinations")(preloadFlightDestinations.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWhenHidden)) __obj.updateDynamic("preloadWhenHidden")(preloadWhenHidden.asInstanceOf[js.Any])
    if (progressiveResolutionHeightFraction != null) __obj.updateDynamic("progressiveResolutionHeightFraction")(progressiveResolutionHeightFraction.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLevelOfDetail)) __obj.updateDynamic("skipLevelOfDetail")(skipLevelOfDetail.asInstanceOf[js.Any])
    if (skipLevels != null) __obj.updateDynamic("skipLevels")(skipLevels.asInstanceOf[js.Any])
    if (skipScreenSpaceErrorFactor != null) __obj.updateDynamic("skipScreenSpaceErrorFactor")(skipScreenSpaceErrorFactor.asInstanceOf[js.Any])
    if (specularEnvironmentMaps != null) __obj.updateDynamic("specularEnvironmentMaps")(specularEnvironmentMaps.asInstanceOf[js.Any])
    if (sphericalHarmonicCoefficients != null) __obj.updateDynamic("sphericalHarmonicCoefficients")(sphericalHarmonicCoefficients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseScreenSpaceError]
  }
}

