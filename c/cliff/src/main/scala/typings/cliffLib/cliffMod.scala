package typings
package cliffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cliff", JSImport.Namespace)
@js.native
object cliffMod extends js.Object {
  def inspect(obj: js.Any): java.lang.String = js.native
  def putObject(level: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def putObject(level: java.lang.String, `object`: js.Any, rewriters: js.Any): scala.Unit = js.native
  def putObject(level: java.lang.String, `object`: js.Any, rewriters: js.Any, padding: js.Any): scala.Unit = js.native
  def putObjectRows(level: java.lang.String, rows: js.Array[js.Object], keys: js.Array[java.lang.String]): scala.Unit = js.native
  def putObjectRows(
    level: java.lang.String,
    rows: js.Array[js.Object],
    keys: js.Array[java.lang.String],
    colors: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def putRows(level: java.lang.String, rows: js.Array[js.Array[java.lang.String]]): scala.Unit = js.native
  def putRows(
    level: java.lang.String,
    rows: js.Array[js.Array[java.lang.String]],
    colors: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[java.lang.String]): java.lang.String = js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[java.lang.String], colors: js.Array[java.lang.String]): java.lang.String = js.native
  def stringifyRows(rows: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  def stringifyRows(rows: js.Array[js.Array[java.lang.String]], colors: js.Array[java.lang.String]): java.lang.String = js.native
}

