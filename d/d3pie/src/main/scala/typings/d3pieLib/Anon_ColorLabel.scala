package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLabel extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var value: scala.Double
}

object Anon_ColorLabel {
  @scala.inline
  def apply(label: java.lang.String, value: scala.Double, color: java.lang.String = null): Anon_ColorLabel = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_ColorLabel]
  }
}

