package typings
package baseuiLib.buttonDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialState extends js.Object {
  var selected: scala.Double | js.Array[scala.Double]
}

object InitialState {
  @scala.inline
  def apply(selected: scala.Double | js.Array[scala.Double]): InitialState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitialState]
  }
}

