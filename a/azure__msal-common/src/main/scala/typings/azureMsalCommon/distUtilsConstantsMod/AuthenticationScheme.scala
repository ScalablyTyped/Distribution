package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthenticationScheme extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "AuthenticationScheme")
@js.native
object AuthenticationScheme extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AuthenticationScheme & String] = js.native
  
  @js.native
  sealed trait BEARER
    extends StObject
       with AuthenticationScheme
  /* "Bearer" */ val BEARER: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.BEARER & String = js.native
  
  @js.native
  sealed trait POP
    extends StObject
       with AuthenticationScheme
  /* "pop" */ val POP: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.POP & String = js.native
  
  @js.native
  sealed trait SSH
    extends StObject
       with AuthenticationScheme
  /* "ssh-cert" */ val SSH: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme.SSH & String = js.native
}
