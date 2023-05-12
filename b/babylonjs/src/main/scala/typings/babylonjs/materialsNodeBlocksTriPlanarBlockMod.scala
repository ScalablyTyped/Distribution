package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsNodeBlocksDualImageSourceBlockMod.ImageSourceBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.materialsNodeNodeMaterialBuildStateMod.NodeMaterialBuildState
import typings.babylonjs.materialsNodeNodeMaterialMod.NodeMaterialTextureBlocks
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksTriPlanarBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/triPlanarBlock", "TriPlanarBlock")
  @js.native
  open class TriPlanarBlock protected ()
    extends NodeMaterialBlock
       with NodeMaterialTextureBlocks {
    /**
      * Create a new TriPlanarBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    def this(name: String, hideSourceZ: Boolean) = this()
    
    /* private */ var _convertToGammaSpace: Any = js.native
    
    /* private */ var _convertToLinearSpace: Any = js.native
    
    /* private */ var _gammaDefineName: Any = js.native
    
    /* private */ var _generateConversionCode: Any = js.native
    
    /* protected */ def _generateTextureLookup(state: NodeMaterialBuildState): Unit = js.native
    
    /* protected */ def _getImageSourceBlock(connectionPoint: Nullable[NodeMaterialConnectionPoint]): Nullable[ImageSourceBlock] = js.native
    
    /* private */ var _imageSource: Any = js.native
    
    /* private */ var _linearDefineName: Any = js.native
    
    /* private */ var _samplerName: Any = js.native
    
    /* protected */ var _tempTextureRead: String = js.native
    
    /* protected */ var _texture: Nullable[Texture] = js.native
    
    /* private */ var _textureInfoName: Any = js.native
    
    /* private */ var _writeOutput: Any = js.native
    
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
      * Gets the normal input component
      */
    def normal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the position input component
      */
    def position: NodeMaterialConnectionPoint = js.native
    
    /**
      * Project the texture(s) for a better fit to a cube
      */
    var projectAsCube: Boolean = js.native
    
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
      * Gets the samplerY name associated with this texture
      */
    def samplerYName: Nullable[String] = js.native
    
    /**
      * Gets the samplerZ name associated with this texture
      */
    def samplerZName: Nullable[String] = js.native
    
    /**
      * Gets the sharpness input component
      */
    def sharpness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the source input component
      */
    def source: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sourceY input component
      */
    def sourceY: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sourceZ input component
      */
    def sourceZ: Nullable[NodeMaterialConnectionPoint] = js.native
    
    /**
      * Gets or sets the texture associated with the node
      */
    def texture: Nullable[Texture] = js.native
    
    /**
      * Gets the textureY associated with the node
      */
    def textureY: Nullable[Texture] = js.native
    
    /**
      * Gets the textureZ associated with the node
      */
    def textureZ: Nullable[Texture] = js.native
    
    def texture_=(texture: Nullable[Texture]): Unit = js.native
  }
}
