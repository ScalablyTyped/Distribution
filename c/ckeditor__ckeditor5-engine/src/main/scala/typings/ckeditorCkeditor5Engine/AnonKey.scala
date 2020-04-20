package typings.ckeditorCkeditor5Engine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var name: String
  var value: String | RegExp | js.Function
}

object AnonKey {
  @scala.inline
  def apply(key: String, name: String, value: String | RegExp | js.Function): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

