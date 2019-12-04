package typings.baseui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: Date | js.Array[Date]
}

object Anon_Date {
  @scala.inline
  def apply(date: Date | js.Array[Date]): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

