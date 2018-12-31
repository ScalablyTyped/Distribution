package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define the interface used by progress events raised during assets loading
  */
trait IAssetsProgressEvent extends js.Object {
  /**
    * Defines the number of remaining tasks to process
    */
  var remainingCount: scala.Double
  /**
    * Defines the task that was just processed
    */
  var task: AbstractAssetTask
  /**
    * Defines the total number of tasks
    */
  var totalCount: scala.Double
}

