package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfigurations extends js.Object {
  
  /**
    * Parameters for publishing logs to Amazon CloudWatch Logs.
    */
  var Cloudwatch: js.UndefOr[LogConfiguration] = js.native
}
object LogConfigurations {
  
  @scala.inline
  def apply(): LogConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigurations]
  }
  
  @scala.inline
  implicit class LogConfigurationsOps[Self <: LogConfigurations] (val x: Self) extends AnyVal {
    
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
    def setCloudwatch(value: LogConfiguration): Self = this.set("Cloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatch: Self = this.set("Cloudwatch", js.undefined)
  }
}
