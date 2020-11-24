package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.nodeMaterialBuildStateMod.NodeMaterialBuildState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/screenSizeBlock", JSImport.Namespace)
@js.native
object screenSizeBlockMod extends js.Object {
  
  @js.native
  class ScreenSizeBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ScreenSizeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _scene: js.Any = js.native
    
    var _varName: js.Any = js.native
    
    /* protected */ def writeOutputs(state: NodeMaterialBuildState, varName: String): String = js.native
    
    /**
      * Gets the x component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xy component
      */
    def xy: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y component
      */
    def y: NodeMaterialConnectionPoint = js.native
  }
}
