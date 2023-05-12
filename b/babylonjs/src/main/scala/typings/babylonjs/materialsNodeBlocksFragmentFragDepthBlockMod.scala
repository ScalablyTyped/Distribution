package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksFragmentFragDepthBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/fragDepthBlock", "FragDepthBlock")
  @js.native
  open class FragDepthBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FragDepthBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the depth input component
      */
    def depth: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the viewProjection input component
      */
    def viewProjection: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the worldPos input component
      */
    def worldPos: NodeMaterialConnectionPoint = js.native
  }
}
