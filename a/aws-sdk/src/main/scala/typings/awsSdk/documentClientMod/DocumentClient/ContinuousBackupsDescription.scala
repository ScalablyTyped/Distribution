package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousBackupsDescription extends js.Object {
  
  /**
    *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  var ContinuousBackupsStatus: typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsStatus = js.native
  
  /**
    * The description of the point in time recovery settings applied to the table.
    */
  var PointInTimeRecoveryDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryDescription] = js.native
}
object ContinuousBackupsDescription {
  
  @scala.inline
  def apply(ContinuousBackupsStatus: ContinuousBackupsStatus): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
  
  @scala.inline
  implicit class ContinuousBackupsDescriptionOps[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
    
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
    def setContinuousBackupsStatus(value: ContinuousBackupsStatus): Self = this.set("ContinuousBackupsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = this.set("PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInTimeRecoveryDescription: Self = this.set("PointInTimeRecoveryDescription", js.undefined)
  }
}
