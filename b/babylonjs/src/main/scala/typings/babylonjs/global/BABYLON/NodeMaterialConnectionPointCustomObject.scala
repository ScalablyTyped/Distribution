package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialConnectionPointCustomObject")
@js.native
open class NodeMaterialConnectionPointCustomObject[T /* <: typings.babylonjs.BABYLON.NodeMaterialBlock */] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NodeMaterialConnectionPointCustomObject[T] {
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
    ownerBlock: typings.babylonjs.BABYLON.NodeMaterialBlock,
    direction: typings.babylonjs.BABYLON.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String
  ) = this()
}
