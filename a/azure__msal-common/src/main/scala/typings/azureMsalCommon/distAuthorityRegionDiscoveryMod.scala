package typings.azureMsalCommon

import typings.azureMsalCommon.distAuthorityImdsOptionsMod.ImdsOptions
import typings.azureMsalCommon.distAuthorityRegionDiscoveryMetadataMod.RegionDiscoveryMetadata
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityRegionDiscoveryMod {
  
  @JSImport("@azure/msal-common/dist/authority/RegionDiscovery", "RegionDiscovery")
  @js.native
  open class RegionDiscovery protected () extends StObject {
    def this(networkInterface: INetworkModule) = this()
    def this(networkInterface: INetworkModule, performanceClient: IPerformanceClient) = this()
    def this(networkInterface: INetworkModule, performanceClient: Unit, correlationId: String) = this()
    def this(networkInterface: INetworkModule, performanceClient: IPerformanceClient, correlationId: String) = this()
    
    /* protected */ var correlationId: js.UndefOr[String] = js.native
    
    /**
      * Detect the region from the application's environment.
      *
      * @returns Promise<string | null>
      */
    def detectRegion(environmentRegion: String, regionDiscoveryMetadata: RegionDiscoveryMetadata): js.Promise[String | Null] = js.native
    def detectRegion(environmentRegion: Unit, regionDiscoveryMetadata: RegionDiscoveryMetadata): js.Promise[String | Null] = js.native
    
    /**
      * Get the most recent version of the IMDS endpoint available
      *
      * @returns Promise<string | null>
      */
    /* private */ var getCurrentVersion: Any = js.native
    
    /**
      * Make the call to the IMDS endpoint
      *
      * @param imdsEndpointUrl
      * @returns Promise<NetworkResponse<string>>
      */
    /* private */ var getRegionFromIMDS: Any = js.native
    
    /* protected */ var networkInterface: INetworkModule = js.native
    
    /* protected */ var performanceClient: js.UndefOr[IPerformanceClient] = js.native
  }
  /* static members */
  object RegionDiscovery {
    
    @JSImport("@azure/msal-common/dist/authority/RegionDiscovery", "RegionDiscovery")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/authority/RegionDiscovery", "RegionDiscovery.IMDS_OPTIONS")
    @js.native
    def IMDS_OPTIONS: ImdsOptions = js.native
    inline def IMDS_OPTIONS_=(x: ImdsOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMDS_OPTIONS")(x.asInstanceOf[js.Any])
  }
}
