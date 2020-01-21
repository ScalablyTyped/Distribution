package typings.csvrow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csvrow", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def normalize(row: String): String = js.native
  def parse(row: String): js.Array[String] = js.native
  def stringify(columns: js.Array[String]): String = js.native
}

