package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesExceptionsUnionMod.DeleteIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsExceptionsUnionMod.ListIdentityPoolsExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityExceptionsUnionMod.LookupDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesExceptionsUnionMod.MergeDeveloperIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityExceptionsUnionMod.UnlinkDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTooManyRequestsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TooManyRequestsExceptionDetails> * / any */ trait TooManyRequestsException
    extends StObject
       with CreateIdentityPoolExceptionsUnion
       with DeleteIdentitiesExceptionsUnion
       with DeleteIdentityPoolExceptionsUnion
       with DescribeIdentityExceptionsUnion
       with DescribeIdentityPoolExceptionsUnion
       with GetCredentialsForIdentityExceptionsUnion
       with GetIdExceptionsUnion
       with GetIdentityPoolRolesExceptionsUnion
       with GetOpenIdTokenExceptionsUnion
       with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
       with ListIdentitiesExceptionsUnion
       with ListIdentityPoolsExceptionsUnion
       with LookupDeveloperIdentityExceptionsUnion
       with MergeDeveloperIdentitiesExceptionsUnion
       with SetIdentityPoolRolesExceptionsUnion
       with UnlinkDeveloperIdentityExceptionsUnion
       with UnlinkIdentityExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
  }
  object TooManyRequestsException {
    
    inline def apply(): TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[TooManyRequestsException]
    }
    
    extension [Self <: TooManyRequestsException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooManyRequestsExceptionDetails extends StObject {
    
    /**
      * <p>Message returned by a TooManyRequestsException</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TooManyRequestsExceptionDetails {
    
    inline def apply(): TooManyRequestsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooManyRequestsExceptionDetails]
    }
    
    extension [Self <: TooManyRequestsExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
