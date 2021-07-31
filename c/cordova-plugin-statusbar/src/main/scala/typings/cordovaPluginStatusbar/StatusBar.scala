package typings.cordovaPluginStatusbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* The StatusBar object provides some functions to customize the iOS and Android StatusBar.
*/
trait StatusBar extends StObject {
  
  /**
    * Sets the background color of the statusbar by a hex string.
    *
    * @param color - CSS shorthand properties are also supported.
    *                On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false, you can set the background color of the statusbar by a hex string (#RRGGBB).
    *                On WP7 and WP8 you can also specify values as #AARRGGBB, where AA is an alpha value
    */
  def backgroundColorByHexString(color: String): Unit
  
  /**
    * On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false,
    * you can set the background color of the statusbar by color name.
    *
    * @param color - Supported color names are:
    *                black, darkGray, lightGray, white, gray, red, green, blue, cyan, yellow, magenta, orange, purple, brown
    */
  def backgroundColorByName(color: String): Unit
  
  /**
    * Hide the statusbar.
    */
  def hide(): Unit
  
  /**
    * Read this property to see if the statusbar is visible or not.
    */
  var isVisible: Boolean
  
  /**
    * On iOS 7, make the statusbar overlay or not overlay the WebView.
    * 
    * @param isOverlay - On iOS 7, set to false to make the statusbar appear like iOS 6.
    *                    Set the style and background color to suit using the other functions.
    */
  def overlaysWebView(isOverlay: Boolean): Unit
  
  /**
    * Show the statusbar.
    */
  def show(): Unit
  
  /**
    * Use the blackOpaque statusbar (light text, for dark backgrounds).
    */
  def styleBlackOpaque(): Unit
  
  /**
    * Use the blackTranslucent statusbar (light text, for dark backgrounds).
    */
  def styleBlackTranslucent(): Unit
  
  /**
    * Use the default statusbar (dark text, for light backgrounds).
    */
  def styleDefault(): Unit
  
  /**
    * Use the lightContent statusbar (light text, for dark backgrounds).
    */
  def styleLightContent(): Unit
}
object StatusBar {
  
  @scala.inline
  def apply(
    backgroundColorByHexString: String => Unit,
    backgroundColorByName: String => Unit,
    hide: () => Unit,
    isVisible: Boolean,
    overlaysWebView: Boolean => Unit,
    show: () => Unit,
    styleBlackOpaque: () => Unit,
    styleBlackTranslucent: () => Unit,
    styleDefault: () => Unit,
    styleLightContent: () => Unit
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1(backgroundColorByHexString), backgroundColorByName = js.Any.fromFunction1(backgroundColorByName), hide = js.Any.fromFunction0(hide), isVisible = isVisible.asInstanceOf[js.Any], overlaysWebView = js.Any.fromFunction1(overlaysWebView), show = js.Any.fromFunction0(show), styleBlackOpaque = js.Any.fromFunction0(styleBlackOpaque), styleBlackTranslucent = js.Any.fromFunction0(styleBlackTranslucent), styleDefault = js.Any.fromFunction0(styleDefault), styleLightContent = js.Any.fromFunction0(styleLightContent))
    __obj.asInstanceOf[StatusBar]
  }
  
  @scala.inline
  implicit class StatusBarMutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorByHexString(value: String => Unit): Self = StObject.set(x, "backgroundColorByHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColorByName(value: String => Unit): Self = StObject.set(x, "backgroundColorByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysWebView(value: Boolean => Unit): Self = StObject.set(x, "overlaysWebView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyleBlackOpaque(value: () => Unit): Self = StObject.set(x, "styleBlackOpaque", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyleBlackTranslucent(value: () => Unit): Self = StObject.set(x, "styleBlackTranslucent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyleDefault(value: () => Unit): Self = StObject.set(x, "styleDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyleLightContent(value: () => Unit): Self = StObject.set(x, "styleLightContent", js.Any.fromFunction0(value))
  }
}
