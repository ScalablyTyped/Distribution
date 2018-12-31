package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to share progress information about assets loading
  */
@JSGlobal("BABYLON.AssetsProgressEvent")
@js.native
class AssetsProgressEvent protected () extends IAssetsProgressEvent {
  /**
    * Creates a AssetsProgressEvent
    * @param remainingCount defines the number of remaining tasks to process
    * @param totalCount defines the total number of tasks
    * @param task defines the task that was just processed
    */
  def this(remainingCount: scala.Double, totalCount: scala.Double, task: AbstractAssetTask) = this()
  /**
    * Defines the number of remaining tasks to process
    */
  /* CompleteClass */
  override var remainingCount: scala.Double = js.native
  /**
    * Defines the task that was just processed
    */
  /* CompleteClass */
  override var task: AbstractAssetTask = js.native
  /**
    * Defines the total number of tasks
    */
  /* CompleteClass */
  override var totalCount: scala.Double = js.native
}

