package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInspectionHeader extends StObject {
  
  /**
    * Values in the response header with the specified name that indicate a failed login attempt. To be counted as a failed login, the value must be an exact match, including case. Each value must be unique among the success and failure values.  JSON example: "FailureValues": [ "LoginFailed", "Failed login" ] 
    */
  var FailureValues: ResponseInspectionHeaderFailureValues
  
  /**
    * The name of the header to match against. The name must be an exact match, including case. JSON example: "Name": [ "LoginResult" ] 
    */
  var Name: ResponseInspectionHeaderName
  
  /**
    * Values in the response header with the specified name that indicate a successful login attempt. To be counted as a successful login, the value must be an exact match, including case. Each value must be unique among the success and failure values.  JSON example: "SuccessValues": [ "LoginPassed", "Successful login" ] 
    */
  var SuccessValues: ResponseInspectionHeaderSuccessValues
}
object ResponseInspectionHeader {
  
  inline def apply(
    FailureValues: ResponseInspectionHeaderFailureValues,
    Name: ResponseInspectionHeaderName,
    SuccessValues: ResponseInspectionHeaderSuccessValues
  ): ResponseInspectionHeader = {
    val __obj = js.Dynamic.literal(FailureValues = FailureValues.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SuccessValues = SuccessValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInspectionHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInspectionHeader] (val x: Self) extends AnyVal {
    
    inline def setFailureValues(value: ResponseInspectionHeaderFailureValues): Self = StObject.set(x, "FailureValues", value.asInstanceOf[js.Any])
    
    inline def setFailureValuesVarargs(value: FailureValue*): Self = StObject.set(x, "FailureValues", js.Array(value*))
    
    inline def setName(value: ResponseInspectionHeaderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSuccessValues(value: ResponseInspectionHeaderSuccessValues): Self = StObject.set(x, "SuccessValues", value.asInstanceOf[js.Any])
    
    inline def setSuccessValuesVarargs(value: SuccessValue*): Self = StObject.set(x, "SuccessValues", js.Array(value*))
  }
}
