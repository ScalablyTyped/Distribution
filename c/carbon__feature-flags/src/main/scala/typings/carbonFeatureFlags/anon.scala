package typings.carbonFeatureFlags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.Record<@carbon/feature-flags.@carbon/feature-flags.FeatureFlagName, boolean>> */
  trait PartialRecordFeatureFlagN extends StObject {
    
    var `enable-css-custom-properties`: js.UndefOr[Boolean] = js.undefined
    
    var `enable-css-grid`: js.UndefOr[Boolean] = js.undefined
    
    var `enable-use-controlled-state-with-value`: js.UndefOr[Boolean] = js.undefined
    
    var `enable-v11-release`: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRecordFeatureFlagN {
    
    inline def apply(): PartialRecordFeatureFlagN = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordFeatureFlagN]
    }
    
    extension [Self <: PartialRecordFeatureFlagN](x: Self) {
      
      inline def `setEnable-css-custom-properties`(value: Boolean): Self = StObject.set(x, "enable-css-custom-properties", value.asInstanceOf[js.Any])
      
      inline def `setEnable-css-custom-propertiesUndefined`: Self = StObject.set(x, "enable-css-custom-properties", js.undefined)
      
      inline def `setEnable-css-grid`(value: Boolean): Self = StObject.set(x, "enable-css-grid", value.asInstanceOf[js.Any])
      
      inline def `setEnable-css-gridUndefined`: Self = StObject.set(x, "enable-css-grid", js.undefined)
      
      inline def `setEnable-use-controlled-state-with-value`(value: Boolean): Self = StObject.set(x, "enable-use-controlled-state-with-value", value.asInstanceOf[js.Any])
      
      inline def `setEnable-use-controlled-state-with-valueUndefined`: Self = StObject.set(x, "enable-use-controlled-state-with-value", js.undefined)
      
      inline def `setEnable-v11-release`(value: Boolean): Self = StObject.set(x, "enable-v11-release", value.asInstanceOf[js.Any])
      
      inline def `setEnable-v11-releaseUndefined`: Self = StObject.set(x, "enable-v11-release", js.undefined)
    }
  }
}
