package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Select extends js.Object {
  var Select: js.UndefOr[Override[_]] = js.undefined
}

object Anon_Select {
  @scala.inline
  def apply(Select: Override[_] = null): Anon_Select = {
    val __obj = js.Dynamic.literal()
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Select]
  }
}

