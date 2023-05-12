package typings.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StaticCacheKeys extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "StaticCacheKeys")
@js.native
object StaticCacheKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StaticCacheKeys & String] = js.native
  
  @js.native
  sealed trait ACCOUNT_KEYS
    extends StObject
       with StaticCacheKeys
  /* "msal.account.keys" */ val ACCOUNT_KEYS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.StaticCacheKeys.ACCOUNT_KEYS & String = js.native
  
  @js.native
  sealed trait TOKEN_KEYS
    extends StObject
       with StaticCacheKeys
  /* "msal.token.keys" */ val TOKEN_KEYS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.StaticCacheKeys.TOKEN_KEYS & String = js.native
}
