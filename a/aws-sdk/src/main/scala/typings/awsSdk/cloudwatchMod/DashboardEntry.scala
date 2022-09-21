package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardArn] = js.undefined
  
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardName] = js.undefined
  
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[typings.awsSdk.cloudwatchMod.Size] = js.undefined
}
object DashboardEntry {
  
  inline def apply(): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardEntry]
  }
  
  extension [Self <: DashboardEntry](x: Self) {
    
    inline def setDashboardArn(value: DashboardArn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    inline def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    inline def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
    
    inline def setDashboardNameUndefined: Self = StObject.set(x, "DashboardName", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
