package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cesium3DTileset
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Resource
import typings.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseScreenSpaceError extends StObject {
  
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
  
  inline def apply(url: Resource | String | (js.Promise[Resource | String])): BaseScreenSpaceError = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScreenSpaceError]
  }
  
  extension [Self <: BaseScreenSpaceError](x: Self) {
    
    inline def setBaseScreenSpaceError(value: Double): Self = StObject.set(x, "baseScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setBaseScreenSpaceErrorUndefined: Self = StObject.set(x, "baseScreenSpaceError", js.undefined)
    
    inline def setClassificationType(value: typings.cesium.mod.ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    inline def setClippingPlane(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlane", value.asInstanceOf[js.Any])
    
    inline def setClippingPlaneUndefined: Self = StObject.set(x, "clippingPlane", js.undefined)
    
    inline def setCullRequestsWhileMoving(value: Boolean): Self = StObject.set(x, "cullRequestsWhileMoving", value.asInstanceOf[js.Any])
    
    inline def setCullRequestsWhileMovingMultiplier(value: Double): Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", value.asInstanceOf[js.Any])
    
    inline def setCullRequestsWhileMovingMultiplierUndefined: Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", js.undefined)
    
    inline def setCullRequestsWhileMovingUndefined: Self = StObject.set(x, "cullRequestsWhileMoving", js.undefined)
    
    inline def setCullWithChildrenBounds(value: Boolean): Self = StObject.set(x, "cullWithChildrenBounds", value.asInstanceOf[js.Any])
    
    inline def setCullWithChildrenBoundsUndefined: Self = StObject.set(x, "cullWithChildrenBounds", js.undefined)
    
    inline def setDebugColorizeTiles(value: Boolean): Self = StObject.set(x, "debugColorizeTiles", value.asInstanceOf[js.Any])
    
    inline def setDebugColorizeTilesUndefined: Self = StObject.set(x, "debugColorizeTiles", js.undefined)
    
    inline def setDebugFreezeFrame(value: Boolean): Self = StObject.set(x, "debugFreezeFrame", value.asInstanceOf[js.Any])
    
    inline def setDebugFreezeFrameUndefined: Self = StObject.set(x, "debugFreezeFrame", js.undefined)
    
    inline def setDebugHeatmapTilePropertyName(value: String): Self = StObject.set(x, "debugHeatmapTilePropertyName", value.asInstanceOf[js.Any])
    
    inline def setDebugHeatmapTilePropertyNameUndefined: Self = StObject.set(x, "debugHeatmapTilePropertyName", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setDebugShowContentBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowContentBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowContentBoundingVolumeUndefined: Self = StObject.set(x, "debugShowContentBoundingVolume", js.undefined)
    
    inline def setDebugShowGeometricError(value: Boolean): Self = StObject.set(x, "debugShowGeometricError", value.asInstanceOf[js.Any])
    
    inline def setDebugShowGeometricErrorUndefined: Self = StObject.set(x, "debugShowGeometricError", js.undefined)
    
    inline def setDebugShowMemoryUsage(value: Boolean): Self = StObject.set(x, "debugShowMemoryUsage", value.asInstanceOf[js.Any])
    
    inline def setDebugShowMemoryUsageUndefined: Self = StObject.set(x, "debugShowMemoryUsage", js.undefined)
    
    inline def setDebugShowRenderingStatistics(value: Boolean): Self = StObject.set(x, "debugShowRenderingStatistics", value.asInstanceOf[js.Any])
    
    inline def setDebugShowRenderingStatisticsUndefined: Self = StObject.set(x, "debugShowRenderingStatistics", js.undefined)
    
    inline def setDebugShowUrl(value: Boolean): Self = StObject.set(x, "debugShowUrl", value.asInstanceOf[js.Any])
    
    inline def setDebugShowUrlUndefined: Self = StObject.set(x, "debugShowUrl", js.undefined)
    
    inline def setDebugShowViewerRequestVolume(value: Boolean): Self = StObject.set(x, "debugShowViewerRequestVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowViewerRequestVolumeUndefined: Self = StObject.set(x, "debugShowViewerRequestVolume", js.undefined)
    
    inline def setDebugWireframe(value: Boolean): Self = StObject.set(x, "debugWireframe", value.asInstanceOf[js.Any])
    
    inline def setDebugWireframeUndefined: Self = StObject.set(x, "debugWireframe", js.undefined)
    
    inline def setDynamicScreenSpaceError(value: Boolean): Self = StObject.set(x, "dynamicScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setDynamicScreenSpaceErrorDensity(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", value.asInstanceOf[js.Any])
    
    inline def setDynamicScreenSpaceErrorDensityUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", js.undefined)
    
    inline def setDynamicScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    
    inline def setDynamicScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", js.undefined)
    
    inline def setDynamicScreenSpaceErrorHeightFalloff(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", value.asInstanceOf[js.Any])
    
    inline def setDynamicScreenSpaceErrorHeightFalloffUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", js.undefined)
    
    inline def setDynamicScreenSpaceErrorUndefined: Self = StObject.set(x, "dynamicScreenSpaceError", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setFoveatedConeSize(value: Double): Self = StObject.set(x, "foveatedConeSize", value.asInstanceOf[js.Any])
    
    inline def setFoveatedConeSizeUndefined: Self = StObject.set(x, "foveatedConeSize", js.undefined)
    
    inline def setFoveatedInterpolationCallback(value: Cesium3DTileset): Self = StObject.set(x, "foveatedInterpolationCallback", value.asInstanceOf[js.Any])
    
    inline def setFoveatedInterpolationCallbackUndefined: Self = StObject.set(x, "foveatedInterpolationCallback", js.undefined)
    
    inline def setFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", value.asInstanceOf[js.Any])
    
    inline def setFoveatedMinimumScreenSpaceErrorRelaxationUndefined: Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", js.undefined)
    
    inline def setFoveatedScreenSpaceError(value: Boolean): Self = StObject.set(x, "foveatedScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setFoveatedScreenSpaceErrorUndefined: Self = StObject.set(x, "foveatedScreenSpaceError", js.undefined)
    
    inline def setFoveatedTimeDelay(value: Double): Self = StObject.set(x, "foveatedTimeDelay", value.asInstanceOf[js.Any])
    
    inline def setFoveatedTimeDelayUndefined: Self = StObject.set(x, "foveatedTimeDelay", js.undefined)
    
    inline def setImageBasedLightingFactor(value: Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    inline def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
    
    inline def setImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", value.asInstanceOf[js.Any])
    
    inline def setImmediatelyLoadDesiredLevelOfDetailUndefined: Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", js.undefined)
    
    inline def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    inline def setLoadSiblings(value: Boolean): Self = StObject.set(x, "loadSiblings", value.asInstanceOf[js.Any])
    
    inline def setLoadSiblingsUndefined: Self = StObject.set(x, "loadSiblings", js.undefined)
    
    inline def setLuminanceAtZenith(value: Double): Self = StObject.set(x, "luminanceAtZenith", value.asInstanceOf[js.Any])
    
    inline def setLuminanceAtZenithUndefined: Self = StObject.set(x, "luminanceAtZenith", js.undefined)
    
    inline def setMaximumMemoryUsage(value: Double): Self = StObject.set(x, "maximumMemoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMaximumMemoryUsageUndefined: Self = StObject.set(x, "maximumMemoryUsage", js.undefined)
    
    inline def setMaximumNumberOfLoadedTiles(value: Double): Self = StObject.set(x, "maximumNumberOfLoadedTiles", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfLoadedTilesUndefined: Self = StObject.set(x, "maximumNumberOfLoadedTiles", js.undefined)
    
    inline def setMaximumScreenSpaceError(value: Double): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setPointCloudShading(value: js.Any): Self = StObject.set(x, "pointCloudShading", value.asInstanceOf[js.Any])
    
    inline def setPointCloudShadingUndefined: Self = StObject.set(x, "pointCloudShading", js.undefined)
    
    inline def setPreferLeaves(value: Boolean): Self = StObject.set(x, "preferLeaves", value.asInstanceOf[js.Any])
    
    inline def setPreferLeavesUndefined: Self = StObject.set(x, "preferLeaves", js.undefined)
    
    inline def setPreloadFlightDestinations(value: Boolean): Self = StObject.set(x, "preloadFlightDestinations", value.asInstanceOf[js.Any])
    
    inline def setPreloadFlightDestinationsUndefined: Self = StObject.set(x, "preloadFlightDestinations", js.undefined)
    
    inline def setPreloadWhenHidden(value: Boolean): Self = StObject.set(x, "preloadWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setPreloadWhenHiddenUndefined: Self = StObject.set(x, "preloadWhenHidden", js.undefined)
    
    inline def setProgressiveResolutionHeightFraction(value: Double): Self = StObject.set(x, "progressiveResolutionHeightFraction", value.asInstanceOf[js.Any])
    
    inline def setProgressiveResolutionHeightFractionUndefined: Self = StObject.set(x, "progressiveResolutionHeightFraction", js.undefined)
    
    inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSkipLevelOfDetail(value: Boolean): Self = StObject.set(x, "skipLevelOfDetail", value.asInstanceOf[js.Any])
    
    inline def setSkipLevelOfDetailUndefined: Self = StObject.set(x, "skipLevelOfDetail", js.undefined)
    
    inline def setSkipLevels(value: Double): Self = StObject.set(x, "skipLevels", value.asInstanceOf[js.Any])
    
    inline def setSkipLevelsUndefined: Self = StObject.set(x, "skipLevels", js.undefined)
    
    inline def setSkipScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "skipScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    
    inline def setSkipScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "skipScreenSpaceErrorFactor", js.undefined)
    
    inline def setSpecularEnvironmentMaps(value: String): Self = StObject.set(x, "specularEnvironmentMaps", value.asInstanceOf[js.Any])
    
    inline def setSpecularEnvironmentMapsUndefined: Self = StObject.set(x, "specularEnvironmentMaps", js.undefined)
    
    inline def setSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = StObject.set(x, "sphericalHarmonicCoefficients", value.asInstanceOf[js.Any])
    
    inline def setSphericalHarmonicCoefficientsUndefined: Self = StObject.set(x, "sphericalHarmonicCoefficients", js.undefined)
    
    inline def setSphericalHarmonicCoefficientsVarargs(value: Cartesian3*): Self = StObject.set(x, "sphericalHarmonicCoefficients", js.Array(value :_*))
    
    inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
