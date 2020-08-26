package typings.baiduApp.swan

import typings.baiduApp.anon.Bottom
import typings.baiduApp.anon.Dataset
import typings.baiduApp.anon.Id
import typings.baiduApp.anon.PropertiesAny
import typings.baiduApp.anon.ScrollLeft
import typings.baiduApp.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRefFieldsValue extends js.Object {
  var dataset: Dataset = js.native
  var id: Id = js.native
  var properties: PropertiesAny = js.native
  var rect: Bottom = js.native
  var scrollOffset: ScrollLeft = js.native
  var size: Width = js.native
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Dataset,
    id: Id,
    properties: PropertiesAny,
    rect: Bottom,
    scrollOffset: ScrollLeft,
    size: Width
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
  @scala.inline
  implicit class NodeRefFieldsValueOps[Self <: NodeRefFieldsValue] (val x: Self) extends AnyVal {
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
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: PropertiesAny): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRect(value: Bottom): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffset(value: ScrollLeft): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Width): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

