package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to share progress information about assets loading
     */
@JSImport("babylonjs", "AssetsProgressEvent")
@js.native
class AssetsProgressEvent protected ()
  extends babylonjsLib.BABYLONNs.AssetsProgressEvent {
  /**
           * Creates a AssetsProgressEvent
           * @param remainingCount defines the number of remaining tasks to process
           * @param totalCount defines the total number of tasks
           * @param task defines the task that was just processed
           */
  def this(remainingCount: scala.Double, totalCount: scala.Double, task: babylonjsLib.BABYLONNs.AbstractAssetTask) = this()
}

