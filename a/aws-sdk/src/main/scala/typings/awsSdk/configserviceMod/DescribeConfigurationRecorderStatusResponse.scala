package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationRecorderStatusResponse extends js.Object {
  
  /**
    * A list that contains status of the specified recorders.
    */
  var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.native
}
object DescribeConfigurationRecorderStatusResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRecorderStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRecorderStatusResponseOps[Self <: DescribeConfigurationRecorderStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigurationRecordersStatusVarargs(value: ConfigurationRecorderStatus*): Self = this.set("ConfigurationRecordersStatus", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationRecordersStatus(value: ConfigurationRecorderStatusList): Self = this.set("ConfigurationRecordersStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationRecordersStatus: Self = this.set("ConfigurationRecordersStatus", js.undefined)
  }
}
