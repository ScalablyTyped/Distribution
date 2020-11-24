package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationDataSourceConfigurationsResult extends js.Object {
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: OrganizationS3LogsConfigurationResult = js.native
}
object OrganizationDataSourceConfigurationsResult {
  
  @scala.inline
  def apply(S3Logs: OrganizationS3LogsConfigurationResult): OrganizationDataSourceConfigurationsResult = {
    val __obj = js.Dynamic.literal(S3Logs = S3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationDataSourceConfigurationsResult]
  }
  
  @scala.inline
  implicit class OrganizationDataSourceConfigurationsResultOps[Self <: OrganizationDataSourceConfigurationsResult] (val x: Self) extends AnyVal {
    
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
    def setS3Logs(value: OrganizationS3LogsConfigurationResult): Self = this.set("S3Logs", value.asInstanceOf[js.Any])
  }
}
