package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load 2D textures
  */
@JSGlobal("BABYLON.TextureAssetTask")
@js.native
class TextureAssetTask protected ()
  extends AbstractAssetTask
     with ITextureAssetTask[Texture] {
  /**
    * Creates a new TextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param noMipmap defines if mipmap should not be generated (default is false)
    * @param invertY defines if texture must be inverted on Y axis (default is false)
    * @param samplingMode defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing], /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: scala.Boolean) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing], /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: js.UndefOr[scala.Nothing], /**
    * Defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: scala.Double) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing], /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: scala.Boolean, /**
    * Defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: scala.Double) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: js.UndefOr[scala.Nothing], /**
    * Defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: scala.Double) = this()
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String, /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: scala.Boolean, /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: scala.Boolean, /**
    * Defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: scala.Double) = this()
  /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  var invertY: js.UndefOr[scala.Boolean] = js.native
  /**
    * Defines if mipmap should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[scala.Boolean] = js.native
  /**
    * Defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    */
  var samplingMode: scala.Double = js.native
  /**
    * Gets the loaded texture
    */
  /* CompleteClass */
  override var texture: Texture = js.native
  /**
    * Defines the location of the file to load
    */
  var url: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextureAssetTask): scala.Unit = js.native
  def onError(task: TextureAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: TextureAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextureAssetTask): scala.Unit = js.native
}

