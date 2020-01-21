package typings.blueprintjsCore.contextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOffset extends js.Object {
  var left: Double
  var top: Double
}

object IOffset {
  @scala.inline
  def apply(left: Double, top: Double): IOffset = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOffset]
  }
}

