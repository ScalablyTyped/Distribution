package typings.cesium.mod

import typings.cesium.mod.WallGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallGraphics")
@js.native
open class WallGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  def clone(result: WallGraphics): WallGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this wall will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the wall is filled with the provided material.
    */
  var fill: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the angular distance between points on the wall.
    */
  var granularity: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to fill the wall.
    */
  var material: MaterialProperty = js.native
  
  /**
    * Gets or sets the Property specifying an array of heights to be used for the top of the wall instead of the height of each position.
    * If defined, the array must be the same length as {@link Wall#positions}.
    */
  var maximumHeights: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: WallGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying an array of heights to be used for the bottom of the wall instead of the surface of the globe.
    * If defined, the array must be the same length as {@link Wall#positions}.
    */
  var minimumHeights: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying whether the wall is outlined.
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
    * Gets or sets the Property specifying the array of {@link Cartesian3} positions which define the top of the wall.
    */
  var positions: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the wall
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the wall.
    */
  var show: js.UndefOr[Property] = js.native
}
object WallGraphics {
  
  /**
    * Initialization options for the WallGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the wall.
    * @property [positions] - A Property specifying the array of {@link Cartesian3} positions which define the top of the wall.
    * @property [minimumHeights] - A Property specifying an array of heights to be used for the bottom of the wall instead of the globe surface.
    * @property [maximumHeights] - A Property specifying an array of heights to be used for the top of the wall instead of the height of each position.
    * @property [granularity = Cesium.Math.RADIANS_PER_DEGREE] - A numeric Property specifying the angular distance between each latitude and longitude point.
    * @property [fill = true] - A boolean Property specifying whether the wall is filled with the provided material.
    * @property [material = Color.WHITE] - A Property specifying the material used to fill the wall.
    * @property [outline = false] - A boolean Property specifying whether the wall is outlined.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the width of the outline.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the wall casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this wall will be displayed.
    */
  trait ConstructorOptions extends StObject {
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var fill: js.UndefOr[Property | Boolean] = js.undefined
    
    var granularity: js.UndefOr[Property | Double] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var maximumHeights: js.UndefOr[Property | js.Array[Double]] = js.undefined
    
    var minimumHeights: js.UndefOr[Property | js.Array[Double]] = js.undefined
    
    var outline: js.UndefOr[Property | Boolean] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setFill(value: Property | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGranularity(value: Property | Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setMaximumHeights(value: Property | js.Array[Double]): Self = StObject.set(x, "maximumHeights", value.asInstanceOf[js.Any])
      
      inline def setMaximumHeightsUndefined: Self = StObject.set(x, "maximumHeights", js.undefined)
      
      inline def setMaximumHeightsVarargs(value: Double*): Self = StObject.set(x, "maximumHeights", js.Array(value*))
      
      inline def setMinimumHeights(value: Property | js.Array[Double]): Self = StObject.set(x, "minimumHeights", value.asInstanceOf[js.Any])
      
      inline def setMinimumHeightsUndefined: Self = StObject.set(x, "minimumHeights", js.undefined)
      
      inline def setMinimumHeightsVarargs(value: Double*): Self = StObject.set(x, "minimumHeights", js.Array(value*))
      
      inline def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setPositions(value: Property | js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
