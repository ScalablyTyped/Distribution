package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WForgottenReturn extends js.Object {
  /** Enables all warnings except forgotten return statements. */
  var wForgottenReturn: Boolean
}

object WForgottenReturn {
  @scala.inline
  def apply(wForgottenReturn: Boolean): WForgottenReturn = {
    val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WForgottenReturn]
  }
}

