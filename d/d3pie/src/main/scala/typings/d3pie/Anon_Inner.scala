package typings.d3pie

import typings.d3pie.d3pieStrings.inner
import typings.d3pie.d3pieStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inner extends js.Object {
  var label: String
  var section: outer | inner
  var value: Double
}

object Anon_Inner {
  @scala.inline
  def apply(label: String, section: outer | inner, value: Double): Anon_Inner = {
    val __obj = js.Dynamic.literal(label = label, section = section.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Anon_Inner]
  }
}

