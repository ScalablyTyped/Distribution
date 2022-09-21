package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AADAuthorityConstants extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "AADAuthorityConstants")
@js.native
object AADAuthorityConstants extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AADAuthorityConstants & String] = js.native
  
  @js.native
  sealed trait COMMON
    extends StObject
       with AADAuthorityConstants
  /* "common" */ val COMMON: typings.azureMsalCommon.constantsMod.AADAuthorityConstants.COMMON & String = js.native
  
  @js.native
  sealed trait CONSUMERS
    extends StObject
       with AADAuthorityConstants
  /* "consumers" */ val CONSUMERS: typings.azureMsalCommon.constantsMod.AADAuthorityConstants.CONSUMERS & String = js.native
  
  @js.native
  sealed trait ORGANIZATIONS
    extends StObject
       with AADAuthorityConstants
  /* "organizations" */ val ORGANIZATIONS: typings.azureMsalCommon.constantsMod.AADAuthorityConstants.ORGANIZATIONS & String = js.native
}
