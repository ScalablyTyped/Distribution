package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesBatch extends js.Object {
  var hardwareInstancedRendering: js.Array[Boolean]
  var mustReturn: Boolean
  var renderSelf: js.Array[Boolean]
  var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
}

object InstancesBatch {
  @scala.inline
  def apply(
    hardwareInstancedRendering: js.Array[Boolean],
    mustReturn: Boolean,
    renderSelf: js.Array[Boolean],
    visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
  ): InstancesBatch = {
    val __obj = js.Dynamic.literal(hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], mustReturn = mustReturn.asInstanceOf[js.Any], renderSelf = renderSelf.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesBatch]
  }
}

