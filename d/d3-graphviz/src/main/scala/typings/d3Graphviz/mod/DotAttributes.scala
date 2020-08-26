package typings.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotAttributes extends js.Object {
  var URL: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
}

object DotAttributes {
  @scala.inline
  def apply(): DotAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotAttributes]
  }
  @scala.inline
  implicit class DotAttributesOps[Self <: DotAttributes] (val x: Self) extends AnyVal {
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
    def setURL(value: js.Any): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

