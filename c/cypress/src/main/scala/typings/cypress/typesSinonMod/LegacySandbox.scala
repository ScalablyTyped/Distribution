package typings.cypress.typesSinonMod

import typings.cypress.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySandbox extends js.Object {
  var sandbox: Anon_Config
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: Anon_Config): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox)
  
    __obj.asInstanceOf[LegacySandbox]
  }
}

