package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printers extends js.Object {
  def filter(filter: js.Any): String = js.native
  def filter(filter: js.Array[_]): String = js.native
  def filter(filter: js.Function1[/* filters */ js.Array[_], String]): String = js.native
  def filters(filters: js.Array[_]): String = js.native
}

