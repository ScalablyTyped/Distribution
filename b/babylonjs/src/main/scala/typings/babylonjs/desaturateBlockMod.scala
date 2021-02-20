package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desaturateBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/desaturateBlock", "DesaturateBlock")
  @js.native
  class DesaturateBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new DesaturateBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the color operand input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the level operand input component
      */
    def level: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
