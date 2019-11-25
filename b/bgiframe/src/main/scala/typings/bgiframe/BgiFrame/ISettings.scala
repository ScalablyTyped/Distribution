package typings.bgiframe.BgiFrame

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
    val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISettings]
  }
}

