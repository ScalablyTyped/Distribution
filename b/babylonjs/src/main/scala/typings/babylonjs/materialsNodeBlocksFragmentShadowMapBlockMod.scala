package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksFragmentShadowMapBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/shadowMapBlock", "ShadowMapBlock")
  @js.native
  open class ShadowMapBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ShadowMapBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the depth output component
      */
    def depth: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the view x projection input component
      */
    def viewProjection: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world normal input component
      */
    def worldNormal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
