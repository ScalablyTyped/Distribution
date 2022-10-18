package typings.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractionStatus extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "InteractionStatus")
@js.native
object InteractionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractionStatus & String] = js.native
  
  /**
    * Status set for acquireToken calls
    */
  @js.native
  sealed trait AcquireToken
    extends StObject
       with InteractionStatus
  /* "acquireToken" */ val AcquireToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.AcquireToken & String = js.native
  
  /**
    * Status set when handleRedirect in progress
    */
  @js.native
  sealed trait HandleRedirect
    extends StObject
       with InteractionStatus
  /* "handleRedirect" */ val HandleRedirect: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.HandleRedirect & String = js.native
  
  /**
    * Status set when all login calls occuring
    */
  @js.native
  sealed trait Login
    extends StObject
       with InteractionStatus
  /* "login" */ val Login: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Login & String = js.native
  
  /**
    * Status set when logout call occuring
    */
  @js.native
  sealed trait Logout
    extends StObject
       with InteractionStatus
  /* "logout" */ val Logout: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Logout & String = js.native
  
  /**
    * Status set when interaction is complete
    */
  @js.native
  sealed trait None
    extends StObject
       with InteractionStatus
  /* "none" */ val None: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.None & String = js.native
  
  /**
    * Status set for ssoSilent calls
    */
  @js.native
  sealed trait SsoSilent
    extends StObject
       with InteractionStatus
  /* "ssoSilent" */ val SsoSilent: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.SsoSilent & String = js.native
  
  /**
    * Initial status before interaction occurs
    */
  @js.native
  sealed trait Startup
    extends StObject
       with InteractionStatus
  /* "startup" */ val Startup: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus.Startup & String = js.native
}
