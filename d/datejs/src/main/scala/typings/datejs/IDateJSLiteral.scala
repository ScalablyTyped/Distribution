package typings.datejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a structure to be used in the add and set instance methods */
trait IDateJSLiteral extends js.Object {
  var days: Double
  var hours: Double
  var milliseconds: Double
  var minutes: Double
  var months: Double
  var seconds: Double
  var years: Double
}

object IDateJSLiteral {
  @scala.inline
  def apply(
    days: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): IDateJSLiteral = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateJSLiteral]
  }
}

