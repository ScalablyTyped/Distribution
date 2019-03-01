package typings
package cordovaDashPluginDashStatusbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* The StatusBar object provides some functions to customize the iOS and Android StatusBar.
*/
trait StatusBar extends js.Object {
  /**
    * Read this property to see if the statusbar is visible or not.
    */
  var isVisible: scala.Boolean
  /**
    * Sets the background color of the statusbar by a hex string.
    * @param color             CSS shorthand properties are also supported.
    *                              On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false, you can set the background color of the statusbar by a hex string (#RRGGBB).
    *                              On WP7 and WP8 you can also specify values as #AARRGGBB, where AA is an alpha value
    */
  def backgroundColorByHexString(color: java.lang.String): scala.Unit
  /**
    * On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false,
    * you can set the background color of the statusbar by color name.
    * @param color             Supported color names are:
    *                              black, darkGray, lightGray, white, gray, red, green, blue, cyan, yellow, magenta, orange, purple, brown
    */
  def backgroundColorByName(color: java.lang.String): scala.Unit
  /**
    * Hide the statusbar.
    */
  def hide(): scala.Unit
  /**
    * On iOS 7, make the statusbar overlay or not overlay the WebView.
    * @param isOverlay         On iOS 7, set to false to make the statusbar appear like iOS 6.
    *                              Set the style and background color to suit using the other functions.
    */
  def overlaysWebView(isOverlay: scala.Boolean): scala.Unit
  /**
    * Show the statusbar.
    */
  def show(): scala.Unit
  /**
    * Use the blackOpaque statusbar (light text, for dark backgrounds).
    */
  def styleBlackOpaque(): scala.Unit
  /**
    * Use the blackTranslucent statusbar (light text, for dark backgrounds).
    */
  def styleBlackTranslucent(): scala.Unit
  /**
    * Use the default statusbar (dark text, for light backgrounds).
    */
  def styleDefault(): scala.Unit
  /**
    * Use the lightContent statusbar (light text, for dark backgrounds).
    */
  def styleLightContent(): scala.Unit
}

object StatusBar {
  @scala.inline
  def apply(
    backgroundColorByHexString: js.Function1[java.lang.String, scala.Unit],
    backgroundColorByName: js.Function1[java.lang.String, scala.Unit],
    hide: js.Function0[scala.Unit],
    isVisible: scala.Boolean,
    overlaysWebView: js.Function1[scala.Boolean, scala.Unit],
    show: js.Function0[scala.Unit],
    styleBlackOpaque: js.Function0[scala.Unit],
    styleBlackTranslucent: js.Function0[scala.Unit],
    styleDefault: js.Function0[scala.Unit],
    styleLightContent: js.Function0[scala.Unit]
  ): StatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColorByHexString")(backgroundColorByHexString)
    __obj.updateDynamic("backgroundColorByName")(backgroundColorByName)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("overlaysWebView")(overlaysWebView)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("styleBlackOpaque")(styleBlackOpaque)
    __obj.updateDynamic("styleBlackTranslucent")(styleBlackTranslucent)
    __obj.updateDynamic("styleDefault")(styleDefault)
    __obj.updateDynamic("styleLightContent")(styleLightContent)
    __obj.asInstanceOf[StatusBar]
  }
}

