package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationRecordersRequest extends js.Object {
  
  /**
    * A list of configuration recorder names.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.native
}
object DescribeConfigurationRecordersRequest {
  
  @scala.inline
  def apply(): DescribeConfigurationRecordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRecordersRequestOps[Self <: DescribeConfigurationRecordersRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationRecorderNamesVarargs(value: RecorderName*): Self = this.set("ConfigurationRecorderNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationRecorderNames(value: ConfigurationRecorderNameList): Self = this.set("ConfigurationRecorderNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationRecorderNames: Self = this.set("ConfigurationRecorderNames", js.undefined)
  }
}
