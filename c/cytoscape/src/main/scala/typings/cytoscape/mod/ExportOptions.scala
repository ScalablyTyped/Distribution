package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/export
  */
trait ExportOptions extends js.Object {
  /**
    * The background colour of the image (transparent by default).
    */
  var bg: js.UndefOr[String] = js.undefined
  /**
    * Whether to export the current viewport view (false, default) or the entire graph (true).
    */
  var full: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the scale automatically in combination with maxWidth such that the resultant image is no taller than maxHeight.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the scale automatically in combination with maxHeight such that the resultant image is no wider than maxWidth.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * This value specifies a positive number that scales the size of the resultant image.
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object ExportOptions {
  @scala.inline
  def apply(
    bg: String = null,
    full: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
}

