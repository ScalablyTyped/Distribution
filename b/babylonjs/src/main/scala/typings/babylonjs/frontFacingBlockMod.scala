package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontFacingBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/frontFacingBlock", "FrontFacingBlock")
  @js.native
  class FrontFacingBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new FrontFacingBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
