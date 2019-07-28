package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsoluteName extends js.Object {
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

object Anon_AbsoluteName {
  @scala.inline
  def apply(absolute: String, name: String, relative: String): Anon_AbsoluteName = {
    val __obj = js.Dynamic.literal(absolute = absolute, name = name, relative = relative)
  
    __obj.asInstanceOf[Anon_AbsoluteName]
  }
}

