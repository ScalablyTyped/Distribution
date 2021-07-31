package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGroundOverlayOptions
  extends StObject
     with ICustomOverlayOptions {
  
  /** A background color that fills the bounding box area beneath the ground overlay. */
  var backgroundColor: js.UndefOr[String | Color] = js.undefined
  
  /** The bounding box to anchor the ground overlay to. This is required when creating a ground overlay. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  
  /** The URL to the image to anchor to the map as a ground overlay. This is required when creating a ground overlay. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** The opacity of the ground overlay image. */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** An angle in degrees to rotate the overlay in a counter-clockwise direction where 0 = north, 90 = west, 180 = south, 270 = east */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /** A boolean value indicating if the ground overlay is visible or not. */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IGroundOverlayOptions {
  
  @scala.inline
  def apply(): IGroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroundOverlayOptions]
  }
  
  @scala.inline
  implicit class IGroundOverlayOptionsMutableBuilder[Self <: IGroundOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String | Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
