package typings.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherState extends js.Object {
  var isMounted: Boolean
}

object TetherState {
  @scala.inline
  def apply(isMounted: Boolean): TetherState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TetherState]
  }
}

