package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Element traversal options for dealing with Shadow DOM
  */
trait Shadow extends js.Object {
  /**
    * Include shadow DOM in search
    *
    * @default: false
    */
  var includeShadowDom: Boolean
}

object Shadow {
  @scala.inline
  def apply(includeShadowDom: Boolean): Shadow = {
    val __obj = js.Dynamic.literal(includeShadowDom = includeShadowDom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}

