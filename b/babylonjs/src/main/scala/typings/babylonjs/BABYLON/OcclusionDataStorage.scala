package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OcclusionDataStorage extends js.Object {
  /** @hidden */
  var isOccluded: Boolean
  /** @hidden */
  var isOcclusionQueryInProgress: Boolean
  /** @hidden */
  var occlusionInternalRetryCounter: Double
  /** @hidden */
  var occlusionQueryAlgorithmType: Double
  /** @hidden */
  var occlusionRetryCount: Double
  /** @hidden */
  var occlusionType: Double
}

object OcclusionDataStorage {
  @scala.inline
  def apply(
    isOccluded: Boolean,
    isOcclusionQueryInProgress: Boolean,
    occlusionInternalRetryCounter: Double,
    occlusionQueryAlgorithmType: Double,
    occlusionRetryCount: Double,
    occlusionType: Double
  ): OcclusionDataStorage = {
    val __obj = js.Dynamic.literal(isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionInternalRetryCounter = occlusionInternalRetryCounter.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcclusionDataStorage]
  }
}

