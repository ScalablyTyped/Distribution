package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksRotate2dBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/rotate2dBlock", "Rotate2dBlock")
  @js.native
  open class Rotate2dBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new Rotate2dBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input angle
      */
    def angle: NodeMaterialConnectionPoint = js.native
    
    def autoConfigure(): Unit = js.native
    
    /**
      * Gets the input vector
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
