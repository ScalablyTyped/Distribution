package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInspectionStatusCode extends StObject {
  
  /**
    * Status codes in the response that indicate a failed login attempt. To be counted as a failed login, the response status code must match one of these. Each code must be unique among the success and failure status codes.  JSON example: "FailureCodes": [ 400, 404 ] 
    */
  var FailureCodes: ResponseInspectionStatusCodeFailureCodes
  
  /**
    * Status codes in the response that indicate a successful login attempt. To be counted as a successful login, the response status code must match one of these. Each code must be unique among the success and failure status codes.  JSON example: "SuccessCodes": [ 200, 201 ] 
    */
  var SuccessCodes: ResponseInspectionStatusCodeSuccessCodes
}
object ResponseInspectionStatusCode {
  
  inline def apply(
    FailureCodes: ResponseInspectionStatusCodeFailureCodes,
    SuccessCodes: ResponseInspectionStatusCodeSuccessCodes
  ): ResponseInspectionStatusCode = {
    val __obj = js.Dynamic.literal(FailureCodes = FailureCodes.asInstanceOf[js.Any], SuccessCodes = SuccessCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInspectionStatusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInspectionStatusCode] (val x: Self) extends AnyVal {
    
    inline def setFailureCodes(value: ResponseInspectionStatusCodeFailureCodes): Self = StObject.set(x, "FailureCodes", value.asInstanceOf[js.Any])
    
    inline def setFailureCodesVarargs(value: FailureCode*): Self = StObject.set(x, "FailureCodes", js.Array(value*))
    
    inline def setSuccessCodes(value: ResponseInspectionStatusCodeSuccessCodes): Self = StObject.set(x, "SuccessCodes", value.asInstanceOf[js.Any])
    
    inline def setSuccessCodesVarargs(value: SuccessCode*): Self = StObject.set(x, "SuccessCodes", js.Array(value*))
  }
}
