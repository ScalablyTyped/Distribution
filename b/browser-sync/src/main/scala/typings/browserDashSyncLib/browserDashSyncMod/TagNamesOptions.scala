package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagNamesOptions extends js.Object {
  var css: js.UndefOr[java.lang.String] = js.undefined
  var gif: js.UndefOr[java.lang.String] = js.undefined
  var jpeg: js.UndefOr[java.lang.String] = js.undefined
  var jpg: js.UndefOr[java.lang.String] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[java.lang.String] = js.undefined
  var less: js.UndefOr[java.lang.String] = js.undefined
  var png: js.UndefOr[java.lang.String] = js.undefined
  var scss: js.UndefOr[java.lang.String] = js.undefined
  var svg: js.UndefOr[java.lang.String] = js.undefined
}

object TagNamesOptions {
  @scala.inline
  def apply(
    css: java.lang.String = null,
    gif: java.lang.String = null,
    jpeg: java.lang.String = null,
    jpg: java.lang.String = null,
    js_ : java.lang.String = null,
    less: java.lang.String = null,
    png: java.lang.String = null,
    scss: java.lang.String = null,
    svg: java.lang.String = null
  ): TagNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css)
    if (gif != null) __obj.updateDynamic("gif")(gif)
    if (jpeg != null) __obj.updateDynamic("jpeg")(jpeg)
    if (jpg != null) __obj.updateDynamic("jpg")(jpg)
    if (js_ != null) __obj.updateDynamic("js")(js_)
    if (less != null) __obj.updateDynamic("less")(less)
    if (png != null) __obj.updateDynamic("png")(png)
    if (scss != null) __obj.updateDynamic("scss")(scss)
    if (svg != null) __obj.updateDynamic("svg")(svg)
    __obj.asInstanceOf[TagNamesOptions]
  }
}

