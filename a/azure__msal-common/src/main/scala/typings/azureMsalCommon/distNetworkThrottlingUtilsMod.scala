package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typings.azureMsalCommon.distNetworkRequestThumbprintMod.RequestThumbprint
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseServerAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkThrottlingUtilsMod {
  
  @JSImport("@azure/msal-common/dist/network/ThrottlingUtils", "ThrottlingUtils")
  @js.native
  open class ThrottlingUtils () extends StObject
  /* static members */
  object ThrottlingUtils {
    
    @JSImport("@azure/msal-common/dist/network/ThrottlingUtils", "ThrottlingUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the Unix-time value for a throttle to expire given throttleTime in seconds.
      * @param throttleTime
      */
    inline def calculateThrottleTime(throttleTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateThrottleTime")(throttleTime.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Checks a NetworkResponse object's RetryAfter header
      * @param response
      */
    inline def checkResponseForRetryAfter(response: NetworkResponse[ServerAuthorizationTokenResponse]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResponseForRetryAfter")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks a NetworkResponse object's status codes against 429 or 5xx
      * @param response
      */
    inline def checkResponseStatus(response: NetworkResponse[ServerAuthorizationTokenResponse]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResponseStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Prepares a RequestThumbprint to be stored as a key.
      * @param thumbprint
      */
    inline def generateThrottlingStorageKey(thumbprint: RequestThumbprint): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateThrottlingStorageKey")(thumbprint.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Performs necessary throttling checks after a network request.
      * @param cacheManager
      * @param thumbprint
      * @param response
      */
    inline def postProcess(
      cacheManager: CacheManager,
      thumbprint: RequestThumbprint,
      response: NetworkResponse[ServerAuthorizationTokenResponse]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postProcess")(cacheManager.asInstanceOf[js.Any], thumbprint.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Performs necessary throttling checks before a network request.
      * @param cacheManager
      * @param thumbprint
      */
    inline def preProcess(cacheManager: CacheManager, thumbprint: RequestThumbprint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcess")(cacheManager.asInstanceOf[js.Any], thumbprint.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeThrottle(cacheManager: CacheManager, clientId: String, request: BaseAuthRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeThrottle")(cacheManager.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeThrottle(
      cacheManager: CacheManager,
      clientId: String,
      request: BaseAuthRequest,
      homeAccountIdentifier: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeThrottle")(cacheManager.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], request.asInstanceOf[js.Any], homeAccountIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
