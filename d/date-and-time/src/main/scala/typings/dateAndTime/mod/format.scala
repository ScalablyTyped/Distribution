package typings.dateAndTime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-and-time", "format")
@js.native
object format extends js.Object {
  
  def apply(dateObj: Date, formatString: String): String = js.native
  def apply(dateObj: Date, formatString: String, utc: Boolean): String = js.native
  def apply(dateObj: Date, formatString: js.Array[String]): String = js.native
  def apply(dateObj: Date, formatString: js.Array[String], utc: Boolean): String = js.native
}
