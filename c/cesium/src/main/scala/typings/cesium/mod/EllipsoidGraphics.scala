package typings.cesium.mod

import typings.cesium.mod.EllipsoidGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGraphics")
@js.native
open class EllipsoidGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  def clone(result: EllipsoidGraphics): EllipsoidGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this ellipsoid will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the ellipsoid is filled with the provided material.
    */
  var fill: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian3} {@link Property} specifying the inner radii of the ellipsoid.
    */
  var innerRadii: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to fill the ellipsoid.
    */
  var material: MaterialProperty = js.native
  
  /**
    * Gets or sets the Property specifying the maximum clock angle of the ellipsoid.
    */
  var maximumClock: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the maximum cone angle of the ellipsoid.
    */
  var maximumCone: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: EllipsoidGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the minimum clock angle of the ellipsoid.
    */
  var minimumClock: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the minimum cone angle of the ellipsoid.
    */
  var minimumCone: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying whether the ellipsoid is outlined.
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
    * Gets or sets the {@link Cartesian3} {@link Property} specifying the radii of the ellipsoid.
    */
  var radii: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the ellipsoid
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the ellipsoid.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of radial slices per 360 degrees.
    */
  var slicePartitions: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of stacks.
    */
  var stackPartitions: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of samples per outline ring, determining the granularity of the curvature.
    */
  var subdivisions: js.UndefOr[Property] = js.native
}
object EllipsoidGraphics {
  
  /**
    * Initialization options for the EllipsoidGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the ellipsoid.
    * @property [radii] - A {@link Cartesian3} Property specifying the radii of the ellipsoid.
    * @property [innerRadii] - A {@link Cartesian3} Property specifying the inner radii of the ellipsoid.
    * @property [minimumClock = 0.0] - A Property specifying the minimum clock angle of the ellipsoid.
    * @property [maximumClock = 2*PI] - A Property specifying the maximum clock angle of the ellipsoid.
    * @property [minimumCone = 0.0] - A Property specifying the minimum cone angle of the ellipsoid.
    * @property [maximumCone = PI] - A Property specifying the maximum cone angle of the ellipsoid.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height from the entity position is relative to.
    * @property [fill = true] - A boolean Property specifying whether the ellipsoid is filled with the provided material.
    * @property [material = Color.WHITE] - A Property specifying the material used to fill the ellipsoid.
    * @property [outline = false] - A boolean Property specifying whether the ellipsoid is outlined.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the width of the outline.
    * @property [stackPartitions = 64] - A Property specifying the number of stacks.
    * @property [slicePartitions = 64] - A Property specifying the number of radial slices.
    * @property [subdivisions = 128] - A Property specifying the number of samples per outline ring, determining the granularity of the curvature.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the ellipsoid casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this ellipsoid will be displayed.
    */
  trait ConstructorOptions extends StObject {
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var fill: js.UndefOr[Property | Boolean] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var innerRadii: js.UndefOr[Property | Cartesian3] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var maximumClock: js.UndefOr[Property | Double] = js.undefined
    
    var maximumCone: js.UndefOr[Property | Double] = js.undefined
    
    var minimumClock: js.UndefOr[Property | Double] = js.undefined
    
    var minimumCone: js.UndefOr[Property | Double] = js.undefined
    
    var outline: js.UndefOr[Property | Boolean] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var radii: js.UndefOr[Property | Cartesian3] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var slicePartitions: js.UndefOr[Property | Double] = js.undefined
    
    var stackPartitions: js.UndefOr[Property | Double] = js.undefined
    
    var subdivisions: js.UndefOr[Property | Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setFill(value: Property | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setInnerRadii(value: Property | Cartesian3): Self = StObject.set(x, "innerRadii", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiiUndefined: Self = StObject.set(x, "innerRadii", js.undefined)
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setMaximumClock(value: Property | Double): Self = StObject.set(x, "maximumClock", value.asInstanceOf[js.Any])
      
      inline def setMaximumClockUndefined: Self = StObject.set(x, "maximumClock", js.undefined)
      
      inline def setMaximumCone(value: Property | Double): Self = StObject.set(x, "maximumCone", value.asInstanceOf[js.Any])
      
      inline def setMaximumConeUndefined: Self = StObject.set(x, "maximumCone", js.undefined)
      
      inline def setMinimumClock(value: Property | Double): Self = StObject.set(x, "minimumClock", value.asInstanceOf[js.Any])
      
      inline def setMinimumClockUndefined: Self = StObject.set(x, "minimumClock", js.undefined)
      
      inline def setMinimumCone(value: Property | Double): Self = StObject.set(x, "minimumCone", value.asInstanceOf[js.Any])
      
      inline def setMinimumConeUndefined: Self = StObject.set(x, "minimumCone", js.undefined)
      
      inline def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setRadii(value: Property | Cartesian3): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
      
      inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSlicePartitions(value: Property | Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
      
      inline def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
      
      inline def setStackPartitions(value: Property | Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
      
      inline def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
      
      inline def setSubdivisions(value: Property | Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
      
      inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    }
  }
}
