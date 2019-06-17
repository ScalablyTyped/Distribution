package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: stdLib.Date | js.Array[stdLib.Date]
}

object Anon_Date {
  @scala.inline
  def apply(date: stdLib.Date | js.Array[stdLib.Date]): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

