package typings.blueprintjsCore.dividerMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IDividerProps extends HTMLAttributes[HTMLElement] {
  /**
    * HTML tag to use for element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IDividerProps {
  @scala.inline
  def apply(): IDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDividerProps]
  }
  @scala.inline
  implicit class IDividerPropsOps[Self <: IDividerProps] (val x: Self) extends AnyVal {
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
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

