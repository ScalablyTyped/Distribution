package typings.cypress.sinonMod

import typings.cypress.AnonConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: AnonConfig
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: AnonConfig): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegacySandbox]
  }
}

