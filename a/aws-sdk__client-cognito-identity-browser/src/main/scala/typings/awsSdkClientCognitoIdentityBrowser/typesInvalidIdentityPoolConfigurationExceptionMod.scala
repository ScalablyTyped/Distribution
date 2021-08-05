package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidIdentityPoolConfigurationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidIdentityPoolConfigurationExceptionDetails> * / any */ trait InvalidIdentityPoolConfigurationException
    extends StObject
       with GetCredentialsForIdentityExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
  }
  object InvalidIdentityPoolConfigurationException {
    
    inline def apply(): InvalidIdentityPoolConfigurationException = {
      val __obj = js.Dynamic.literal(name = "InvalidIdentityPoolConfigurationException")
      __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
    }
    
    extension [Self <: InvalidIdentityPoolConfigurationException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InvalidIdentityPoolConfigurationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidIdentityPoolConfigurationExceptionDetails extends StObject {
    
    /**
      * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code> </p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidIdentityPoolConfigurationExceptionDetails {
    
    inline def apply(): InvalidIdentityPoolConfigurationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidIdentityPoolConfigurationExceptionDetails]
    }
    
    extension [Self <: InvalidIdentityPoolConfigurationExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
