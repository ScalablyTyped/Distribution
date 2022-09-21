package typings.cordovaPluginSafariviewcontroller

import typings.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.curl
import typings.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.fade
import typings.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.flip
import typings.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariViewControllerShowOptions extends StObject {
  
  /**
    * Whether opening/hiding the `SafariViewController`/custom tab should use a transition animation.
    * Note that `hide()` will reuse this preference (the 'Done' button will always animate though).
    *
    * @default true
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color to tint the background of the navigation bar and the toolbar (iOS 10+ only).
    * See https://developer.apple.com/documentation/safariservices/sfsafariviewcontroller/2274394-preferredbartintcolor
    * for more details.
    *
    * @example '#0000ff'
    */
  var barColor: js.UndefOr[String] = js.undefined
  
  /**
    * The color to tint the control buttons on the navigation bar and the toolbar (iOS 10+ only).
    * See https://developer.apple.com/documentation/safariservices/sfsafariviewcontroller/2274393-preferredcontroltintcolor
    * for more details.
    *
    * @example '#ffffff'
    */
  var controlTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * Whether reader mode should be used for `SafariViewController`.
    *
    * @default false
    */
  var enterReaderModeIfAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Loads the `url` without showing the `SafariViewController`/custom tab view in foreground.
    * You can use this to load cookies etc in the background
    * (see https://github.com/EddyVerbruggen/cordova-plugin-safariviewcontroller/issues/1 for details).
    *
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true`, will add a menu entry to share the current URL (Android only).
    *
    * @default false
    */
  var showDefaultShareMenuItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tint color to use.
    *
    * @default ios blue
    * @example '#ffffff'
    */
  var tintColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the toolbar color (Android only). On Android L and above, this color is also applied to the status bar.
    *
    * @example '#ffffff'
    */
  var toolbarColor: js.UndefOr[String] = js.undefined
  
  /**
    * Unless animated is `false` you can choose a transition animation. This only works in iOS 9.1/9.2 and lower and on Android.
    * Only `'slide'` option is available on Android.
    *
    * @default 'slide'
    */
  var transition: js.UndefOr[curl | flip | fade | slide] = js.undefined
  
  /**
    * The url to open in `SafariViewController`/custom tab view.
    */
  var url: String
}
object SafariViewControllerShowOptions {
  
  inline def apply(url: String): SafariViewControllerShowOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariViewControllerShowOptions]
  }
  
  extension [Self <: SafariViewControllerShowOptions](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBarColor(value: String): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
    
    inline def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
    
    inline def setControlTintColor(value: String): Self = StObject.set(x, "controlTintColor", value.asInstanceOf[js.Any])
    
    inline def setControlTintColorUndefined: Self = StObject.set(x, "controlTintColor", js.undefined)
    
    inline def setEnterReaderModeIfAvailable(value: Boolean): Self = StObject.set(x, "enterReaderModeIfAvailable", value.asInstanceOf[js.Any])
    
    inline def setEnterReaderModeIfAvailableUndefined: Self = StObject.set(x, "enterReaderModeIfAvailable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setShowDefaultShareMenuItem(value: Boolean): Self = StObject.set(x, "showDefaultShareMenuItem", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultShareMenuItemUndefined: Self = StObject.set(x, "showDefaultShareMenuItem", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setToolbarColor(value: String): Self = StObject.set(x, "toolbarColor", value.asInstanceOf[js.Any])
    
    inline def setToolbarColorUndefined: Self = StObject.set(x, "toolbarColor", js.undefined)
    
    inline def setTransition(value: curl | flip | fade | slide): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
