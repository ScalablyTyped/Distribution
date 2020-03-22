package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrid extends js.Object {
  var Grid: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonGrid {
  @scala.inline
  def apply(
    Grid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonGrid = {
    val __obj = js.Dynamic.literal()
    if (Grid != null) __obj.updateDynamic("Grid")(Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrid]
  }
}

