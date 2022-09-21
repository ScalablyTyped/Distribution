package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PasswordGrantConstants extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "PasswordGrantConstants")
@js.native
object PasswordGrantConstants extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PasswordGrantConstants & String] = js.native
  
  @js.native
  sealed trait password
    extends StObject
       with PasswordGrantConstants
  /* "password" */ val password: typings.azureMsalCommon.constantsMod.PasswordGrantConstants.password & String = js.native
  
  @js.native
  sealed trait username
    extends StObject
       with PasswordGrantConstants
  /* "username" */ val username: typings.azureMsalCommon.constantsMod.PasswordGrantConstants.username & String = js.native
}
