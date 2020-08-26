package typings.cathoQuantum.tabbedViewMod

import typings.cathoQuantum.anon.ComponentsSpacing
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbedViewProps extends js.Object {
  var activeTab: js.UndefOr[String] = js.native
  var children: js.Array[ReactNode] | ReactNode = js.native
  var fluid: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var skin: js.UndefOr[neutral | primary] = js.native
  var theme: js.UndefOr[ComponentsSpacing] = js.native
}

object TabbedViewProps {
  @scala.inline
  def apply(): TabbedViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbedViewProps]
  }
  @scala.inline
  implicit class TabbedViewPropsOps[Self <: TabbedViewProps] (val x: Self) extends AnyVal {
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
    def setActiveTab(value: String): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSkin(value: neutral | primary): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setTheme(value: ComponentsSpacing): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

