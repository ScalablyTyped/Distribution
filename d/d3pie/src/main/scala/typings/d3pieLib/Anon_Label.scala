package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    percentage: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

