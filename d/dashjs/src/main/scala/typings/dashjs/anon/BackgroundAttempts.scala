package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundAttempts extends StObject {
  
  var backgroundAttempts: js.UndefOr[Double] = js.undefined
  
  var defaultTimingSource: js.UndefOr[Scheme] = js.undefined
  
  var enableBackgroundSyncAfterSegmentDownloadError: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var maximumAllowedDrift: js.UndefOr[Double] = js.undefined
  
  var maximumTimeBetweenSyncAttempts: js.UndefOr[Double] = js.undefined
  
  var minimumTimeBetweenSyncAttempts: js.UndefOr[Double] = js.undefined
  
  var timeBetweenSyncAttempts: js.UndefOr[Double] = js.undefined
  
  var timeBetweenSyncAttemptsAdjustmentFactor: js.UndefOr[Double] = js.undefined
  
  var useManifestDateHeaderTimeSource: js.UndefOr[Boolean] = js.undefined
}
object BackgroundAttempts {
  
  inline def apply(): BackgroundAttempts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundAttempts]
  }
  
  extension [Self <: BackgroundAttempts](x: Self) {
    
    inline def setBackgroundAttempts(value: Double): Self = StObject.set(x, "backgroundAttempts", value.asInstanceOf[js.Any])
    
    inline def setBackgroundAttemptsUndefined: Self = StObject.set(x, "backgroundAttempts", js.undefined)
    
    inline def setDefaultTimingSource(value: Scheme): Self = StObject.set(x, "defaultTimingSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimingSourceUndefined: Self = StObject.set(x, "defaultTimingSource", js.undefined)
    
    inline def setEnableBackgroundSyncAfterSegmentDownloadError(value: Boolean): Self = StObject.set(x, "enableBackgroundSyncAfterSegmentDownloadError", value.asInstanceOf[js.Any])
    
    inline def setEnableBackgroundSyncAfterSegmentDownloadErrorUndefined: Self = StObject.set(x, "enableBackgroundSyncAfterSegmentDownloadError", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaximumAllowedDrift(value: Double): Self = StObject.set(x, "maximumAllowedDrift", value.asInstanceOf[js.Any])
    
    inline def setMaximumAllowedDriftUndefined: Self = StObject.set(x, "maximumAllowedDrift", js.undefined)
    
    inline def setMaximumTimeBetweenSyncAttempts(value: Double): Self = StObject.set(x, "maximumTimeBetweenSyncAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumTimeBetweenSyncAttemptsUndefined: Self = StObject.set(x, "maximumTimeBetweenSyncAttempts", js.undefined)
    
    inline def setMinimumTimeBetweenSyncAttempts(value: Double): Self = StObject.set(x, "minimumTimeBetweenSyncAttempts", value.asInstanceOf[js.Any])
    
    inline def setMinimumTimeBetweenSyncAttemptsUndefined: Self = StObject.set(x, "minimumTimeBetweenSyncAttempts", js.undefined)
    
    inline def setTimeBetweenSyncAttempts(value: Double): Self = StObject.set(x, "timeBetweenSyncAttempts", value.asInstanceOf[js.Any])
    
    inline def setTimeBetweenSyncAttemptsAdjustmentFactor(value: Double): Self = StObject.set(x, "timeBetweenSyncAttemptsAdjustmentFactor", value.asInstanceOf[js.Any])
    
    inline def setTimeBetweenSyncAttemptsAdjustmentFactorUndefined: Self = StObject.set(x, "timeBetweenSyncAttemptsAdjustmentFactor", js.undefined)
    
    inline def setTimeBetweenSyncAttemptsUndefined: Self = StObject.set(x, "timeBetweenSyncAttempts", js.undefined)
    
    inline def setUseManifestDateHeaderTimeSource(value: Boolean): Self = StObject.set(x, "useManifestDateHeaderTimeSource", value.asInstanceOf[js.Any])
    
    inline def setUseManifestDateHeaderTimeSourceUndefined: Self = StObject.set(x, "useManifestDateHeaderTimeSource", js.undefined)
  }
}
