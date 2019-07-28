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
    val __obj = js.Dynamic.literal(days = days, hours = hours, milliseconds = milliseconds, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[IDateJSLiteral]
  }
}

