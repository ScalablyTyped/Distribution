package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  /**
    * Set formatter for the label on each donut piece.
    */
  var format: js.UndefOr[js.Function3[/* value */ Double, /* ratio */ Double, /* id */ String, String]] = js.undefined
  /**
    * Show or hide label on each donut piece.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Set threshold to show/hide labels.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: (/* value */ Double, /* ratio */ Double, /* id */ String) => String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

