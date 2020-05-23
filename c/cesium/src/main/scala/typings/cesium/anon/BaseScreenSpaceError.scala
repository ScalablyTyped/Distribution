package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cesium3DTileset
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Resource
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseScreenSpaceError extends js.Object {
  var baseScreenSpaceError: js.UndefOr[Double] = js.undefined
  var classificationType: js.UndefOr[typings.cesium.mod.ClassificationType] = js.undefined
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
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
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

object BaseScreenSpaceError {
  @scala.inline
  def apply(
    url: Resource | String | (js.Promise[Resource | String]),
    baseScreenSpaceError: js.UndefOr[Double] = js.undefined,
    classificationType: typings.cesium.mod.ClassificationType = null,
    clippingPlane: ClippingPlaneCollection = null,
    cullRequestsWhileMoving: js.UndefOr[Boolean] = js.undefined,
    cullRequestsWhileMovingMultiplier: js.UndefOr[Double] = js.undefined,
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
    dynamicScreenSpaceErrorDensity: js.UndefOr[Double] = js.undefined,
    dynamicScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined,
    dynamicScreenSpaceErrorHeightFalloff: js.UndefOr[Double] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    foveatedConeSize: js.UndefOr[Double] = js.undefined,
    foveatedInterpolationCallback: Cesium3DTileset = null,
    foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.undefined,
    foveatedScreenSpaceError: js.UndefOr[Boolean] = js.undefined,
    foveatedTimeDelay: js.UndefOr[Double] = js.undefined,
    imageBasedLightingFactor: Cartesian2 = null,
    immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.undefined,
    lightColor: Cartesian3 = null,
    loadSiblings: js.UndefOr[Boolean] = js.undefined,
    luminanceAtZenith: js.UndefOr[Double] = js.undefined,
    maximumMemoryUsage: js.UndefOr[Double] = js.undefined,
    maximumNumberOfLoadedTiles: js.UndefOr[Double] = js.undefined,
    maximumScreenSpaceError: js.UndefOr[Double] = js.undefined,
    modelMatrix: Matrix4 = null,
    pointCloudShading: js.Any = null,
    preferLeaves: js.UndefOr[Boolean] = js.undefined,
    preloadFlightDestinations: js.UndefOr[Boolean] = js.undefined,
    preloadWhenHidden: js.UndefOr[Boolean] = js.undefined,
    progressiveResolutionHeightFraction: js.UndefOr[Double] = js.undefined,
    shadows: ShadowMode = null,
    show: js.UndefOr[Boolean] = js.undefined,
    skipLevelOfDetail: js.UndefOr[Boolean] = js.undefined,
    skipLevels: js.UndefOr[Double] = js.undefined,
    skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined,
    specularEnvironmentMaps: String = null,
    sphericalHarmonicCoefficients: js.Array[Cartesian3] = null
  ): BaseScreenSpaceError = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(baseScreenSpaceError)) __obj.updateDynamic("baseScreenSpaceError")(baseScreenSpaceError.get.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (clippingPlane != null) __obj.updateDynamic("clippingPlane")(clippingPlane.asInstanceOf[js.Any])
    if (!js.isUndefined(cullRequestsWhileMoving)) __obj.updateDynamic("cullRequestsWhileMoving")(cullRequestsWhileMoving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cullRequestsWhileMovingMultiplier)) __obj.updateDynamic("cullRequestsWhileMovingMultiplier")(cullRequestsWhileMovingMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cullWithChildrenBounds)) __obj.updateDynamic("cullWithChildrenBounds")(cullWithChildrenBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugColorizeTiles)) __obj.updateDynamic("debugColorizeTiles")(debugColorizeTiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugFreezeFrame)) __obj.updateDynamic("debugFreezeFrame")(debugFreezeFrame.get.asInstanceOf[js.Any])
    if (debugHeatmapTilePropertyName != null) __obj.updateDynamic("debugHeatmapTilePropertyName")(debugHeatmapTilePropertyName.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowContentBoundingVolume)) __obj.updateDynamic("debugShowContentBoundingVolume")(debugShowContentBoundingVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowGeometricError)) __obj.updateDynamic("debugShowGeometricError")(debugShowGeometricError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowMemoryUsage)) __obj.updateDynamic("debugShowMemoryUsage")(debugShowMemoryUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowRenderingStatistics)) __obj.updateDynamic("debugShowRenderingStatistics")(debugShowRenderingStatistics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowUrl)) __obj.updateDynamic("debugShowUrl")(debugShowUrl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowViewerRequestVolume)) __obj.updateDynamic("debugShowViewerRequestVolume")(debugShowViewerRequestVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframe)) __obj.updateDynamic("debugWireframe")(debugWireframe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicScreenSpaceError)) __obj.updateDynamic("dynamicScreenSpaceError")(dynamicScreenSpaceError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicScreenSpaceErrorDensity)) __obj.updateDynamic("dynamicScreenSpaceErrorDensity")(dynamicScreenSpaceErrorDensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicScreenSpaceErrorFactor)) __obj.updateDynamic("dynamicScreenSpaceErrorFactor")(dynamicScreenSpaceErrorFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicScreenSpaceErrorHeightFalloff)) __obj.updateDynamic("dynamicScreenSpaceErrorHeightFalloff")(dynamicScreenSpaceErrorHeightFalloff.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(foveatedConeSize)) __obj.updateDynamic("foveatedConeSize")(foveatedConeSize.get.asInstanceOf[js.Any])
    if (foveatedInterpolationCallback != null) __obj.updateDynamic("foveatedInterpolationCallback")(foveatedInterpolationCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(foveatedMinimumScreenSpaceErrorRelaxation)) __obj.updateDynamic("foveatedMinimumScreenSpaceErrorRelaxation")(foveatedMinimumScreenSpaceErrorRelaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(foveatedScreenSpaceError)) __obj.updateDynamic("foveatedScreenSpaceError")(foveatedScreenSpaceError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(foveatedTimeDelay)) __obj.updateDynamic("foveatedTimeDelay")(foveatedTimeDelay.get.asInstanceOf[js.Any])
    if (imageBasedLightingFactor != null) __obj.updateDynamic("imageBasedLightingFactor")(imageBasedLightingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(immediatelyLoadDesiredLevelOfDetail)) __obj.updateDynamic("immediatelyLoadDesiredLevelOfDetail")(immediatelyLoadDesiredLevelOfDetail.get.asInstanceOf[js.Any])
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSiblings)) __obj.updateDynamic("loadSiblings")(loadSiblings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(luminanceAtZenith)) __obj.updateDynamic("luminanceAtZenith")(luminanceAtZenith.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumMemoryUsage)) __obj.updateDynamic("maximumMemoryUsage")(maximumMemoryUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfLoadedTiles)) __obj.updateDynamic("maximumNumberOfLoadedTiles")(maximumNumberOfLoadedTiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumScreenSpaceError)) __obj.updateDynamic("maximumScreenSpaceError")(maximumScreenSpaceError.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (pointCloudShading != null) __obj.updateDynamic("pointCloudShading")(pointCloudShading.asInstanceOf[js.Any])
    if (!js.isUndefined(preferLeaves)) __obj.updateDynamic("preferLeaves")(preferLeaves.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadFlightDestinations)) __obj.updateDynamic("preloadFlightDestinations")(preloadFlightDestinations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWhenHidden)) __obj.updateDynamic("preloadWhenHidden")(preloadWhenHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveResolutionHeightFraction)) __obj.updateDynamic("progressiveResolutionHeightFraction")(progressiveResolutionHeightFraction.get.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLevelOfDetail)) __obj.updateDynamic("skipLevelOfDetail")(skipLevelOfDetail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLevels)) __obj.updateDynamic("skipLevels")(skipLevels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipScreenSpaceErrorFactor)) __obj.updateDynamic("skipScreenSpaceErrorFactor")(skipScreenSpaceErrorFactor.get.asInstanceOf[js.Any])
    if (specularEnvironmentMaps != null) __obj.updateDynamic("specularEnvironmentMaps")(specularEnvironmentMaps.asInstanceOf[js.Any])
    if (sphericalHarmonicCoefficients != null) __obj.updateDynamic("sphericalHarmonicCoefficients")(sphericalHarmonicCoefficients.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScreenSpaceError]
  }
}

