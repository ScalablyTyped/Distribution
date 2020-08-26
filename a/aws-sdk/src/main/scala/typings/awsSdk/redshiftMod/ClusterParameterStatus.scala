package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterStatus extends js.Object {
  /**
    * The error that prevented the parameter from being applied to the database.
    */
  var ParameterApplyErrorDescription: js.UndefOr[String] = js.native
  /**
    * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when being applied. The following are possible statuses and descriptions.    in-sync: The parameter value is in sync with the database.    pending-reboot: The parameter value will be applied after the cluster reboots.    applying: The parameter value is being applied to the database.    invalid-parameter: Cannot apply the parameter value because it has an invalid value or syntax.    apply-deferred: The parameter contains static property changes. The changes are deferred until the cluster reboots.    apply-error: Cannot connect to the cluster. The parameter change will be applied after the cluster reboots.    unknown-error: Cannot apply the parameter change right now. The change will be applied after the cluster reboots.  
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
}

object ClusterParameterStatus {
  @scala.inline
  def apply(): ClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterStatus]
  }
  @scala.inline
  implicit class ClusterParameterStatusOps[Self <: ClusterParameterStatus] (val x: Self) extends AnyVal {
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
    def setParameterApplyErrorDescription(value: String): Self = this.set("ParameterApplyErrorDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterApplyErrorDescription: Self = this.set("ParameterApplyErrorDescription", js.undefined)
    @scala.inline
    def setParameterApplyStatus(value: String): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
    @scala.inline
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
  }
  
}

