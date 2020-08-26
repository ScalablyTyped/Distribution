package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationVpcConfigurationRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * Description of the VPC to add to the application.
    */
  var VpcConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.VpcConfiguration = js.native
}

object AddApplicationVpcConfigurationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    VpcConfiguration: VpcConfiguration
  ): AddApplicationVpcConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], VpcConfiguration = VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationVpcConfigurationRequest]
  }
  @scala.inline
  implicit class AddApplicationVpcConfigurationRequestOps[Self <: AddApplicationVpcConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
  }
  
}

