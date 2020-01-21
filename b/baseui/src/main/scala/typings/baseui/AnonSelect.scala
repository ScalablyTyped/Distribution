package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelect extends js.Object {
  var Select: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonSelect {
  @scala.inline
  def apply(
    Select: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonSelect = {
    val __obj = js.Dynamic.literal()
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelect]
  }
}

