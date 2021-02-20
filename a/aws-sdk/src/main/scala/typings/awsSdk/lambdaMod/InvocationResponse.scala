package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvocationResponse extends StObject {
  
  /**
    * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
    */
  var ExecutedVersion: js.UndefOr[Version] = js.native
  
  /**
    * If present, indicates that an error occurred during function execution. Details about the error are included in the response payload.
    */
  var FunctionError: js.UndefOr[String] = js.native
  
  /**
    * The last 4 KB of the execution log, which is base64 encoded.
    */
  var LogResult: js.UndefOr[String] = js.native
  
  /**
    * The response from the function, or an error object.
    */
  var Payload: js.UndefOr[_Blob] = js.native
  
  /**
    * The HTTP status code is in the 200 range for a successful request. For the RequestResponse invocation type, this status code is 200. For the Event invocation type, this status code is 202. For the DryRun invocation type, the status code is 204.
    */
  var StatusCode: js.UndefOr[Integer] = js.native
}
object InvocationResponse {
  
  @scala.inline
  def apply(): InvocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvocationResponse]
  }
  
  @scala.inline
  implicit class InvocationResponseMutableBuilder[Self <: InvocationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutedVersion(value: Version): Self = StObject.set(x, "ExecutedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutedVersionUndefined: Self = StObject.set(x, "ExecutedVersion", js.undefined)
    
    @scala.inline
    def setFunctionError(value: String): Self = StObject.set(x, "FunctionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionErrorUndefined: Self = StObject.set(x, "FunctionError", js.undefined)
    
    @scala.inline
    def setLogResult(value: String): Self = StObject.set(x, "LogResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogResultUndefined: Self = StObject.set(x, "LogResult", js.undefined)
    
    @scala.inline
    def setPayload(value: _Blob): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
