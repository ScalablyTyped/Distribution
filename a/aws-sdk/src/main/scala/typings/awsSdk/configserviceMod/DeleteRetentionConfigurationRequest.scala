package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRetentionConfigurationRequest extends js.Object {
  /**
    * The name of the retention configuration to delete.
    */
  var RetentionConfigurationName: typings.awsSdk.configserviceMod.RetentionConfigurationName = js.native
}

object DeleteRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionConfigurationName = RetentionConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteRetentionConfigurationRequestOps[Self <: DeleteRetentionConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setRetentionConfigurationName(value: RetentionConfigurationName): Self = this.set("RetentionConfigurationName", value.asInstanceOf[js.Any])
  }
  
}

