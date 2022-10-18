package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RegionDiscoverySources extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "RegionDiscoverySources")
@js.native
object RegionDiscoverySources extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RegionDiscoverySources & String] = js.native
  
  @js.native
  sealed trait ENVIRONMENT_VARIABLE
    extends StObject
       with RegionDiscoverySources
  /* "3" */ val ENVIRONMENT_VARIABLE: typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoverySources.ENVIRONMENT_VARIABLE & String = js.native
  
  @js.native
  sealed trait FAILED_AUTO_DETECTION
    extends StObject
       with RegionDiscoverySources
  /* "1" */ val FAILED_AUTO_DETECTION: typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoverySources.FAILED_AUTO_DETECTION & String = js.native
  
  @js.native
  sealed trait IMDS
    extends StObject
       with RegionDiscoverySources
  /* "4" */ val IMDS: typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoverySources.IMDS & String = js.native
  
  @js.native
  sealed trait INTERNAL_CACHE
    extends StObject
       with RegionDiscoverySources
  /* "2" */ val INTERNAL_CACHE: typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoverySources.INTERNAL_CACHE & String = js.native
}
