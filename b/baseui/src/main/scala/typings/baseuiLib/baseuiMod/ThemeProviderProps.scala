package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var theme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any
}

object ThemeProviderProps {
  @scala.inline
  def apply(
    theme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any,
    children: reactLib.reactMod.ReactNode = null
  ): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
}

