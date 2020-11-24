package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterClusterParameterStatus extends js.Object {
  
  /**
    * The error that prevented the parameter from being applied to the database.
    */
  var ParameterApplyErrorDescription: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when it was applied. Valid values: in-sync | pending-reboot | applying | invalid-parameter | apply-deferred | apply-error | unknown-error 
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterClusterParameterStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterParameterStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterParameterStatusOps[Self <: AwsRedshiftClusterClusterParameterStatus] (val x: Self) extends AnyVal {
    
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
    def setParameterApplyErrorDescription(value: NonEmptyString): Self = this.set("ParameterApplyErrorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyErrorDescription: Self = this.set("ParameterApplyErrorDescription", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterName(value: NonEmptyString): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
  }
}
