package typings.baseui.baseuiMod

import typings.dateDashFns.Locale
import typings.react.reactMod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var locale: Partial[Locale]
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: Partial[Locale], children: ReactNode = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

