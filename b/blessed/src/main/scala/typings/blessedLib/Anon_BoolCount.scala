package typings
package blessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolCount extends js.Object {
  var boolCount: scala.Double
  var dataSize: scala.Double
  var headerSize: scala.Double
  var lastStrTableOffset: scala.Double
  var numCount: scala.Double
  var strCount: scala.Double
  var strTableSize: scala.Double
}

object Anon_BoolCount {
  @scala.inline
  def apply(
    boolCount: scala.Double,
    dataSize: scala.Double,
    headerSize: scala.Double,
    lastStrTableOffset: scala.Double,
    numCount: scala.Double,
    strCount: scala.Double,
    strTableSize: scala.Double
  ): Anon_BoolCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolCount")(boolCount)
    __obj.updateDynamic("dataSize")(dataSize)
    __obj.updateDynamic("headerSize")(headerSize)
    __obj.updateDynamic("lastStrTableOffset")(lastStrTableOffset)
    __obj.updateDynamic("numCount")(numCount)
    __obj.updateDynamic("strCount")(strCount)
    __obj.updateDynamic("strTableSize")(strTableSize)
    __obj.asInstanceOf[Anon_BoolCount]
  }
}

