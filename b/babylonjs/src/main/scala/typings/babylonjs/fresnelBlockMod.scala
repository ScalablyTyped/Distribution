package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/fresnelBlock", JSImport.Namespace)
@js.native
object fresnelBlockMod extends js.Object {
  @js.native
  class FresnelBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FresnelBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the bias input component
      */
    def bias(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the fresnel output component
      */
    def fresnel(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the camera (or eye) position component
      */
    def power(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the view direction input component
      */
    def viewDirection(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the world normal input component
      */
    def worldNormal(): NodeMaterialConnectionPoint = js.native
  }
  
}

