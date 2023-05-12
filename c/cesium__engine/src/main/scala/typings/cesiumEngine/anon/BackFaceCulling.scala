package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Axis
import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.Cesium3DTileContent
import typings.cesiumEngine.mod.ClassificationType
import typings.cesiumEngine.mod.ClippingPlaneCollection
import typings.cesiumEngine.mod.ColorBlendMode
import typings.cesiumEngine.mod.Credit
import typings.cesiumEngine.mod.DistanceDisplayCondition
import typings.cesiumEngine.mod.HeightReference
import typings.cesiumEngine.mod.ImageBasedLighting
import typings.cesiumEngine.mod.Matrix4
import typings.cesiumEngine.mod.Model.GltfCallback
import typings.cesiumEngine.mod.Resource
import typings.cesiumEngine.mod.Scene
import typings.cesiumEngine.mod.ShadowMode
import typings.cesiumEngine.mod.SplitDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackFaceCulling extends StObject {
  
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  
  var backFaceCulling: js.UndefOr[Boolean] = js.undefined
  
  var basePath: js.UndefOr[String | Resource] = js.undefined
  
  var clampAnimations: js.UndefOr[Boolean] = js.undefined
  
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
  
  var color: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var colorBlendAmount: js.UndefOr[Double] = js.undefined
  
  var colorBlendMode: js.UndefOr[ColorBlendMode] = js.undefined
  
  var content: js.UndefOr[Cesium3DTileContent] = js.undefined
  
  var credit: js.UndefOr[Credit | String] = js.undefined
  
  var cull: js.UndefOr[Boolean] = js.undefined
  
  var customShader: js.UndefOr[typings.cesiumEngine.mod.CustomShader] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var debugWireframe: js.UndefOr[Boolean] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
  
  var enableDebugWireframe: js.UndefOr[Boolean] = js.undefined
  
  var enableShowOutline: js.UndefOr[Boolean] = js.undefined
  
  var featureIdLabel: js.UndefOr[String | Double] = js.undefined
  
  var forwardAxis: js.UndefOr[Axis] = js.undefined
  
  var gltfCallback: js.UndefOr[GltfCallback] = js.undefined
  
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var imageBasedLighting: js.UndefOr[ImageBasedLighting] = js.undefined
  
  var incrementallyLoadTextures: js.UndefOr[Boolean] = js.undefined
  
  var instanceFeatureIdLabel: js.UndefOr[String | Double] = js.undefined
  
  var lightColor: js.UndefOr[Cartesian3] = js.undefined
  
  var maximumScale: js.UndefOr[Double] = js.undefined
  
  var minimumPixelSize: js.UndefOr[Double] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var opaquePass: js.UndefOr[Boolean] = js.undefined
  
  var outlineColor: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var pointCloudShading: js.UndefOr[Any] = js.undefined
  
  var projectTo2D: js.UndefOr[Boolean] = js.undefined
  
  var releaseGltfJson: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var scene: js.UndefOr[Scene] = js.undefined
  
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showCreditsOnScreen: js.UndefOr[Boolean] = js.undefined
  
  var showOutline: js.UndefOr[Boolean] = js.undefined
  
  var silhouetteColor: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var silhouetteSize: js.UndefOr[Double] = js.undefined
  
  var splitDirection: js.UndefOr[SplitDirection] = js.undefined
  
  var upAxis: js.UndefOr[Axis] = js.undefined
  
  var url: String | Resource
}
object BackFaceCulling {
  
  inline def apply(url: String | Resource): BackFaceCulling = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackFaceCulling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackFaceCulling] (val x: Self) extends AnyVal {
    
    inline def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    inline def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    inline def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    inline def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    inline def setBackFaceCulling(value: Boolean): Self = StObject.set(x, "backFaceCulling", value.asInstanceOf[js.Any])
    
    inline def setBackFaceCullingUndefined: Self = StObject.set(x, "backFaceCulling", js.undefined)
    
    inline def setBasePath(value: String | Resource): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setClampAnimations(value: Boolean): Self = StObject.set(x, "clampAnimations", value.asInstanceOf[js.Any])
    
    inline def setClampAnimationsUndefined: Self = StObject.set(x, "clampAnimations", js.undefined)
    
    inline def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    inline def setClippingPlanes(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
    inline def setColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorBlendAmount(value: Double): Self = StObject.set(x, "colorBlendAmount", value.asInstanceOf[js.Any])
    
    inline def setColorBlendAmountUndefined: Self = StObject.set(x, "colorBlendAmount", js.undefined)
    
    inline def setColorBlendMode(value: ColorBlendMode): Self = StObject.set(x, "colorBlendMode", value.asInstanceOf[js.Any])
    
    inline def setColorBlendModeUndefined: Self = StObject.set(x, "colorBlendMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContent(value: Cesium3DTileContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setCull(value: Boolean): Self = StObject.set(x, "cull", value.asInstanceOf[js.Any])
    
    inline def setCullUndefined: Self = StObject.set(x, "cull", js.undefined)
    
    inline def setCustomShader(value: typings.cesiumEngine.mod.CustomShader): Self = StObject.set(x, "customShader", value.asInstanceOf[js.Any])
    
    inline def setCustomShaderUndefined: Self = StObject.set(x, "customShader", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setDebugWireframe(value: Boolean): Self = StObject.set(x, "debugWireframe", value.asInstanceOf[js.Any])
    
    inline def setDebugWireframeUndefined: Self = StObject.set(x, "debugWireframe", js.undefined)
    
    inline def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setEnableDebugWireframe(value: Boolean): Self = StObject.set(x, "enableDebugWireframe", value.asInstanceOf[js.Any])
    
    inline def setEnableDebugWireframeUndefined: Self = StObject.set(x, "enableDebugWireframe", js.undefined)
    
    inline def setEnableShowOutline(value: Boolean): Self = StObject.set(x, "enableShowOutline", value.asInstanceOf[js.Any])
    
    inline def setEnableShowOutlineUndefined: Self = StObject.set(x, "enableShowOutline", js.undefined)
    
    inline def setFeatureIdLabel(value: String | Double): Self = StObject.set(x, "featureIdLabel", value.asInstanceOf[js.Any])
    
    inline def setFeatureIdLabelUndefined: Self = StObject.set(x, "featureIdLabel", js.undefined)
    
    inline def setForwardAxis(value: Axis): Self = StObject.set(x, "forwardAxis", value.asInstanceOf[js.Any])
    
    inline def setForwardAxisUndefined: Self = StObject.set(x, "forwardAxis", js.undefined)
    
    inline def setGltfCallback(value: /* gltf */ Any => Unit): Self = StObject.set(x, "gltfCallback", js.Any.fromFunction1(value))
    
    inline def setGltfCallbackUndefined: Self = StObject.set(x, "gltfCallback", js.undefined)
    
    inline def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageBasedLighting(value: ImageBasedLighting): Self = StObject.set(x, "imageBasedLighting", value.asInstanceOf[js.Any])
    
    inline def setImageBasedLightingUndefined: Self = StObject.set(x, "imageBasedLighting", js.undefined)
    
    inline def setIncrementallyLoadTextures(value: Boolean): Self = StObject.set(x, "incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    inline def setIncrementallyLoadTexturesUndefined: Self = StObject.set(x, "incrementallyLoadTextures", js.undefined)
    
    inline def setInstanceFeatureIdLabel(value: String | Double): Self = StObject.set(x, "instanceFeatureIdLabel", value.asInstanceOf[js.Any])
    
    inline def setInstanceFeatureIdLabelUndefined: Self = StObject.set(x, "instanceFeatureIdLabel", js.undefined)
    
    inline def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    inline def setMaximumScale(value: Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumScaleUndefined: Self = StObject.set(x, "maximumScale", js.undefined)
    
    inline def setMinimumPixelSize(value: Double): Self = StObject.set(x, "minimumPixelSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumPixelSizeUndefined: Self = StObject.set(x, "minimumPixelSize", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setOpaquePass(value: Boolean): Self = StObject.set(x, "opaquePass", value.asInstanceOf[js.Any])
    
    inline def setOpaquePassUndefined: Self = StObject.set(x, "opaquePass", js.undefined)
    
    inline def setOutlineColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setPointCloudShading(value: Any): Self = StObject.set(x, "pointCloudShading", value.asInstanceOf[js.Any])
    
    inline def setPointCloudShadingUndefined: Self = StObject.set(x, "pointCloudShading", js.undefined)
    
    inline def setProjectTo2D(value: Boolean): Self = StObject.set(x, "projectTo2D", value.asInstanceOf[js.Any])
    
    inline def setProjectTo2DUndefined: Self = StObject.set(x, "projectTo2D", js.undefined)
    
    inline def setReleaseGltfJson(value: Boolean): Self = StObject.set(x, "releaseGltfJson", value.asInstanceOf[js.Any])
    
    inline def setReleaseGltfJsonUndefined: Self = StObject.set(x, "releaseGltfJson", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowCreditsOnScreen(value: Boolean): Self = StObject.set(x, "showCreditsOnScreen", value.asInstanceOf[js.Any])
    
    inline def setShowCreditsOnScreenUndefined: Self = StObject.set(x, "showCreditsOnScreen", js.undefined)
    
    inline def setShowOutline(value: Boolean): Self = StObject.set(x, "showOutline", value.asInstanceOf[js.Any])
    
    inline def setShowOutlineUndefined: Self = StObject.set(x, "showOutline", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSilhouetteColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "silhouetteColor", value.asInstanceOf[js.Any])
    
    inline def setSilhouetteColorUndefined: Self = StObject.set(x, "silhouetteColor", js.undefined)
    
    inline def setSilhouetteSize(value: Double): Self = StObject.set(x, "silhouetteSize", value.asInstanceOf[js.Any])
    
    inline def setSilhouetteSizeUndefined: Self = StObject.set(x, "silhouetteSize", js.undefined)
    
    inline def setSplitDirection(value: SplitDirection): Self = StObject.set(x, "splitDirection", value.asInstanceOf[js.Any])
    
    inline def setSplitDirectionUndefined: Self = StObject.set(x, "splitDirection", js.undefined)
    
    inline def setUpAxis(value: Axis): Self = StObject.set(x, "upAxis", value.asInstanceOf[js.Any])
    
    inline def setUpAxisUndefined: Self = StObject.set(x, "upAxis", js.undefined)
    
    inline def setUrl(value: String | Resource): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
