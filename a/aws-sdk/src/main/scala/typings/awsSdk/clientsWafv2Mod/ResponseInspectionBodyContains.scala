package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInspectionBodyContains extends StObject {
  
  /**
    * Strings in the body of the response that indicate a failed login attempt. To be counted as a failed login, the string can be anywhere in the body and must be an exact match, including case. Each string must be unique among the success and failure strings.  JSON example: "FailureStrings": [ "Login failed" ] 
    */
  var FailureStrings: ResponseInspectionBodyContainsFailureStrings
  
  /**
    * Strings in the body of the response that indicate a successful login attempt. To be counted as a successful login, the string can be anywhere in the body and must be an exact match, including case. Each string must be unique among the success and failure strings.  JSON example: "SuccessStrings": [ "Login successful", "Welcome to our site!" ] 
    */
  var SuccessStrings: ResponseInspectionBodyContainsSuccessStrings
}
object ResponseInspectionBodyContains {
  
  inline def apply(
    FailureStrings: ResponseInspectionBodyContainsFailureStrings,
    SuccessStrings: ResponseInspectionBodyContainsSuccessStrings
  ): ResponseInspectionBodyContains = {
    val __obj = js.Dynamic.literal(FailureStrings = FailureStrings.asInstanceOf[js.Any], SuccessStrings = SuccessStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInspectionBodyContains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInspectionBodyContains] (val x: Self) extends AnyVal {
    
    inline def setFailureStrings(value: ResponseInspectionBodyContainsFailureStrings): Self = StObject.set(x, "FailureStrings", value.asInstanceOf[js.Any])
    
    inline def setFailureStringsVarargs(value: FailureValue*): Self = StObject.set(x, "FailureStrings", js.Array(value*))
    
    inline def setSuccessStrings(value: ResponseInspectionBodyContainsSuccessStrings): Self = StObject.set(x, "SuccessStrings", value.asInstanceOf[js.Any])
    
    inline def setSuccessStringsVarargs(value: SuccessValue*): Self = StObject.set(x, "SuccessStrings", js.Array(value*))
  }
}
