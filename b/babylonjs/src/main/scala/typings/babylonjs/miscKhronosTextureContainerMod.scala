package typings.babylonjs

import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscKhronosTextureContainerMod {
  
  @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer")
  @js.native
  open class KhronosTextureContainer protected () extends StObject {
    /**
      * Creates a new KhronosTextureContainer
      * @param data contents of the KTX container file
      * @param facesExpected should be either 1 or 6, based whether a cube texture or or
      */
    def this(
      /** contents of the KTX container file */
    data: js.typedarray.ArrayBufferView,
      facesExpected: Double
    ) = this()
    
    /* private */ var _upload2DCompressedLevels: Any = js.native
    
    /**
      * Gets the bytes of key value data
      */
    var bytesOfKeyValueData: Double = js.native
    
    /** contents of the KTX container file */
    var data: js.typedarray.ArrayBufferView = js.native
    
    /**
      * Gets the base internal format
      */
    var glBaseInternalFormat: Double = js.native
    
    /**
      * Gets the openGL format
      */
    var glFormat: Double = js.native
    
    /**
      * Gets the openGL internal format
      */
    var glInternalFormat: Double = js.native
    
    /**
      * Gets the openGL type
      */
    var glType: Double = js.native
    
    /**
      * Gets the openGL type size
      */
    var glTypeSize: Double = js.native
    
    /**
      * If the container has been made invalid (eg. constructor failed to correctly load array buffer)
      */
    var isInvalid: Boolean = js.native
    
    /**
      * Gets the load type
      */
    var loadType: Double = js.native
    
    /**
      * Gets the number of array elements
      */
    var numberOfArrayElements: Double = js.native
    
    /**
      * Gets the number of faces
      */
    var numberOfFaces: Double = js.native
    
    /**
      * Gets the number of mipmap levels
      */
    var numberOfMipmapLevels: Double = js.native
    
    /**
      * Gets image depth in pixels
      */
    var pixelDepth: Double = js.native
    
    /**
      * Gets image height in pixel
      */
    var pixelHeight: Double = js.native
    
    /**
      * Gets image width in pixel
      */
    var pixelWidth: Double = js.native
    
    /**
      * Uploads KTX content to a Babylon Texture.
      * It is assumed that the texture has already been created & is currently bound
      * @internal
      */
    def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit = js.native
  }
  /* static members */
  object KhronosTextureContainer {
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer.COMPRESSED_2D")
    @js.native
    def COMPRESSED_2D: Any = js.native
    inline def COMPRESSED_2D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_2D")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer.COMPRESSED_3D")
    @js.native
    def COMPRESSED_3D: Any = js.native
    inline def COMPRESSED_3D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_3D")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer.HEADER_LEN")
    @js.native
    def HEADER_LEN: Any = js.native
    inline def HEADER_LEN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_LEN")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if the given data starts with a KTX file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX file or false otherwise
      */
    inline def IsValid(data: js.typedarray.ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer.TEX_2D")
    @js.native
    def TEX_2D: Any = js.native
    inline def TEX_2D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_2D")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer", "KhronosTextureContainer.TEX_3D")
    @js.native
    def TEX_3D: Any = js.native
    inline def TEX_3D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_3D")(x.asInstanceOf[js.Any])
  }
}
