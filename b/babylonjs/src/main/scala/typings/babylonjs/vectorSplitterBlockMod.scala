package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/vectorSplitterBlock", JSImport.Namespace)
@js.native
object vectorSplitterBlockMod extends js.Object {
  @js.native
  class VectorSplitterBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new VectorSplitterBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the w component (output)
      */
    def w(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the x component (output)
      */
    def x(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xy component (input)
      */
    def xyIn(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xy component (output)
      */
    def xyOut(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyz component (input)
      */
    def xyzIn(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyz component (output)
      */
    def xyzOut(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the xyzw component (input)
      */
    def xyzw(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the y component (output)
      */
    def y(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the z component (output)
      */
    def z(): NodeMaterialConnectionPoint = js.native
  }
  
}

