package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "InteractionType")
@js.native
object InteractionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalBrowser.browserConstantsMod.InteractionType & String] = js.native
  
  /* "none" */ val None: typings.azureMsalBrowser.browserConstantsMod.InteractionType.None & String = js.native
  
  /* "popup" */ val Popup: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Popup & String = js.native
  
  /* "redirect" */ val Redirect: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Redirect & String = js.native
  
  /* "silent" */ val Silent: typings.azureMsalBrowser.browserConstantsMod.InteractionType.Silent & String = js.native
}
