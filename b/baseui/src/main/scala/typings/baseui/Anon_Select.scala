package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Select extends js.Object {
  var Select: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object Anon_Select {
  @scala.inline
  def apply(
    Select: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): Anon_Select = {
    val __obj = js.Dynamic.literal()
    if (Select != null) __obj.updateDynamic("Select")(Select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Select]
  }
}

