package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/cloudBlock", "CloudBlock")
  @js.native
  open class CloudBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new CloudBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the chaos input component
      */
    def chaos: NodeMaterialConnectionPoint = js.native
    
    /** Gets or sets the number of octaves */
    var octaves: Double = js.native
    
    /**
      * Gets the offset X input component
      */
    def offsetX: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the offset Y input component
      */
    def offsetY: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the offset Z input component
      */
    def offsetZ: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
}
