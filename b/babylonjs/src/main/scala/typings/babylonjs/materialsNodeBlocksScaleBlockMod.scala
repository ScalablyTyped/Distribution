package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksScaleBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/scaleBlock", "ScaleBlock")
  @js.native
  open class ScaleBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ScaleBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the factor input component
      */
    def factor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
