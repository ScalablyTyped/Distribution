package typings.babylonjs

import typings.babylonjs.sceneComponentMod.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction[T /* <: js.Function */] extends js.Object {
  var action: T
  var component: ISceneComponent
  var index: Double
}

object AnonAction {
  @scala.inline
  def apply[T /* <: js.Function */](action: T, component: ISceneComponent, index: Double): AnonAction[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction[T]]
  }
}

