package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDualFogBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Dual/fogBlock", "FogBlock")
  @js.native
  open class FogBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FogBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _fogDistanceName: Any = js.native
    
    /* private */ var _fogParameters: Any = js.native
    
    /**
      * Gets the fog color input component
      */
    def fogColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the color input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the view input component
      */
    def view: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
