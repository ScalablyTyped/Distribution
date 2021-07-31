package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConcurrentModificationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ConcurrentModificationExceptionDetails> * / any */ trait ConcurrentModificationException
    extends StObject
       with SetIdentityPoolRolesExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
  }
  object ConcurrentModificationException {
    
    @scala.inline
    def apply(): ConcurrentModificationException = {
      val __obj = js.Dynamic.literal(name = "ConcurrentModificationException")
      __obj.asInstanceOf[ConcurrentModificationException]
    }
    
    @scala.inline
    implicit class ConcurrentModificationExceptionMutableBuilder[Self <: ConcurrentModificationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcurrentModificationExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by a ConcurrentModificationException.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ConcurrentModificationExceptionDetails {
    
    @scala.inline
    def apply(): ConcurrentModificationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcurrentModificationExceptionDetails]
    }
    
    @scala.inline
    implicit class ConcurrentModificationExceptionDetailsMutableBuilder[Self <: ConcurrentModificationExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
