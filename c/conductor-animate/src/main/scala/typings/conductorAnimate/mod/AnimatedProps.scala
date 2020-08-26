package typings.conductorAnimate.mod

import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedProps extends js.Object {
  var additional: js.UndefOr[js.Object] = js.native
  var children: js.UndefOr[ReactNode | ReactNodeArray | Null] = js.native
  var id: String = js.native
}

object AnimatedProps {
  @scala.inline
  def apply(id: String): AnimatedProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedProps]
  }
  @scala.inline
  implicit class AnimatedPropsOps[Self <: AnimatedProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditional(value: js.Object): Self = this.set("additional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional: Self = this.set("additional", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode | ReactNodeArray): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
  
}

