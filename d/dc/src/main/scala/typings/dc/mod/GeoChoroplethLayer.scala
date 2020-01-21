package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChoroplethLayer extends js.Object {
  var data: js.Any = js.native
  @JSName("keyAccessor")
  var keyAccessor_Original: Accessor[_, _] = js.native
  var name: String = js.native
  def keyAccessor(datum: js.Any): js.Any = js.native
  def keyAccessor(datum: js.Any, index: Double): js.Any = js.native
}

