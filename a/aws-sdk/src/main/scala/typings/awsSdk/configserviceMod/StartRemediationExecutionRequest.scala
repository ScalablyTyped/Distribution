package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRemediationExecutionRequest extends StObject {
  
  /**
    * The list of names of AWS Config rules that you want to run remediation execution for.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
  
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: typings.awsSdk.configserviceMod.ResourceKeys
}
object StartRemediationExecutionRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: ResourceKeys): StartRemediationExecutionRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRemediationExecutionRequest]
  }
  
  extension [Self <: StartRemediationExecutionRequest](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setResourceKeys(value: ResourceKeys): Self = StObject.set(x, "ResourceKeys", value.asInstanceOf[js.Any])
    
    inline def setResourceKeysVarargs(value: ResourceKey*): Self = StObject.set(x, "ResourceKeys", js.Array(value :_*))
  }
}
