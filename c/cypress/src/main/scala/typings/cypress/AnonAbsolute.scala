package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbsolute extends js.Object {
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

object AnonAbsolute {
  @scala.inline
  def apply(absolute: String, name: String, relative: String): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
}

