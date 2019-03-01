package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertChange extends js.Object {
  var index: scala.Double
  var `type`: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsLibStrings.insert
  var values: js.Array[java.lang.String]
}

object InsertChange {
  @scala.inline
  def apply(
    index: scala.Double,
    `type`: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsLibStrings.insert,
    values: js.Array[java.lang.String]
  ): InsertChange = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[InsertChange]
  }
}

