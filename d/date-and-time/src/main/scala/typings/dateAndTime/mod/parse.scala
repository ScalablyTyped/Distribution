package typings.dateAndTime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-and-time", "parse")
@js.native
object parse extends js.Object {
  
  def apply(dateString: String, formatter: String): Date = js.native
  def apply(dateString: String, formatter: String, utc: Boolean): Date = js.native
  def apply(dateString: String, formatter: js.Array[String]): Date = js.native
  def apply(dateString: String, formatter: js.Array[String], utc: Boolean): Date = js.native
}
