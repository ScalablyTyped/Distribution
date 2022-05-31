package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceColorBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/replaceColorBlock", "ReplaceColorBlock")
  @js.native
  class ReplaceColorBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ReplaceColorBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the distance input component
      */
    def distance: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the reference input component
      */
    def reference: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the replacement input component
      */
    def replacement: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
