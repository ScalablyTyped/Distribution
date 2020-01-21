package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementInfo extends js.Object {
  var attributes: js.Any
  var height: Double
  var html: String
  var nodeName: String
  var tag: String
  var text: String
  var visible: Boolean
  var width: Double
  var x: Double
  var y: Double
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
}

