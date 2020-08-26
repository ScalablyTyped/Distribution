package typings.baseui.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProviderProps extends js.Object {
  var children: ReactNode = js.native
  var overrides: js.UndefOr[BaseProviderOverrides] = js.native
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object BaseProviderProps {
  @scala.inline
  def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): BaseProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderProps]
  }
  @scala.inline
  implicit class BaseProviderPropsOps[Self <: BaseProviderProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOverrides(value: BaseProviderOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

