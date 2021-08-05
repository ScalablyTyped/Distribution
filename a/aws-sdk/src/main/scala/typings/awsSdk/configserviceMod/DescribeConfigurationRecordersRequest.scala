package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRecordersRequest extends StObject {
  
  /**
    * A list of configuration recorder names.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
}
object DescribeConfigurationRecordersRequest {
  
  inline def apply(): DescribeConfigurationRecordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
  }
  
  extension [Self <: DescribeConfigurationRecordersRequest](x: Self) {
    
    inline def setConfigurationRecorderNames(value: ConfigurationRecorderNameList): Self = StObject.set(x, "ConfigurationRecorderNames", value.asInstanceOf[js.Any])
    
    inline def setConfigurationRecorderNamesUndefined: Self = StObject.set(x, "ConfigurationRecorderNames", js.undefined)
    
    inline def setConfigurationRecorderNamesVarargs(value: RecorderName*): Self = StObject.set(x, "ConfigurationRecorderNames", js.Array(value :_*))
  }
}
