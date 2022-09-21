package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryFileAssetTask
  extends StObject
     with AbstractAssetTask {
  
  /**
    * Gets the loaded data (as an array buffer)
    */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: BinaryFileAssetTask): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String, exception: Any): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: Unit, exception: Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: BinaryFileAssetTask): Unit = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
