package typings.cliff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cliff", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def inspect(obj: js.Any): String = js.native
  def putObject(level: String, `object`: js.Any): Unit = js.native
  def putObject(level: String, `object`: js.Any, rewriters: js.Any): Unit = js.native
  def putObject(level: String, `object`: js.Any, rewriters: js.Any, padding: js.Any): Unit = js.native
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String]): Unit = js.native
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): Unit = js.native
  def putRows(level: String, rows: js.Array[js.Array[String]]): Unit = js.native
  def putRows(level: String, rows: js.Array[js.Array[String]], colors: js.Array[String]): Unit = js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String]): String = js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): String = js.native
  def stringifyRows(rows: js.Array[js.Array[String]]): String = js.native
  def stringifyRows(rows: js.Array[js.Array[String]], colors: js.Array[String]): String = js.native
}

