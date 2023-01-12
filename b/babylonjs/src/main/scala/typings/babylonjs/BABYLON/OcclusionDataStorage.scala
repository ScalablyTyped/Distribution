package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OcclusionDataStorage extends StObject {
  
  /** @internal */
  var forceRenderingWhenOccluded: Boolean
  
  /** @internal */
  var isOccluded: Boolean
  
  /** @internal */
  var isOcclusionQueryInProgress: Boolean
  
  /** @internal */
  var occlusionInternalRetryCounter: Double
  
  /** @internal */
  var occlusionQueryAlgorithmType: Double
  
  /** @internal */
  var occlusionRetryCount: Double
  
  /** @internal */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OcclusionDataStorage] (val x: Self) extends AnyVal {
    
    inline def setForceRenderingWhenOccluded(value: Boolean): Self = StObject.set(x, "forceRenderingWhenOccluded", value.asInstanceOf[js.Any])
    
    inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
    
    inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
    
    inline def setOcclusionInternalRetryCounter(value: Double): Self = StObject.set(x, "occlusionInternalRetryCounter", value.asInstanceOf[js.Any])
    
    inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
    
    inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
  }
}
