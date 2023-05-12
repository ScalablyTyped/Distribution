package typings.babylonjs

import org.scalablytyped.runtime.Instantiable1
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeNodeMaterialConnectionPointCustomObjectMod {
  
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
      */
    def this(
      name: String,
      ownerBlock: NodeMaterialBlock,
      direction: NodeMaterialConnectionPointDirection,
      _blockType: Instantiable1[/* args (repeated) */ Any, T],
      _blockName: String
    ) = this()
    
    /* private */ var _blockName: Any = js.native
    
    var _blockType: Instantiable1[/* args (repeated) */ Any, T] = js.native
  }
}
