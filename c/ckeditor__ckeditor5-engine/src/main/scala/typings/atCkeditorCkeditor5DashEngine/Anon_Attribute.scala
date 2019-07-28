package typings.atCkeditorCkeditor5DashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: js.UndefOr[js.Array[String]] = js.undefined
  var name: Boolean
}

object Anon_Attribute {
  @scala.inline
  def apply(name: Boolean, attribute: js.Array[String] = null): Anon_Attribute = {
    val __obj = js.Dynamic.literal(name = name)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

