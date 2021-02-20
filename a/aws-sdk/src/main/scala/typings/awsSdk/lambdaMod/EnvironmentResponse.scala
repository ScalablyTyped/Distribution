package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResponse extends StObject {
  
  /**
    * Error messages for environment variables that couldn't be applied.
    */
  var Error: js.UndefOr[EnvironmentError] = js.native
  
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[EnvironmentVariables] = js.native
}
object EnvironmentResponse {
  
  @scala.inline
  def apply(): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResponse]
  }
  
  @scala.inline
  implicit class EnvironmentResponseMutableBuilder[Self <: EnvironmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: EnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setVariables(value: EnvironmentVariables): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
