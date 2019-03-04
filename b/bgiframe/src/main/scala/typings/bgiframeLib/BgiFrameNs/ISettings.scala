package typings
package bgiframeLib.BgiFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var conditional: scala.Boolean
  var height: java.lang.String
  var left: java.lang.String
  var opacity: scala.Boolean
  var src: java.lang.String
  var top: java.lang.String
  var width: java.lang.String
}

object ISettings {
  @scala.inline
  def apply(
    conditional: scala.Boolean,
    height: java.lang.String,
    left: java.lang.String,
    opacity: scala.Boolean,
    src: java.lang.String,
    top: java.lang.String,
    width: java.lang.String
  ): ISettings = {
    val __obj = js.Dynamic.literal(conditional = conditional, height = height, left = left, opacity = opacity, src = src, top = top, width = width)
  
    __obj.asInstanceOf[ISettings]
  }
}

