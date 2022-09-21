package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeTypeConfigurationsOutput extends StObject {
  
  /**
    * A list of information concerning any errors generated during the setting of the specified configurations.
    */
  var Errors: js.UndefOr[BatchDescribeTypeConfigurationsErrors] = js.undefined
  
  /**
    * A list of any of the specified extension configurations from the CloudFormation registry.
    */
  var TypeConfigurations: js.UndefOr[TypeConfigurationDetailsList] = js.undefined
  
  /**
    * A list of any of the specified extension configurations that CloudFormation could not process for any reason.
    */
  var UnprocessedTypeConfigurations: js.UndefOr[typings.awsSdk.cloudformationMod.UnprocessedTypeConfigurations] = js.undefined
}
object BatchDescribeTypeConfigurationsOutput {
  
  inline def apply(): BatchDescribeTypeConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeTypeConfigurationsOutput]
  }
  
  extension [Self <: BatchDescribeTypeConfigurationsOutput](x: Self) {
    
    inline def setErrors(value: BatchDescribeTypeConfigurationsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchDescribeTypeConfigurationsError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setTypeConfigurations(value: TypeConfigurationDetailsList): Self = StObject.set(x, "TypeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationsUndefined: Self = StObject.set(x, "TypeConfigurations", js.undefined)
    
    inline def setTypeConfigurationsVarargs(value: TypeConfigurationDetails*): Self = StObject.set(x, "TypeConfigurations", js.Array(value*))
    
    inline def setUnprocessedTypeConfigurations(value: UnprocessedTypeConfigurations): Self = StObject.set(x, "UnprocessedTypeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedTypeConfigurationsUndefined: Self = StObject.set(x, "UnprocessedTypeConfigurations", js.undefined)
    
    inline def setUnprocessedTypeConfigurationsVarargs(value: TypeConfigurationIdentifier*): Self = StObject.set(x, "UnprocessedTypeConfigurations", js.Array(value*))
  }
}
