package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksMatrixTransposeBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/matrixTransposeBlock", "MatrixTransposeBlock")
  @js.native
  open class MatrixTransposeBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new MatrixTransposeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input matrix
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
