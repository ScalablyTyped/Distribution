package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotate2dBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/rotate2dBlock", "Rotate2dBlock")
  @js.native
  class Rotate2dBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new Rotate2dBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input angle
      */
    def angle: NodeMaterialConnectionPoint = js.native
    
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
