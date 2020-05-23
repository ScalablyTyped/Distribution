package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  // "cypress/integration/config_passing_spec.coffee"
  var absolute: String | Null
  var name: String
  // "config_passing_spec.coffee"
  var relative: String | Null
}

object Name {
  @scala.inline
  def apply(name: String, absolute: String = null, relative: String = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], absolute = absolute.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

