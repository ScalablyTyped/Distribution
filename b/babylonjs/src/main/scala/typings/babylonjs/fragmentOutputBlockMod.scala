package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fragmentOutputBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/fragmentOutputBlock", "FragmentOutputBlock")
  @js.native
  class FragmentOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FragmentOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the a input component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb input component
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba input component
      */
    def rgba: NodeMaterialConnectionPoint = js.native
  }
}
