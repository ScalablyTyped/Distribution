package typings.blueprintjsCore.calloutMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ICalloutProps
  extends HTMLAttributes[HTMLDivElement]
     with IIntentProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side.
    *
    * If this prop is omitted or `undefined`, the `intent` prop will determine a default icon.
    * If this prop is explicitly `null`, no icon will be displayed (regardless of `intent`).
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
}

object ICalloutProps {
  @scala.inline
  def apply(): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutProps]
  }
  @scala.inline
  implicit class ICalloutPropsOps[Self <: ICalloutProps] (val x: Self) extends AnyVal {
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
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
  }
  
}

