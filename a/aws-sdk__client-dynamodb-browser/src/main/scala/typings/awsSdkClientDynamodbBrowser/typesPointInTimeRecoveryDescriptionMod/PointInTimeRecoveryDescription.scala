package typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInTimeRecoveryDescription extends js.Object {
  
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  var EarliestRestorableDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  var LatestRestorableDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The current state of point in time recovery:</p> <ul> <li> <p> <code>ENABLING</code> - Point in time recovery is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Point in time recovery is enabled.</p> </li> <li> <p> <code>DISABLED</code> - Point in time recovery is disabled.</p> </li> </ul>
    */
  var PointInTimeRecoveryStatus: js.UndefOr[ENABLED | DISABLED | String] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEarliestRestorableDateTime(value: Date | String | Double): Self = this.set("EarliestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestRestorableDateTime: Self = this.set("EarliestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setLatestRestorableDateTime(value: Date | String | Double): Self = this.set("LatestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRestorableDateTime: Self = this.set("LatestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setPointInTimeRecoveryStatus(value: ENABLED | DISABLED | String): Self = this.set("PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInTimeRecoveryStatus: Self = this.set("PointInTimeRecoveryStatus", js.undefined)
  }
}
