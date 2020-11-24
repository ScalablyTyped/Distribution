package typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod.CognitoProviderParameters
import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromCognitoIdentityPoolParameters extends CognitoProviderParameters {
  
  /**
    * A standard AWS account ID (9+ digits).
    */
  var accountId: js.UndefOr[String] = js.native
  
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
  var cache: js.UndefOr[Storage] = js.native
  
  /**
    * The unique identifier for the identity pool from which an identity should
    * be retrieved or generated.
    */
  var identityPoolId: String = js.native
  
  /**
    * A unique identifier for the user. This is distinct from a Cognito
    * IdentityId and should instead be an identifier meaningful to your
    * application. Used to cache Cognito IdentityIds on a per-user basis.
    */
  var userIdentifier: js.UndefOr[String] = js.native
}
object FromCognitoIdentityPoolParameters {
  
  @scala.inline
  def apply(client: CognitoIdentityClient, identityPoolId: String): FromCognitoIdentityPoolParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromCognitoIdentityPoolParameters]
  }
  
  @scala.inline
  implicit class FromCognitoIdentityPoolParametersOps[Self <: FromCognitoIdentityPoolParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = this.set("identityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCache(value: Storage): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setUserIdentifier(value: String): Self = this.set("userIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdentifier: Self = this.set("userIdentifier", js.undefined)
  }
}
