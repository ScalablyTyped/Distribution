package typings.babylonjs

import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesEquiRectangularCubeTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture")
  @js.native
  open class EquiRectangularCubeTexture protected () extends BaseTexture {
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
    def this(url: String, scene: Scene, size: Double, noMipmap: Unit, gammaSpace: Boolean) = this()
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
      gammaSpace: Unit,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Unit,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: Unit,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Unit,
      onLoad: Unit,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Unit,
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Boolean,
      onLoad: Unit,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Unit,
      onLoad: Unit,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Unit,
      gammaSpace: Unit,
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    
    /** The buffer of the image. */
    /* private */ var _buffer: Any = js.native
    
    /**
      * Convert the ArrayBuffer into a Float32Array and drop the transparency channel.
      * @param buffer The ArrayBuffer that should be converted.
      * @returns The buffer as Float32Array.
      */
    /* private */ var _getFloat32ArrayFromArrayBuffer: Any = js.native
    
    /** The height of the input image. */
    /* private */ var _height: Any = js.native
    
    /**
      * Load the image data, by putting the image on a canvas and extracting its buffer.
      * @param loadTextureCallback
      * @param onError
      */
    /* private */ var _loadImage: Any = js.native
    
    /**
      * Convert the image buffer into a cubemap and create a CubeTexture.
      */
    /* private */ var _loadTexture: Any = js.native
    
    /* private */ var _noMipmap: Any = js.native
    
    /* private */ var _onError: Any = js.native
    
    /* private */ var _onLoad: Any = js.native
    
    /** The size of the cubemap. */
    /* private */ var _size: Any = js.native
    
    /** The width of the input image. */
    /* private */ var _width: Any = js.native
    
    /** The URL to the image. */
    var url: String = js.native
  }
  /* static members */
  object EquiRectangularCubeTexture {
    
    @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /** The six faces of the cube. */
    @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture._FacesMapping")
    @js.native
    def _FacesMapping: Any = js.native
    inline def _FacesMapping_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FacesMapping")(x.asInstanceOf[js.Any])
  }
}
