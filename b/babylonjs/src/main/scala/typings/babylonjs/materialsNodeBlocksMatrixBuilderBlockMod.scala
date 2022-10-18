package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksMatrixBuilderBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/matrixBuilderBlock", "MatrixBuilderBlock")
  @js.native
  open class MatrixBuilderBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new MatrixBuilder
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row0 vector
      */
    def row0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row1 vector
      */
    def row1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row2 vector
      */
    def row2: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row3 vector
      */
    def row3: NodeMaterialConnectionPoint = js.native
  }
}
