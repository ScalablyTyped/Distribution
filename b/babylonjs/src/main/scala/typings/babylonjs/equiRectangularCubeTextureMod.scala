package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", JSImport.Namespace)
@js.native
object equiRectangularCubeTextureMod extends js.Object {
  @js.native
  class EquiRectangularCubeTexture protected () extends BaseTexture {
    /**
      * Instantiates an EquiRectangularCubeTexture from the following parameters.
      * @param url The location of the image
      * @param scene The scene the texture will be used in
      * @param size The cubemap desired size (the more it increases the longer the generation will be)
      * @param noMipmap Forces to not generate the mipmap if true
      * @param gammaSpace Specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
      * @param onLoad — defines a callback called when texture is loaded
      * @param onError — defines a callback called if there is an error
      */
    def this(url: String, scene: Scene, size: Double) = this()
    def this(url: String, scene: Scene, size: Double, noMipmap: Boolean) = this()
    def this(url: String, scene: Scene, size: Double, noMipmap: Boolean, gammaSpace: Boolean) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    /** The buffer of the image. */
    var _buffer: js.Any = js.native
    /** The height of the input image. */
    var _height: js.Any = js.native
    var _noMipmap: js.Any = js.native
    var _onError: js.Any = js.native
    var _onLoad: js.Any = js.native
    /** The size of the cubemap. */
    var _size: js.Any = js.native
    /** The width of the input image. */
    var _width: js.Any = js.native
    /** The texture coordinates mode. As this texture is stored in a cube format, please modify carefully. */
    @JSName("coordinatesMode")
    var coordinatesMode_FEquiRectangularCubeTexture: Double = js.native
    /**
      * Convert the ArrayBuffer into a Float32Array and drop the transparency channel.
      * @param buffer The ArrayBuffer that should be converted.
      * @returns The buffer as Float32Array.
      */
    var getFloat32ArrayFromArrayBuffer: js.Any = js.native
    /**
      * Load the image data, by putting the image on a canvas and extracting its buffer.
      */
    var loadImage: js.Any = js.native
    /**
      * Convert the image buffer into a cubemap and create a CubeTexture.
      */
    var loadTexture: js.Any = js.native
    /** The URL to the image. */
    var url: String = js.native
  }
  
  /* static members */
  @js.native
  object EquiRectangularCubeTexture extends js.Object {
    /** The six faces of the cube. */
    var _FacesMapping: js.Any = js.native
  }
  
}

