package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var Cell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonCell {
  @scala.inline
  def apply(
    Cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonCell = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

