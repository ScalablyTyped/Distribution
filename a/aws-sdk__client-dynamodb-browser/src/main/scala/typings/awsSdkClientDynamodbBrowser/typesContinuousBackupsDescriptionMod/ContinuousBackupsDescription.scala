package typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousBackupsDescription extends js.Object {
  
  /**
    * <p> <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED</p>
    */
  var ContinuousBackupsStatus: ENABLED | DISABLED | String = js.native
  
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  var PointInTimeRecoveryDescription: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
  ] = js.native
}
object ContinuousBackupsDescription {
  
  @scala.inline
  def apply(ContinuousBackupsStatus: ENABLED | DISABLED | String): ContinuousBackupsDescription = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuousBackupsStatus(value: ENABLED | DISABLED | String): Self = this.set("ContinuousBackupsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = this.set("PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInTimeRecoveryDescription: Self = this.set("PointInTimeRecoveryDescription", js.undefined)
  }
}
