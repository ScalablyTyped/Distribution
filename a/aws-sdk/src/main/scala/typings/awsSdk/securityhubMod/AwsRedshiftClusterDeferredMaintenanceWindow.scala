package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterDeferredMaintenanceWindow extends StObject {
  
  /**
    * The end of the time window for which maintenance was deferred. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var DeferMaintenanceEndTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The start of the time window for which maintenance was deferred. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var DeferMaintenanceStartTime: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterDeferredMaintenanceWindow {
  
  inline def apply(): AwsRedshiftClusterDeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterDeferredMaintenanceWindow]
  }
  
  extension [Self <: AwsRedshiftClusterDeferredMaintenanceWindow](x: Self) {
    
    inline def setDeferMaintenanceEndTime(value: NonEmptyString): Self = StObject.set(x, "DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceEndTimeUndefined: Self = StObject.set(x, "DeferMaintenanceEndTime", js.undefined)
    
    inline def setDeferMaintenanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceIdentifierUndefined: Self = StObject.set(x, "DeferMaintenanceIdentifier", js.undefined)
    
    inline def setDeferMaintenanceStartTime(value: NonEmptyString): Self = StObject.set(x, "DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeferMaintenanceStartTimeUndefined: Self = StObject.set(x, "DeferMaintenanceStartTime", js.undefined)
  }
}
