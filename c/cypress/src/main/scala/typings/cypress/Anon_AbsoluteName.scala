package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsoluteName extends js.Object {
  // "cypress/integration/config_passing_spec.coffee"
  var absolute: String | Null
  var name: String
  // "config_passing_spec.coffee"
  var relative: String | Null
}

object Anon_AbsoluteName {
  @scala.inline
  def apply(name: String, absolute: String = null, relative: String = null): Anon_AbsoluteName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (absolute != null) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AbsoluteName]
  }
}

