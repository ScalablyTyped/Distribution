package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationDataSourceConfigurations extends js.Object {
  
  /**
    * Describes whether S3 data event logs are enabled for new members of the organization.
    */
  var S3Logs: js.UndefOr[OrganizationS3LogsConfiguration] = js.native
}
object OrganizationDataSourceConfigurations {
  
  @scala.inline
  def apply(): OrganizationDataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationDataSourceConfigurations]
  }
  
  @scala.inline
  implicit class OrganizationDataSourceConfigurationsOps[Self <: OrganizationDataSourceConfigurations] (val x: Self) extends AnyVal {
    
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
    def setS3Logs(value: OrganizationS3LogsConfiguration): Self = this.set("S3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Logs: Self = this.set("S3Logs", js.undefined)
  }
}
