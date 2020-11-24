package typings.babylonjs.assetsManagerMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/assetsManager", "ImageAssetTask")
@js.native
class ImageAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new ImageAssetTask
    * @param name defines the name of the task
    * @param url defines the location of the image to load
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the image to load
    */
  url: String
  ) = this()
  
  /**
    * Gets the loaded images
    */
  var image: HTMLImageElement = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: ImageAssetTask): Unit = js.native
  def onError(task: ImageAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: ImageAssetTask, message: String): Unit = js.native
  def onError(task: ImageAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: ImageAssetTask): Unit = js.native
  
  /**
    * Defines the location of the image to load
    */
  var url: String = js.native
}
