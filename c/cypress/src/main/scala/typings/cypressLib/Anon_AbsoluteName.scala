package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsoluteName extends js.Object {
  /**
    * resolved filename of the spec
    */
  var absolute: java.lang.String
  /**
    * filename like "spec.js"
    */
  var name: java.lang.String
  /**
    * name relative to the project root, like "cypress/integration/spec.js"
    */
  var relative: java.lang.String
}

object Anon_AbsoluteName {
  @scala.inline
  def apply(absolute: java.lang.String, name: java.lang.String, relative: java.lang.String): Anon_AbsoluteName = {
    val __obj = js.Dynamic.literal(absolute = absolute, name = name, relative = relative)
  
    __obj.asInstanceOf[Anon_AbsoluteName]
  }
}

