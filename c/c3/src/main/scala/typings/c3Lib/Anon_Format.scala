package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  /**
    * Set formatter for the label on each donut piece.
    */
  var format: js.UndefOr[
    js.Function3[
      /* value */ scala.Double, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Show or hide label on each donut piece.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set threshold to show/hide labels.
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: js.Function3[
      /* value */ scala.Double, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      java.lang.String
    ] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

