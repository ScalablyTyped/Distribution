package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChange extends js.Object {
  var howMany: scala.Double
  var index: scala.Double
  var `type`: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsLibStrings.delete
}

object DeleteChange {
  @scala.inline
  def apply(
    howMany: scala.Double,
    index: scala.Double,
    `type`: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsLibStrings.delete
  ): DeleteChange = {
    val __obj = js.Dynamic.literal(howMany = howMany, index = index)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeleteChange]
  }
}

