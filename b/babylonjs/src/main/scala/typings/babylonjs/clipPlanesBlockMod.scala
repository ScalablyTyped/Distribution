package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPlanesBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Dual/clipPlanesBlock", "ClipPlanesBlock")
  @js.native
  open class ClipPlanesBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ClipPlanesBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the worldPosition input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
