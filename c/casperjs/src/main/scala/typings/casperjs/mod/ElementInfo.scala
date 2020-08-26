package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementInfo extends js.Object {
  var attributes: js.Any = js.native
  var height: Double = js.native
  var html: String = js.native
  var nodeName: String = js.native
  var tag: String = js.native
  var text: String = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ElementInfo {
  @scala.inline
  def apply(
    attributes: js.Any,
    height: Double,
    html: String,
    nodeName: String,
    tag: String,
    text: String,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): ElementInfo = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInfo]
  }
  @scala.inline
  implicit class ElementInfoOps[Self <: ElementInfo] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

