package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/vectorMergerBlock", JSImport.Namespace)
@js.native
object vectorMergerBlockMod extends js.Object {
  @js.native
  class VectorMergerBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new VectorMergerBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the w component (input)
      */
    def w(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the x component (input)
      */
    def x(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xy component (output)
      * @deprecated Please use xyOut instead.
      */
    def xy(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xy component (input)
      */
    def xyIn(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xy component (output)
      */
    def xyOut(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyz component (output)
      * @deprecated Please use xyzOut instead.
      */
    def xyz(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyz component (input)
      */
    def xyzIn(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyz component (output)
      */
    def xyzOut(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyzw component (output)
      */
    def xyzw(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the y component (input)
      */
    def y(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the z component (input)
      */
    def z(): NodeMaterialConnectionPoint = js.native
  }
  
}

