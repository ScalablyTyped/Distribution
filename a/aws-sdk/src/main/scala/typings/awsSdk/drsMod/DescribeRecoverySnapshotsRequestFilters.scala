package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoverySnapshotsRequestFilters extends StObject {
  
  /**
    * The start date in a date range query.
    */
  var fromDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The end date in a date range query.
    */
  var toDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object DescribeRecoverySnapshotsRequestFilters {
  
  inline def apply(): DescribeRecoverySnapshotsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoverySnapshotsRequestFilters]
  }
  
  extension [Self <: DescribeRecoverySnapshotsRequestFilters](x: Self) {
    
    inline def setFromDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "fromDateTime", value.asInstanceOf[js.Any])
    
    inline def setFromDateTimeUndefined: Self = StObject.set(x, "fromDateTime", js.undefined)
    
    inline def setToDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "toDateTime", value.asInstanceOf[js.Any])
    
    inline def setToDateTimeUndefined: Self = StObject.set(x, "toDateTime", js.undefined)
  }
}
