package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollInfo extends js.Object {
  var clientHeight: js.Any
  var clientWidth: js.Any
  var height: js.Any
  var left: js.Any
  var top: js.Any
  var width: js.Any
}

object ScrollInfo {
  @scala.inline
  def apply(
    clientHeight: js.Any,
    clientWidth: js.Any,
    height: js.Any,
    left: js.Any,
    top: js.Any,
    width: js.Any
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ScrollInfo]
  }
}

