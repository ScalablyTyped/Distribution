package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "AuthenticationScheme")
@js.native
object AuthenticationScheme extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalCommon.constantsMod.AuthenticationScheme & String] = js.native
  
  /* "Bearer" */ val BEARER: typings.azureMsalCommon.constantsMod.AuthenticationScheme.BEARER & String = js.native
  
  /* "pop" */ val POP: typings.azureMsalCommon.constantsMod.AuthenticationScheme.POP & String = js.native
  
  /* "ssh-cert" */ val SSH: typings.azureMsalCommon.constantsMod.AuthenticationScheme.SSH & String = js.native
}
