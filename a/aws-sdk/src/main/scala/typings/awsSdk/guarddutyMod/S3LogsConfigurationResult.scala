package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3LogsConfigurationResult extends js.Object {
  
  /**
    * A value that describes whether S3 data event logs are automatically enabled for new members of the organization.
    */
  var Status: DataSourceStatus = js.native
}
object S3LogsConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): S3LogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfigurationResult]
  }
  
  @scala.inline
  implicit class S3LogsConfigurationResultOps[Self <: S3LogsConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DataSourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
