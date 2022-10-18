package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "InteractionStatus")
@js.native
object InteractionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus & String] = js.native
  
  /* "acquireToken" */ val AcquireToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.AcquireToken & String = js.native
  
  /* "handleRedirect" */ val HandleRedirect: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.HandleRedirect & String = js.native
  
  /* "login" */ val Login: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Login & String = js.native
  
  /* "logout" */ val Logout: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Logout & String = js.native
  
  /* "none" */ val None: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.None & String = js.native
  
  /* "ssoSilent" */ val SsoSilent: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.SsoSilent & String = js.native
  
  /* "startup" */ val Startup: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Startup & String = js.native
}
