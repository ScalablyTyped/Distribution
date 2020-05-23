package typings.cypress.commonMod

import typings.cypress.Mocha
import typings.cypress.Mocha.MochaGlobals
import typings.cypress.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha/lib/interfaces/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(suites: js.Array[Suite], context: MochaGlobals, mocha: Mocha): CommonFunctions = js.native
}

