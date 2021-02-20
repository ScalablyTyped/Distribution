package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdrCubeTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/hdrCubeTexture", "HDRCubeTexture")
  @js.native
  class HDRCubeTexture protected () extends BaseTexture {
    /**
      * Instantiates an HDRTexture from the following parameters.
      *
      * @param url The location of the HDR raw data (Panorama stored in RGBE format)
      * @param sceneOrEngine The scene or engine the texture will be used in
      * @param size The cubemap desired size (the more it increases the longer the generation will be)
      * @param noMipmap Forces to not generate the mipmap if true
      * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
      * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
      * @param prefilterOnLoad Prefilters HDR texture to allow use of this texture as a PBR reflection texture.
      */
    def this(
      url: String,
      sceneOrEngine: Scene | ThinEngine,
      size: Double,
      noMipmap: js.UndefOr[Boolean],
      generateHarmonics: js.UndefOr[Boolean],
      gammaSpace: js.UndefOr[Boolean],
      prefilterOnLoad: js.UndefOr[Boolean],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: js.UndefOr[
            Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
            ]
          ]
    ) = this()
    
    var _boundingBoxSize: js.Any = js.native
    
    var _generateHarmonics: js.Any = js.native
    
    var _isBlocking: Boolean = js.native
    
    var _noMipmap: js.Any = js.native
    
    var _onError: js.Any = js.native
    
    var _onLoad: js.Any = js.native
    
    var _prefilterOnLoad: js.Any = js.native
    
    var _rotationY: Double = js.native
    
    var _size: js.Any = js.native
    
    var _textureMatrix: js.Any = js.native
    
    /**
      * Gets or sets the center of the bounding box associated with the cube texture
      * It must define where the camera used to render the texture was set
      */
    var boundingBoxPosition: Vector3 = js.native
    
    def boundingBoxSize: Vector3 = js.native
    /**
      * Gets or sets the size of the bounding box associated with the cube texture
      * When defined, the cubemap will switch to local mode
      * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
      * @example https://www.babylonjs-playground.com/#RNASML
      */
    def boundingBoxSize_=(value: Vector3): Unit = js.native
    
    /**
      * Sets wether or not the texture is blocking during loading.
      */
    def isBlocking_=(value: Boolean): Unit = js.native
    
    /**
      * Occurs when the file is raw .hdr file.
      */
    var loadTexture: js.Any = js.native
    
    /**
      * Gets texture matrix rotation angle around Y axis radians.
      */
    def rotationY: Double = js.native
    /**
      * Sets texture matrix rotation angle around Y axis in radians.
      */
    def rotationY_=(value: Double): Unit = js.native
    
    /**
      * Set the texture reflection matrix used to rotate/transform the reflection.
      * @param value Define the reflection matrix to set
      */
    def setReflectionTextureMatrix(value: Matrix): Unit = js.native
    
    /**
      * The texture URL.
      */
    var url: String = js.native
  }
  /* static members */
  object HDRCubeTexture {
    
    @JSImport("babylonjs/Materials/Textures/hdrCubeTexture", "HDRCubeTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON representation of an HDR Texture in order to create the texture
      * @param parsedTexture Define the JSON representation
      * @param scene Define the scene the texture should be created in
      * @param rootUrl Define the root url in case we need to load relative dependencies
      * @returns the newly created texture after parsing
      */
    @JSImport("babylonjs/Materials/Textures/hdrCubeTexture", "HDRCubeTexture.Parse")
    @js.native
    def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): Nullable[HDRCubeTexture] = js.native
    
    @JSImport("babylonjs/Materials/Textures/hdrCubeTexture", "HDRCubeTexture._facesMapping")
    @js.native
    def _facesMapping: js.Any = js.native
    @scala.inline
    def _facesMapping_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_facesMapping")(x.asInstanceOf[js.Any])
  }
}
