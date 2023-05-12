package typings.chrome.global.chrome

import typings.chrome.chrome.identity.AccountInfo
import typings.chrome.chrome.identity.GetAuthTokenResult
import typings.chrome.chrome.identity.ProfileDetails
import typings.chrome.chrome.identity.SignInChangeEvent
import typings.chrome.chrome.identity.TokenDetails
import typings.chrome.chrome.identity.TokenInformation
import typings.chrome.chrome.identity.UserInfo
import typings.chrome.chrome.identity.WebAuthFlowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Identity
////////////////////
/**
  * Use the chrome.identity API to get OAuth2 access tokens.
  * Permissions:  "identity"
  * @since Chrome 29.
  */
object identity {
  
  @JSGlobal("chrome.identity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.identity.AccountStatus")
  @js.native
  object AccountStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.identity.AccountStatus & String] = js.native
    
    /* "ANY" */ val ANY: typings.chrome.chrome.identity.AccountStatus.ANY & String = js.native
    
    /* "SYNC" */ val SYNC: typings.chrome.chrome.identity.AccountStatus.SYNC & String = js.native
  }
  
  inline def clearAllCachedAuthTokens(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllCachedAuthTokens")().asInstanceOf[js.Promise[Unit]]
  inline def clearAllCachedAuthTokens(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllCachedAuthTokens")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAccounts(): js.Promise[js.Array[AccountInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")().asInstanceOf[js.Promise[js.Array[AccountInfo]]]
  inline def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAuthToken(details: TokenDetails): js.Promise[GetAuthTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAuthTokenResult]]
  inline def getAuthToken(
    details: TokenDetails,
    callback: js.Function2[
      /* token */ js.UndefOr[String], 
      /* grantedScopes */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getProfileUserInfo(details: ProfileDetails): js.Promise[UserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserInfo]]
  inline def getProfileUserInfo(details: ProfileDetails, callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRedirectURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")().asInstanceOf[String]
  inline def getRedirectURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def launchWebAuthFlow(details: WebAuthFlowOptions): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.identity.onSignInChanged")
  @js.native
  def onSignInChanged: SignInChangeEvent = js.native
  inline def onSignInChanged_=(x: SignInChangeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSignInChanged")(x.asInstanceOf[js.Any])
  
  inline def removeCachedAuthToken(details: TokenInformation): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
