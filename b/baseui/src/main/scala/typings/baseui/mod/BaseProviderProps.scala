package typings.baseui.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderProps extends js.Object {
  var children: ReactNode
  var overrides: js.UndefOr[BaseProviderOverrides] = js.undefined
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  var zIndex: js.UndefOr[Double] = js.undefined
}

object BaseProviderProps {
  @scala.inline
  def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any,
    children: ReactNode = null,
    overrides: BaseProviderOverrides = null,
    zIndex: Int | Double = null
  ): BaseProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderProps]
  }
}

