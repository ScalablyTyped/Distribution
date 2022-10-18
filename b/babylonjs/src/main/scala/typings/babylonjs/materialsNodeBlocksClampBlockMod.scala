package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksClampBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/clampBlock", "ClampBlock")
  @js.native
  open class ClampBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ClampBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /** Gets or sets the maximum range */
    var maximum: Double = js.native
    
    /** Gets or sets the minimum range */
    var minimum: Double = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
