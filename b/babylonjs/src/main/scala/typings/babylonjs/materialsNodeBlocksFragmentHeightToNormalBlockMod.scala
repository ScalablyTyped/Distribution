package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksFragmentHeightToNormalBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/heightToNormalBlock", "HeightToNormalBlock")
  @js.native
  open class HeightToNormalBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new HeightToNormalBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the normal component
      */
    def normal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the position component
      */
    def position: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the tangent component
      */
    def tangent: NodeMaterialConnectionPoint = js.native
  }
}
