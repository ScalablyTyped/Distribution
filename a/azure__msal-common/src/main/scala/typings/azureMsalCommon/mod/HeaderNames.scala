package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "HeaderNames")
@js.native
object HeaderNames extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalCommon.constantsMod.HeaderNames & String] = js.native
  
  /* "Authentication-Info" */ val AuthenticationInfo: typings.azureMsalCommon.constantsMod.HeaderNames.AuthenticationInfo & String = js.native
  
  /* "X-AnchorMailbox" */ val CCS_HEADER: typings.azureMsalCommon.constantsMod.HeaderNames.CCS_HEADER & String = js.native
  
  /* "Content-Type" */ val CONTENT_TYPE: typings.azureMsalCommon.constantsMod.HeaderNames.CONTENT_TYPE & String = js.native
  
  /* "Retry-After" */ val RETRY_AFTER: typings.azureMsalCommon.constantsMod.HeaderNames.RETRY_AFTER & String = js.native
  
  /* "WWW-Authenticate" */ val WWWAuthenticate: typings.azureMsalCommon.constantsMod.HeaderNames.WWWAuthenticate & String = js.native
}
