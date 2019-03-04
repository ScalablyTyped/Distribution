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
    val __obj = js.Dynamic.literal(abbr = abbr, isdst = isdst, name = name, offset = offset, text = text, utc = utc)
  
    __obj.asInstanceOf[Timezone]
  }
}

