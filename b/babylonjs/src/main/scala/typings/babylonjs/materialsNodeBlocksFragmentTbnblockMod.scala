package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksFragmentTbnblockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/TBNBlock", "TBNBlock")
  @js.native
  open class TBNBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new TBNBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the TBN output component
      */
    def TBN: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the normal input component
      */
    def normal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row0 of the output matrix
      */
    def row0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row1 of the output matrix
      */
    def row1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the row2 of the output matrix
      */
    def row2: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tangent input component
      */
    def tangent: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world matrix input component
      */
    def world: NodeMaterialConnectionPoint = js.native
  }
}
