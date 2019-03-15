package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends js.Object {
  /**
    * Background color using hex notation, defaults to '#ffffff'.
    */
  var bgcolor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * App window height in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * App window left offset in pixels.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * App window top offset in pixels.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    * App window width in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    bgcolor: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

