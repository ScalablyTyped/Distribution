package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLabel extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var label: String
  var value: Double
}

object Anon_ColorLabel {
  @scala.inline
  def apply(label: String, value: Double, color: String = null): Anon_ColorLabel = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_ColorLabel]
  }
}

