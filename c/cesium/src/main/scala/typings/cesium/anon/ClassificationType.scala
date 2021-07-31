package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ConstantProperty
import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import typings.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationType extends StObject {
  
  var arcType: js.UndefOr[Property | typings.cesium.mod.ArcType] = js.undefined
  
  var classificationType: js.UndefOr[Property | typings.cesium.mod.ClassificationType] = js.undefined
  
  var closeBottom: js.UndefOr[Boolean] = js.undefined
  
  var closeTop: js.UndefOr[Boolean] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  
  var extrudedHeightReference: js.UndefOr[Property] = js.undefined
  
  var fill: js.UndefOr[Property | Boolean] = js.undefined
  
  var granularity: js.UndefOr[Property] = js.undefined
  
  var height: js.UndefOr[Property | Double] = js.undefined
  
  var heightReference: js.UndefOr[Property] = js.undefined
  
  var hierarchy: js.UndefOr[Property | js.Array[Cartesian3] | typings.cesium.mod.PolygonHierarchy] = js.undefined
  
  var material: js.UndefOr[MaterialProperty | typings.cesium.mod.Color] = js.undefined
  
  var outline: js.UndefOr[Property | Boolean] = js.undefined
  
  var outlineColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Property | Double] = js.undefined
  
  var perPositionHeight: js.UndefOr[Property] = js.undefined
  
  var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
  
  var show: js.UndefOr[Property | Boolean] = js.undefined
  
  var stRotation: js.UndefOr[Property] = js.undefined
  
  var zIndex: js.UndefOr[ConstantProperty | Double] = js.undefined
}
object ClassificationType {
  
  @scala.inline
  def apply(): ClassificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationType]
  }
  
  @scala.inline
  implicit class ClassificationTypeMutableBuilder[Self <: ClassificationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcType(value: Property | typings.cesium.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    @scala.inline
    def setClassificationType(value: Property | typings.cesium.mod.ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    @scala.inline
    def setCloseBottom(value: Boolean): Self = StObject.set(x, "closeBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseBottomUndefined: Self = StObject.set(x, "closeBottom", js.undefined)
    
    @scala.inline
    def setCloseTop(value: Boolean): Self = StObject.set(x, "closeTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTopUndefined: Self = StObject.set(x, "closeTop", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Property): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightReference(value: Property): Self = StObject.set(x, "extrudedHeightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightReferenceUndefined: Self = StObject.set(x, "extrudedHeightReference", js.undefined)
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setFill(value: Property | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGranularity(value: Property): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Property | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReference(value: Property): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHierarchy(value: Property | js.Array[Cartesian3] | typings.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    @scala.inline
    def setHierarchyVarargs(value: Cartesian3*): Self = StObject.set(x, "hierarchy", js.Array(value :_*))
    
    @scala.inline
    def setMaterial(value: MaterialProperty | typings.cesium.mod.Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setPerPositionHeight(value: Property): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStRotation(value: Property): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
    
    @scala.inline
    def setZIndex(value: ConstantProperty | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
