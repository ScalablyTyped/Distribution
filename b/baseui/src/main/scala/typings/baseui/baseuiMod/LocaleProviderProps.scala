package typings.baseui.baseuiMod

import typings.react.reactMod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var locale: Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Locale */ _
  ]
}

object LocaleProviderProps {
  @scala.inline
  def apply(
    locale: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Locale */ _
    ],
    children: ReactNode = null
  ): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

