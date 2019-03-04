package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action[T /* <: js.Function */] extends js.Object {
  var action: T
  var component: babylonjsLib.BABYLONNs.ISceneComponent
  var index: scala.Double
}

object Anon_Action {
  @scala.inline
  def apply[T /* <: js.Function */](action: T, component: babylonjsLib.BABYLONNs.ISceneComponent, index: scala.Double): Anon_Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component, index = index)
  
    __obj.asInstanceOf[Anon_Action[T]]
  }
}

