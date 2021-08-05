package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewOptions extends StObject {
  
  /** The bounding rectangle of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  
  /** The location of the center of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var center: js.UndefOr[Location] = js.undefined
  
  /**	The amount the center is shifted in pixels.This property is ignored if center is not specified. */
  var centerOffset: js.UndefOr[Point] = js.undefined
  
  /**
    * The directional heading of the map. The heading is represented in geometric degrees with 0 or 360 = North, 90 = East,
    * 180 = South, and 270 = West.
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /** Indicates how the map labels are displayed. */
  var labelOverlay: js.UndefOr[LabelOverlay] = js.undefined
  
  /** The map type of the view. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.undefined
  
  /** The amount of padding in pixels to be added to each side of the bounds of the map view. */
  var padding: js.UndefOr[Double] = js.undefined
  
  /** The angle relative to the horizon to tilt a streetside panorama image. */
  var pitch: js.UndefOr[Double] = js.undefined
  
  /** The zoom level of the map view. */
  var zoom: js.UndefOr[Double] = js.undefined
}
object IViewOptions {
  
  inline def apply(): IViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewOptions]
  }
  
  extension [Self <: IViewOptions](x: Self) {
    
    inline def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterOffset(value: Point): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    inline def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setLabelOverlay(value: LabelOverlay): Self = StObject.set(x, "labelOverlay", value.asInstanceOf[js.Any])
    
    inline def setLabelOverlayUndefined: Self = StObject.set(x, "labelOverlay", js.undefined)
    
    inline def setMapTypeId(value: MapTypeId): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
