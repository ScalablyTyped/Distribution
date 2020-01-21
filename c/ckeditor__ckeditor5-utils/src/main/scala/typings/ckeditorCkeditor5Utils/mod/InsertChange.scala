package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertChange extends js.Object {
  var index: Double
  var `type`: insert
  var values: js.Array[String]
}

object InsertChange {
  @scala.inline
  def apply(index: Double, `type`: insert, values: js.Array[String]): InsertChange = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertChange]
  }
}

