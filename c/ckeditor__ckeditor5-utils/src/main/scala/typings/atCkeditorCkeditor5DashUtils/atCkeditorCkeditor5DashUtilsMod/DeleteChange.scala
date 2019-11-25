package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChange extends js.Object {
  var howMany: Double
  var index: Double
  var `type`: delete
}

object DeleteChange {
  @scala.inline
  def apply(howMany: Double, index: Double, `type`: delete): DeleteChange = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChange]
  }
}

