package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/hdrCubeTexture", JSImport.Namespace)
@js.native
object hdrCubeTextureMod extends js.Object {
  @js.native
  class HDRCubeTexture protected () extends BaseTexture {
    /**
      * Instantiates an HDRTexture from the following parameters.
      *
      * @param url The location of the HDR raw data (Panorama stored in RGBE format)
      * @param scene The scene the texture will be used in
      * @param size The cubemap desired size (the more it increases the longer the generation will be)
      * @param noMipmap Forces to not generate the mipmap if true
      * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
      * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
      * @param reserved Reserved flag for internal use.
      */
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: js.UndefOr[Boolean],
      generateHarmonics: js.UndefOr[Boolean],
      gammaSpace: js.UndefOr[Boolean],
      reserved: js.UndefOr[Boolean],
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
    var _rotationY: Double = js.native
    var _size: js.Any = js.native
    var _textureMatrix: js.Any = js.native
    /**
      * Gets or sets the center of the bounding box associated with the cube texture
      * It must define where the camera used to render the texture was set
      */
    var boundingBoxPosition: Vector3 = js.native
    /**
      * The texture coordinates mode. As this texture is stored in a cube format, please modify carefully.
      */
    @JSName("coordinatesMode")
    var coordinatesMode_FHDRCubeTexture: Double = js.native
    /**
      * Occurs when the file is raw .hdr file.
      */
    var loadTexture: js.Any = js.native
    /**
      * The texture URL.
      */
    var url: String = js.native
    def boundingBoxSize(): Vector3 = js.native
    /**
      * Gets or sets the size of the bounding box associated with the cube texture
      * When defined, the cubemap will switch to local mode
      * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
      * @example https://www.babylonjs-playground.com/#RNASML
      */
    def boundingBoxSize(value: Vector3): js.Any = js.native
    /**
      * Sets wether or not the texture is blocking during loading.
      */
    def isBlocking(value: Boolean): js.Any = js.native
    /**
      * Gets texture matrix rotation angle around Y axis radians.
      */
    def rotationY(): Double = js.native
    /**
      * Sets texture matrix rotation angle around Y axis in radians.
      */
    def rotationY(value: Double): js.Any = js.native
    /**
      * Set the texture reflection matrix used to rotate/transform the reflection.
      * @param value Define the reflection matrix to set
      */
    def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  }
  
  /* static members */
  @js.native
  object HDRCubeTexture extends js.Object {
    var _facesMapping: js.Any = js.native
    /**
      * Parses a JSON representation of an HDR Texture in order to create the texture
      * @param parsedTexture Define the JSON representation
      * @param scene Define the scene the texture should be created in
      * @param rootUrl Define the root url in case we need to load relative dependencies
      * @returns the newly created texture after parsing
      */
    def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): Nullable[HDRCubeTexture] = js.native
  }
  
}

