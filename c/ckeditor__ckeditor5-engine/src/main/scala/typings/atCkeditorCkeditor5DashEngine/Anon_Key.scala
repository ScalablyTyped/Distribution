package typings.atCkeditorCkeditor5DashEngine

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var name: String
  var value: String | RegExp | js.Function
}

object Anon_Key {
  @scala.inline
  def apply(key: String, name: String, value: String | RegExp | js.Function): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, name = name, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

