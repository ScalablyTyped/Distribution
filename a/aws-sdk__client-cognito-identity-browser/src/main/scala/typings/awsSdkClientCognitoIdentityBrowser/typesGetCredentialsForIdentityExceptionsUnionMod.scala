package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCredentialsForIdentityExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
    - typings.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
    - typings.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException
    - typings.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typings.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod.InvalidIdentityPoolConfigurationException
    - typings.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
    - typings.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException
  */
  trait GetCredentialsForIdentityExceptionsUnion extends StObject
  object GetCredentialsForIdentityExceptionsUnion {
    
    inline def ExternalServiceException(): typings.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException = {
      val __obj = js.Dynamic.literal(name = "ExternalServiceException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException]
    }
    
    inline def InternalErrorException(): typings.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException = {
      val __obj = js.Dynamic.literal(name = "InternalErrorException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException]
    }
    
    inline def InvalidIdentityPoolConfigurationException(): typings.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod.InvalidIdentityPoolConfigurationException = {
      val __obj = js.Dynamic.literal(name = "InvalidIdentityPoolConfigurationException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod.InvalidIdentityPoolConfigurationException]
    }
    
    inline def InvalidParameterException(): typings.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException]
    }
    
    inline def NotAuthorizedException(): typings.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException = {
      val __obj = js.Dynamic.literal(name = "NotAuthorizedException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException]
    }
    
    inline def ResourceConflictException(): typings.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException = {
      val __obj = js.Dynamic.literal(name = "ResourceConflictException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def TooManyRequestsException(): typings.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
