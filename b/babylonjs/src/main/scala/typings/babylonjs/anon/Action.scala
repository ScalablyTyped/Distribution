package typings.babylonjs.anon

import typings.babylonjs.sceneComponentMod.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T /* <: js.Function */] extends js.Object {
  var action: T
  var component: ISceneComponent
  var index: Double
}

object Action {
  @scala.inline
  def apply[/* <: js.Function */ T](action: T, component: ISceneComponent, index: Double): Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

