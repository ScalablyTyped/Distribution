package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterDeferredMaintenanceWindow extends js.Object {
  
  /**
    * The end of the time window for which maintenance was deferred. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var DeferMaintenanceEndTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The start of the time window for which maintenance was deferred. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var DeferMaintenanceStartTime: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterDeferredMaintenanceWindow {
  
  @scala.inline
  def apply(): AwsRedshiftClusterDeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterDeferredMaintenanceWindow]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterDeferredMaintenanceWindowOps[Self <: AwsRedshiftClusterDeferredMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeferMaintenanceEndTime(value: NonEmptyString): Self = this.set("DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceEndTime: Self = this.set("DeferMaintenanceEndTime", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceIdentifier(value: NonEmptyString): Self = this.set("DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceIdentifier: Self = this.set("DeferMaintenanceIdentifier", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceStartTime(value: NonEmptyString): Self = this.set("DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceStartTime: Self = this.set("DeferMaintenanceStartTime", js.undefined)
  }
}
