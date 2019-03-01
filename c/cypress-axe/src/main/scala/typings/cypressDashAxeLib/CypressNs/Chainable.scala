package typings
package cypressDashAxeLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chainable[Subject] extends js.Object {
  def checkA11y(): scala.Unit
  def injectAxe(): scala.Unit
}

object Chainable {
  @scala.inline
  def apply[Subject](checkA11y: js.Function0[scala.Unit], injectAxe: js.Function0[scala.Unit]): Chainable[Subject] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkA11y")(checkA11y)
    __obj.updateDynamic("injectAxe")(injectAxe)
    __obj.asInstanceOf[Chainable[Subject]]
  }
}

