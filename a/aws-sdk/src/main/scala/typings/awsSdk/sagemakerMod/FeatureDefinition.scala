package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureDefinition extends StObject {
  
  /**
    * The name of a feature. The type must be a string. FeatureName cannot be any of the following: is_deleted, write_time, api_invocation_time.
    */
  var FeatureName: js.UndefOr[typings.awsSdk.sagemakerMod.FeatureName] = js.undefined
  
  /**
    * The value type of a feature. Valid values are Integral, Fractional, or String.
    */
  var FeatureType: js.UndefOr[typings.awsSdk.sagemakerMod.FeatureType] = js.undefined
}
object FeatureDefinition {
  
  inline def apply(): FeatureDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureDefinition]
  }
  
  extension [Self <: FeatureDefinition](x: Self) {
    
    inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "FeatureType", js.undefined)
  }
}
