package typings.blueprintjsCore.navbarMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait INavbarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Whether this navbar should be fixed to the top of the viewport (using CSS `position: fixed`).
    */
  var fixedToTop: js.UndefOr[Boolean] = js.native
}

object INavbarProps {
  @scala.inline
  def apply(): INavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavbarProps]
  }
  @scala.inline
  implicit class INavbarPropsOps[Self <: INavbarProps] (val x: Self) extends AnyVal {
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
    def setFixedToTop(value: Boolean): Self = this.set("fixedToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedToTop: Self = this.set("fixedToTop", js.undefined)
  }
  
}

