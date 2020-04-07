package typings.babylonjs.assetsManagerMod

import typings.babylonjs.equiRectangularCubeTextureMod.EquiRectangularCubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/assetsManager", "EquiRectangularCubeTextureAssetTask")
@js.native
class EquiRectangularCubeTextureAssetTask protected ()
  extends AbstractAssetTask
     with ITextureAssetTask[EquiRectangularCubeTexture] {
  /**
    * Creates a new EquiRectangularCubeTextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param size defines the desired size (the more it increases the longer the generation will be)
    * If the size is omitted this implies you are using a preprocessed cubemap.
    * @param noMipmap defines if mipmaps should not be generated (default is false)
    * @param gammaSpace specifies if the texture will be used in gamma or linear space
    * (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * (default is true)
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
  noMipmap: Boolean,
    /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
    * but the standard material would require them in Gamma space) (default is true)
    */
  gammaSpace: Boolean
  ) = this()
  /**
    * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
    * but the standard material would require them in Gamma space) (default is true)
    */
  var gammaSpace: Boolean = js.native
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: Boolean = js.native
  /**
    * Defines the desired size (the more it increases the longer the generation will be)
    */
  var size: Double = js.native
  /**
    * Gets the loaded texture
    */
  /* CompleteClass */
  override var texture: EquiRectangularCubeTexture = js.native
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
  def onError(task: EquiRectangularCubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: EquiRectangularCubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
}

