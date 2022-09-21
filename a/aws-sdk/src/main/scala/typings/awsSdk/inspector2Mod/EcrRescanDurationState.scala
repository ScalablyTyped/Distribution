package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrRescanDurationState extends StObject {
  
  /**
    * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring state of that image becomes inactive and all associated findings are scheduled for closure.
    */
  var rescanDuration: js.UndefOr[EcrRescanDuration] = js.undefined
  
  /**
    * The status of changes to the ECR automated re-scan duration.
    */
  var status: js.UndefOr[EcrRescanDurationStatus] = js.undefined
  
  /**
    * A timestamp representing when the last time the ECR scan duration setting was changed.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object EcrRescanDurationState {
  
  inline def apply(): EcrRescanDurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrRescanDurationState]
  }
  
  extension [Self <: EcrRescanDurationState](x: Self) {
    
    inline def setRescanDuration(value: EcrRescanDuration): Self = StObject.set(x, "rescanDuration", value.asInstanceOf[js.Any])
    
    inline def setRescanDurationUndefined: Self = StObject.set(x, "rescanDuration", js.undefined)
    
    inline def setStatus(value: EcrRescanDurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
