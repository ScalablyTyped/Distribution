package typings.cesium.mod

import typings.cesium.mod.PointGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointGraphics")
@js.native
open class PointGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  def clone(result: PointGraphics): PointGraphics = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the point.
    */
  var color: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
    * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
    */
  var disableDepthTestDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this point will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: PointGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the outline.
    */
  var outlineColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the the outline width in pixels.
    */
  var outlineWidth: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the size in pixels.
    */
  var pixelSize: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link NearFarScalar} Property used to scale the point based on distance.
    * If undefined, a constant size is used.
    */
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the point.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the translucency of the point based on the distance from the camera.
    * A point's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the points's translucency remains clamped to the nearest bound.
    */
  var translucencyByDistance: js.UndefOr[Property] = js.native
}
object PointGraphics {
  
  /**
    * Initialization options for the PointGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the point.
    * @property [pixelSize = 1] - A numeric Property specifying the size in pixels.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [color = Color.WHITE] - A Property specifying the {@link Color} of the point.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 0] - A numeric Property specifying the the outline width in pixels.
    * @property [scaleByDistance] - A {@link NearFarScalar} Property used to scale the point based on distance.
    * @property [translucencyByDistance] - A {@link NearFarScalar} Property used to set translucency based on distance from the camera.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this point will be displayed.
    * @property [disableDepthTestDistance] - A Property specifying the distance from the camera at which to disable the depth test to.
    */
  trait ConstructorOptions extends StObject {
    
    var color: js.UndefOr[Property | Color] = js.undefined
    
    var disableDepthTestDistance: js.UndefOr[Property | Double] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var pixelSize: js.UndefOr[Property | Double] = js.undefined
    
    var scaleByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var translucencyByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setColor(value: Property | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
      
      inline def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setPixelSize(value: Property | Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
      
      inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      
      inline def setScaleByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
      
      inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTranslucencyByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
      
      inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    }
  }
}
