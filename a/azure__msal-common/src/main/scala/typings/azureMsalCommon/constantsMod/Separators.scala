package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Separators extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "Separators")
@js.native
object Separators extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Separators & String] = js.native
  
  @js.native
  sealed trait CACHE_KEY_SEPARATOR
    extends StObject
       with Separators
  /* "-" */ val CACHE_KEY_SEPARATOR: typings.azureMsalCommon.constantsMod.Separators.CACHE_KEY_SEPARATOR & String = js.native
  
  @js.native
  sealed trait CLIENT_INFO_SEPARATOR
    extends StObject
       with Separators
  /* "." */ val CLIENT_INFO_SEPARATOR: typings.azureMsalCommon.constantsMod.Separators.CLIENT_INFO_SEPARATOR & String = js.native
}
