package typings.cassandraDashDriver

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: Date
  var ticks: Double
}

object Anon_Date {
  @scala.inline
  def apply(date: Date, ticks: Double): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

