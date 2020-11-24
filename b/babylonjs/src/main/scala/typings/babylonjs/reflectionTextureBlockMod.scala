package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.reflectionTextureBaseBlockMod.ReflectionTextureBaseBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Dual/reflectionTextureBlock", JSImport.Namespace)
@js.native
object reflectionTextureBlockMod extends js.Object {
  
  @js.native
  class ReflectionTextureBlock protected () extends ReflectionTextureBaseBlock {
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
