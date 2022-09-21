package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RegionDiscoveryOutcomes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "RegionDiscoveryOutcomes")
@js.native
object RegionDiscoveryOutcomes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RegionDiscoveryOutcomes & String] = js.native
  
  @js.native
  sealed trait AUTO_DETECTION_REQUESTED_FAILED
    extends StObject
       with RegionDiscoveryOutcomes
  /* "5" */ val AUTO_DETECTION_REQUESTED_FAILED: typings.azureMsalCommon.constantsMod.RegionDiscoveryOutcomes.AUTO_DETECTION_REQUESTED_FAILED & String = js.native
  
  @js.native
  sealed trait AUTO_DETECTION_REQUESTED_SUCCESSFUL
    extends StObject
       with RegionDiscoveryOutcomes
  /* "4" */ val AUTO_DETECTION_REQUESTED_SUCCESSFUL: typings.azureMsalCommon.constantsMod.RegionDiscoveryOutcomes.AUTO_DETECTION_REQUESTED_SUCCESSFUL & String = js.native
  
  @js.native
  sealed trait CONFIGURED_MATCHES_DETECTED
    extends StObject
       with RegionDiscoveryOutcomes
  /* "1" */ val CONFIGURED_MATCHES_DETECTED: typings.azureMsalCommon.constantsMod.RegionDiscoveryOutcomes.CONFIGURED_MATCHES_DETECTED & String = js.native
  
  @js.native
  sealed trait CONFIGURED_NOT_DETECTED
    extends StObject
       with RegionDiscoveryOutcomes
  /* "3" */ val CONFIGURED_NOT_DETECTED: typings.azureMsalCommon.constantsMod.RegionDiscoveryOutcomes.CONFIGURED_NOT_DETECTED & String = js.native
  
  @js.native
  sealed trait CONFIGURED_NO_AUTO_DETECTION
    extends StObject
       with RegionDiscoveryOutcomes
  /* "2" */ val CONFIGURED_NO_AUTO_DETECTION: typings.azureMsalCommon.constantsMod.RegionDiscoveryOutcomes.CONFIGURED_NO_AUTO_DETECTION & String = js.native
}
