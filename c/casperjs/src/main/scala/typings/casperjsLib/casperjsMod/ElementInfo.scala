package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementInfo extends js.Object {
  var attributes: js.Any
  var height: scala.Double
  var html: java.lang.String
  var nodeName: java.lang.String
  var tag: java.lang.String
  var text: java.lang.String
  var visible: scala.Boolean
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object ElementInfo {
  @scala.inline
  def apply(
    attributes: js.Any,
    height: scala.Double,
    html: java.lang.String,
    nodeName: java.lang.String,
    tag: java.lang.String,
    text: java.lang.String,
    visible: scala.Boolean,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ElementInfo = {
    val __obj = js.Dynamic.literal(attributes = attributes, height = height, html = html, nodeName = nodeName, tag = tag, text = text, visible = visible, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ElementInfo]
  }
}

