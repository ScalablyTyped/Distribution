package typings.azureMsalBrowser.browserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HTTP_REQUEST_TYPE extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "HTTP_REQUEST_TYPE")
@js.native
object HTTP_REQUEST_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HTTP_REQUEST_TYPE & String] = js.native
  
  @js.native
  sealed trait GET
    extends StObject
       with HTTP_REQUEST_TYPE
  /* "GET" */ val GET: typings.azureMsalBrowser.browserConstantsMod.HTTP_REQUEST_TYPE.GET & String = js.native
  
  @js.native
  sealed trait POST
    extends StObject
       with HTTP_REQUEST_TYPE
  /* "POST" */ val POST: typings.azureMsalBrowser.browserConstantsMod.HTTP_REQUEST_TYPE.POST & String = js.native
}
