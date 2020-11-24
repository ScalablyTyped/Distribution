package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "NodeMaterialBlock")
@js.native
class NodeMaterialBlock protected ()
  extends typings.babylonjs.indexMod.NodeMaterialBlock {
  /**
    * Creates a new NodeMaterialBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param isFinalMerger defines a boolean indicating that this block is an end block (e.g. it is generating a system value). Default is false
    * @param isInput defines a boolean indicating that this block is an input (e.g. it sends data to the shader). Default is false
    */
  def this(name: String) = this()
  def this(name: String, target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets) = this()
  def this(name: String, target: js.UndefOr[scala.Nothing], isFinalMerger: Boolean) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    isFinalMerger: Boolean
  ) = this()
  def this(
    name: String,
    target: js.UndefOr[scala.Nothing],
    isFinalMerger: js.UndefOr[scala.Nothing],
    isInput: Boolean
  ) = this()
  def this(name: String, target: js.UndefOr[scala.Nothing], isFinalMerger: Boolean, isInput: Boolean) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    isFinalMerger: js.UndefOr[scala.Nothing],
    isInput: Boolean
  ) = this()
  def this(
    name: String,
    target: typings.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets,
    isFinalMerger: Boolean,
    isInput: Boolean
  ) = this()
}
