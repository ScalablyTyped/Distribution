package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load HDR cube textures
  */
@JSImport("babylonjs", "HDRCubeTextureAssetTask")
@js.native
class HDRCubeTextureAssetTask protected ()
  extends babylonjsLib.BABYLONNs.HDRCubeTextureAssetTask {
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
}

