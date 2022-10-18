package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AccountEntity")
@js.native
open class AccountEntity ()
  extends typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
/* static members */
object AccountEntity {
  
  @JSImport("@azure/msal-common", "AccountEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to determine whether 2 accountInfo objects represent the same account
    * @param accountA
    * @param accountB
    * @param compareClaims - If set to true idTokenClaims will also be compared to determine account equality
    */
  inline def accountInfoIsEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")().asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: Null, accountB: Null, compareClaims: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any], compareClaims.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: Null, accountB: AccountInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: Null, accountB: AccountInfo, compareClaims: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any], compareClaims.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: AccountInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: AccountInfo, accountB: Null, compareClaims: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any], compareClaims.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: AccountInfo, accountB: AccountInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def accountInfoIsEqual(accountA: AccountInfo, accountB: AccountInfo, compareClaims: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("accountInfoIsEqual")(accountA.asInstanceOf[js.Any], accountB.asInstanceOf[js.Any], compareClaims.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Build Account cache from IdToken, clientInfo and authority/policy. Associated with AAD.
    * @param clientInfo
    * @param authority
    * @param idToken
    * @param policy
    */
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createAccount(
    clientInfo: String,
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: Unit,
    nativeAccountId: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  
  /**
    * Builds non-AAD/ADFS account.
    * @param authority
    * @param idToken
    */
  inline def createGenericAccount(homeAccountId: String, idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: Unit,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: String,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: String,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  inline def createGenericAccount(
    homeAccountId: String,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken,
    authority: typings.azureMsalCommon.distAuthorityAuthorityMod.Authority,
    cloudGraphHostName: Unit,
    msGraphHost: Unit,
    environment: String
  ): typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity]
  
  /**
    * Generates account key from interface
    * @param accountInterface
    */
  inline def generateAccountCacheKey(accountInterface: AccountInfo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAccountCacheKey")(accountInterface.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generate HomeAccountId from server response
    * @param serverClientInfo
    * @param authType
    */
  inline def generateHomeAccountId(
    serverClientInfo: String,
    authType: typings.azureMsalCommon.distAuthorityAuthorityTypeMod.AuthorityType,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    cryptoObj: ICrypto
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHomeAccountId")(serverClientInfo.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cryptoObj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateHomeAccountId(
    serverClientInfo: String,
    authType: typings.azureMsalCommon.distAuthorityAuthorityTypeMod.AuthorityType,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    cryptoObj: ICrypto,
    idToken: typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHomeAccountId")(serverClientInfo.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cryptoObj.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Validates an entity: checks for all expected params
    * @param entity
    */
  inline def isAccountEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccountEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
