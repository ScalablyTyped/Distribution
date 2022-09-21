package typings.azureMsalBrowser.browserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractionType extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "InteractionType")
@js.native
object InteractionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractionType & String] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with InteractionType
  /* "none" */ val None: typings.azureMsalBrowser.browserConstantsMod.InteractionType.None & String = js.native
  
  @js.native
  sealed trait Popup
    extends StObject
       with InteractionType
  /* "popup" */ val Popup: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Popup & String = js.native
  
  @js.native
  sealed trait Redirect
    extends StObject
       with InteractionType
  /* "redirect" */ val Redirect: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Redirect & String = js.native
  
  @js.native
  sealed trait Silent
    extends StObject
       with InteractionType
  /* "silent" */ val Silent: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Silent & String = js.native
}
