package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksColorSplitterBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/colorSplitterBlock", "ColorSplitterBlock")
  @js.native
  open class ColorSplitterBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ColorSplitterBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the a component (output)
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the b component (output)
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the g component (output)
      */
    def g: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the r component (output)
      */
    def r: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb component (input)
      */
    def rgbIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb component (output)
      */
    def rgbOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba component (input)
      */
    def rgba: NodeMaterialConnectionPoint = js.native
  }
}
