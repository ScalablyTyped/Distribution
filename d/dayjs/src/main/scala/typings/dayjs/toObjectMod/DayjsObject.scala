package typings.dayjs.toObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayjsObject extends js.Object {
  var date: Double
  var hours: Double
  var milliseconds: Double
  var minutes: Double
  var months: Double
  var seconds: Double
  var years: Double
}

object DayjsObject {
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): DayjsObject = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DayjsObject]
  }
}

