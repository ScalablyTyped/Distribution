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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseScreenSpaceError extends StObject {
  
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
  implicit class BaseScreenSpaceErrorMutableBuilder[Self <: BaseScreenSpaceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseScreenSpaceError(value: Double): Self = StObject.set(x, "baseScreenSpaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseScreenSpaceErrorUndefined: Self = StObject.set(x, "baseScreenSpaceError", js.undefined)
    
    @scala.inline
    def setClassificationType(value: typings.cesium.mod.ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    @scala.inline
    def setClippingPlane(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPlaneUndefined: Self = StObject.set(x, "clippingPlane", js.undefined)
    
    @scala.inline
    def setCullRequestsWhileMoving(value: Boolean): Self = StObject.set(x, "cullRequestsWhileMoving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullRequestsWhileMovingMultiplier(value: Double): Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullRequestsWhileMovingMultiplierUndefined: Self = StObject.set(x, "cullRequestsWhileMovingMultiplier", js.undefined)
    
    @scala.inline
    def setCullRequestsWhileMovingUndefined: Self = StObject.set(x, "cullRequestsWhileMoving", js.undefined)
    
    @scala.inline
    def setCullWithChildrenBounds(value: Boolean): Self = StObject.set(x, "cullWithChildrenBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullWithChildrenBoundsUndefined: Self = StObject.set(x, "cullWithChildrenBounds", js.undefined)
    
    @scala.inline
    def setDebugColorizeTiles(value: Boolean): Self = StObject.set(x, "debugColorizeTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugColorizeTilesUndefined: Self = StObject.set(x, "debugColorizeTiles", js.undefined)
    
    @scala.inline
    def setDebugFreezeFrame(value: Boolean): Self = StObject.set(x, "debugFreezeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugFreezeFrameUndefined: Self = StObject.set(x, "debugFreezeFrame", js.undefined)
    
    @scala.inline
    def setDebugHeatmapTilePropertyName(value: String): Self = StObject.set(x, "debugHeatmapTilePropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugHeatmapTilePropertyNameUndefined: Self = StObject.set(x, "debugHeatmapTilePropertyName", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setDebugShowContentBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowContentBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowContentBoundingVolumeUndefined: Self = StObject.set(x, "debugShowContentBoundingVolume", js.undefined)
    
    @scala.inline
    def setDebugShowGeometricError(value: Boolean): Self = StObject.set(x, "debugShowGeometricError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowGeometricErrorUndefined: Self = StObject.set(x, "debugShowGeometricError", js.undefined)
    
    @scala.inline
    def setDebugShowMemoryUsage(value: Boolean): Self = StObject.set(x, "debugShowMemoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowMemoryUsageUndefined: Self = StObject.set(x, "debugShowMemoryUsage", js.undefined)
    
    @scala.inline
    def setDebugShowRenderingStatistics(value: Boolean): Self = StObject.set(x, "debugShowRenderingStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowRenderingStatisticsUndefined: Self = StObject.set(x, "debugShowRenderingStatistics", js.undefined)
    
    @scala.inline
    def setDebugShowUrl(value: Boolean): Self = StObject.set(x, "debugShowUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowUrlUndefined: Self = StObject.set(x, "debugShowUrl", js.undefined)
    
    @scala.inline
    def setDebugShowViewerRequestVolume(value: Boolean): Self = StObject.set(x, "debugShowViewerRequestVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowViewerRequestVolumeUndefined: Self = StObject.set(x, "debugShowViewerRequestVolume", js.undefined)
    
    @scala.inline
    def setDebugWireframe(value: Boolean): Self = StObject.set(x, "debugWireframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugWireframeUndefined: Self = StObject.set(x, "debugWireframe", js.undefined)
    
    @scala.inline
    def setDynamicScreenSpaceError(value: Boolean): Self = StObject.set(x, "dynamicScreenSpaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScreenSpaceErrorDensity(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScreenSpaceErrorDensityUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorDensity", js.undefined)
    
    @scala.inline
    def setDynamicScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorFactor", js.undefined)
    
    @scala.inline
    def setDynamicScreenSpaceErrorHeightFalloff(value: Double): Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScreenSpaceErrorHeightFalloffUndefined: Self = StObject.set(x, "dynamicScreenSpaceErrorHeightFalloff", js.undefined)
    
    @scala.inline
    def setDynamicScreenSpaceErrorUndefined: Self = StObject.set(x, "dynamicScreenSpaceError", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setFoveatedConeSize(value: Double): Self = StObject.set(x, "foveatedConeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoveatedConeSizeUndefined: Self = StObject.set(x, "foveatedConeSize", js.undefined)
    
    @scala.inline
    def setFoveatedInterpolationCallback(value: Cesium3DTileset): Self = StObject.set(x, "foveatedInterpolationCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoveatedInterpolationCallbackUndefined: Self = StObject.set(x, "foveatedInterpolationCallback", js.undefined)
    
    @scala.inline
    def setFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoveatedMinimumScreenSpaceErrorRelaxationUndefined: Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", js.undefined)
    
    @scala.inline
    def setFoveatedScreenSpaceError(value: Boolean): Self = StObject.set(x, "foveatedScreenSpaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoveatedScreenSpaceErrorUndefined: Self = StObject.set(x, "foveatedScreenSpaceError", js.undefined)
    
    @scala.inline
    def setFoveatedTimeDelay(value: Double): Self = StObject.set(x, "foveatedTimeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoveatedTimeDelayUndefined: Self = StObject.set(x, "foveatedTimeDelay", js.undefined)
    
    @scala.inline
    def setImageBasedLightingFactor(value: Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
    
    @scala.inline
    def setImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediatelyLoadDesiredLevelOfDetailUndefined: Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", js.undefined)
    
    @scala.inline
    def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    @scala.inline
    def setLoadSiblings(value: Boolean): Self = StObject.set(x, "loadSiblings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadSiblingsUndefined: Self = StObject.set(x, "loadSiblings", js.undefined)
    
    @scala.inline
    def setLuminanceAtZenith(value: Double): Self = StObject.set(x, "luminanceAtZenith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLuminanceAtZenithUndefined: Self = StObject.set(x, "luminanceAtZenith", js.undefined)
    
    @scala.inline
    def setMaximumMemoryUsage(value: Double): Self = StObject.set(x, "maximumMemoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumMemoryUsageUndefined: Self = StObject.set(x, "maximumMemoryUsage", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfLoadedTiles(value: Double): Self = StObject.set(x, "maximumNumberOfLoadedTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfLoadedTilesUndefined: Self = StObject.set(x, "maximumNumberOfLoadedTiles", js.undefined)
    
    @scala.inline
    def setMaximumScreenSpaceError(value: Double): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    @scala.inline
    def setPointCloudShading(value: js.Any): Self = StObject.set(x, "pointCloudShading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointCloudShadingUndefined: Self = StObject.set(x, "pointCloudShading", js.undefined)
    
    @scala.inline
    def setPreferLeaves(value: Boolean): Self = StObject.set(x, "preferLeaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferLeavesUndefined: Self = StObject.set(x, "preferLeaves", js.undefined)
    
    @scala.inline
    def setPreloadFlightDestinations(value: Boolean): Self = StObject.set(x, "preloadFlightDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadFlightDestinationsUndefined: Self = StObject.set(x, "preloadFlightDestinations", js.undefined)
    
    @scala.inline
    def setPreloadWhenHidden(value: Boolean): Self = StObject.set(x, "preloadWhenHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadWhenHiddenUndefined: Self = StObject.set(x, "preloadWhenHidden", js.undefined)
    
    @scala.inline
    def setProgressiveResolutionHeightFraction(value: Double): Self = StObject.set(x, "progressiveResolutionHeightFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressiveResolutionHeightFractionUndefined: Self = StObject.set(x, "progressiveResolutionHeightFraction", js.undefined)
    
    @scala.inline
    def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSkipLevelOfDetail(value: Boolean): Self = StObject.set(x, "skipLevelOfDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLevelOfDetailUndefined: Self = StObject.set(x, "skipLevelOfDetail", js.undefined)
    
    @scala.inline
    def setSkipLevels(value: Double): Self = StObject.set(x, "skipLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLevelsUndefined: Self = StObject.set(x, "skipLevels", js.undefined)
    
    @scala.inline
    def setSkipScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "skipScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "skipScreenSpaceErrorFactor", js.undefined)
    
    @scala.inline
    def setSpecularEnvironmentMaps(value: String): Self = StObject.set(x, "specularEnvironmentMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularEnvironmentMapsUndefined: Self = StObject.set(x, "specularEnvironmentMaps", js.undefined)
    
    @scala.inline
    def setSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = StObject.set(x, "sphericalHarmonicCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphericalHarmonicCoefficientsUndefined: Self = StObject.set(x, "sphericalHarmonicCoefficients", js.undefined)
    
    @scala.inline
    def setSphericalHarmonicCoefficientsVarargs(value: Cartesian3*): Self = StObject.set(x, "sphericalHarmonicCoefficients", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
