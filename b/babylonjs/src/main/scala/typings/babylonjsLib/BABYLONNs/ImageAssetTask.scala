package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load images
  */
@JSGlobal("BABYLON.ImageAssetTask")
@js.native
class ImageAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new ImageAssetTask
    * @param name defines the name of the task
    * @param url defines the location of the image to load
    */
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the image to load
    */
  url: java.lang.String) = this()
  /**
    * Gets the loaded images
    */
  var image: stdLib.HTMLImageElement = js.native
  /**
    * Defines the location of the image to load
    */
  var url: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: ImageAssetTask): scala.Unit = js.native
  def onError(task: ImageAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: ImageAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: ImageAssetTask): scala.Unit = js.native
}

