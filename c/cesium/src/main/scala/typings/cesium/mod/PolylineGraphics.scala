package typings.cesium.mod

import typings.cesium.mod.PolylineGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGraphics")
@js.native
open class PolylineGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the {@link ArcType} Property specifying whether the line segments should be great arcs, rhumb lines or linearly connected.
    */
  var arcType: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the polyline
    * should be clamped to the ground.
    */
  var clampToGround: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link ClassificationType} Property specifying whether this polyline will classify terrain, 3D Tiles, or both when on the ground.
    */
  var classificationType: js.UndefOr[Property] = js.native
  
  def clone(result: PolylineGraphics): PolylineGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to draw the polyline when it fails the depth test.
    * <p>
    * Requires the EXT_frag_depth WebGL extension to render properly. If the extension is not supported,
    * there may be artifacts.
    * </p>
    */
  var depthFailMaterial: MaterialProperty = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this polyline will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the angular distance between each latitude and longitude if arcType is not ArcType.NONE and clampToGround is false.
    */
  var granularity: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to draw the polyline.
    */
  var material: MaterialProperty = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: PolylineGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the array of {@link Cartesian3}
    * positions that define the line strip.
    */
  var positions: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the polyline
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the polyline.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the width in pixels.
    */
  var width: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the zIndex Property specifying the ordering of the polyline. Only has an effect if `clampToGround` is true and polylines on terrain is supported.
    */
  var zIndex: js.UndefOr[ConstantProperty] = js.native
}
object PolylineGraphics {
  
  /**
    * Initialization options for the PolylineGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the polyline.
    * @property [positions] - A Property specifying the array of {@link Cartesian3} positions that define the line strip.
    * @property [width = 1.0] - A numeric Property specifying the width in pixels.
    * @property [granularity = Cesium.Math.RADIANS_PER_DEGREE] - A numeric Property specifying the angular distance between each latitude and longitude if arcType is not ArcType.NONE.
    * @property [material = Color.WHITE] - A Property specifying the material used to draw the polyline.
    * @property [depthFailMaterial] - A property specifying the material used to draw the polyline when it is below the terrain.
    * @property [arcType = ArcType.GEODESIC] - The type of line the polyline segments must follow.
    * @property [clampToGround = false] - A boolean Property specifying whether the Polyline should be clamped to the ground.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the polyline casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this polyline will be displayed.
    * @property [classificationType = ClassificationType.BOTH] - An enum Property specifying whether this polyline will classify terrain, 3D Tiles, or both when on the ground.
    * @property [zIndex = 0] - A Property specifying the zIndex used for ordering ground geometry. Only has an effect if `clampToGround` is true and polylines on terrain is supported.
    */
  trait ConstructorOptions extends StObject {
    
    var arcType: js.UndefOr[Property | ArcType] = js.undefined
    
    var clampToGround: js.UndefOr[Property | Boolean] = js.undefined
    
    var classificationType: js.UndefOr[Property | ClassificationType] = js.undefined
    
    var depthFailMaterial: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var granularity: js.UndefOr[Property | Double] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var width: js.UndefOr[Property | Double] = js.undefined
    
    var zIndex: js.UndefOr[Property | Double] = js.undefined
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
      
      inline def setClampToGround(value: Property | Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
      
      inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
      
      inline def setClassificationType(value: Property | ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
      inline def setDepthFailMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "depthFailMaterial", value.asInstanceOf[js.Any])
      
      inline def setDepthFailMaterialUndefined: Self = StObject.set(x, "depthFailMaterial", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setGranularity(value: Property | Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setPositions(value: Property | js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Property | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
