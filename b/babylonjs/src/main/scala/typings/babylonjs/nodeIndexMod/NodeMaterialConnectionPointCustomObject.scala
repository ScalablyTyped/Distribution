package typings.babylonjs.nodeIndexMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/index", "NodeMaterialConnectionPointCustomObject")
@js.native
open class NodeMaterialConnectionPointCustomObject[T /* <: typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock */] protected ()
  extends typings.babylonjs.nodeMaterialConnectionPointCustomObjectMod.NodeMaterialConnectionPointCustomObject[T] {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    * @param _blockType
    * @param _blockName
    * @param _nameForCheking
    */
  def this(
    name: String,
    ownerBlock: typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock,
    direction: typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String
  ) = this()
  def this(
    name: String,
    ownerBlock: typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock,
    direction: typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String,
    _nameForCheking: String
  ) = this()
}
