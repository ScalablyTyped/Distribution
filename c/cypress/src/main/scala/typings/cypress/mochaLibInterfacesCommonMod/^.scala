package typings.cypress.mochaLibInterfacesCommonMod

import typings.cypress.Mocha
import typings.cypress.MochaNs.MochaGlobals
import typings.cypress.MochaNs.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha/lib/interfaces/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(suites: js.Array[Suite], context: MochaGlobals, mocha: Mocha): CommonFunctions = js.native
}

