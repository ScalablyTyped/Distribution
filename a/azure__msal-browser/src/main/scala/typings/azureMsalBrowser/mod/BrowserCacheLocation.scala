package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "BrowserCacheLocation")
@js.native
object BrowserCacheLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation & String
  ] = js.native
  
  /* "localStorage" */ val LocalStorage: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.LocalStorage & String = js.native
  
  /* "memoryStorage" */ val MemoryStorage: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.MemoryStorage & String = js.native
  
  /* "sessionStorage" */ val SessionStorage: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.SessionStorage & String = js.native
}
