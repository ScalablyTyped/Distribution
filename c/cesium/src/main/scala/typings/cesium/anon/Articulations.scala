package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.ColorBlendMode
import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import typings.cesium.mod.PropertyBag
import typings.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Articulations extends StObject {
  
  var articulations: js.UndefOr[PropertyBag] = js.undefined
  
  var clampAnimations: js.UndefOr[Property | Boolean] = js.undefined
  
  var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.undefined
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var colorBlendAmount: js.UndefOr[Property | Double] = js.undefined
  
  var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[Property | typings.cesium.mod.DistanceDisplayCondition] = js.undefined
  
  var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
  
  var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.undefined
  
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.undefined
  
  var lightColor: js.UndefOr[Property | Cartesian3] = js.undefined
  
  var maximumScale: js.UndefOr[Property | Double] = js.undefined
  
  var minimumPixelSize: js.UndefOr[Property | Double] = js.undefined
  
  var nodeTransformations: js.UndefOr[PropertyBag] = js.undefined
  
  var runAnimations: js.UndefOr[Property | Boolean] = js.undefined
  
  var scale: js.UndefOr[Property | Double] = js.undefined
  
  var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
  
  var show: js.UndefOr[Property | Boolean] = js.undefined
  
  var silhouetteColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var silhouetteSize: js.UndefOr[Property | Double] = js.undefined
  
  var uri: js.UndefOr[Property | String] = js.undefined
}
object Articulations {
  
  inline def apply(): Articulations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Articulations]
  }
  
  extension [Self <: Articulations](x: Self) {
    
    inline def setArticulations(value: PropertyBag): Self = StObject.set(x, "articulations", value.asInstanceOf[js.Any])
    
    inline def setArticulationsUndefined: Self = StObject.set(x, "articulations", js.undefined)
    
    inline def setClampAnimations(value: Property | Boolean): Self = StObject.set(x, "clampAnimations", value.asInstanceOf[js.Any])
    
    inline def setClampAnimationsUndefined: Self = StObject.set(x, "clampAnimations", js.undefined)
    
    inline def setClippingPlanes(value: Property | ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
    inline def setColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorBlendAmount(value: Property | Double): Self = StObject.set(x, "colorBlendAmount", value.asInstanceOf[js.Any])
    
    inline def setColorBlendAmountUndefined: Self = StObject.set(x, "colorBlendAmount", js.undefined)
    
    inline def setColorBlendMode(value: Property | ColorBlendMode): Self = StObject.set(x, "colorBlendMode", value.asInstanceOf[js.Any])
    
    inline def setColorBlendModeUndefined: Self = StObject.set(x, "colorBlendMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDistanceDisplayCondition(value: Property | typings.cesium.mod.DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setImageBasedLightingFactor(value: Property | Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    inline def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
    
    inline def setIncrementallyLoadTextures(value: Property | Boolean): Self = StObject.set(x, "incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    inline def setIncrementallyLoadTexturesUndefined: Self = StObject.set(x, "incrementallyLoadTextures", js.undefined)
    
    inline def setLightColor(value: Property | Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    inline def setMaximumScale(value: Property | Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumScaleUndefined: Self = StObject.set(x, "maximumScale", js.undefined)
    
    inline def setMinimumPixelSize(value: Property | Double): Self = StObject.set(x, "minimumPixelSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumPixelSizeUndefined: Self = StObject.set(x, "minimumPixelSize", js.undefined)
    
    inline def setNodeTransformations(value: PropertyBag): Self = StObject.set(x, "nodeTransformations", value.asInstanceOf[js.Any])
    
    inline def setNodeTransformationsUndefined: Self = StObject.set(x, "nodeTransformations", js.undefined)
    
    inline def setRunAnimations(value: Property | Boolean): Self = StObject.set(x, "runAnimations", value.asInstanceOf[js.Any])
    
    inline def setRunAnimationsUndefined: Self = StObject.set(x, "runAnimations", js.undefined)
    
    inline def setScale(value: Property | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSilhouetteColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "silhouetteColor", value.asInstanceOf[js.Any])
    
    inline def setSilhouetteColorUndefined: Self = StObject.set(x, "silhouetteColor", js.undefined)
    
    inline def setSilhouetteSize(value: Property | Double): Self = StObject.set(x, "silhouetteSize", value.asInstanceOf[js.Any])
    
    inline def setSilhouetteSizeUndefined: Self = StObject.set(x, "silhouetteSize", js.undefined)
    
    inline def setUri(value: Property | String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
