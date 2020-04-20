package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var prevSubject: Boolean | PrevSubject | js.Array[PrevSubject]
}

object CommandOptions {
  @scala.inline
  def apply(prevSubject: Boolean | PrevSubject | js.Array[PrevSubject]): CommandOptions = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

