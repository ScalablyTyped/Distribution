package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discardBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/discardBlock", "DiscardBlock")
  @js.native
  class DiscardBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new DiscardBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the cutoff input component
      */
    def cutoff: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the color input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
