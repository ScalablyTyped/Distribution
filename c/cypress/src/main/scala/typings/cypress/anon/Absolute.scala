package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Absolute extends js.Object {
  /**
    * resolved filename of the spec
    */
  var absolute: String
  /**
    * filename like "spec.js"
    */
  var name: String
  /**
    * name relative to the project root, like "cypress/integration/spec.js"
    */
  var relative: String
}

object Absolute {
  @scala.inline
  def apply(absolute: String, name: String, relative: String): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
}

