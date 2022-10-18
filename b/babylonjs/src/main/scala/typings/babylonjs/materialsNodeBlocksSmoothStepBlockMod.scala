package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksSmoothStepBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/smoothStepBlock", "SmoothStepBlock")
  @js.native
  open class SmoothStepBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new SmoothStepBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the first edge operand input component
      */
    def edge0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second edge operand input component
      */
    def edge1: NodeMaterialConnectionPoint = js.native
    
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
