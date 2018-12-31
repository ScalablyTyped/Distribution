package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load text content
  */
@JSGlobal("BABYLON.TextFileAssetTask")
@js.native
class TextFileAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new TextFileAssetTask object
    * @param name defines the name of the task
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
    * Gets the loaded text string
    */
  var text: java.lang.String = js.native
  /**
    * Defines the location of the file to load
    */
  var url: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextFileAssetTask): scala.Unit = js.native
  def onError(task: TextFileAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: TextFileAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextFileAssetTask): scala.Unit = js.native
}

