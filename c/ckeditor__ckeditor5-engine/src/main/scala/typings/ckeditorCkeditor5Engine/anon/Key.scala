package typings.ckeditorCkeditor5Engine.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var name: String
  var value: String | RegExp | js.Function
}

object Key {
  @scala.inline
  def apply(key: String, name: String, value: String | RegExp | js.Function): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

