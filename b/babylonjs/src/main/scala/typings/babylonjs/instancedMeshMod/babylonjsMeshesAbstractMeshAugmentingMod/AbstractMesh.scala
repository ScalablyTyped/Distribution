package typings.babylonjs.instancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMesh extends js.Object {
  /**
    * Object used to store instanced buffers defined by user
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    */
  var instancedBuffers: StringDictionary[js.Any]
}

object AbstractMesh {
  @scala.inline
  def apply(instancedBuffers: StringDictionary[js.Any]): AbstractMesh = {
    val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractMesh]
  }
}

