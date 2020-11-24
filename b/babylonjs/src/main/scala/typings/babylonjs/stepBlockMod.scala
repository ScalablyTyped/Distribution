package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/stepBlock", JSImport.Namespace)
@js.native
object stepBlockMod extends js.Object {
  
  @js.native
  class StepBlock protected () extends NodeMaterialBlock {
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
