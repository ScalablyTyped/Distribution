package typings.azureMsalCommon

import typings.azureMsalCommon.authErrorMod.AuthError
import typings.azureMsalCommon.cacheManagerMod.CacheManager
import typings.azureMsalCommon.constantsMod.CacheOutcome
import typings.azureMsalCommon.regionDiscoveryMetadataMod.RegionDiscoveryMetadata
import typings.azureMsalCommon.serverTelemetryEntityMod.ServerTelemetryEntity
import typings.azureMsalCommon.serverTelemetryRequestMod.ServerTelemetryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverTelemetryManagerMod {
  
  @JSImport("@azure/msal-common/dist/telemetry/server/ServerTelemetryManager", "ServerTelemetryManager")
  @js.native
  open class ServerTelemetryManager protected () extends StObject {
    def this(telemetryRequest: ServerTelemetryRequest, cacheManager: CacheManager) = this()
    
    /* private */ var apiId: Any = js.native
    
    /**
      * API to cache token failures for MSER data capture
      * @param error
      */
    def cacheFailedRequest(error: AuthError): Unit = js.native
    
    /* private */ var cacheManager: Any = js.native
    
    /* private */ var cacheOutcome: Any = js.native
    
    /**
      * Remove server telemetry cache entry
      */
    def clearTelemetryCache(): Unit = js.native
    
    /* private */ var correlationId: Any = js.native
    
    /**
      * API to add MSER Telemetry to request
      */
    def generateCurrentRequestHeaderValue(): String = js.native
    
    /**
      * API to add MSER Telemetry for the last failed request
      */
    def generateLastRequestHeaderValue(): String = js.native
    
    /**
      * Get the server telemetry entity from cache or initialize a new one
      */
    def getLastRequests(): ServerTelemetryEntity = js.native
    
    /**
      * Get the region discovery fields
      *
      * @returns string
      */
    def getRegionDiscoveryFields(): String = js.native
    
    /**
      * Update server telemetry cache entry by incrementing cache hit counter
      */
    def incrementCacheHits(): Double = js.native
    
    /* private */ var regionOutcome: Any = js.native
    
    /* private */ var regionSource: Any = js.native
    
    /* private */ var regionUsed: Any = js.native
    
    /**
      * Set cache outcome
      */
    def setCacheOutcome(cacheOutcome: CacheOutcome): Unit = js.native
    
    /* private */ var telemetryCacheKey: Any = js.native
    
    /**
      * Update the region discovery metadata
      *
      * @param regionDiscoveryMetadata
      * @returns void
      */
    def updateRegionDiscoveryMetadata(regionDiscoveryMetadata: RegionDiscoveryMetadata): Unit = js.native
    
    /* private */ var wrapperSKU: Any = js.native
    
    /* private */ var wrapperVer: Any = js.native
  }
  /* static members */
  object ServerTelemetryManager {
    
    @JSImport("@azure/msal-common/dist/telemetry/server/ServerTelemetryManager", "ServerTelemetryManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the maximum number of errors that can be flushed to the server in the next network request
      * @param serverTelemetryEntity
      */
    inline def maxErrorsToSend(serverTelemetryEntity: ServerTelemetryEntity): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxErrorsToSend")(serverTelemetryEntity.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
