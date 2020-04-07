package typings.babylonjs

import typings.babylonjs.BABYLON.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[T /* <: js.Function */] extends js.Object {
  var action: T
  var component: ISceneComponent
  var index: Double
}

object AnonComponent {
  @scala.inline
  def apply[T /* <: js.Function */](action: T, component: ISceneComponent, index: Double): AnonComponent[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponent[T]]
  }
}

