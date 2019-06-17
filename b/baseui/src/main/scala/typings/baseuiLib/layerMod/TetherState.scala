package typings
package baseuiLib.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherState extends js.Object {
  var isMounted: scala.Boolean
}

object TetherState {
  @scala.inline
  def apply(isMounted: scala.Boolean): TetherState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted)
  
    __obj.asInstanceOf[TetherState]
  }
}

