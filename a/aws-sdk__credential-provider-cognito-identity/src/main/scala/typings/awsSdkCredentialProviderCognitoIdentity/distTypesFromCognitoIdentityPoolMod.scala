package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesCognitoProviderParametersMod.CognitoProviderParameters
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromCognitoIdentityPoolMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist-types/fromCognitoIdentityPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentityPool(param0: FromCognitoIdentityPoolParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(param0.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  trait FromCognitoIdentityPoolParameters
    extends StObject
       with CognitoProviderParameters {
    
    /**
      * A standard AWS account ID (9+ digits).
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * A cache in which to store resolved Cognito IdentityIds. If not supplied,
      * the credential provider will attempt to store IdentityIds in one of the
      * following (in order of preference):
      *   1. IndexedDB
      *   2. LocalStorage
      *   3. An in-memory cache object that will not persist between pages.
      *
      * IndexedDB is preferred to maximize data sharing between top-level
      * browsing contexts and web workers.
      *
      * The provider will not cache IdentityIds of authenticated users unless a
      * separate `userIdentitifer` parameter is supplied.
      */
    var cache: js.UndefOr[Storage] = js.undefined
    
    /**
      * The unique identifier for the identity pool from which an identity should
      * be retrieved or generated.
      */
    var identityPoolId: String
    
    /**
      * A unique identifier for the user. This is distinct from a Cognito
      * IdentityId and should instead be an identifier meaningful to your
      * application. Used to cache Cognito IdentityIds on a per-user basis.
      */
    var userIdentifier: js.UndefOr[String] = js.undefined
  }
  object FromCognitoIdentityPoolParameters {
    
    inline def apply(client: CognitoIdentityClient, identityPoolId: String): FromCognitoIdentityPoolParameters = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromCognitoIdentityPoolParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromCognitoIdentityPoolParameters] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setCache(value: Storage): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setIdentityPoolId(value: String): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifier(value: String): Self = StObject.set(x, "userIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifierUndefined: Self = StObject.set(x, "userIdentifier", js.undefined)
    }
  }
}
