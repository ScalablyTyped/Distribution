package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "InteractionStatus")
@js.native
object InteractionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalBrowser.browserConstantsMod.InteractionStatus & String] = js.native
  
  /* "acquireToken" */ val AcquireToken: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.AcquireToken & String = js.native
  
  /* "handleRedirect" */ val HandleRedirect: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.HandleRedirect & String = js.native
  
  /* "login" */ val Login: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.Login & String = js.native
  
  /* "logout" */ val Logout: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.Logout & String = js.native
  
  /* "none" */ val None: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.None & String = js.native
  
  /* "ssoSilent" */ val SsoSilent: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.SsoSilent & String = js.native
  
  /* "startup" */ val Startup: typings.azureMsalBrowser.browserConstantsMod.InteractionStatus.Startup & String = js.native
}
