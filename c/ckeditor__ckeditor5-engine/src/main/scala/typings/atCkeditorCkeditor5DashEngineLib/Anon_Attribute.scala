package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: scala.Boolean
}

object Anon_Attribute {
  @scala.inline
  def apply(name: scala.Boolean, attribute: js.Array[java.lang.String] = null): Anon_Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

