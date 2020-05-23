package typings.babylonjs.anon

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var controller: WebVRController
  var mesh: AbstractMesh
}

object Controller {
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
}

