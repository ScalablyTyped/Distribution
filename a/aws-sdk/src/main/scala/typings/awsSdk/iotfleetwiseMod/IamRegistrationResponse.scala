package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamRegistrationResponse extends StObject {
  
  /**
    * A message associated with a registration error.
    */
  var errorMessage: js.UndefOr[typings.awsSdk.iotfleetwiseMod.errorMessage] = js.undefined
  
  /**
    * The status of registering your IAM resource. The status can be one of REGISTRATION_SUCCESS, REGISTRATION_PENDING, REGISTRATION_FAILURE.
    */
  var registrationStatus: RegistrationStatus
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to register.
    */
  var roleArn: arn
}
object IamRegistrationResponse {
  
  inline def apply(registrationStatus: RegistrationStatus, roleArn: arn): IamRegistrationResponse = {
    val __obj = js.Dynamic.literal(registrationStatus = registrationStatus.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamRegistrationResponse]
  }
  
  extension [Self <: IamRegistrationResponse](x: Self) {
    
    inline def setErrorMessage(value: errorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
