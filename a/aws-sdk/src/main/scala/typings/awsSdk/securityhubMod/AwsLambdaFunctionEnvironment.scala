package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionEnvironment extends StObject {
  
  /**
    * An AwsLambdaFunctionEnvironmentError object.
    */
  var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError] = js.undefined
  
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[FieldMap] = js.undefined
}
object AwsLambdaFunctionEnvironment {
  
  inline def apply(): AwsLambdaFunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
  }
  
  extension [Self <: AwsLambdaFunctionEnvironment](x: Self) {
    
    inline def setError(value: AwsLambdaFunctionEnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setVariables(value: FieldMap): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
