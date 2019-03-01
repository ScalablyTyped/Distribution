package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var abbr: java.lang.String
  var isdst: scala.Boolean
  var name: java.lang.String
  var offset: scala.Double
  var text: java.lang.String
  var utc: js.Array[java.lang.String]
}

object Timezone {
  @scala.inline
  def apply(
    abbr: java.lang.String,
    isdst: scala.Boolean,
    name: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    utc: js.Array[java.lang.String]
  ): Timezone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbr")(abbr)
    __obj.updateDynamic("isdst")(isdst)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("utc")(utc)
    __obj.asInstanceOf[Timezone]
  }
}

