package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var name: java.lang.String
  var value: java.lang.String | stdLib.RegExp | js.Function
}

object Anon_Key {
  @scala.inline
  def apply(
    key: java.lang.String,
    name: java.lang.String,
    value: java.lang.String | stdLib.RegExp | js.Function
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

