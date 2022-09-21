package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "BrowserCacheLocation")
@js.native
object BrowserCacheLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalBrowser.browserConstantsMod.BrowserCacheLocation & String] = js.native
  
  /* "localStorage" */ val LocalStorage: typings.azureMsalBrowser.browserConstantsMod.BrowserCacheLocation.LocalStorage & String = js.native
  
  /* "memoryStorage" */ val MemoryStorage: typings.azureMsalBrowser.browserConstantsMod.BrowserCacheLocation.MemoryStorage & String = js.native
  
  /* "sessionStorage" */ val SessionStorage: typings.azureMsalBrowser.browserConstantsMod.BrowserCacheLocation.SessionStorage & String = js.native
}
