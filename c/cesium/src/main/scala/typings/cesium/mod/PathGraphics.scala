package typings.cesium.mod

import typings.cesium.mod.PathGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PathGraphics")
@js.native
open class PathGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  def clone(result: PathGraphics): PathGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this path will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of seconds in front of the object to show.
    */
  var leadTime: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to draw the path.
    */
  var material: MaterialProperty = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: PathGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the maximum number of seconds to step when sampling the position.
    */
  var resolution: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the path.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of seconds behind the object to show.
    */
  var trailTime: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the width in pixels.
    */
  var width: js.UndefOr[Property] = js.native
}
object PathGraphics {
  
  /**
    * Initialization options for the PathGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the path.
    * @property [leadTime] - A Property specifying the number of seconds in front the object to show.
    * @property [trailTime] - A Property specifying the number of seconds behind of the object to show.
    * @property [width = 1.0] - A numeric Property specifying the width in pixels.
    * @property [resolution = 60] - A numeric Property specifying the maximum number of seconds to step when sampling the position.
    * @property [material = Color.WHITE] - A Property specifying the material used to draw the path.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this path will be displayed.
    */
  trait ConstructorOptions extends StObject {
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var leadTime: js.UndefOr[Property | Double] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var resolution: js.UndefOr[Property | Double] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var trailTime: js.UndefOr[Property | Double] = js.undefined
    
    var width: js.UndefOr[Property | Double] = js.undefined
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
      
      inline def setLeadTime(value: Property | Double): Self = StObject.set(x, "leadTime", value.asInstanceOf[js.Any])
      
      inline def setLeadTimeUndefined: Self = StObject.set(x, "leadTime", js.undefined)
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setResolution(value: Property | Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTrailTime(value: Property | Double): Self = StObject.set(x, "trailTime", value.asInstanceOf[js.Any])
      
      inline def setTrailTimeUndefined: Self = StObject.set(x, "trailTime", js.undefined)
      
      inline def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
