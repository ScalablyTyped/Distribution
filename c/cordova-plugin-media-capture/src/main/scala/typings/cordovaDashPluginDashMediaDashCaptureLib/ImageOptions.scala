package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates image capture configuration options. */
trait ImageOptions extends js.Object {
  /**
    * The maximum number of images the user can capture in a single capture operation.
    * The value must be greater than or equal to 1 (defaults to 1).
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

