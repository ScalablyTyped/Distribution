package typings.createEmotion.mod.global.JSX

import typings.createEmotion.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributes extends js.Object {
  var css: js.UndefOr[Interpolation] = js.native
}

object HTMLAttributes {
  @scala.inline
  def apply(): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes]
  }
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes] (val x: Self) extends AnyVal {
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
    def setCss(value: Interpolation): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setCssNull: Self = this.set("css", null)
  }
  
}

