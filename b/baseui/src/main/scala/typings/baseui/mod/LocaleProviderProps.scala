package typings.baseui.mod

import typings.baseui.anon.PartialLocale
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var locale: PartialLocale
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: PartialLocale, children: ReactNode = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

