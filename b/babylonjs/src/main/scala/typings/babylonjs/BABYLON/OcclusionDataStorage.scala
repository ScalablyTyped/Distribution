package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OcclusionDataStorage extends js.Object {
  
  /** @hidden */
  var isOccluded: Boolean = js.native
  
  /** @hidden */
  var isOcclusionQueryInProgress: Boolean = js.native
  
  /** @hidden */
  var occlusionInternalRetryCounter: Double = js.native
  
  /** @hidden */
  var occlusionQueryAlgorithmType: Double = js.native
  
  /** @hidden */
  var occlusionRetryCount: Double = js.native
  
  /** @hidden */
  var occlusionType: Double = js.native
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
  
  @scala.inline
  implicit class OcclusionDataStorageOps[Self <: OcclusionDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsOccluded(value: Boolean): Self = this.set("isOccluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOcclusionQueryInProgress(value: Boolean): Self = this.set("isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionInternalRetryCounter(value: Double): Self = this.set("occlusionInternalRetryCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionQueryAlgorithmType(value: Double): Self = this.set("occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionRetryCount(value: Double): Self = this.set("occlusionRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionType(value: Double): Self = this.set("occlusionType", value.asInstanceOf[js.Any])
  }
}
