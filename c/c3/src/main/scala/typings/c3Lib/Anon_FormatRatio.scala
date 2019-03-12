package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatRatio extends js.Object {
  /**
    * Set formatter for the label on gauge.
    */
  var format: js.UndefOr[js.Function2[/* value */ js.Any, /* ratio */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Show or hide label on gauge.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FormatRatio {
  @scala.inline
  def apply(
    format: (/* value */ js.Any, /* ratio */ scala.Double) => java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FormatRatio = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_FormatRatio]
  }
}

