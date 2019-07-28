package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Absolute extends js.Object {
  // "cypress/integration/config_passing_spec.coffee"
  var absolute: String | Null
  var name: String
  // "config_passing_spec.coffee"
  var relative: String | Null
}

object Anon_Absolute {
  @scala.inline
  def apply(name: String, absolute: String = null, relative: String = null): Anon_Absolute = {
    val __obj = js.Dynamic.literal(name = name)
    if (absolute != null) __obj.updateDynamic("absolute")(absolute)
    if (relative != null) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[Anon_Absolute]
  }
}

