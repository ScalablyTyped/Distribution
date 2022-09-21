package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageProcessingBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/imageProcessingBlock", "ImageProcessingBlock")
  @js.native
  open class ImageProcessingBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ImageProcessingBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Defines if the input should be converted to linear space (default: true)
      */
    var convertInputToLinearSpace: Boolean = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
