package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersistentCacheKeys extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "PersistentCacheKeys")
@js.native
object PersistentCacheKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PersistentCacheKeys & String] = js.native
  
  @js.native
  sealed trait ACTIVE_ACCOUNT
    extends StObject
       with PersistentCacheKeys
  /* "active-account" */ val ACTIVE_ACCOUNT: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ACTIVE_ACCOUNT & String = js.native
  
  @js.native
  sealed trait ACTIVE_ACCOUNT_FILTERS
    extends StObject
       with PersistentCacheKeys
  /* "active-account-filters" */ val ACTIVE_ACCOUNT_FILTERS: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ACTIVE_ACCOUNT_FILTERS & String = js.native
  
  @js.native
  sealed trait ADAL_ID_TOKEN
    extends StObject
       with PersistentCacheKeys
  /* "adal.idtoken" */ val ADAL_ID_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ADAL_ID_TOKEN & String = js.native
  
  @js.native
  sealed trait CLIENT_INFO
    extends StObject
       with PersistentCacheKeys
  /* "client.info" */ val CLIENT_INFO: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.CLIENT_INFO & String = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PersistentCacheKeys
  /* "error" */ val ERROR: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ERROR & String = js.native
  
  @js.native
  sealed trait ERROR_DESC
    extends StObject
       with PersistentCacheKeys
  /* "error.description" */ val ERROR_DESC: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ERROR_DESC & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with PersistentCacheKeys
  /* "idtoken" */ val ID_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.PersistentCacheKeys.ID_TOKEN & String = js.native
}
