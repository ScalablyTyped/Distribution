package typings.cypress.sinonMod

import typings.cypress.Anon3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: Anon3
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: Anon3): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegacySandbox]
  }
}

