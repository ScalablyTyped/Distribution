package typings.babylonjs.anon

import typings.babylonjs.BABYLON.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[T /* <: js.Function */] extends js.Object {
  var action: T
  var component: ISceneComponent
  var index: Double
}

object Component {
  @scala.inline
  def apply[T](action: T, component: ISceneComponent, index: Double): Component[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[T]]
  }
}

