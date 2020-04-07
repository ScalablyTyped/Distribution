package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/colorSplitterBlock", JSImport.Namespace)
@js.native
object colorSplitterBlockMod extends js.Object {
  @js.native
  class ColorSplitterBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ColorSplitterBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the a component (output)
      */
    def a(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the b component (output)
      */
    def b(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the g component (output)
      */
    def g(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the r component (output)
      */
    def r(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the rgb component (input)
      */
    def rgbIn(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the rgb component (output)
      */
    def rgbOut(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the rgba component (input)
      */
    def rgba(): NodeMaterialConnectionPoint = js.native
  }
  
}

