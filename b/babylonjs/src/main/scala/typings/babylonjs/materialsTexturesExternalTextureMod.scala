package typings.babylonjs

import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesExternalTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/externalTexture", "ExternalTexture")
  @js.native
  open class ExternalTexture protected () extends StObject {
    /**
      * Constructs the texture
      * @param video The video the texture should be wrapped around
      */
    def this(video: HTMLVideoElement) = this()
    
    /* private */ var _video: Any = js.native
    
    /**
      * Dispose the texture and release its associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the class name of the texture.
      * @returns "ExternalTexture"
      */
    def getClassName(): String = js.native
    
    /**
      * Get if the texture is ready to be used (downloaded, converted, mip mapped...).
      * @returns true if fully ready
      */
    def isReady(): Boolean = js.native
    
    /**
      * The type of the underlying texture is implementation dependent, so return "UNDEFINED" for the type
      */
    val `type`: Double = js.native
    
    /**
      * Gets the underlying texture object
      */
    def underlyingResource: Any = js.native
    
    /**
      * Gets the unique id of this texture
      */
    val uniqueId: Double = js.native
    
    /**
      * Gets a boolean indicating if the texture uses mipmaps
      */
    var useMipMaps: Boolean = js.native
  }
  /* static members */
  object ExternalTexture {
    
    @JSImport("babylonjs/Materials/Textures/externalTexture", "ExternalTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if a texture is an external or internal texture
      * @param texture the external or internal texture
      * @returns true if the texture is an external texture, else false
      */
    inline def IsExternalTexture(texture: ExternalTexture): /* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean]
    inline def IsExternalTexture(texture: InternalTexture): /* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean]
  }
}
