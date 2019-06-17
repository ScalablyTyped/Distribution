package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var locale: baseuiLib.Locale
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: baseuiLib.Locale, children: reactLib.reactMod.ReactNode = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

