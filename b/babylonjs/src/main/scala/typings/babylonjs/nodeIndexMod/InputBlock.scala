package typings.babylonjs.nodeIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/index", "InputBlock")
@js.native
class InputBlock protected ()
  extends typings.babylonjs.blocksIndexMod.InputBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    `type`: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
  ) = this()
}

