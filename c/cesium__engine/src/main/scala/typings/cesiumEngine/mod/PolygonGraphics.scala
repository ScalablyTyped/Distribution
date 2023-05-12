package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.PolygonGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolygonGraphics")
@js.native
open class PolygonGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the {@link ArcType} Property specifying the type of lines the polygon edges use.
    */
  var arcType: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link ClassificationType} Property specifying whether this polygon will classify terrain, 3D Tiles, or both when on the ground.
    */
  var classificationType: js.UndefOr[Property] = js.native
  
  def clone(result: PolygonGraphics): PolygonGraphics = js.native
  
  /**
    * Gets or sets a boolean specifying whether or not the bottom of an extruded polygon is included.
    */
  var closeBottom: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets a boolean specifying whether or not the top of an extruded polygon is included.
    */
  var closeTop: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this polygon will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the altitude of the polygon extrusion.
    * If {@link PolygonGraphics#perPositionHeight} is false, the volume starts at {@link PolygonGraphics#height} and ends at this altitude.
    * If {@link PolygonGraphics#perPositionHeight} is true, the volume starts at the height of each {@link PolygonGraphics#hierarchy} position and ends at this altitude.
    */
  var extrudedHeight: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the extruded {@link HeightReference}.
    */
  var extrudedHeightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the polygon is filled with the provided material.
    */
  var fill: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the angular distance between points on the polygon.
    */
  var granularity: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the constant altitude of the polygon.
    */
  var height: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link PolygonHierarchy}.
    */
  var hierarchy: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to fill the polygon.
    */
  var material: MaterialProperty = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: PolygonGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying whether the polygon is outlined.
    */
  var outline: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the outline.
    */
  var outlineColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the width of the outline.
    * <p>
    * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
    * </p>
    */
  var outlineWidth: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean specifying whether or not the the height of each position is used.
    * If true, the shape will have non-uniform altitude defined by the height of each {@link PolygonGraphics#hierarchy} position.
    * If false, the shape will have a constant altitude as specified by {@link PolygonGraphics#height}.
    */
  var perPositionHeight: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the polygon
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the polygon.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric property specifying the rotation of the polygon texture counter-clockwise from north. Only has an effect if textureCoordinates is not defined.
    */
  var stRotation: js.UndefOr[Property] = js.native
  
  /**
    * A Property specifying texture coordinates as a {@link PolygonHierarchy} of {@link Cartesian2} points. Has no effect for ground primitives.
    */
  var textureCoordinates: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the zIndex Prperty specifying the ordering of ground geometry.  Only has an effect if the polygon is constant and neither height or extrudedHeight are specified.
    */
  var zIndex: js.UndefOr[ConstantProperty] = js.native
}
object PolygonGraphics {
  
  /**
    * Initialization options for the PolygonGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the polygon.
    * @property [hierarchy] - A Property specifying the {@link PolygonHierarchy}.
    * @property [height = 0] - A numeric Property specifying the altitude of the polygon relative to the ellipsoid surface.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [extrudedHeight] - A numeric Property specifying the altitude of the polygon's extruded face relative to the ellipsoid surface.
    * @property [extrudedHeightReference = HeightReference.NONE] - A Property specifying what the extrudedHeight is relative to.
    * @property [stRotation = 0.0] - A numeric property specifying the rotation of the polygon texture counter-clockwise from north. Only has an effect if textureCoordinates is not defined.
    * @property [granularity = Cesium.Math.RADIANS_PER_DEGREE] - A numeric Property specifying the angular distance between each latitude and longitude point.
    * @property [fill = true] - A boolean Property specifying whether the polygon is filled with the provided material.
    * @property [material = Color.WHITE] - A Property specifying the material used to fill the polygon.
    * @property [outline = false] - A boolean Property specifying whether the polygon is outlined.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the width of the outline.
    * @property [perPositionHeight = false] - A boolean specifying whether or not the height of each position is used.
    * @property [closeTop = true] - When false, leaves off the top of an extruded polygon open.
    * @property [closeBottom = true] - When false, leaves off the bottom of an extruded polygon open.
    * @property [arcType = ArcType.GEODESIC] - The type of line the polygon edges must follow.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the polygon casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this polygon will be displayed.
    * @property [classificationType = ClassificationType.BOTH] - An enum Property specifying whether this polygon will classify terrain, 3D Tiles, or both when on the ground.
    * @property [zIndex = 0] - A property specifying the zIndex used for ordering ground geometry.  Only has an effect if the polygon is constant and neither height or extrudedHeight are specified.
    * @property [textureCoordinates] - A Property specifying texture coordinates as a {@link PolygonHierarchy} of {@link Cartesian2} points. Has no effect for ground primitives.
    */
  trait ConstructorOptions extends StObject {
    
    var arcType: js.UndefOr[Property | ArcType] = js.undefined
    
    var classificationType: js.UndefOr[Property | ClassificationType] = js.undefined
    
    var closeBottom: js.UndefOr[Boolean] = js.undefined
    
    var closeTop: js.UndefOr[Boolean] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var extrudedHeight: js.UndefOr[Property | Double] = js.undefined
    
    var extrudedHeightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var fill: js.UndefOr[Property | Boolean] = js.undefined
    
    var granularity: js.UndefOr[Property | Double] = js.undefined
    
    var height: js.UndefOr[Property | Double] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var hierarchy: js.UndefOr[Property | PolygonHierarchy | js.Array[Cartesian3]] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var outline: js.UndefOr[Property | Boolean] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var perPositionHeight: js.UndefOr[Property | Boolean] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var stRotation: js.UndefOr[Property | Double] = js.undefined
    
    var textureCoordinates: js.UndefOr[Property | PolygonHierarchy] = js.undefined
    
    var zIndex: js.UndefOr[ConstantProperty | Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setArcType(value: Property | ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
      
      inline def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
      
      inline def setClassificationType(value: Property | ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
      inline def setCloseBottom(value: Boolean): Self = StObject.set(x, "closeBottom", value.asInstanceOf[js.Any])
      
      inline def setCloseBottomUndefined: Self = StObject.set(x, "closeBottom", js.undefined)
      
      inline def setCloseTop(value: Boolean): Self = StObject.set(x, "closeTop", value.asInstanceOf[js.Any])
      
      inline def setCloseTopUndefined: Self = StObject.set(x, "closeTop", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setExtrudedHeight(value: Property | Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
      
      inline def setExtrudedHeightReference(value: Property | HeightReference): Self = StObject.set(x, "extrudedHeightReference", value.asInstanceOf[js.Any])
      
      inline def setExtrudedHeightReferenceUndefined: Self = StObject.set(x, "extrudedHeightReference", js.undefined)
      
      inline def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
      
      inline def setFill(value: Property | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGranularity(value: Property | Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setHeight(value: Property | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHierarchy(value: Property | PolygonHierarchy | js.Array[Cartesian3]): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
      
      inline def setHierarchyVarargs(value: Cartesian3*): Self = StObject.set(x, "hierarchy", js.Array(value*))
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setPerPositionHeight(value: Property | Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
      
      inline def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStRotation(value: Property | Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
      
      inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
      
      inline def setTextureCoordinates(value: Property | PolygonHierarchy): Self = StObject.set(x, "textureCoordinates", value.asInstanceOf[js.Any])
      
      inline def setTextureCoordinatesUndefined: Self = StObject.set(x, "textureCoordinates", js.undefined)
      
      inline def setZIndex(value: ConstantProperty | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
