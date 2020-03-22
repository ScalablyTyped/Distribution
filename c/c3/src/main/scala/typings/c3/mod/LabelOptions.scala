package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  /**
    * Set formatter for the label on each pie piece.
    */
  var format: js.UndefOr[
    js.Function3[/* value */ Double, /* ratio */ Double, /* id */ String, String | Double]
  ] = js.undefined
  /**
    * Show or hide label on each pie piece.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    format: (/* value */ Double, /* ratio */ Double, /* id */ String) => String | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

