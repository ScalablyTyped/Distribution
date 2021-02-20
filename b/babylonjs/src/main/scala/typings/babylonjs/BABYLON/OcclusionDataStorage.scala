package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OcclusionDataStorage extends StObject {
  
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
  implicit class OcclusionDataStorageMutableBuilder[Self <: OcclusionDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionInternalRetryCounter(value: Double): Self = StObject.set(x, "occlusionInternalRetryCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
  }
}
