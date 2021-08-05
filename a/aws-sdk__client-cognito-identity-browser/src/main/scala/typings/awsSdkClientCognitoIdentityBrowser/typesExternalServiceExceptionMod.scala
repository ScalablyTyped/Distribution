package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExternalServiceExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExternalServiceExceptionDetails> * / any */ trait ExternalServiceException
    extends StObject
       with GetCredentialsForIdentityExceptionsUnion
       with GetIdExceptionsUnion
       with GetOpenIdTokenExceptionsUnion
       with UnlinkIdentityExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
  }
  object ExternalServiceException {
    
    inline def apply(): ExternalServiceException = {
      val __obj = js.Dynamic.literal(name = "ExternalServiceException")
      __obj.asInstanceOf[ExternalServiceException]
    }
    
    extension [Self <: ExternalServiceException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalServiceExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by an ExternalServiceException</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ExternalServiceExceptionDetails {
    
    inline def apply(): ExternalServiceExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalServiceExceptionDetails]
    }
    
    extension [Self <: ExternalServiceExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
