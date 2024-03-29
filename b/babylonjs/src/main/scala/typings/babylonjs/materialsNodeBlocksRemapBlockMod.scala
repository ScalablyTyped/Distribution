package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksRemapBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/remapBlock", "RemapBlock")
  @js.native
  open class RemapBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new RemapBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the source max input component
      */
    def sourceMax: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the source min input component
      */
    def sourceMin: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the source range
      */
    var sourceRange: Vector2 = js.native
    
    /**
      * Gets the target max input component
      */
    def targetMax: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the target min input component
      */
    def targetMin: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the target range
      */
    var targetRange: Vector2 = js.native
  }
}
