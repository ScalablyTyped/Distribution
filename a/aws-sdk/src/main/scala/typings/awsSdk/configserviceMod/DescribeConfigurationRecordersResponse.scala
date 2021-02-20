package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationRecordersResponse extends StObject {
  
  /**
    * A list that contains the descriptions of the specified configuration recorders.
    */
  var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.native
}
object DescribeConfigurationRecordersResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRecordersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRecordersResponseMutableBuilder[Self <: DescribeConfigurationRecordersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorders(value: ConfigurationRecorderList): Self = StObject.set(x, "ConfigurationRecorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRecordersUndefined: Self = StObject.set(x, "ConfigurationRecorders", js.undefined)
    
    @scala.inline
    def setConfigurationRecordersVarargs(value: ConfigurationRecorder*): Self = StObject.set(x, "ConfigurationRecorders", js.Array(value :_*))
  }
}
