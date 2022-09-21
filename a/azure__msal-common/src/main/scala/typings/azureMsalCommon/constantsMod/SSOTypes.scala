package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SSOTypes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "SSOTypes")
@js.native
object SSOTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SSOTypes & String] = js.native
  
  @js.native
  sealed trait ACCOUNT
    extends StObject
       with SSOTypes
  /* "account" */ val ACCOUNT: typings.azureMsalCommon.constantsMod.SSOTypes.ACCOUNT & String = js.native
  
  @js.native
  sealed trait ACCOUNT_ID
    extends StObject
       with SSOTypes
  /* "accountIdentifier" */ val ACCOUNT_ID: typings.azureMsalCommon.constantsMod.SSOTypes.ACCOUNT_ID & String = js.native
  
  @js.native
  sealed trait CONSUMERS
    extends StObject
       with SSOTypes
  /* "consumers" */ val CONSUMERS: typings.azureMsalCommon.constantsMod.SSOTypes.CONSUMERS & String = js.native
  
  @js.native
  sealed trait DOMAIN_HINT
    extends StObject
       with SSOTypes
  /* "domain_hint" */ val DOMAIN_HINT: typings.azureMsalCommon.constantsMod.SSOTypes.DOMAIN_HINT & String = js.native
  
  @js.native
  sealed trait HOMEACCOUNT_ID
    extends StObject
       with SSOTypes
  /* "homeAccountIdentifier" */ val HOMEACCOUNT_ID: typings.azureMsalCommon.constantsMod.SSOTypes.HOMEACCOUNT_ID & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with SSOTypes
  /* "id_token" */ val ID_TOKEN: typings.azureMsalCommon.constantsMod.SSOTypes.ID_TOKEN & String = js.native
  
  @js.native
  sealed trait LOGIN_HINT
    extends StObject
       with SSOTypes
  /* "login_hint" */ val LOGIN_HINT: typings.azureMsalCommon.constantsMod.SSOTypes.LOGIN_HINT & String = js.native
  
  @js.native
  sealed trait ORGANIZATIONS
    extends StObject
       with SSOTypes
  /* "organizations" */ val ORGANIZATIONS: typings.azureMsalCommon.constantsMod.SSOTypes.ORGANIZATIONS & String = js.native
  
  @js.native
  sealed trait SID
    extends StObject
       with SSOTypes
  /* "sid" */ val SID: typings.azureMsalCommon.constantsMod.SSOTypes.SID & String = js.native
}
