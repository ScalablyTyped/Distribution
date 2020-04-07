package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/refractBlock", JSImport.Namespace)
@js.native
object refractBlockMod extends js.Object {
  @js.native
  class RefractBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new RefractBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the incident component
      */
    def incident(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the index of refraction component
      */
    def ior(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the normal component
      */
    def normal(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output(): NodeMaterialConnectionPoint = js.native
  }
  
}

