package typings.babylonjs.engineTextureSelectorMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends js.Object {
  
  /** @hidden */
  var _excludedCompressedTextures: js.Array[String] = js.native
  
  /** @hidden */
  var _textureFormatInUse: String = js.native
  
  /**
    * Set the compressed texture extensions or file names to skip.
    *
    * @param skippedFiles defines the list of those texture files you want to skip
    * Example: [".dds", ".env", "myfile.png"]
    */
  def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
  
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
  def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String] = js.native
  
  /**
    * Gets the texture format in use
    */
  val textureFormatInUse: Nullable[String] = js.native
  
  /**
    * Gets the list of texture formats supported
    */
  val texturesSupported: js.Array[String] = js.native
}
object Engine {
  
  @scala.inline
  def apply(
    _excludedCompressedTextures: js.Array[String],
    _textureFormatInUse: String,
    setCompressedTextureExclusions: js.Array[String] => Unit,
    setTextureFormatToUse: js.Array[String] => Nullable[String],
    texturesSupported: js.Array[String]
  ): Engine = {
    val __obj = js.Dynamic.literal(_excludedCompressedTextures = _excludedCompressedTextures.asInstanceOf[js.Any], _textureFormatInUse = _textureFormatInUse.asInstanceOf[js.Any], setCompressedTextureExclusions = js.Any.fromFunction1(setCompressedTextureExclusions), setTextureFormatToUse = js.Any.fromFunction1(setTextureFormatToUse), texturesSupported = texturesSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_excludedCompressedTexturesVarargs(value: String*): Self = this.set("_excludedCompressedTextures", js.Array(value :_*))
    
    @scala.inline
    def set_excludedCompressedTextures(value: js.Array[String]): Self = this.set("_excludedCompressedTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textureFormatInUse(value: String): Self = this.set("_textureFormatInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCompressedTextureExclusions(value: js.Array[String] => Unit): Self = this.set("setCompressedTextureExclusions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextureFormatToUse(value: js.Array[String] => Nullable[String]): Self = this.set("setTextureFormatToUse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTexturesSupportedVarargs(value: String*): Self = this.set("texturesSupported", js.Array(value :_*))
    
    @scala.inline
    def setTexturesSupported(value: js.Array[String]): Self = this.set("texturesSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFormatInUse(value: Nullable[String]): Self = this.set("textureFormatInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFormatInUseNull: Self = this.set("textureFormatInUse", null)
  }
}
