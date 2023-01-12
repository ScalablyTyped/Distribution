package typings.cesium.anon

import typings.cesium.mod.Axis
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.ImageBasedLighting
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Resource
import typings.cesium.mod.ShadowMode
import typings.cesium.mod.SplitDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackFaceCulling extends StObject {
  
  var backFaceCulling: js.UndefOr[Boolean] = js.undefined
  
  var baseScreenSpaceError: js.UndefOr[Double] = js.undefined
  
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
  
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
  
  var enableDebugWireframe: js.UndefOr[Boolean] = js.undefined
  
  var enableShowOutline: js.UndefOr[Boolean] = js.undefined
  
  var featureIdLabel: js.UndefOr[String | Double] = js.undefined
  
  var foveatedConeSize: js.UndefOr[Double] = js.undefined
  
  var foveatedInterpolationCallback: js.UndefOr[typings.cesium.mod.Cesium3DTileset.foveatedInterpolationCallback] = js.undefined
  
  var foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.undefined
  
  var foveatedScreenSpaceError: js.UndefOr[Boolean] = js.undefined
  
  var foveatedTimeDelay: js.UndefOr[Double] = js.undefined
  
  var imageBasedLighting: js.UndefOr[ImageBasedLighting] = js.undefined
  
  var immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.undefined
  
  var instanceFeatureIdLabel: js.UndefOr[String | Double] = js.undefined
  
  var lightColor: js.UndefOr[Cartesian3] = js.undefined
  
  var loadSiblings: js.UndefOr[Boolean] = js.undefined
  
  var maximumMemoryUsage: js.UndefOr[Double] = js.undefined
  
  var maximumScreenSpaceError: js.UndefOr[Double] = js.undefined
  
  var modelForwardAxis: js.UndefOr[Axis] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var modelUpAxis: js.UndefOr[Axis] = js.undefined
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var pointCloudShading: js.UndefOr[Any] = js.undefined
  
  var preferLeaves: js.UndefOr[Boolean] = js.undefined
  
  var preloadFlightDestinations: js.UndefOr[Boolean] = js.undefined
  
  var preloadWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  var progressiveResolutionHeightFraction: js.UndefOr[Double] = js.undefined
  
  var projectTo2D: js.UndefOr[Boolean] = js.undefined
  
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showCreditsOnScreen: js.UndefOr[Boolean] = js.undefined
  
  var showOutline: js.UndefOr[Boolean] = js.undefined
  
  var skipLevelOfDetail: js.UndefOr[Boolean] = js.undefined
  
  var skipLevels: js.UndefOr[Double] = js.undefined
  
  var skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.undefined
  
  var splitDirection: js.UndefOr[SplitDirection] = js.undefined
  
  var url: Resource | String | (js.Promise[Resource | String])
  
  var vectorClassificationOnly: js.UndefOr[Boolean] = js.undefined
  
  var vectorKeepDecodedPositions: js.UndefOr[Boolean] = js.undefined
}
object BackFaceCulling {
  
  inline def apply(url: Resource | String | (js.Promise[Resource | String])): BackFaceCulling = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackFaceCulling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackFaceCulling] (val x: Self) extends AnyVal {
    
    inline def setBackFaceCulling(value: Boolean): Self = StObject.set(x, "backFaceCulling", value.asInstanceOf[js.Any])
    
    inline def setBackFaceCullingUndefined: Self = StObject.set(x, "backFaceCulling", js.undefined)
    
    inline def setBaseScreenSpaceError(value: Double): Self = StObject.set(x, "baseScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setBaseScreenSpaceErrorUndefined: Self = StObject.set(x, "baseScreenSpaceError", js.undefined)
    
    inline def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    inline def setClippingPlanes(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
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
    
    inline def setEnableDebugWireframe(value: Boolean): Self = StObject.set(x, "enableDebugWireframe", value.asInstanceOf[js.Any])
    
    inline def setEnableDebugWireframeUndefined: Self = StObject.set(x, "enableDebugWireframe", js.undefined)
    
    inline def setEnableShowOutline(value: Boolean): Self = StObject.set(x, "enableShowOutline", value.asInstanceOf[js.Any])
    
    inline def setEnableShowOutlineUndefined: Self = StObject.set(x, "enableShowOutline", js.undefined)
    
    inline def setFeatureIdLabel(value: String | Double): Self = StObject.set(x, "featureIdLabel", value.asInstanceOf[js.Any])
    
    inline def setFeatureIdLabelUndefined: Self = StObject.set(x, "featureIdLabel", js.undefined)
    
    inline def setFoveatedConeSize(value: Double): Self = StObject.set(x, "foveatedConeSize", value.asInstanceOf[js.Any])
    
    inline def setFoveatedConeSizeUndefined: Self = StObject.set(x, "foveatedConeSize", js.undefined)
    
    inline def setFoveatedInterpolationCallback(value: (/* p */ Double, /* q */ Double, /* time */ Double) => Double): Self = StObject.set(x, "foveatedInterpolationCallback", js.Any.fromFunction3(value))
    
    inline def setFoveatedInterpolationCallbackUndefined: Self = StObject.set(x, "foveatedInterpolationCallback", js.undefined)
    
    inline def setFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", value.asInstanceOf[js.Any])
    
    inline def setFoveatedMinimumScreenSpaceErrorRelaxationUndefined: Self = StObject.set(x, "foveatedMinimumScreenSpaceErrorRelaxation", js.undefined)
    
    inline def setFoveatedScreenSpaceError(value: Boolean): Self = StObject.set(x, "foveatedScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setFoveatedScreenSpaceErrorUndefined: Self = StObject.set(x, "foveatedScreenSpaceError", js.undefined)
    
    inline def setFoveatedTimeDelay(value: Double): Self = StObject.set(x, "foveatedTimeDelay", value.asInstanceOf[js.Any])
    
    inline def setFoveatedTimeDelayUndefined: Self = StObject.set(x, "foveatedTimeDelay", js.undefined)
    
    inline def setImageBasedLighting(value: ImageBasedLighting): Self = StObject.set(x, "imageBasedLighting", value.asInstanceOf[js.Any])
    
    inline def setImageBasedLightingUndefined: Self = StObject.set(x, "imageBasedLighting", js.undefined)
    
    inline def setImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", value.asInstanceOf[js.Any])
    
    inline def setImmediatelyLoadDesiredLevelOfDetailUndefined: Self = StObject.set(x, "immediatelyLoadDesiredLevelOfDetail", js.undefined)
    
    inline def setInstanceFeatureIdLabel(value: String | Double): Self = StObject.set(x, "instanceFeatureIdLabel", value.asInstanceOf[js.Any])
    
    inline def setInstanceFeatureIdLabelUndefined: Self = StObject.set(x, "instanceFeatureIdLabel", js.undefined)
    
    inline def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    inline def setLoadSiblings(value: Boolean): Self = StObject.set(x, "loadSiblings", value.asInstanceOf[js.Any])
    
    inline def setLoadSiblingsUndefined: Self = StObject.set(x, "loadSiblings", js.undefined)
    
    inline def setMaximumMemoryUsage(value: Double): Self = StObject.set(x, "maximumMemoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMaximumMemoryUsageUndefined: Self = StObject.set(x, "maximumMemoryUsage", js.undefined)
    
    inline def setMaximumScreenSpaceError(value: Double): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
    
    inline def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
    
    inline def setModelForwardAxis(value: Axis): Self = StObject.set(x, "modelForwardAxis", value.asInstanceOf[js.Any])
    
    inline def setModelForwardAxisUndefined: Self = StObject.set(x, "modelForwardAxis", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setModelUpAxis(value: Axis): Self = StObject.set(x, "modelUpAxis", value.asInstanceOf[js.Any])
    
    inline def setModelUpAxisUndefined: Self = StObject.set(x, "modelUpAxis", js.undefined)
    
    inline def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setPointCloudShading(value: Any): Self = StObject.set(x, "pointCloudShading", value.asInstanceOf[js.Any])
    
    inline def setPointCloudShadingUndefined: Self = StObject.set(x, "pointCloudShading", js.undefined)
    
    inline def setPreferLeaves(value: Boolean): Self = StObject.set(x, "preferLeaves", value.asInstanceOf[js.Any])
    
    inline def setPreferLeavesUndefined: Self = StObject.set(x, "preferLeaves", js.undefined)
    
    inline def setPreloadFlightDestinations(value: Boolean): Self = StObject.set(x, "preloadFlightDestinations", value.asInstanceOf[js.Any])
    
    inline def setPreloadFlightDestinationsUndefined: Self = StObject.set(x, "preloadFlightDestinations", js.undefined)
    
    inline def setPreloadWhenHidden(value: Boolean): Self = StObject.set(x, "preloadWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setPreloadWhenHiddenUndefined: Self = StObject.set(x, "preloadWhenHidden", js.undefined)
    
    inline def setProgressiveResolutionHeightFraction(value: Double): Self = StObject.set(x, "progressiveResolutionHeightFraction", value.asInstanceOf[js.Any])
    
    inline def setProgressiveResolutionHeightFractionUndefined: Self = StObject.set(x, "progressiveResolutionHeightFraction", js.undefined)
    
    inline def setProjectTo2D(value: Boolean): Self = StObject.set(x, "projectTo2D", value.asInstanceOf[js.Any])
    
    inline def setProjectTo2DUndefined: Self = StObject.set(x, "projectTo2D", js.undefined)
    
    inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowCreditsOnScreen(value: Boolean): Self = StObject.set(x, "showCreditsOnScreen", value.asInstanceOf[js.Any])
    
    inline def setShowCreditsOnScreenUndefined: Self = StObject.set(x, "showCreditsOnScreen", js.undefined)
    
    inline def setShowOutline(value: Boolean): Self = StObject.set(x, "showOutline", value.asInstanceOf[js.Any])
    
    inline def setShowOutlineUndefined: Self = StObject.set(x, "showOutline", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSkipLevelOfDetail(value: Boolean): Self = StObject.set(x, "skipLevelOfDetail", value.asInstanceOf[js.Any])
    
    inline def setSkipLevelOfDetailUndefined: Self = StObject.set(x, "skipLevelOfDetail", js.undefined)
    
    inline def setSkipLevels(value: Double): Self = StObject.set(x, "skipLevels", value.asInstanceOf[js.Any])
    
    inline def setSkipLevelsUndefined: Self = StObject.set(x, "skipLevels", js.undefined)
    
    inline def setSkipScreenSpaceErrorFactor(value: Double): Self = StObject.set(x, "skipScreenSpaceErrorFactor", value.asInstanceOf[js.Any])
    
    inline def setSkipScreenSpaceErrorFactorUndefined: Self = StObject.set(x, "skipScreenSpaceErrorFactor", js.undefined)
    
    inline def setSplitDirection(value: SplitDirection): Self = StObject.set(x, "splitDirection", value.asInstanceOf[js.Any])
    
    inline def setSplitDirectionUndefined: Self = StObject.set(x, "splitDirection", js.undefined)
    
    inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVectorClassificationOnly(value: Boolean): Self = StObject.set(x, "vectorClassificationOnly", value.asInstanceOf[js.Any])
    
    inline def setVectorClassificationOnlyUndefined: Self = StObject.set(x, "vectorClassificationOnly", js.undefined)
    
    inline def setVectorKeepDecodedPositions(value: Boolean): Self = StObject.set(x, "vectorKeepDecodedPositions", value.asInstanceOf[js.Any])
    
    inline def setVectorKeepDecodedPositionsUndefined: Self = StObject.set(x, "vectorKeepDecodedPositions", js.undefined)
  }
}
