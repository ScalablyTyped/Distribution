package typings.baseui.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
}

object ThemeProviderProps {
  @scala.inline
  def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
  @scala.inline
  implicit class ThemeProviderPropsOps[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

