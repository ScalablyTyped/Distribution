package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var locale: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Locale */ js.Any
}

object LocaleProviderProps {
  @scala.inline
  def apply(
    locale: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Locale */ js.Any,
    children: reactLib.reactMod.ReactNode = null
  ): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

