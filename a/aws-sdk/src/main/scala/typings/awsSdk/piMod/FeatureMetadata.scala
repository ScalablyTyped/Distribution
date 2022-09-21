package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureMetadata extends StObject {
  
  /**
    * The status of the feature on the DB instance. Possible values include the following:    ENABLED - The feature is enabled on the instance.    DISABLED - The feature is disabled on the instance.    UNSUPPORTED - The feature isn't supported on the instance.    ENABLED_PENDING_REBOOT - The feature is enabled on the instance but requires a reboot to take effect.    DISABLED_PENDING_REBOOT - The feature is disabled on the instance but requires a reboot to take effect.    UNKNOWN - The feature status couldn't be determined.  
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object FeatureMetadata {
  
  inline def apply(): FeatureMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureMetadata]
  }
  
  extension [Self <: FeatureMetadata](x: Self) {
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
