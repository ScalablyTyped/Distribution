package typings
package bootstrapDashMaxlengthLib.BootstrapMaxlengthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible options for the position of the counter. (passed to $.fn.css)
  */
trait PlacementOptions extends js.Object {
  /**
    * The bottom position of the counter (Number of pixels, or a px or percent string)
    */
  var bottom: js.UndefOr[stdLib.Number | java.lang.String] = js.undefined
  /**
    * The left position of the counter (Number of pixels, or a px or percent string)
    */
  var left: js.UndefOr[stdLib.Number | java.lang.String] = js.undefined
  /**
    * The positioning to use. For example 'relative', 'absolute'
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The right position of the counter (Number of pixels, or a px or percent string)
    */
  var right: js.UndefOr[stdLib.Number | java.lang.String] = js.undefined
  /**
    * The top position of the counter (Number of pixels, or a px or percent string)
    */
  var top: js.UndefOr[stdLib.Number | java.lang.String] = js.undefined
}

object PlacementOptions {
  @scala.inline
  def apply(
    bottom: stdLib.Number | java.lang.String = null,
    left: stdLib.Number | java.lang.String = null,
    position: java.lang.String = null,
    right: stdLib.Number | java.lang.String = null,
    top: stdLib.Number | java.lang.String = null
  ): PlacementOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementOptions]
  }
}

