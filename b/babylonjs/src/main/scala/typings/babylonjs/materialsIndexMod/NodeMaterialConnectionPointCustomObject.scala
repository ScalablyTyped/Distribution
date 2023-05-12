package typings.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "NodeMaterialConnectionPointCustomObject")
@js.native
open class NodeMaterialConnectionPointCustomObject[T /* <: typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock */] protected ()
  extends typings.babylonjs.materialsNodeIndexMod.NodeMaterialConnectionPointCustomObject[T] {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    * @param _blockType
    * @param _blockName
    */
  def this(
    name: String,
    ownerBlock: typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock,
    direction: typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String
  ) = this()
}
