package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRecorderStatusResponse extends StObject {
  
  /**
    * A list that contains status of the specified recorders.
    */
  var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
}
object DescribeConfigurationRecorderStatusResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRecorderStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRecorderStatusResponseMutableBuilder[Self <: DescribeConfigurationRecorderStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecordersStatus(value: ConfigurationRecorderStatusList): Self = StObject.set(x, "ConfigurationRecordersStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRecordersStatusUndefined: Self = StObject.set(x, "ConfigurationRecordersStatus", js.undefined)
    
    @scala.inline
    def setConfigurationRecordersStatusVarargs(value: ConfigurationRecorderStatus*): Self = StObject.set(x, "ConfigurationRecordersStatus", js.Array(value :_*))
  }
}
