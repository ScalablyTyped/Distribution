package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OcclusionDataStorage extends StObject {
  
  /** @hidden */
  var forceRenderingWhenOccluded: Boolean
  
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
  
  inline def apply(
    forceRenderingWhenOccluded: Boolean,
    isOccluded: Boolean,
    isOcclusionQueryInProgress: Boolean,
    occlusionInternalRetryCounter: Double,
    occlusionQueryAlgorithmType: Double,
    occlusionRetryCount: Double,
    occlusionType: Double
  ): OcclusionDataStorage = {
    val __obj = js.Dynamic.literal(forceRenderingWhenOccluded = forceRenderingWhenOccluded.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionInternalRetryCounter = occlusionInternalRetryCounter.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcclusionDataStorage]
  }
  
  extension [Self <: OcclusionDataStorage](x: Self) {
    
    inline def setForceRenderingWhenOccluded(value: Boolean): Self = StObject.set(x, "forceRenderingWhenOccluded", value.asInstanceOf[js.Any])
    
    inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
    
    inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
    
    inline def setOcclusionInternalRetryCounter(value: Double): Self = StObject.set(x, "occlusionInternalRetryCounter", value.asInstanceOf[js.Any])
    
    inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
    
    inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
  }
}
