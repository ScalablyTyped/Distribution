package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRecorderStatusRequest extends StObject {
  
  /**
    * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of all the configuration recorders associated with the account.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
}
object DescribeConfigurationRecorderStatusRequest {
  
  @scala.inline
  def apply(): DescribeConfigurationRecorderStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRecorderStatusRequestMutableBuilder[Self <: DescribeConfigurationRecorderStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorderNames(value: ConfigurationRecorderNameList): Self = StObject.set(x, "ConfigurationRecorderNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRecorderNamesUndefined: Self = StObject.set(x, "ConfigurationRecorderNames", js.undefined)
    
    @scala.inline
    def setConfigurationRecorderNamesVarargs(value: RecorderName*): Self = StObject.set(x, "ConfigurationRecorderNames", js.Array(value :_*))
  }
}
