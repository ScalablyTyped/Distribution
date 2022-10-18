package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksWorleyNoise3DBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/worleyNoise3DBlock", "WorleyNoise3DBlock")
  @js.native
  open class WorleyNoise3DBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new WorleyNoise3DBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the jitter input component
      */
    def jitter: NodeMaterialConnectionPoint = js.native
    
    /** Gets or sets a boolean indicating that normal should be inverted on X axis */
    var manhattanDistance: Boolean = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the x component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y component
      */
    def y: NodeMaterialConnectionPoint = js.native
  }
}
