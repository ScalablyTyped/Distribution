package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/viewDirectionBlock", JSImport.Namespace)
@js.native
object viewDirectionBlockMod extends js.Object {
  
  @js.native
  class ViewDirectionBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ViewDirectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the camera position component
      */
    def cameraPosition: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
