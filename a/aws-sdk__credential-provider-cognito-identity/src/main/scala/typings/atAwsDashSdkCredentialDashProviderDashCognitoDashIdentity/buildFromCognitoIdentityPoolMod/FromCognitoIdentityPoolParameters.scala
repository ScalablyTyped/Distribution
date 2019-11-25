package typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildFromCognitoIdentityPoolMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityClientMod.CognitoIdentityClient
import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildCognitoProviderParametersMod.CognitoProviderParameters
import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildLoginsMod.Logins
import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildStorageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromCognitoIdentityPoolParameters extends CognitoProviderParameters {
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
  @scala.inline
  def apply(
    client: CognitoIdentityClient,
    identityPoolId: String,
    accountId: String = null,
    cache: Storage = null,
    customRoleArn: String = null,
    logins: Logins = null,
    userIdentifier: String = null
  ): FromCognitoIdentityPoolParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (customRoleArn != null) __obj.updateDynamic("customRoleArn")(customRoleArn.asInstanceOf[js.Any])
    if (logins != null) __obj.updateDynamic("logins")(logins.asInstanceOf[js.Any])
    if (userIdentifier != null) __obj.updateDynamic("userIdentifier")(userIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromCognitoIdentityPoolParameters]
  }
}

