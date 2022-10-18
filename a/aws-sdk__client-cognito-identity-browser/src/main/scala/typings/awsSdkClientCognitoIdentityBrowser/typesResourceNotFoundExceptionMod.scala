package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityExceptionsUnionMod.LookupDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesExceptionsUnionMod.MergeDeveloperIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityExceptionsUnionMod.UnlinkDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ trait ResourceNotFoundException
    extends StObject
       with DeleteIdentityPoolExceptionsUnion
       with DescribeIdentityExceptionsUnion
       with DescribeIdentityPoolExceptionsUnion
       with GetCredentialsForIdentityExceptionsUnion
       with GetIdExceptionsUnion
       with GetIdentityPoolRolesExceptionsUnion
       with GetOpenIdTokenExceptionsUnion
       with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
       with ListIdentitiesExceptionsUnion
       with LookupDeveloperIdentityExceptionsUnion
       with MergeDeveloperIdentitiesExceptionsUnion
       with SetIdentityPoolRolesExceptionsUnion
       with UnlinkDeveloperIdentityExceptionsUnion
       with UnlinkIdentityExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ResourceNotFoundException
  }
  object ResourceNotFoundException {
    
    inline def apply(): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    extension [Self <: ResourceNotFoundException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by a ResourceNotFoundException.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ResourceNotFoundExceptionDetails {
    
    inline def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    extension [Self <: ResourceNotFoundExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
