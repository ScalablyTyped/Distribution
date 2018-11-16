package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Define a task used by AssetsManager to load cube textures
     */
@JSGlobal("BABYLON.CubeTextureAssetTask")
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
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.Array[java.lang.String]) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.Array[java.lang.String], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: scala.Boolean) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.UndefOr[scala.Nothing], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: scala.Boolean) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.Array[java.lang.String], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: js.UndefOr[scala.Nothing], /**
           * Defines the explicit list of files (undefined by default)
           */
  files: js.Array[java.lang.String]) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.Array[java.lang.String], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: scala.Boolean, /**
           * Defines the explicit list of files (undefined by default)
           */
  files: js.Array[java.lang.String]) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.UndefOr[scala.Nothing], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: js.UndefOr[scala.Nothing], /**
           * Defines the explicit list of files (undefined by default)
           */
  files: js.Array[java.lang.String]) = this()
  /**
           * Creates a new CubeTextureAssetTask
           * @param name defines the name of the task
           * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           * @param noMipmap defines if mipmaps should not be generated (default is false)
           * @param files defines the explicit list of files (undefined by default)
           */
  def this(/**
           * Defines the name of the task
           */
  name: java.lang.String, /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  url: java.lang.String, /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  extensions: js.UndefOr[scala.Nothing], /**
           * Defines if mipmaps should not be generated (default is false)
           */
  noMipmap: scala.Boolean, /**
           * Defines the explicit list of files (undefined by default)
           */
  files: js.Array[java.lang.String]) = this()
  /**
           * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
           */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
           * Defines the explicit list of files (undefined by default)
           */
  var files: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
           * Defines if mipmaps should not be generated (default is false)
           */
  var noMipmap: js.UndefOr[scala.Boolean] = js.native
  /**
           * Gets the loaded texture
           */
  /* CompleteClass */
  override var texture: CubeTexture = js.native
  /**
           * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
           */
  var url: java.lang.String = js.native
  /**
           * Callback called when the task is successful
           */
  def onError(task: CubeTextureAssetTask): scala.Unit = js.native
  /**
           * Callback called when the task is successful
           */
  def onError(task: CubeTextureAssetTask, message: java.lang.String): scala.Unit = js.native
  /**
           * Callback called when the task is successful
           */
  def onError(task: CubeTextureAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
           * Callback called when the task is successful
           */
  def onSuccess(task: CubeTextureAssetTask): scala.Unit = js.native
}

