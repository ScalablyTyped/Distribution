package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInspectionJson extends StObject {
  
  /**
    * Values for the specified identifier in the response JSON that indicate a failed login attempt. To be counted as a failed login, the value must be an exact match, including case. Each value must be unique among the success and failure values.  JSON example: "FailureValues": [ "False", "Failed" ] 
    */
  var FailureValues: ResponseInspectionJsonFailureValues
  
  /**
    * The identifier for the value to match against in the JSON. The identifier must be an exact match, including case. JSON example: "Identifier": [ "/login/success" ] 
    */
  var Identifier: FieldIdentifier
  
  /**
    * Values for the specified identifier in the response JSON that indicate a successful login attempt. To be counted as a successful login, the value must be an exact match, including case. Each value must be unique among the success and failure values.  JSON example: "SuccessValues": [ "True", "Succeeded" ] 
    */
  var SuccessValues: ResponseInspectionJsonSuccessValues
}
object ResponseInspectionJson {
  
  inline def apply(
    FailureValues: ResponseInspectionJsonFailureValues,
    Identifier: FieldIdentifier,
    SuccessValues: ResponseInspectionJsonSuccessValues
  ): ResponseInspectionJson = {
    val __obj = js.Dynamic.literal(FailureValues = FailureValues.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], SuccessValues = SuccessValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInspectionJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInspectionJson] (val x: Self) extends AnyVal {
    
    inline def setFailureValues(value: ResponseInspectionJsonFailureValues): Self = StObject.set(x, "FailureValues", value.asInstanceOf[js.Any])
    
    inline def setFailureValuesVarargs(value: FailureValue*): Self = StObject.set(x, "FailureValues", js.Array(value*))
    
    inline def setIdentifier(value: FieldIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setSuccessValues(value: ResponseInspectionJsonSuccessValues): Self = StObject.set(x, "SuccessValues", value.asInstanceOf[js.Any])
    
    inline def setSuccessValuesVarargs(value: SuccessValue*): Self = StObject.set(x, "SuccessValues", js.Array(value*))
  }
}
