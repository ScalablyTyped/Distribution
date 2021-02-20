package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardArn] = js.native
  
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardName] = js.native
  
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[typings.awsSdk.cloudwatchMod.LastModified] = js.native
  
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[typings.awsSdk.cloudwatchMod.Size] = js.native
}
object DashboardEntry {
  
  @scala.inline
  def apply(): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardEntry]
  }
  
  @scala.inline
  implicit class DashboardEntryMutableBuilder[Self <: DashboardEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardArn(value: DashboardArn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    @scala.inline
    def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardNameUndefined: Self = StObject.set(x, "DashboardName", js.undefined)
    
    @scala.inline
    def setLastModified(value: LastModified): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
