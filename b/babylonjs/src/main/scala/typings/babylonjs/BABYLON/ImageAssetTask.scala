package typings.babylonjs.BABYLON

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAssetTask
  extends StObject
     with AbstractAssetTask {
  
  /**
    * Gets the loaded images
    */
  var image: HTMLImageElement = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: ImageAssetTask): Unit = js.native
  def onError(task: ImageAssetTask, message: String): Unit = js.native
  def onError(task: ImageAssetTask, message: String, exception: Any): Unit = js.native
  def onError(task: ImageAssetTask, message: Unit, exception: Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: ImageAssetTask): Unit = js.native
  
  /**
    * Defines the location of the image to load
    */
  var url: String = js.native
}
