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

@js.native
trait BaseScreenSpaceError extends js.Object {
  var baseScreenSpaceError: js.UndefOr[Double] = js.native
  var classificationType: js.UndefOr[typings.cesium.mod.ClassificationType] = js.native
  var clippingPlane: js.UndefOr[ClippingPlaneCollection] = js.native
  var cullRequestsWhileMoving: js.UndefOr[Boolean] = js.native
  var cullRequestsWhileMovingMultiplier: js.UndefOr[Double] = js.native
  var cullWithChildrenBounds: js.UndefOr[Boolean] = js.native
  var debugColorizeTiles: js.UndefOr[Boolean] = js.native
  var debugFreezeFrame: js.UndefOr[Boolean] = js.native
  var debugHeatmapTilePropertyName: js.UndefOr[String] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowContentBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowGeometricError: js.UndefOr[Boolean] = js.native
  var debugShowMemoryUsage: js.UndefOr[Boolean] = js.native
  var debugShowRenderingStatistics: js.UndefOr[Boolean] = js.native
  var debugShowUrl: js.UndefOr[Boolean] = js.native
  var debugShowViewerRequestVolume: js.UndefOr[Boolean] = js.native
  var debugWireframe: js.UndefOr[Boolean] = js.native
  var dynamicScreenSpaceError: js.UndefOr[Boolean] = js.native
  var dynamicScreenSpaceErrorDensity: js.UndefOr[Double] = js.native
  var dynamicScreenSpaceErrorFactor: js.UndefOr[Double] = js.native
  var dynamicScreenSpaceErrorHeightFalloff: js.UndefOr[Double] = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var foveatedConeSize: js.UndefOr[Double] = js.native
  var foveatedInterpolationCallback: js.UndefOr[Cesium3DTileset] = js.native
  var foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.native
  var foveatedScreenSpaceError: js.UndefOr[Boolean] = js.native
  var foveatedTimeDelay: js.UndefOr[Double] = js.native
  var imageBasedLightingFactor: js.UndefOr[Cartesian2] = js.native
  var immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.native
  var lightColor: js.UndefOr[Cartesian3] = js.native
  var loadSiblings: js.UndefOr[Boolean] = js.native
  var luminanceAtZenith: js.UndefOr[Double] = js.native
  var maximumMemoryUsage: js.UndefOr[Double] = js.native
  var maximumNumberOfLoadedTiles: js.UndefOr[Double] = js.native
  var maximumScreenSpaceError: js.UndefOr[Double] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var pointCloudShading: js.UndefOr[js.Any] = js.native
  var preferLeaves: js.UndefOr[Boolean] = js.native
  var preloadFlightDestinations: js.UndefOr[Boolean] = js.native
  var preloadWhenHidden: js.UndefOr[Boolean] = js.native
  var progressiveResolutionHeightFraction: js.UndefOr[Double] = js.native
  var shadows: js.UndefOr[ShadowMode] = js.native
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Optimization option.
    * Determines if level of detail skipping should be applied during the traversal.
    * @default false
    */
  var skipLevelOfDetail: js.UndefOr[Boolean] = js.native
  var skipLevels: js.UndefOr[Double] = js.native
  var skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.native
  var specularEnvironmentMaps: js.UndefOr[String] = js.native
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.native
  var url: Resource | String | (js.Promise[Resource | String]) = js.native
}

object BaseScreenSpaceError {
  @scala.inline
  def apply(url: Resource | String | (js.Promise[Resource | String])): BaseScreenSpaceError = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScreenSpaceError]
  }
  @scala.inline
  implicit class BaseScreenSpaceErrorOps[Self <: BaseScreenSpaceError] (val x: Self) extends AnyVal {
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
    def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseScreenSpaceError(value: Double): Self = this.set("baseScreenSpaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseScreenSpaceError: Self = this.set("baseScreenSpaceError", js.undefined)
    @scala.inline
    def setClassificationType(value: typings.cesium.mod.ClassificationType): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationType: Self = this.set("classificationType", js.undefined)
    @scala.inline
    def setClippingPlane(value: ClippingPlaneCollection): Self = this.set("clippingPlane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClippingPlane: Self = this.set("clippingPlane", js.undefined)
    @scala.inline
    def setCullRequestsWhileMoving(value: Boolean): Self = this.set("cullRequestsWhileMoving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCullRequestsWhileMoving: Self = this.set("cullRequestsWhileMoving", js.undefined)
    @scala.inline
    def setCullRequestsWhileMovingMultiplier(value: Double): Self = this.set("cullRequestsWhileMovingMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCullRequestsWhileMovingMultiplier: Self = this.set("cullRequestsWhileMovingMultiplier", js.undefined)
    @scala.inline
    def setCullWithChildrenBounds(value: Boolean): Self = this.set("cullWithChildrenBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCullWithChildrenBounds: Self = this.set("cullWithChildrenBounds", js.undefined)
    @scala.inline
    def setDebugColorizeTiles(value: Boolean): Self = this.set("debugColorizeTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugColorizeTiles: Self = this.set("debugColorizeTiles", js.undefined)
    @scala.inline
    def setDebugFreezeFrame(value: Boolean): Self = this.set("debugFreezeFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugFreezeFrame: Self = this.set("debugFreezeFrame", js.undefined)
    @scala.inline
    def setDebugHeatmapTilePropertyName(value: String): Self = this.set("debugHeatmapTilePropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugHeatmapTilePropertyName: Self = this.set("debugHeatmapTilePropertyName", js.undefined)
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    @scala.inline
    def setDebugShowContentBoundingVolume(value: Boolean): Self = this.set("debugShowContentBoundingVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowContentBoundingVolume: Self = this.set("debugShowContentBoundingVolume", js.undefined)
    @scala.inline
    def setDebugShowGeometricError(value: Boolean): Self = this.set("debugShowGeometricError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowGeometricError: Self = this.set("debugShowGeometricError", js.undefined)
    @scala.inline
    def setDebugShowMemoryUsage(value: Boolean): Self = this.set("debugShowMemoryUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowMemoryUsage: Self = this.set("debugShowMemoryUsage", js.undefined)
    @scala.inline
    def setDebugShowRenderingStatistics(value: Boolean): Self = this.set("debugShowRenderingStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowRenderingStatistics: Self = this.set("debugShowRenderingStatistics", js.undefined)
    @scala.inline
    def setDebugShowUrl(value: Boolean): Self = this.set("debugShowUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowUrl: Self = this.set("debugShowUrl", js.undefined)
    @scala.inline
    def setDebugShowViewerRequestVolume(value: Boolean): Self = this.set("debugShowViewerRequestVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowViewerRequestVolume: Self = this.set("debugShowViewerRequestVolume", js.undefined)
    @scala.inline
    def setDebugWireframe(value: Boolean): Self = this.set("debugWireframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugWireframe: Self = this.set("debugWireframe", js.undefined)
    @scala.inline
    def setDynamicScreenSpaceError(value: Boolean): Self = this.set("dynamicScreenSpaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicScreenSpaceError: Self = this.set("dynamicScreenSpaceError", js.undefined)
    @scala.inline
    def setDynamicScreenSpaceErrorDensity(value: Double): Self = this.set("dynamicScreenSpaceErrorDensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicScreenSpaceErrorDensity: Self = this.set("dynamicScreenSpaceErrorDensity", js.undefined)
    @scala.inline
    def setDynamicScreenSpaceErrorFactor(value: Double): Self = this.set("dynamicScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicScreenSpaceErrorFactor: Self = this.set("dynamicScreenSpaceErrorFactor", js.undefined)
    @scala.inline
    def setDynamicScreenSpaceErrorHeightFalloff(value: Double): Self = this.set("dynamicScreenSpaceErrorHeightFalloff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicScreenSpaceErrorHeightFalloff: Self = this.set("dynamicScreenSpaceErrorHeightFalloff", js.undefined)
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setFoveatedConeSize(value: Double): Self = this.set("foveatedConeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoveatedConeSize: Self = this.set("foveatedConeSize", js.undefined)
    @scala.inline
    def setFoveatedInterpolationCallback(value: Cesium3DTileset): Self = this.set("foveatedInterpolationCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoveatedInterpolationCallback: Self = this.set("foveatedInterpolationCallback", js.undefined)
    @scala.inline
    def setFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = this.set("foveatedMinimumScreenSpaceErrorRelaxation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoveatedMinimumScreenSpaceErrorRelaxation: Self = this.set("foveatedMinimumScreenSpaceErrorRelaxation", js.undefined)
    @scala.inline
    def setFoveatedScreenSpaceError(value: Boolean): Self = this.set("foveatedScreenSpaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoveatedScreenSpaceError: Self = this.set("foveatedScreenSpaceError", js.undefined)
    @scala.inline
    def setFoveatedTimeDelay(value: Double): Self = this.set("foveatedTimeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoveatedTimeDelay: Self = this.set("foveatedTimeDelay", js.undefined)
    @scala.inline
    def setImageBasedLightingFactor(value: Cartesian2): Self = this.set("imageBasedLightingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBasedLightingFactor: Self = this.set("imageBasedLightingFactor", js.undefined)
    @scala.inline
    def setImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = this.set("immediatelyLoadDesiredLevelOfDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediatelyLoadDesiredLevelOfDetail: Self = this.set("immediatelyLoadDesiredLevelOfDetail", js.undefined)
    @scala.inline
    def setLightColor(value: Cartesian3): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightColor: Self = this.set("lightColor", js.undefined)
    @scala.inline
    def setLoadSiblings(value: Boolean): Self = this.set("loadSiblings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadSiblings: Self = this.set("loadSiblings", js.undefined)
    @scala.inline
    def setLuminanceAtZenith(value: Double): Self = this.set("luminanceAtZenith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLuminanceAtZenith: Self = this.set("luminanceAtZenith", js.undefined)
    @scala.inline
    def setMaximumMemoryUsage(value: Double): Self = this.set("maximumMemoryUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumMemoryUsage: Self = this.set("maximumMemoryUsage", js.undefined)
    @scala.inline
    def setMaximumNumberOfLoadedTiles(value: Double): Self = this.set("maximumNumberOfLoadedTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfLoadedTiles: Self = this.set("maximumNumberOfLoadedTiles", js.undefined)
    @scala.inline
    def setMaximumScreenSpaceError(value: Double): Self = this.set("maximumScreenSpaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumScreenSpaceError: Self = this.set("maximumScreenSpaceError", js.undefined)
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
    @scala.inline
    def setPointCloudShading(value: js.Any): Self = this.set("pointCloudShading", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointCloudShading: Self = this.set("pointCloudShading", js.undefined)
    @scala.inline
    def setPreferLeaves(value: Boolean): Self = this.set("preferLeaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferLeaves: Self = this.set("preferLeaves", js.undefined)
    @scala.inline
    def setPreloadFlightDestinations(value: Boolean): Self = this.set("preloadFlightDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadFlightDestinations: Self = this.set("preloadFlightDestinations", js.undefined)
    @scala.inline
    def setPreloadWhenHidden(value: Boolean): Self = this.set("preloadWhenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadWhenHidden: Self = this.set("preloadWhenHidden", js.undefined)
    @scala.inline
    def setProgressiveResolutionHeightFraction(value: Double): Self = this.set("progressiveResolutionHeightFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressiveResolutionHeightFraction: Self = this.set("progressiveResolutionHeightFraction", js.undefined)
    @scala.inline
    def setShadows(value: ShadowMode): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSkipLevelOfDetail(value: Boolean): Self = this.set("skipLevelOfDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLevelOfDetail: Self = this.set("skipLevelOfDetail", js.undefined)
    @scala.inline
    def setSkipLevels(value: Double): Self = this.set("skipLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLevels: Self = this.set("skipLevels", js.undefined)
    @scala.inline
    def setSkipScreenSpaceErrorFactor(value: Double): Self = this.set("skipScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipScreenSpaceErrorFactor: Self = this.set("skipScreenSpaceErrorFactor", js.undefined)
    @scala.inline
    def setSpecularEnvironmentMaps(value: String): Self = this.set("specularEnvironmentMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecularEnvironmentMaps: Self = this.set("specularEnvironmentMaps", js.undefined)
    @scala.inline
    def setSphericalHarmonicCoefficientsVarargs(value: Cartesian3*): Self = this.set("sphericalHarmonicCoefficients", js.Array(value :_*))
    @scala.inline
    def setSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = this.set("sphericalHarmonicCoefficients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSphericalHarmonicCoefficients: Self = this.set("sphericalHarmonicCoefficients", js.undefined)
  }
  
}

