package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksStepBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/stepBlock", "StepBlock")
  @js.native
  open class StepBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new StepBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the edge operand input component
      */
    def edge: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value operand input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
