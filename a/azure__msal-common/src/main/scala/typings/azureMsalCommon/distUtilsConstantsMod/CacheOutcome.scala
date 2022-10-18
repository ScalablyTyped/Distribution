package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheOutcome extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "CacheOutcome")
@js.native
object CacheOutcome extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheOutcome & String] = js.native
  
  @js.native
  sealed trait CACHED_ACCESS_TOKEN_EXPIRED
    extends StObject
       with CacheOutcome
  /* "3" */ val CACHED_ACCESS_TOKEN_EXPIRED: typings.azureMsalCommon.distUtilsConstantsMod.CacheOutcome.CACHED_ACCESS_TOKEN_EXPIRED & String = js.native
  
  @js.native
  sealed trait FORCE_REFRESH
    extends StObject
       with CacheOutcome
  /* "1" */ val FORCE_REFRESH: typings.azureMsalCommon.distUtilsConstantsMod.CacheOutcome.FORCE_REFRESH & String = js.native
  
  @js.native
  sealed trait NO_CACHED_ACCESS_TOKEN
    extends StObject
       with CacheOutcome
  /* "2" */ val NO_CACHED_ACCESS_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.CacheOutcome.NO_CACHED_ACCESS_TOKEN & String = js.native
  
  @js.native
  sealed trait NO_CACHE_HIT
    extends StObject
       with CacheOutcome
  /* "0" */ val NO_CACHE_HIT: typings.azureMsalCommon.distUtilsConstantsMod.CacheOutcome.NO_CACHE_HIT & String = js.native
  
  @js.native
  sealed trait REFRESH_CACHED_ACCESS_TOKEN
    extends StObject
       with CacheOutcome
  /* "4" */ val REFRESH_CACHED_ACCESS_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.CacheOutcome.REFRESH_CACHED_ACCESS_TOKEN & String = js.native
}
