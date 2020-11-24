package typings.babylonjs.assetsManagerMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/assetsManager", "BinaryFileAssetTask")
@js.native
class BinaryFileAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new BinaryFileAssetTask object
    * @param name defines the name of the new task
    * @param url defines the location of the file to load
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
  
  /**
    * Gets the lodaded data (as an array buffer)
    */
  var data: ArrayBuffer = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: BinaryFileAssetTask): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: BinaryFileAssetTask): Unit = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
