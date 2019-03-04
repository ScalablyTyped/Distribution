package typings
package datejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a structure to be used in the add and set instance methods */
trait IDateJSLiteral extends js.Object {
  var days: scala.Double
  var hours: scala.Double
  var milliseconds: scala.Double
  var minutes: scala.Double
  var months: scala.Double
  var seconds: scala.Double
  var years: scala.Double
}

object IDateJSLiteral {
  @scala.inline
  def apply(
    days: scala.Double,
    hours: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    months: scala.Double,
    seconds: scala.Double,
    years: scala.Double
  ): IDateJSLiteral = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, milliseconds = milliseconds, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[IDateJSLiteral]
  }
}

