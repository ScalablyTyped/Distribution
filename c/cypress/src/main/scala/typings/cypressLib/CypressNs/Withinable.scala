package typings
package cypressLib.CypressNs

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
  var withinSubject: cypressLib.JQuery[stdLib.HTMLElement] | stdLib.HTMLElement | scala.Null
}

object Withinable {
  @scala.inline
  def apply(withinSubject: cypressLib.JQuery[stdLib.HTMLElement] | stdLib.HTMLElement = null): Withinable = {
    val __obj = js.Dynamic.literal()
    if (withinSubject != null) __obj.updateDynamic("withinSubject")(withinSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Withinable]
  }
}

