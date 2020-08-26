package typings.cordovaPluginStatusbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* The StatusBar object provides some functions to customize the iOS and Android StatusBar.
*/
@js.native
trait StatusBar extends js.Object {
  /**
    * Read this property to see if the statusbar is visible or not.
    */
  var isVisible: Boolean = js.native
  /**
    * Sets the background color of the statusbar by a hex string.
    *
    * @param color - CSS shorthand properties are also supported.
    *                On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false, you can set the background color of the statusbar by a hex string (#RRGGBB).
    *                On WP7 and WP8 you can also specify values as #AARRGGBB, where AA is an alpha value
    */
  def backgroundColorByHexString(color: String): Unit = js.native
  /**
    * On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false,
    * you can set the background color of the statusbar by color name.
    *
    * @param color - Supported color names are:
    *                black, darkGray, lightGray, white, gray, red, green, blue, cyan, yellow, magenta, orange, purple, brown
    */
  def backgroundColorByName(color: String): Unit = js.native
  /**
    * Hide the statusbar.
    */
  def hide(): Unit = js.native
  /**
    * On iOS 7, make the statusbar overlay or not overlay the WebView.
    * 
    * @param isOverlay - On iOS 7, set to false to make the statusbar appear like iOS 6.
    *                    Set the style and background color to suit using the other functions.
    */
  def overlaysWebView(isOverlay: Boolean): Unit = js.native
  /**
    * Show the statusbar.
    */
  def show(): Unit = js.native
  /**
    * Use the blackOpaque statusbar (light text, for dark backgrounds).
    */
  def styleBlackOpaque(): Unit = js.native
  /**
    * Use the blackTranslucent statusbar (light text, for dark backgrounds).
    */
  def styleBlackTranslucent(): Unit = js.native
  /**
    * Use the default statusbar (dark text, for light backgrounds).
    */
  def styleDefault(): Unit = js.native
  /**
    * Use the lightContent statusbar (light text, for dark backgrounds).
    */
  def styleLightContent(): Unit = js.native
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
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColorByHexString(value: String => Unit): Self = this.set("backgroundColorByHexString", js.Any.fromFunction1(value))
    @scala.inline
    def setBackgroundColorByName(value: String => Unit): Self = this.set("backgroundColorByName", js.Any.fromFunction1(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlaysWebView(value: Boolean => Unit): Self = this.set("overlaysWebView", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleBlackOpaque(value: () => Unit): Self = this.set("styleBlackOpaque", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleBlackTranslucent(value: () => Unit): Self = this.set("styleBlackTranslucent", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleDefault(value: () => Unit): Self = this.set("styleDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleLightContent(value: () => Unit): Self = this.set("styleLightContent", js.Any.fromFunction0(value))
  }
  
}

