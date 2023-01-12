package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferPruningInterval extends StObject {
  
  var bufferPruningInterval: js.UndefOr[Double] = js.undefined
  
  var bufferTimeAtTopQuality: js.UndefOr[Double] = js.undefined
  
  var bufferTimeAtTopQualityLongForm: js.UndefOr[Double] = js.undefined
  
  var bufferToKeep: js.UndefOr[Double] = js.undefined
  
  var enableSeekDecorrelationFix: js.UndefOr[Boolean] = js.undefined
  
  var fastSwitchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var flushBufferAtTrackSwitch: js.UndefOr[Boolean] = js.undefined
  
  var initialBufferLevel: js.UndefOr[Double] = js.undefined
  
  var longFormContentDurationThreshold: js.UndefOr[Double] = js.undefined
  
  var reuseExistingSourceBuffers: js.UndefOr[Boolean] = js.undefined
  
  var setStallState: js.UndefOr[Boolean] = js.undefined
  
  var stableBufferTime: js.UndefOr[Double] = js.undefined
  
  var stallThreshold: js.UndefOr[Double] = js.undefined
  
  var useAppendWindow: js.UndefOr[Boolean] = js.undefined
}
object BufferPruningInterval {
  
  inline def apply(): BufferPruningInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferPruningInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferPruningInterval] (val x: Self) extends AnyVal {
    
    inline def setBufferPruningInterval(value: Double): Self = StObject.set(x, "bufferPruningInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferPruningIntervalUndefined: Self = StObject.set(x, "bufferPruningInterval", js.undefined)
    
    inline def setBufferTimeAtTopQuality(value: Double): Self = StObject.set(x, "bufferTimeAtTopQuality", value.asInstanceOf[js.Any])
    
    inline def setBufferTimeAtTopQualityLongForm(value: Double): Self = StObject.set(x, "bufferTimeAtTopQualityLongForm", value.asInstanceOf[js.Any])
    
    inline def setBufferTimeAtTopQualityLongFormUndefined: Self = StObject.set(x, "bufferTimeAtTopQualityLongForm", js.undefined)
    
    inline def setBufferTimeAtTopQualityUndefined: Self = StObject.set(x, "bufferTimeAtTopQuality", js.undefined)
    
    inline def setBufferToKeep(value: Double): Self = StObject.set(x, "bufferToKeep", value.asInstanceOf[js.Any])
    
    inline def setBufferToKeepUndefined: Self = StObject.set(x, "bufferToKeep", js.undefined)
    
    inline def setEnableSeekDecorrelationFix(value: Boolean): Self = StObject.set(x, "enableSeekDecorrelationFix", value.asInstanceOf[js.Any])
    
    inline def setEnableSeekDecorrelationFixUndefined: Self = StObject.set(x, "enableSeekDecorrelationFix", js.undefined)
    
    inline def setFastSwitchEnabled(value: Boolean): Self = StObject.set(x, "fastSwitchEnabled", value.asInstanceOf[js.Any])
    
    inline def setFastSwitchEnabledUndefined: Self = StObject.set(x, "fastSwitchEnabled", js.undefined)
    
    inline def setFlushBufferAtTrackSwitch(value: Boolean): Self = StObject.set(x, "flushBufferAtTrackSwitch", value.asInstanceOf[js.Any])
    
    inline def setFlushBufferAtTrackSwitchUndefined: Self = StObject.set(x, "flushBufferAtTrackSwitch", js.undefined)
    
    inline def setInitialBufferLevel(value: Double): Self = StObject.set(x, "initialBufferLevel", value.asInstanceOf[js.Any])
    
    inline def setInitialBufferLevelUndefined: Self = StObject.set(x, "initialBufferLevel", js.undefined)
    
    inline def setLongFormContentDurationThreshold(value: Double): Self = StObject.set(x, "longFormContentDurationThreshold", value.asInstanceOf[js.Any])
    
    inline def setLongFormContentDurationThresholdUndefined: Self = StObject.set(x, "longFormContentDurationThreshold", js.undefined)
    
    inline def setReuseExistingSourceBuffers(value: Boolean): Self = StObject.set(x, "reuseExistingSourceBuffers", value.asInstanceOf[js.Any])
    
    inline def setReuseExistingSourceBuffersUndefined: Self = StObject.set(x, "reuseExistingSourceBuffers", js.undefined)
    
    inline def setSetStallState(value: Boolean): Self = StObject.set(x, "setStallState", value.asInstanceOf[js.Any])
    
    inline def setSetStallStateUndefined: Self = StObject.set(x, "setStallState", js.undefined)
    
    inline def setStableBufferTime(value: Double): Self = StObject.set(x, "stableBufferTime", value.asInstanceOf[js.Any])
    
    inline def setStableBufferTimeUndefined: Self = StObject.set(x, "stableBufferTime", js.undefined)
    
    inline def setStallThreshold(value: Double): Self = StObject.set(x, "stallThreshold", value.asInstanceOf[js.Any])
    
    inline def setStallThresholdUndefined: Self = StObject.set(x, "stallThreshold", js.undefined)
    
    inline def setUseAppendWindow(value: Boolean): Self = StObject.set(x, "useAppendWindow", value.asInstanceOf[js.Any])
    
    inline def setUseAppendWindowUndefined: Self = StObject.set(x, "useAppendWindow", js.undefined)
  }
}
