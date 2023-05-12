package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.EllipseGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EllipseGraphics")
@js.native
open class EllipseGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the {@link ClassificationType} Property specifying whether this ellipse will classify terrain, 3D Tiles, or both when on the ground.
    */
  var classificationType: js.UndefOr[Property] = js.native
  
  def clone(result: EllipseGraphics): EllipseGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this ellipse will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the altitude of the ellipse extrusion.
    * Setting this property creates volume starting at height and ending at this altitude.
    */
  var extrudedHeight: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the extruded {@link HeightReference}.
    */
  var extrudedHeightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the ellipse is filled with the provided material.
    */
  var fill: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the angular distance between points on the ellipse.
    */
  var granularity: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the altitude of the ellipse.
    */
  var height: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to fill the ellipse.
    */
  var material: js.UndefOr[MaterialProperty] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: EllipseGraphics): Unit = js.native
  
  /**
    * Gets or sets the numeric Property specifying the number of vertical lines to draw along the perimeter for the outline.
    */
  var numberOfVerticalLines: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying whether the ellipse is outlined.
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
    * Gets or sets the numeric property specifying the rotation of the ellipse counter-clockwise from north.
    */
  var rotation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the semi-major axis.
    */
  var semiMajorAxis: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the semi-minor axis.
    */
  var semiMinorAxis: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the ellipse
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the ellipse.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric property specifying the rotation of the ellipse texture counter-clockwise from north.
    */
  var stRotation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the zIndex Property specifying the ellipse ordering.  Only has an effect if the ellipse is constant and neither height or extrudedHeight are specified
    */
  var zIndex: js.UndefOr[ConstantProperty] = js.native
}
object EllipseGraphics {
  
  /**
    * Initialization options for the EllipseGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the ellipse.
    * @property [semiMajorAxis] - The numeric Property specifying the semi-major axis.
    * @property [semiMinorAxis] - The numeric Property specifying the semi-minor axis.
    * @property [height = 0] - A numeric Property specifying the altitude of the ellipse relative to the ellipsoid surface.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [extrudedHeight] - A numeric Property specifying the altitude of the ellipse's extruded face relative to the ellipsoid surface.
    * @property [extrudedHeightReference = HeightReference.NONE] - A Property specifying what the extrudedHeight is relative to.
    * @property [rotation = 0.0] - A numeric property specifying the rotation of the ellipse counter-clockwise from north.
    * @property [stRotation = 0.0] - A numeric property specifying the rotation of the ellipse texture counter-clockwise from north.
    * @property [granularity = Cesium.Math.RADIANS_PER_DEGREE] - A numeric Property specifying the angular distance between points on the ellipse.
    * @property [fill = true] - A boolean Property specifying whether the ellipse is filled with the provided material.
    * @property [material = Color.WHITE] - A Property specifying the material used to fill the ellipse.
    * @property [outline = false] - A boolean Property specifying whether the ellipse is outlined.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the width of the outline.
    * @property [numberOfVerticalLines = 16] - A numeric Property specifying the number of vertical lines to draw along the perimeter for the outline.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the ellipse casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this ellipse will be displayed.
    * @property [classificationType = ClassificationType.BOTH] - An enum Property specifying whether this ellipse will classify terrain, 3D Tiles, or both when on the ground.
    * @property [zIndex = 0] - A property specifying the zIndex of the Ellipse.  Used for ordering ground geometry.  Only has an effect if the ellipse is constant and neither height or exturdedHeight are specified.
    */
  trait ConstructorOptions extends StObject {
    
    var classificationType: js.UndefOr[Property | ClassificationType] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var extrudedHeight: js.UndefOr[Property | Double] = js.undefined
    
    var extrudedHeightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var fill: js.UndefOr[Property | Boolean] = js.undefined
    
    var granularity: js.UndefOr[Property | Double] = js.undefined
    
    var height: js.UndefOr[Property | Double] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var numberOfVerticalLines: js.UndefOr[Property | Double] = js.undefined
    
    var outline: js.UndefOr[Property | Boolean] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var rotation: js.UndefOr[Property | Double] = js.undefined
    
    var semiMajorAxis: js.UndefOr[Property | Double] = js.undefined
    
    var semiMinorAxis: js.UndefOr[Property | Double] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var stRotation: js.UndefOr[Property | Double] = js.undefined
    
    var zIndex: js.UndefOr[ConstantProperty | Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setClassificationType(value: Property | ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
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
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setNumberOfVerticalLines(value: Property | Double): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
      
      inline def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setRotation(value: Property | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSemiMajorAxis(value: Property | Double): Self = StObject.set(x, "semiMajorAxis", value.asInstanceOf[js.Any])
      
      inline def setSemiMajorAxisUndefined: Self = StObject.set(x, "semiMajorAxis", js.undefined)
      
      inline def setSemiMinorAxis(value: Property | Double): Self = StObject.set(x, "semiMinorAxis", value.asInstanceOf[js.Any])
      
      inline def setSemiMinorAxisUndefined: Self = StObject.set(x, "semiMinorAxis", js.undefined)
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStRotation(value: Property | Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
      
      inline def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
      
      inline def setZIndex(value: ConstantProperty | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
