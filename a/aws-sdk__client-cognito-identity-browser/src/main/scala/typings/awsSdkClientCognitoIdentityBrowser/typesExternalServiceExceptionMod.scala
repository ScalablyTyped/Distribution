package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExternalServiceExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExternalServiceExceptionDetails> * / any */ @js.native
  trait ExternalServiceException
    extends GetCredentialsForIdentityExceptionsUnion
       with GetIdExceptionsUnion
       with GetOpenIdTokenExceptionsUnion
       with UnlinkIdentityExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException = js.native
  }
  object ExternalServiceException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
    ): ExternalServiceException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalServiceException]
    }
    
    @scala.inline
    implicit class ExternalServiceExceptionMutableBuilder[Self <: ExternalServiceException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalServiceExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by an ExternalServiceException</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ExternalServiceExceptionDetails {
    
    @scala.inline
    def apply(): ExternalServiceExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalServiceExceptionDetails]
    }
    
    @scala.inline
    implicit class ExternalServiceExceptionDetailsMutableBuilder[Self <: ExternalServiceExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
