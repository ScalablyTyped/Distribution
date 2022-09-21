package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxGallery.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGalleryOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxGallery[TItem, TKey], TItem, TKey] {
  
  /**
    * The time, in milliseconds, spent on slide animation.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not to animate the displayed item change.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to allow users to switch between items by clicking an indicator.
    */
  var indicatorEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of an area used to display a single image.
    */
  var initialItemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to scroll back to the first item after the last item is swiped.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display an indicator that points to the selected gallery item.
    */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies the availability of the &apos;Forward&apos; and &apos;Back&apos; navigation buttons.
    */
  var showNavButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time interval in milliseconds, after which the gallery switches to the next item.
    */
  var slideshowDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the UI component stretches images to fit the total gallery width.
    */
  var stretchImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to allow users to switch between items by swiping.
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to display parts of previous and next images along the sides of the current image.
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}
object dxGalleryOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxGalleryOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryOptions[TItem, TKey]]
  }
  
  extension [Self <: dxGalleryOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxGalleryOptions[TItem, TKey])) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setIndicatorEnabled(value: Boolean): Self = StObject.set(x, "indicatorEnabled", value.asInstanceOf[js.Any])
    
    inline def setIndicatorEnabledUndefined: Self = StObject.set(x, "indicatorEnabled", js.undefined)
    
    inline def setInitialItemWidth(value: Double): Self = StObject.set(x, "initialItemWidth", value.asInstanceOf[js.Any])
    
    inline def setInitialItemWidthUndefined: Self = StObject.set(x, "initialItemWidth", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
    
    inline def setShowNavButtons(value: Boolean): Self = StObject.set(x, "showNavButtons", value.asInstanceOf[js.Any])
    
    inline def setShowNavButtonsUndefined: Self = StObject.set(x, "showNavButtons", js.undefined)
    
    inline def setSlideshowDelay(value: Double): Self = StObject.set(x, "slideshowDelay", value.asInstanceOf[js.Any])
    
    inline def setSlideshowDelayUndefined: Self = StObject.set(x, "slideshowDelay", js.undefined)
    
    inline def setStretchImages(value: Boolean): Self = StObject.set(x, "stretchImages", value.asInstanceOf[js.Any])
    
    inline def setStretchImagesUndefined: Self = StObject.set(x, "stretchImages", js.undefined)
    
    inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    
    inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
  }
}
