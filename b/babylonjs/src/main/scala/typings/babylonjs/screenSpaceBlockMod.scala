package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenSpaceBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/screenSpaceBlock", "ScreenSpaceBlock")
  @js.native
  open class ScreenSpaceBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ScreenSpaceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the vector input
      */
    def vector: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the worldViewProjection transform input
      */
    def worldViewProjection: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the x output component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y output component
      */
    def y: NodeMaterialConnectionPoint = js.native
  }
}
