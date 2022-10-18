package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPosterizeBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/posterizeBlock", "PosterizeBlock")
  @js.native
  open class PosterizeBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new PosterizeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the steps input component
      */
    def steps: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
