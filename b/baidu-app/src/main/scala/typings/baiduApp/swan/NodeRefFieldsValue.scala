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

trait NodeRefFieldsValue extends js.Object {
  var dataset: Dataset
  var id: Id
  var properties: PropertiesAny
  var rect: Bottom
  var scrollOffset: ScrollLeft
  var size: Width
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
}

