package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AssetsProgressEvent")
@js.native
class AssetsProgressEvent protected ()
  extends typings.babylonjs.miscIndexMod.AssetsProgressEvent {
  /**
    * Creates a AssetsProgressEvent
    * @param remainingCount defines the number of remaining tasks to process
    * @param totalCount defines the total number of tasks
    * @param task defines the task that was just processed
    */
  def this(
    remainingCount: Double,
    totalCount: Double,
    task: typings.babylonjs.assetsManagerMod.AbstractAssetTask
  ) = this()
}

