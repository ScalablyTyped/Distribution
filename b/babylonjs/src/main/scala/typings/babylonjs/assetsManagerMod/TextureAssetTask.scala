package typings.babylonjs.assetsManagerMod

import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/assetsManager", "TextureAssetTask")
@js.native
class TextureAssetTask protected ()
  extends AbstractAssetTask
     with ITextureAssetTask[Texture] {
  /**
    * Creates a new TextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param noMipmap defines if mipmap should not be generated (default is false)
    * @param invertY defines if texture must be inverted on Y axis (default is true)
    * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String
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
    * Defines if mipmap should not be generated (default is false)
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: Boolean
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: Boolean
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: js.UndefOr[scala.Nothing],
    /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: Double
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: Boolean,
    /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: Double
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: js.UndefOr[scala.Nothing],
    /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: Double
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
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  invertY: Boolean,
    /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: Double
  ) = this()
  
  /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  var invertY: Boolean = js.native
  
  /**
    * Defines if mipmap should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextureAssetTask): Unit = js.native
  def onError(task: TextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: TextureAssetTask, message: String): Unit = js.native
  def onError(task: TextureAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextureAssetTask): Unit = js.native
  
  /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  var samplingMode: Double = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
