package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load binary data
  */
@JSGlobal("BABYLON.BinaryFileAssetTask")
@js.native
class BinaryFileAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new BinaryFileAssetTask object
    * @param name defines the name of the new task
    * @param url defines the location of the file to load
    */
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the location of the file to load
    */
  url: java.lang.String) = this()
  /**
    * Gets the lodaded data (as an array buffer)
    */
  var data: stdLib.ArrayBuffer = js.native
  /**
    * Defines the location of the file to load
    */
  var url: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: BinaryFileAssetTask): scala.Unit = js.native
  def onError(task: BinaryFileAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: BinaryFileAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: BinaryFileAssetTask): scala.Unit = js.native
}

