package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceConfigurations extends js.Object {
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: js.UndefOr[S3LogsConfiguration] = js.native
}
object DataSourceConfigurations {
  
  @scala.inline
  def apply(): DataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfigurations]
  }
  
  @scala.inline
  implicit class DataSourceConfigurationsOps[Self <: DataSourceConfigurations] (val x: Self) extends AnyVal {
    
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
    def setS3Logs(value: S3LogsConfiguration): Self = this.set("S3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Logs: Self = this.set("S3Logs", js.undefined)
  }
}
