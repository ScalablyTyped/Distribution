package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Context via RenderProps
trait ProviderProps[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var value: T
}

object ProviderProps {
  @scala.inline
  def apply[T](value: T, children: js.UndefOr[Null | ReactNode] = js.undefined): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

