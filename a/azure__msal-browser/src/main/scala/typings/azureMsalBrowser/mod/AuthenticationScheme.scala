package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "AuthenticationScheme")
@js.native
object AuthenticationScheme extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme & String] = js.native
  
  /* "Bearer" */ val BEARER: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.BEARER & String = js.native
  
  /* "pop" */ val POP: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.POP & String = js.native
  
  /* "ssh-cert" */ val SSH: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.SSH & String = js.native
}
