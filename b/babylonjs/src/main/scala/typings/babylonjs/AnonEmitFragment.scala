package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmitFragment extends js.Object {
  var emitFragment: Boolean
  var emitVertex: Boolean
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
}

object AnonEmitFragment {
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): AnonEmitFragment = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmitFragment]
  }
}

