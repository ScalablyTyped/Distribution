package typings.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var dispatch: js.UndefOr[Dispatch] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    context: js.Any = null,
    dispatch: /* action */ js.Any => js.Any = null,
    path: String = null,
    props: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1(dispatch))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

