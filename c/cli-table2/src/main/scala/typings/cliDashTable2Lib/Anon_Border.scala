package typings
package cliDashTable2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Border extends js.Object {
  var border: js.Array[java.lang.String]
  var compact: scala.Boolean
  var head: js.Array[java.lang.String]
  var `padding-left`: scala.Double
  var `padding-right`: scala.Double
}

object Anon_Border {
  @scala.inline
  def apply(
    border: js.Array[java.lang.String],
    compact: scala.Boolean,
    head: js.Array[java.lang.String],
    `padding-left`: scala.Double,
    `padding-right`: scala.Double
  ): Anon_Border = {
    val __obj = js.Dynamic.literal(`padding-left` = `padding-left`, `padding-right` = `padding-right`)
    __obj.updateDynamic("border")(border)
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[Anon_Border]
  }
}

