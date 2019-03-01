package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Absolute extends js.Object {
  // "cypress/integration/config_passing_spec.coffee"
  var absolute: java.lang.String | scala.Null
  var name: java.lang.String
  // "config_passing_spec.coffee"
  var relative: java.lang.String | scala.Null
}

object Anon_Absolute {
  @scala.inline
  def apply(name: java.lang.String, absolute: java.lang.String = null, relative: java.lang.String = null): Anon_Absolute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (absolute != null) __obj.updateDynamic("absolute")(absolute)
    if (relative != null) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[Anon_Absolute]
  }
}

