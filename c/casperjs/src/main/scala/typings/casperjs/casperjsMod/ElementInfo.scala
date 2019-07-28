package typings.casperjs.casperjsMod

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
    val __obj = js.Dynamic.literal(attributes = attributes, height = height, html = html, nodeName = nodeName, tag = tag, text = text, visible = visible, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ElementInfo]
  }
}

