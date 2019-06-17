package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmptyState extends js.Object {
  var EmptyState: js.UndefOr[Override[_]] = js.undefined
  var List: js.UndefOr[Override[_]] = js.undefined
  var Option: js.UndefOr[Override[_]] = js.undefined
}

object Anon_EmptyState {
  @scala.inline
  def apply(EmptyState: Override[_] = null, List: Override[_] = null, Option: Override[_] = null): Anon_EmptyState = {
    val __obj = js.Dynamic.literal()
    if (EmptyState != null) __obj.updateDynamic("EmptyState")(EmptyState.asInstanceOf[js.Any])
    if (List != null) __obj.updateDynamic("List")(List.asInstanceOf[js.Any])
    if (Option != null) __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmptyState]
  }
}

