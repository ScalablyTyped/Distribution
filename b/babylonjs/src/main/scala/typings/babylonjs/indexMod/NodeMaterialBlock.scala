package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "NodeMaterialBlock")
@js.native
class NodeMaterialBlock protected ()
  extends typings.babylonjs.materialsIndexMod.NodeMaterialBlock {
  /**
    * Creates a new NodeMaterialBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param isFinalMerger defines a boolean indicating that this block is an end block (e.g. it is generating a system value). Default is false
    * @param isInput defines a boolean indicating that this block is an input (e.g. it sends data to the shader). Default is false
    */
  def this(name: String) = this()
  def this(name: String, target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    isFinalMerger: Boolean
  ) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    isFinalMerger: Boolean,
    isInput: Boolean
  ) = this()
}

