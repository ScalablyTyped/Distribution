package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that check case sensitivity
  */
trait CaseMatchable extends js.Object {
  /**
    * Check case sensitivity
    *
    * @default true
    */
  var matchCase: Boolean
}

object CaseMatchable {
  @scala.inline
  def apply(matchCase: Boolean): CaseMatchable = {
    val __obj = js.Dynamic.literal(matchCase = matchCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseMatchable]
  }
}

