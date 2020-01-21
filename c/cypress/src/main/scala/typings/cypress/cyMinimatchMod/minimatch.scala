package typings.cypress.cyMinimatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress/types/cy-minimatch", "minimatch")
@js.native
object minimatch extends js.Object {
  def apply(target: String, pattern: String): Boolean = js.native
  def apply(target: String, pattern: String, options: MinimatchOptions): Boolean = js.native
}

