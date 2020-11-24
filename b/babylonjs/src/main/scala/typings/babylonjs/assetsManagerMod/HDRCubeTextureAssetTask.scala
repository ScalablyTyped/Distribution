package typings.babylonjs.assetsManagerMod

import typings.babylonjs.hdrCubeTextureMod.HDRCubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/assetsManager", "HDRCubeTextureAssetTask")
@js.native
class HDRCubeTextureAssetTask protected ()
  extends AbstractAssetTask
     with ITextureAssetTask[HDRCubeTexture] {
  /**
    * Creates a new HDRCubeTextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param size defines the desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
    * @param noMipmap defines if mipmaps should not be generated (default is false)
    * @param generateHarmonics specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    * @param reserved Internal use only
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: js.UndefOr[scala.Nothing],
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean,
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: js.UndefOr[scala.Nothing],
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean,
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: js.UndefOr[scala.Nothing],
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: js.UndefOr[scala.Nothing],
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean,
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: js.UndefOr[scala.Nothing],
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: Double,
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: Boolean,
    /**
    * Internal Use Only
    */
  reserved: Boolean
  ) = this()
  
  /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  var gammaSpace: Boolean = js.native
  
  /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  var generateHarmonics: Boolean = js.native
  
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: Boolean = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: HDRCubeTextureAssetTask): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: HDRCubeTextureAssetTask): Unit = js.native
  
  /**
    * Internal Use Only
    */
  var reserved: Boolean = js.native
  
  /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  var size: Double = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
