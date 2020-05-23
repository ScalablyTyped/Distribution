package typings.cypress.minimatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress/types/minimatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Minimatch: IMinimatchStatic = js.native
  def apply(target: String, pattern: String): Boolean = js.native
  def apply(target: String, pattern: String, options: IOptions): Boolean = js.native
}

