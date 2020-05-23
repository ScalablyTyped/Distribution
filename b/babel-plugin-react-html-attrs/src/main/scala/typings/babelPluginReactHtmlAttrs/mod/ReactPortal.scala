package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPortal
  extends ReactElement[js.Any, String | JSXElementConstructor[js.Any]] {
  var children: ReactNode
}

object ReactPortal {
  @scala.inline
  def apply(
    props: js.Any,
    `type`: String | JSXElementConstructor[js.Any],
    children: js.UndefOr[Null | ReactNode] = js.undefined,
    key: Key = null
  ): ReactPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
}

