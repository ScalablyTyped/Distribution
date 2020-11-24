package typings.babylonjs.assetsManagerMod

import typings.babylonjs.cubeTextureMod.CubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/assetsManager", "CubeTextureAssetTask")
@js.native
class CubeTextureAssetTask protected ()
  extends AbstractAssetTask
     with ITextureAssetTask[CubeTexture] {
  /**
    * Creates a new CubeTextureAssetTask
    * @param name defines the name of the task
    * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    * @param noMipmap defines if mipmaps should not be generated (default is false)
    * @param files defines the explicit list of files (undefined by default)
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.Array[String]
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.UndefOr[scala.Nothing],
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
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.Array[String],
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
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.UndefOr[scala.Nothing],
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Defines the explicit list of files (undefined by default)
    */
  files: js.Array[String]
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.UndefOr[scala.Nothing],
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines the explicit list of files (undefined by default)
    */
  files: js.Array[String]
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.Array[String],
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: js.UndefOr[scala.Nothing],
    /**
    * Defines the explicit list of files (undefined by default)
    */
  files: js.Array[String]
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  url: String,
    /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  extensions: js.Array[String],
    /**
    * Defines if mipmaps should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines the explicit list of files (undefined by default)
    */
  files: js.Array[String]
  ) = this()
  
  /**
    * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines the explicit list of files (undefined by default)
    */
  var files: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines if mipmaps should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: CubeTextureAssetTask): Unit = js.native
  def onError(task: CubeTextureAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: CubeTextureAssetTask, message: String): Unit = js.native
  def onError(task: CubeTextureAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: CubeTextureAssetTask): Unit = js.native
  
  /**
    * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
    */
  var url: String = js.native
}
