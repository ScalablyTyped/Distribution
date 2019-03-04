package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: stdLib.Date
  var ticks: scala.Double
}

object Anon_Date {
  @scala.inline
  def apply(date: stdLib.Date, ticks: scala.Double): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date, ticks = ticks)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

