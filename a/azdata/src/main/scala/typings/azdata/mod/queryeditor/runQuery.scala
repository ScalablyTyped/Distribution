package typings.azdata.mod.queryeditor

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "queryeditor.runQuery")
@js.native
object runQuery extends js.Object {
  def apply(fileUri: String): Unit = js.native
  def apply(fileUri: String, options: Map[String, String]): Unit = js.native
  def apply(fileUri: String, options: Map[String, String], runCurrentQuery: Boolean): Unit = js.native
}

