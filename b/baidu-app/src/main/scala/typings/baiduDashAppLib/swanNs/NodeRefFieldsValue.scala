package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: baiduDashAppLib.Anon_Dataset
  var id: baiduDashAppLib.Anon_Id
  var properties: baiduDashAppLib.Anon_PropertiesAny
  var rect: baiduDashAppLib.Anon_Bottom
  var scrollOffset: baiduDashAppLib.Anon_ScrollLeft
  var size: baiduDashAppLib.Anon_HeightWidth
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: baiduDashAppLib.Anon_Dataset,
    id: baiduDashAppLib.Anon_Id,
    properties: baiduDashAppLib.Anon_PropertiesAny,
    rect: baiduDashAppLib.Anon_Bottom,
    scrollOffset: baiduDashAppLib.Anon_ScrollLeft,
    size: baiduDashAppLib.Anon_HeightWidth
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("rect")(rect)
    __obj.updateDynamic("scrollOffset")(scrollOffset)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

