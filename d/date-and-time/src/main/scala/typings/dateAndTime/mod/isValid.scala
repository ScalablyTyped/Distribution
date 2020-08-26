package typings.dateAndTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-and-time", "isValid")
@js.native
object isValid extends js.Object {
  def apply(dateValue: String): Boolean = js.native
  def apply(dateValue: String, formatter: String): Boolean = js.native
  def apply(dateValue: String, formatter: js.Array[String]): Boolean = js.native
  def apply(dateValue: PreparseResult): Boolean = js.native
  def apply(dateValue: PreparseResult, formatter: String): Boolean = js.native
  def apply(dateValue: PreparseResult, formatter: js.Array[String]): Boolean = js.native
}

