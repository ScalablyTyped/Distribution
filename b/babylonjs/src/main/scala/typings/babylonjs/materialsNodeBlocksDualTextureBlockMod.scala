package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDualTextureBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Dual/textureBlock", "TextureBlock")
  @js.native
  open class TextureBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new TextureBlock
      * @param name defines the block name
      * @param fragmentOnly
      */
    def this(name: String) = this()
    def this(name: String, fragmentOnly: Boolean) = this()
    
    /* private */ var _convertToGammaSpace: Any = js.native
    
    /* private */ var _convertToLinearSpace: Any = js.native
    
    /* private */ var _defineName: Any = js.native
    
    /* private */ var _fragmentOnly: Any = js.native
    
    /* private */ var _gammaDefineName: Any = js.native
    
    /* private */ var _generateConversionCode: Any = js.native
    
    /* private */ var _generateTextureLookup: Any = js.native
    
    /* private */ var _imageSource: Any = js.native
    
    /* private */ var _injectVertexCode: Any = js.native
    
    /* private */ def _isMixed: Any = js.native
    
    /* private */ var _linearDefineName: Any = js.native
    
    /* private */ var _mainUVDefineName: Any = js.native
    
    /* private */ var _mainUVName: Any = js.native
    
    /* private */ var _samplerName: Any = js.native
    
    /* private */ var _tempTextureRead: Any = js.native
    
    /* protected */ var _texture: Nullable[Texture] = js.native
    
    /* private */ var _textureInfoName: Any = js.native
    
    /* private */ var _textureTransformName: Any = js.native
    
    /* private */ var _transformedUVName: Any = js.native
    
    /* private */ var _writeOutput: Any = js.native
    
    /* private */ var _writeTextureRead: Any = js.native
    
    /**
      * Gets the a output component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the b output component
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    def bind(effect: Effect): Unit = js.native
    
    def convertToGammaSpace: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if content needs to be converted to gamma space
      */
    def convertToGammaSpace_=(value: Boolean): Unit = js.native
    
    def convertToLinearSpace: Boolean = js.native
    /**
      * Gets or sets a boolean indicating if content needs to be converted to linear space
      */
    def convertToLinearSpace_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if multiplication of texture with level should be disabled
      */
    var disableLevelMultiplication: Boolean = js.native
    
    /**
      * Gets the g output component
      */
    def g: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets a boolean indicating that this block is linked to an ImageSourceBlock
      */
    def hasImageSource: Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    /**
      * Gets the level output component
      */
    def level: NodeMaterialConnectionPoint = js.native
    
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
      * Gets the sampler name associated with this texture
      */
    def samplerName: String = js.native
    
    /**
      * Gets the source input component
      */
    def source: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the texture associated with the node
      */
    def texture: Nullable[Texture] = js.native
    def texture_=(texture: Nullable[Texture]): Unit = js.native
    
    /**
      * Gets the uv input component
      */
    def uv: NodeMaterialConnectionPoint = js.native
  }
}
