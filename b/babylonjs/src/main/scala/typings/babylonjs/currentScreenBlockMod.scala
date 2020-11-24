package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Dual/currentScreenBlock", JSImport.Namespace)
@js.native
object currentScreenBlockMod extends js.Object {
  
  @js.native
  class CurrentScreenBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new CurrentScreenBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _gammaDefineName: js.Any = js.native
    
    var _injectVertexCode: js.Any = js.native
    
    var _linearDefineName: js.Any = js.native
    
    var _mainUVName: js.Any = js.native
    
    var _samplerName: js.Any = js.native
    
    var _tempTextureRead: js.Any = js.native
    
    var _writeOutput: js.Any = js.native
    
    var _writeTextureRead: js.Any = js.native
    
    /**
      * Gets the a output component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the b output component
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets a boolean indicating if content needs to be converted to gamma space
      */
    var convertToGammaSpace: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if content needs to be converted to linear space
      */
    var convertToLinearSpace: Boolean = js.native
    
    /**
      * Gets the g output component
      */
    def g: NodeMaterialConnectionPoint = js.native
    
    def isReady(): Boolean = js.native
    
    /**
      * Gets the r output component
      */
    def r: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb output component
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba output component
      */
    def rgba: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the texture associated with the node
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * Gets the uv input component
      */
    def uv: NodeMaterialConnectionPoint = js.native
  }
}
