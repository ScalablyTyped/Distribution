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
  
  @scala.inline
  def apply(): AwsLambdaFunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionEnvironmentMutableBuilder[Self <: AwsLambdaFunctionEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: AwsLambdaFunctionEnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setVariables(value: FieldMap): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
