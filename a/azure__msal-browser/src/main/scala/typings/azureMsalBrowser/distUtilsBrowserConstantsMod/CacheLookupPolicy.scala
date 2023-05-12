package typings.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheLookupPolicy extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "CacheLookupPolicy")
@js.native
object CacheLookupPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CacheLookupPolicy & Double] = js.native
  
  @js.native
  sealed trait AccessToken
    extends StObject
       with CacheLookupPolicy
  /* 1 */ val AccessToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.AccessToken & Double = js.native
  
  @js.native
  sealed trait AccessTokenAndRefreshToken
    extends StObject
       with CacheLookupPolicy
  /* 2 */ val AccessTokenAndRefreshToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.AccessTokenAndRefreshToken & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with CacheLookupPolicy
  /* 0 */ val Default: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.Default & Double = js.native
  
  @js.native
  sealed trait RefreshToken
    extends StObject
       with CacheLookupPolicy
  /* 3 */ val RefreshToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.RefreshToken & Double = js.native
  
  @js.native
  sealed trait RefreshTokenAndNetwork
    extends StObject
       with CacheLookupPolicy
  /* 4 */ val RefreshTokenAndNetwork: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.RefreshTokenAndNetwork & Double = js.native
  
  @js.native
  sealed trait Skip
    extends StObject
       with CacheLookupPolicy
  /* 5 */ val Skip: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.CacheLookupPolicy.Skip & Double = js.native
}
