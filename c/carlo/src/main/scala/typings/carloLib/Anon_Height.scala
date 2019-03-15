package typings
package carloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /**
    * Height in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Left offset in pixels.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * Top offset in pixels.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

