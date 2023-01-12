package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDottextureSelectorMod {
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /** @internal */
      var _excludedCompressedTextures: js.Array[String]
      
      /** @internal */
      var _textureFormatInUse: String
      
      /**
        * Set the compressed texture extensions or file names to skip.
        *
        * @param skippedFiles defines the list of those texture files you want to skip
        * Example: [".dds", ".env", "myfile.png"]
        */
      def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit
      
      /**
        * Set the compressed texture format to use, based on the formats you have, and the formats
        * supported by the hardware / browser.
        *
        * Khronos Texture Container (.ktx) files are used to support this.  This format has the
        * advantage of being specifically designed for OpenGL.  Header elements directly correspond
        * to API arguments needed to compressed textures.  This puts the burden on the container
        * generator to house the arcane code for determining these for current & future formats.
        *
        * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
        * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
        *
        * Note: The result of this call is not taken into account when a texture is base64.
        *
        * @param formatsAvailable defines the list of those format families you have created
        * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
        *
        * Current families are astc, dxt, pvrtc, etc2, & etc1.
        * @returns The extension selected.
        */
      def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String]
      
      /**
        * Gets the texture format in use
        */
      val textureFormatInUse: Nullable[String]
      
      /**
        * Gets the list of texture formats supported
        */
      val texturesSupported: js.Array[String]
    }
    object Engine {
      
      inline def apply(
        _excludedCompressedTextures: js.Array[String],
        _textureFormatInUse: String,
        setCompressedTextureExclusions: js.Array[String] => Unit,
        setTextureFormatToUse: js.Array[String] => Nullable[String],
        texturesSupported: js.Array[String]
      ): Engine = {
        val __obj = js.Dynamic.literal(_excludedCompressedTextures = _excludedCompressedTextures.asInstanceOf[js.Any], _textureFormatInUse = _textureFormatInUse.asInstanceOf[js.Any], setCompressedTextureExclusions = js.Any.fromFunction1(setCompressedTextureExclusions), setTextureFormatToUse = js.Any.fromFunction1(setTextureFormatToUse), texturesSupported = texturesSupported.asInstanceOf[js.Any], textureFormatInUse = null)
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        inline def setSetCompressedTextureExclusions(value: js.Array[String] => Unit): Self = StObject.set(x, "setCompressedTextureExclusions", js.Any.fromFunction1(value))
        
        inline def setSetTextureFormatToUse(value: js.Array[String] => Nullable[String]): Self = StObject.set(x, "setTextureFormatToUse", js.Any.fromFunction1(value))
        
        inline def setTextureFormatInUse(value: Nullable[String]): Self = StObject.set(x, "textureFormatInUse", value.asInstanceOf[js.Any])
        
        inline def setTextureFormatInUseNull: Self = StObject.set(x, "textureFormatInUse", null)
        
        inline def setTexturesSupported(value: js.Array[String]): Self = StObject.set(x, "texturesSupported", value.asInstanceOf[js.Any])
        
        inline def setTexturesSupportedVarargs(value: String*): Self = StObject.set(x, "texturesSupported", js.Array(value*))
        
        inline def set_excludedCompressedTextures(value: js.Array[String]): Self = StObject.set(x, "_excludedCompressedTextures", value.asInstanceOf[js.Any])
        
        inline def set_excludedCompressedTexturesVarargs(value: String*): Self = StObject.set(x, "_excludedCompressedTextures", js.Array(value*))
        
        inline def set_textureFormatInUse(value: String): Self = StObject.set(x, "_textureFormatInUse", value.asInstanceOf[js.Any])
      }
    }
  }
}
