package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfigurationEnvironment extends StObject {
  
  /**
    * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass container.
    */
  var AccessSysfs: js.UndefOr[boolean] = js.undefined
  
  /**
    * Configuration related to executing the Lambda function
    */
  var Execution: js.UndefOr[FunctionExecutionConfig] = js.undefined
  
  /**
    * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a Greengrass container.
    */
  var ResourceAccessPolicies: js.UndefOr[listOfResourceAccessPolicy] = js.undefined
  
  /**
    * Environment variables for the Lambda function's configuration.
    */
  var Variables: js.UndefOr[mapOfString] = js.undefined
}
object FunctionConfigurationEnvironment {
  
  inline def apply(): FunctionConfigurationEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfigurationEnvironment]
  }
  
  extension [Self <: FunctionConfigurationEnvironment](x: Self) {
    
    inline def setAccessSysfs(value: boolean): Self = StObject.set(x, "AccessSysfs", value.asInstanceOf[js.Any])
    
    inline def setAccessSysfsUndefined: Self = StObject.set(x, "AccessSysfs", js.undefined)
    
    inline def setExecution(value: FunctionExecutionConfig): Self = StObject.set(x, "Execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "Execution", js.undefined)
    
    inline def setResourceAccessPolicies(value: listOfResourceAccessPolicy): Self = StObject.set(x, "ResourceAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessPoliciesUndefined: Self = StObject.set(x, "ResourceAccessPolicies", js.undefined)
    
    inline def setResourceAccessPoliciesVarargs(value: ResourceAccessPolicy*): Self = StObject.set(x, "ResourceAccessPolicies", js.Array(value*))
    
    inline def setVariables(value: mapOfString): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
