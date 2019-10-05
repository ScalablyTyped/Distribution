package typings.bootstrapDashMaxlength.BootstrapMaxlength

import typings.std.Number
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
  var bottom: js.UndefOr[Number | String] = js.undefined
  /**
    * The left position of the counter (Number of pixels, or a px or percent string)
    */
  var left: js.UndefOr[Number | String] = js.undefined
  /**
    * The positioning to use. For example 'relative', 'absolute'
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The right position of the counter (Number of pixels, or a px or percent string)
    */
  var right: js.UndefOr[Number | String] = js.undefined
  /**
    * The top position of the counter (Number of pixels, or a px or percent string)
    */
  var top: js.UndefOr[Number | String] = js.undefined
}

object PlacementOptions {
  @scala.inline
  def apply(
    bottom: Number | String = null,
    left: Number | String = null,
    position: String = null,
    right: Number | String = null,
    top: Number | String = null
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

