package typings.babylonjs.assetsManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssetsProgressEvent extends js.Object {
  /**
    * Defines the number of remaining tasks to process
    */
  var remainingCount: Double
  /**
    * Defines the task that was just processed
    */
  var task: AbstractAssetTask
  /**
    * Defines the total number of tasks
    */
  var totalCount: Double
}

object IAssetsProgressEvent {
  @scala.inline
  def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): IAssetsProgressEvent = {
    val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssetsProgressEvent]
  }
}

