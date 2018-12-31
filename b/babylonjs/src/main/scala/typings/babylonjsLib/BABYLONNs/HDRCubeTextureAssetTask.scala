package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load HDR cube textures
  */
@JSGlobal("BABYLON.HDRCubeTextureAssetTask")
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
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: scala.Double) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: scala.Double, /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: scala.Double, /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: scala.Double, /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: scala.Boolean, /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  size: scala.Double, /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  generateHarmonics: scala.Boolean, /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  gammaSpace: scala.Boolean, /**
    * Internal Use Only
    */
  reserved: scala.Boolean) = this()
  /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    */
  var gammaSpace: scala.Boolean = js.native
  /**
    * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
    */
  var generateHarmonics: scala.Boolean = js.native
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: scala.Boolean = js.native
  /**
    * Internal Use Only
    */
  var reserved: scala.Boolean = js.native
  /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  var size: scala.Double = js.native
  /**
    * Gets the loaded texture
    */
  /* CompleteClass */
  override var texture: HDRCubeTexture = js.native
  /**
    * Defines the location of the file to load
    */
  var url: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: HDRCubeTextureAssetTask): scala.Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: HDRCubeTextureAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: HDRCubeTextureAssetTask): scala.Unit = js.native
}

