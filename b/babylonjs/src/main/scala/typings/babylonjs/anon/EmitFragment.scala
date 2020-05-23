package typings.babylonjs.anon

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitFragment extends js.Object {
  var emitFragment: Boolean
  var emitVertex: Boolean
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
}

object EmitFragment {
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): EmitFragment = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitFragment]
  }
}

