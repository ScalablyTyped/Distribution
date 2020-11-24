package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/khronosTextureContainer", JSImport.Namespace)
@js.native
object khronosTextureContainerMod extends js.Object {
  
  @js.native
  class KhronosTextureContainer protected () extends js.Object {
    /**
      * Creates a new KhronosTextureContainer
      * @param data contents of the KTX container file
      * @param facesExpected should be either 1 or 6, based whether a cube texture or or
      * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
      * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
      */
    def this(/** contents of the KTX container file */
    data: ArrayBufferView, facesExpected: Double) = this()
    def this(
      /** contents of the KTX container file */
    data: ArrayBufferView,
      facesExpected: Double,
      threeDExpected: Boolean
    ) = this()
    def this(
      /** contents of the KTX container file */
    data: ArrayBufferView,
      facesExpected: Double,
      threeDExpected: js.UndefOr[scala.Nothing],
      textureArrayExpected: Boolean
    ) = this()
    def this(
      /** contents of the KTX container file */
    data: ArrayBufferView,
      facesExpected: Double,
      threeDExpected: Boolean,
      textureArrayExpected: Boolean
    ) = this()
    
    var _upload2DCompressedLevels: js.Any = js.native
    
    /**
      * Gets the bytes of key value data
      */
    var bytesOfKeyValueData: Double = js.native
    
    /** contents of the KTX container file */
    var data: ArrayBufferView = js.native
    
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
      * @hidden
      */
    def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object KhronosTextureContainer extends js.Object {
    
    var COMPRESSED_2D: js.Any = js.native
    
    var COMPRESSED_3D: js.Any = js.native
    
    var HEADER_LEN: js.Any = js.native
    
    /**
      * Checks if the given data starts with a KTX file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX file or false otherwise
      */
    def IsValid(data: ArrayBufferView): Boolean = js.native
    
    var TEX_2D: js.Any = js.native
    
    var TEX_3D: js.Any = js.native
  }
}
