package typings.bgiframe.BgiFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var conditional: Boolean
  var height: String
  var left: String
  var opacity: Boolean
  var src: String
  var top: String
  var width: String
}

object ISettings {
  @scala.inline
  def apply(
    conditional: Boolean,
    height: String,
    left: String,
    opacity: Boolean,
    src: String,
    top: String,
    width: String
  ): ISettings = {
    val __obj = js.Dynamic.literal(conditional = conditional, height = height, left = left, opacity = opacity, src = src, top = top, width = width)
  
    __obj.asInstanceOf[ISettings]
  }
}

