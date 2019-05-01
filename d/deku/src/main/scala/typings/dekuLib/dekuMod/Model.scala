package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var dispatch: js.UndefOr[Dispatch] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    context: js.Any = null,
    dispatch: Dispatch = null,
    path: java.lang.String = null,
    props: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (context != null) __obj.updateDynamic("context")(context)
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch)
    if (path != null) __obj.updateDynamic("path")(path)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Model]
  }
}

