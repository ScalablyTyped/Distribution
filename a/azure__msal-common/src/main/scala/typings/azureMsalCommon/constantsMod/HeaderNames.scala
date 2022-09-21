package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderNames extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "HeaderNames")
@js.native
object HeaderNames extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HeaderNames & String] = js.native
  
  @js.native
  sealed trait AuthenticationInfo
    extends StObject
       with HeaderNames
  /* "Authentication-Info" */ val AuthenticationInfo: typings.azureMsalCommon.constantsMod.HeaderNames.AuthenticationInfo & String = js.native
  
  @js.native
  sealed trait CCS_HEADER
    extends StObject
       with HeaderNames
  /* "X-AnchorMailbox" */ val CCS_HEADER: typings.azureMsalCommon.constantsMod.HeaderNames.CCS_HEADER & String = js.native
  
  @js.native
  sealed trait CONTENT_TYPE
    extends StObject
       with HeaderNames
  /* "Content-Type" */ val CONTENT_TYPE: typings.azureMsalCommon.constantsMod.HeaderNames.CONTENT_TYPE & String = js.native
  
  @js.native
  sealed trait RETRY_AFTER
    extends StObject
       with HeaderNames
  /* "Retry-After" */ val RETRY_AFTER: typings.azureMsalCommon.constantsMod.HeaderNames.RETRY_AFTER & String = js.native
  
  @js.native
  sealed trait WWWAuthenticate
    extends StObject
       with HeaderNames
  /* "WWW-Authenticate" */ val WWWAuthenticate: typings.azureMsalCommon.constantsMod.HeaderNames.WWWAuthenticate & String = js.native
}
