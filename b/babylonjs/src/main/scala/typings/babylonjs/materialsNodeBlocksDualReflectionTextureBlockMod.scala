package typings.babylonjs

import typings.babylonjs.materialsNodeBlocksDualReflectionTextureBaseBlockMod.ReflectionTextureBaseBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDualReflectionTextureBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Dual/reflectionTextureBlock", "ReflectionTextureBlock")
  @js.native
  open class ReflectionTextureBlock protected () extends ReflectionTextureBaseBlock {
    /**
      * Create a new ReflectionTextureBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the a output component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the b output component
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the g output component
      */
    def g: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the r output component
      */
    def r: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb output component
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba output component
      */
    def rgba: NodeMaterialConnectionPoint = js.native
  }
}
