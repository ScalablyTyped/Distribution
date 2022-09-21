package typings.babylonjs

import org.scalablytyped.runtime.Instantiable1
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialConnectionPointCustomObjectMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialConnectionPointCustomObject", "NodeMaterialConnectionPointCustomObject")
  @js.native
  open class NodeMaterialConnectionPointCustomObject[T /* <: NodeMaterialBlock */] protected () extends NodeMaterialConnectionPoint {
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
      ownerBlock: NodeMaterialBlock,
      direction: NodeMaterialConnectionPointDirection,
      _blockType: Instantiable1[/* args (repeated) */ Any, T],
      _blockName: String
    ) = this()
    def this(
      name: String,
      ownerBlock: NodeMaterialBlock,
      direction: NodeMaterialConnectionPointDirection,
      _blockType: Instantiable1[/* args (repeated) */ Any, T],
      _blockName: String,
      _nameForCheking: String
    ) = this()
    
    /* private */ var _blockName: Any = js.native
    
    /* private */ var _blockType: Any = js.native
    
    /* private */ var _nameForCheking: Any = js.native
  }
}
