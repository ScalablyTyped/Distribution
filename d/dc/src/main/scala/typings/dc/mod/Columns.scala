package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  @JSName("format")
  var format_Original: Accessor[_, String] = js.native
  var label: String = js.native
  def format(datum: js.Any): String = js.native
  def format(datum: js.Any, index: Double): String = js.native
}

