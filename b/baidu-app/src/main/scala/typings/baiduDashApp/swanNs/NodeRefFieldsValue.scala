package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_Bottom
import typings.baiduDashApp.Anon_Dataset
import typings.baiduDashApp.Anon_HeightWidth
import typings.baiduDashApp.Anon_Id
import typings.baiduDashApp.Anon_PropertiesAny
import typings.baiduDashApp.Anon_ScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: Anon_Dataset
  var id: Anon_Id
  var properties: Anon_PropertiesAny
  var rect: Anon_Bottom
  var scrollOffset: Anon_ScrollLeft
  var size: Anon_HeightWidth
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Anon_Dataset,
    id: Anon_Id,
    properties: Anon_PropertiesAny,
    rect: Anon_Bottom,
    scrollOffset: Anon_ScrollLeft,
    size: Anon_HeightWidth
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset, id = id, properties = properties, rect = rect, scrollOffset = scrollOffset, size = size)
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

