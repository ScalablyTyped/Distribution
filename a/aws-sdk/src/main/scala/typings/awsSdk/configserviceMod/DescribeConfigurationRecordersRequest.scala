package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationRecordersRequest extends StObject {
  
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
  implicit class DescribeConfigurationRecordersRequestMutableBuilder[Self <: DescribeConfigurationRecordersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorderNames(value: ConfigurationRecorderNameList): Self = StObject.set(x, "ConfigurationRecorderNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRecorderNamesUndefined: Self = StObject.set(x, "ConfigurationRecorderNames", js.undefined)
    
    @scala.inline
    def setConfigurationRecorderNamesVarargs(value: RecorderName*): Self = StObject.set(x, "ConfigurationRecorderNames", js.Array(value :_*))
  }
}
