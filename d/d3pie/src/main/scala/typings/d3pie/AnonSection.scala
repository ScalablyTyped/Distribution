package typings.d3pie

import typings.d3pie.d3pieStrings.inner
import typings.d3pie.d3pieStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSection extends js.Object {
  var label: String
  var section: outer | inner
  var value: Double
}

object AnonSection {
  @scala.inline
  def apply(label: String, section: outer | inner, value: Double): AnonSection = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSection]
  }
}

