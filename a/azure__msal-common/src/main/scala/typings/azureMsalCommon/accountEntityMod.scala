package typings.azureMsalCommon

import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.authTokenMod.AuthToken
import typings.azureMsalCommon.authorityMod.Authority
import typings.azureMsalCommon.authorityTypeMod.AuthorityType
import typings.azureMsalCommon.cacheTypesMod._ValidCacheType
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.loggerMod.Logger
import typings.azureMsalCommon.tokenClaimsMod.TokenClaims
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/AccountEntity", "AccountEntity")
  @js.native
  open class AccountEntity ()
    extends StObject
       with _ValidCacheType {
    
    var authorityType: String = js.native
    
    var clientInfo: js.UndefOr[String] = js.native
    
    var cloudGraphHostName: js.UndefOr[String] = js.native
    
    var environment: String = js.native
    
    /**
      * Generate Account Id key component as per the schema: <home_account_id>-<environment>
      */
    def generateAccountId(): String = js.native
    
    /**
      * Generate Account Cache Key as per the schema: <home_account_id>-<environment>-<realm*>
      */
    def generateAccountKey(): String = js.native
    
    /**
      * returns the type of the cache (in this case account)
      */
    def generateType(): Double = js.native
    
    /**
      * Returns the AccountInfo interface for this account.
      */
    def getAccountInfo(): AccountInfo = js.native
    
    var homeAccountId: String = js.native
    
    var idTokenClaims: js.UndefOr[TokenClaims] = js.native
    
    var lastModificationApp: js.UndefOr[String] = js.native
    
    var lastModificationTime: js.UndefOr[String] = js.native
    
    var localAccountId: String = js.native
    
    var msGraphHost: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nativeAccountId: js.UndefOr[String] = js.native
    
    var realm: String = js.native
    
    var username: String = js.native
  }
  /* static members */
  object AccountEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/AccountEntity", "AccountEntity")
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
    inline def createAccount(clientInfo: String, homeAccountId: String, idToken: AuthToken): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(clientInfo: String, homeAccountId: String, idToken: AuthToken, authority: Authority): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createAccount(
      clientInfo: String,
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: Unit,
      nativeAccountId: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(clientInfo.asInstanceOf[js.Any], homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], nativeAccountId.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    
    /**
      * Builds non-AAD/ADFS account.
      * @param authority
      * @param idToken
      */
    inline def createGenericAccount(homeAccountId: String, idToken: AuthToken): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(homeAccountId: String, idToken: AuthToken, authority: Unit, cloudGraphHostName: String): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Unit,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(homeAccountId: String, idToken: AuthToken, authority: Authority): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(homeAccountId: String, idToken: AuthToken, authority: Authority, cloudGraphHostName: String): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: String,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: String,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    inline def createGenericAccount(
      homeAccountId: String,
      idToken: AuthToken,
      authority: Authority,
      cloudGraphHostName: Unit,
      msGraphHost: Unit,
      environment: String
    ): AccountEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericAccount")(homeAccountId.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cloudGraphHostName.asInstanceOf[js.Any], msGraphHost.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AccountEntity]
    
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
    inline def generateHomeAccountId(serverClientInfo: String, authType: AuthorityType, logger: Logger, cryptoObj: ICrypto): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHomeAccountId")(serverClientInfo.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cryptoObj.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateHomeAccountId(
      serverClientInfo: String,
      authType: AuthorityType,
      logger: Logger,
      cryptoObj: ICrypto,
      idToken: AuthToken
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHomeAccountId")(serverClientInfo.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], cryptoObj.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isAccountEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccountEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
