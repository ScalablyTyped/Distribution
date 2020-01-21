package typings.cypress.cypressMod.Cypress

import typings.cypress.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how a command behaves in the `within` scope.
  * These options will determine how nodes are selected.
  */
trait Withinable extends js.Object {
  /**
    * Element to search for children in. If null, search begins from root-level DOM element.
    *
    * @default depends on context, null if outside of within wrapper
    */
  var withinSubject: JQuery_[HTMLElement] | HTMLElement | Null
}

object Withinable {
  @scala.inline
  def apply(withinSubject: JQuery_[HTMLElement] | HTMLElement = null): Withinable = {
    val __obj = js.Dynamic.literal()
    if (withinSubject != null) __obj.updateDynamic("withinSubject")(withinSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Withinable]
  }
}

