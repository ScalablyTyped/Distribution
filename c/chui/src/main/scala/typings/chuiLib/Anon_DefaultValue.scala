package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: scala.Double
  var end: scala.Double
  var start: scala.Double
}

object Anon_DefaultValue {
  @scala.inline
  def apply(defaultValue: scala.Double, end: scala.Double, start: scala.Double): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

