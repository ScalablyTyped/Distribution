package typings.babylonjs

import typings.babylonjs.BABYLON.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmitVertex extends js.Object {
  var emitFragment: Boolean
  var emitVertex: Boolean
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
}

object AnonEmitVertex {
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): AnonEmitVertex = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmitVertex]
  }
}

