package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInTimeRecoveryDescription extends js.Object {
  
  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[Date] = js.native
  
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryStatus] = js.native
}
object PointInTimeRecoveryDescription {
  
  @scala.inline
  def apply(): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
  
  @scala.inline
  implicit class PointInTimeRecoveryDescriptionOps[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEarliestRestorableDateTime(value: Date): Self = this.set("EarliestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestRestorableDateTime: Self = this.set("EarliestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setLatestRestorableDateTime(value: Date): Self = this.set("LatestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRestorableDateTime: Self = this.set("LatestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = this.set("PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInTimeRecoveryStatus: Self = this.set("PointInTimeRecoveryStatus", js.undefined)
  }
}
