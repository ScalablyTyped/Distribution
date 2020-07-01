package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Absolute extends js.Object {
  // "cypress/integration/config_passing_spec.coffee" or "__all" if clicked all specs button
  var absolute: String
  var name: String
  // "config_passing_spec.coffee"
  var relative: String
}

object Absolute {
  @scala.inline
  def apply(absolute: String, name: String, relative: String): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
}

