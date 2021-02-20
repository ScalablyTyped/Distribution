package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidIdentityPoolConfigurationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidIdentityPoolConfigurationExceptionDetails> * / any */ @js.native
  trait InvalidIdentityPoolConfigurationException extends GetCredentialsForIdentityExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException = js.native
  }
  object InvalidIdentityPoolConfigurationException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
    ): InvalidIdentityPoolConfigurationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
    }
    
    @scala.inline
    implicit class InvalidIdentityPoolConfigurationExceptionMutableBuilder[Self <: InvalidIdentityPoolConfigurationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidIdentityPoolConfigurationExceptionDetails extends StObject {
    
    /**
      * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code> </p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidIdentityPoolConfigurationExceptionDetails {
    
    @scala.inline
    def apply(): InvalidIdentityPoolConfigurationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidIdentityPoolConfigurationExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidIdentityPoolConfigurationExceptionDetailsMutableBuilder[Self <: InvalidIdentityPoolConfigurationExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
