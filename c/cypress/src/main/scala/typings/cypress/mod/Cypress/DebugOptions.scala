package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugOptions extends js.Object {
  var verbose: Boolean
}

object DebugOptions {
  @scala.inline
  def apply(verbose: Boolean): DebugOptions = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugOptions]
  }
}

