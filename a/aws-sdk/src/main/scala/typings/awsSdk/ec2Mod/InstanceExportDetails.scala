package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceExportDetails extends js.Object {
  /**
    * The ID of the resource being exported.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object InstanceExportDetails {
  @scala.inline
  def apply(): InstanceExportDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceExportDetails]
  }
  @scala.inline
  implicit class InstanceExportDetailsOps[Self <: InstanceExportDetails] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setTargetEnvironment(value: ExportEnvironment): Self = this.set("TargetEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetEnvironment: Self = this.set("TargetEnvironment", js.undefined)
  }
  
}

