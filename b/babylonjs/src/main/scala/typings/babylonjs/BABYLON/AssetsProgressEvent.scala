package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AssetsProgressEvent")
@js.native
class AssetsProgressEvent protected () extends IAssetsProgressEvent {
  /**
    * Creates a AssetsProgressEvent
    * @param remainingCount defines the number of remaining tasks to process
    * @param totalCount defines the total number of tasks
    * @param task defines the task that was just processed
    */
  def this(remainingCount: Double, totalCount: Double, task: AbstractAssetTask) = this()
  /**
    * Defines the number of remaining tasks to process
    */
  /* CompleteClass */
  override var remainingCount: Double = js.native
  /**
    * Defines the task that was just processed
    */
  /* CompleteClass */
  override var task: AbstractAssetTask = js.native
  /**
    * Defines the total number of tasks
    */
  /* CompleteClass */
  override var totalCount: Double = js.native
}

