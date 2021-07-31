package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSpecificCredentialMetadata extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
    */
  var CreateDate: dateType
  
  /**
    * The name of the service associated with the service-specific credential.
    */
  var ServiceName: serviceName
  
  /**
    * The unique identifier for the service-specific credential.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId
  
  /**
    * The generated user name for the service-specific credential.
    */
  var ServiceUserName: serviceUserName
  
  /**
    * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType
  
  /**
    * The name of the IAM user associated with the service-specific credential.
    */
  var UserName: userNameType
}
object ServiceSpecificCredentialMetadata {
  
  @scala.inline
  def apply(
    CreateDate: dateType,
    ServiceName: serviceName,
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    ServiceUserName: serviceUserName,
    Status: statusType,
    UserName: userNameType
  ): ServiceSpecificCredentialMetadata = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], ServiceUserName = ServiceUserName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
  }
  
  @scala.inline
  implicit class ServiceSpecificCredentialMetadataMutableBuilder[Self <: ServiceSpecificCredentialMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: serviceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = StObject.set(x, "ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUserName(value: serviceUserName): Self = StObject.set(x, "ServiceUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
