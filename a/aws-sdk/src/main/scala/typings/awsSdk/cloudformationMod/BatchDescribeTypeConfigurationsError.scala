package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeTypeConfigurationsError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.cloudformationMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.cloudformationMod.ErrorMessage] = js.undefined
  
  var TypeConfigurationIdentifier: js.UndefOr[typings.awsSdk.cloudformationMod.TypeConfigurationIdentifier] = js.undefined
}
object BatchDescribeTypeConfigurationsError {
  
  inline def apply(): BatchDescribeTypeConfigurationsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeTypeConfigurationsError]
  }
  
  extension [Self <: BatchDescribeTypeConfigurationsError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setTypeConfigurationIdentifier(value: TypeConfigurationIdentifier): Self = StObject.set(x, "TypeConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationIdentifierUndefined: Self = StObject.set(x, "TypeConfigurationIdentifier", js.undefined)
  }
}
