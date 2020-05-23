package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitVertex extends js.Object {
  var emitFragment: Boolean
  var emitVertex: Boolean
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
}

object EmitVertex {
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): EmitVertex = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitVertex]
  }
}

